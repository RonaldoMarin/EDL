//import java.util.Scanner;

import java.util.Scanner;

public class Hash {
    private final int[] hashArray;

    public Hash(int capacidadeDoArray){
        this.hashArray = new int[capacidadeDoArray];
    }

    public int size(){
        return this.hashArray.length;
    }

    public int insertHash(int novoElemento) {
        int capacidade, posicao;
        capacidade = this.size();

        posicao = novoElemento % capacidade;

        this.hashArray[posicao] = novoElemento;

        return novoElemento;
    }

    public void printHashArray(){
        System.out.print("[ ");
        for (int i = 0; i < this.size(); i++){

            System.out.print(this.hashArray[i] + " ");

        }
        System.out.print("]");
    }


    public static void main(String[] args) {

        System.out.println("-------------------------------------");
        System.out.println("------- ALGORITMO TABELA HASH -------");
        System.out.println("-------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nPara começar, insira a capacidade do seu Array: ");
        int capacidadeDoArray = sc.nextInt();
        Hash hash = new Hash(capacidadeDoArray);
        System.out.println();

        while (true){

            int options, novoElemento;

            System.out.println("Insira a operação que deseja selecionar: ");
            System.out.println("Insert = 1");
            System.out.println("Remover = 2");
            System.out.println("Print HashMap = 3");
            System.out.println("Exit = 4");

            options = sc.nextInt();



            if (options == 1){
                System.out.print("\nDigite um valor para ser inserido: ");
                novoElemento = sc.nextInt();
                hash.insertHash(novoElemento);
                System.out.println();
                continue;
            }
            else if (options == 3){
                hash.printHashArray();
                continue;
            } else if (options == 4) {
                System.out.println("\nFinalizando processo..");
                break;
            }

        }

//        int capacidadeDoArray, novoElemento;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite um tamanho para seu array: ");
//        capacidadeDoArray = sc.nextInt();
//
//        Hash hash = new Hash(capacidadeDoArray);
//
//        int sizeArray = hash.size();
//        System.out.println("O tamanho do seu array é: " + sizeArray);
//
//        System.out.print("Digite um valor para ser inserido: ");
//        novoElemento = sc.nextInt();
//
//        System.out.println("Valor inserido: " + hash.insertHash(novoElemento));
//
//        hash.printHashArray();
//
//        sc.close();
    }
}