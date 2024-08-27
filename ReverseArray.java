public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Reverse Array : ");
        reverseArr(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArr(int[] arr) {
        int n = arr.length;
        // Two Pointer Approach
        for (int i = 0; i < n / 2; i++) {
            int j = n - 1 - i;
            // Swap elements at index i and j
            swap(arr, i, j);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
