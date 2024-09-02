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

    public static void main(String[] args) {
        int[] nums = {1, 12, 312, 4, 0, -2, 22, 13, 4};
        ShellSort.sort(nums);
        
        // Imprimir o array ordenado
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
