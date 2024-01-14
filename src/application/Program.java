package application;

import entities.Product;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    String path = "./products.csv";
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      List<Product> products = br.lines().map(line -> {
        String[] items = line.split(",");
        return new Product(items[0], Double.parseDouble(items[1]), Integer.parseInt(items[2]));
      }).toList();

      try {
        Files.createDirectories(Paths.get("./out_csv"));
      } catch (IOException e) {
        System.err.println("Error creating directory: " + e.getMessage());
      }

      List<String> lines = products.stream()
          .map(product -> product.getName() + "," + product.total())
          .toList();

      try {
        Files.write(Paths.get("./out_csv/summary.csv"), lines);
      } catch (IOException e) {
        e.printStackTrace();
      }

    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("Unexpected error: " + e.getMessage());
    }
  }
}
