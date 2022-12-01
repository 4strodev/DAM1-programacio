// Author Juan Alejandro Marin Ruiz AKA 4strodev

public class SimilarArrays {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 2, 3, 5, 5, 6};
        int[] secondArray = new int[]{6, 5, 4, 3, 2, 1};

        if (firstArray.length != secondArray.length) {
            System.out.println("El primer array y el segon no son similars");
            System.exit(0);
        }

        firstArray = sortArray(firstArray);
        secondArray = sortArray(secondArray);

        if (!contentEquals(firstArray, secondArray)) {
            System.out.println("El primer array y el segon no son similars");
            System.exit(0);
        }

        System.out.println("El primer array y el segon son similars");
    }

    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    // Swaping values
                    var aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                }
            }
        }

        return array;
    }

    public static boolean contentEquals(int[] array1, int[] array2) {
        boolean equals = true;
        for (int i = 0; i < array1.length; i ++) {
            // Ensuring that are not equals
            if (array1[i] != array2[i]) {
                equals = false;
                break;
            }
        }

        return equals;
    }
}
