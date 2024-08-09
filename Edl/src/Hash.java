import java.util.Scanner;

public class Hash {
    private final Object[] hashArray;

    public Hash(int capacidadeDoArray){
        this.hashArray = new Object[capacidadeDoArray];
    }

    public int size(){
        return this.hashArray.length;
    }


    public static void main(String[] args) {

        int capacidadeDoArray;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um tamanho para seu array: ");
        capacidadeDoArray = sc.nextInt();

        Hash hash = new Hash(capacidadeDoArray);

        int sizeArray = hash.size();
        System.out.println("O tamanho do seu array é: " + sizeArray);

        sc.close();
    }
}