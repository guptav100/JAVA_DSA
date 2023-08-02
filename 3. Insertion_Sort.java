class Insertion_Sort {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + (" "));
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 7, 78, 91, 12, 43, 1, 3 };

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
        print(arr);
    }
}
