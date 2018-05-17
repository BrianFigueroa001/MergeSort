package mergesort;

public class Main {
    public static void main(String[] Args) {
        MergeSort ms = new MergeSort();
//        int[] array = {3, 1, 4, 2};
        int[] array = {4, 1, 40, 3, 2, 5};
//        int[] array = {6, 6, 6, 7, 7, 8, 8, 10, 10, 12, 12};
        int[] newArray = ms.sort(array);
        System.out.println("Printing sorted array:");
        for (int i = 0; i < newArray.length; ++i) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }
}
