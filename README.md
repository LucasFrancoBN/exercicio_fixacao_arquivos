# Exercício
O software desenvolvido nesse projeto deve ler o caminho de um arquivo .csv contendo os dados de itens vendidos. As regras do exercício são:

1. **Cada item possui um nome, preço unitário e quantidade:**
2. **Gerar arquivo chamado "summary.csv" contendo apenas o nome e o valor total daquele item**
3. **O arquivo gerado deve estar dentro da subpasta chamada "out" criada a partir da pasta original do arquivo de origem**
    

## Exemplo
```plaintext
// source file
TV LED,1290.99,1
Video Game Chair,350.50,3
Iphone X,900.00,2
Samsung Galaxy 9,850.00,2
```
```plaintext
// output file (out/summary.csv)
TV LED,1290.99
Video Game Chair,1051.50
Iphone X,1800.00
Samsung Galaxy 9,1700.00
```

## Ferramentas
Desafio desenvolvido utilizando a linguagem Java e a IDE Intellij Community.


## Instruções de Uso
Antes de prosseguir com as instruções de uso, é requerido que você tenha em sua máquina o Java 20 e o git.

### Instalação
Antes de tudo, recomendo que você, pelo terminal, navegue até o diretório Desktop e rode o comando
```bash
# Clone o repositório
git clone https://github.com/LucasFrancoBN/exercicio_fixacao_arquivos.git

# Acesse o diretório da classe Program
cd exercicio_fixacao_arquivos/src/application
```
Agora basta você digitar no seu terminal
```bash
# Compile o projeto
javac Program.java ../entities/Product.java
```
Retroceda ao diretório src e compile o programa
```
# Retroceda ao diretório src
cd ../

# Execute o programa
java application.Program
```
