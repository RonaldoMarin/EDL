public class ShellSort {

    public static void sort(int[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] vetor = {9, 8, 3, 7, 5, 6, 4, 1};
        System.out.println("Vetor desordenado");
        printArray(vetor);

        // int[] vetor = new int[10];
        // for (int i = 0; i < vetor.length; i++){
        //     vetor[i] = (int) (Math.random() * vetor.length);
        //     System.out.print(vetor[i] + " ");
        // }

        ShellSort.sort(vetor);
        System.out.println("\nVetor ordenado");

        // Imprimir o array ordenado
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
