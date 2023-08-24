public class SmallestElement {
    public static void main(String[] args) {
        int[] array = {9, 3, 7, 1, 5, 2, 8, 4, 6};

        int smallest = array[0]; // Initialize with the first element

        // Find the smallest element in the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        System.out.println("The smallest element in the array is: " + smallest);
    }
}
