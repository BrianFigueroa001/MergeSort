package mergesort;

public class MergeSort { 
    public int[] sort(int[] unsortedArr) {
        if (unsortedArr.length == 0){ //Array is empty
            return unsortedArr;
        }
        
        if (unsortedArr.length == 1) { //base case 1
            return unsortedArr;
        }
        
        if (unsortedArr.length == 2) { //base case 2
            if (unsortedArr[0] > unsortedArr[1]) {
                int element0 = unsortedArr[0];
                int element1 = unsortedArr[1];
                unsortedArr[0] = element1;
                unsortedArr[1] = element0;
            }
            return unsortedArr;
        }


        int[] arr1;
        int[] arr2;
        int length = unsortedArr.length; //length of unsortedArr
        int n = 0; //Index of unsorted unsortedArr

        if (length % 2 == 0) { //length is even
            arr1 = new int[length / 2];
            arr2 = new int[length / 2];
        } else { //length if odd
            arr1 = new int[(length + 1) / 2];
            arr2 = new int[length - arr1.length];
        }

        for (int i = 0; i < arr1.length; ++i) {
            arr1[i] = unsortedArr[n];
            ++n;
        }
        for (int i = 0; i < arr2.length; ++i) {
            arr2[i] = unsortedArr[n];
            ++n;
        }
        arr1 = sort(arr1);
        arr2 = sort(arr2);
        return merge(arr1, arr2);
    }

    private int[] merge(int[] arr1, int[] arr2) {
        int[] newArray = new int[arr1.length + arr2.length]; //Merged array
        int arr1Ind = 0;
        int arr2Ind = 0;
        int newArrInd = 0;
        while (arr1Ind != (arr1.length) && arr2Ind != (arr2.length)) {
            if (arr1[arr1Ind] > arr2[arr2Ind]) {
                newArray[newArrInd] = arr2[arr2Ind];
                ++arr2Ind;
            } else {
                newArray[newArrInd] = arr1[arr1Ind];
                ++arr1Ind;
            }
            ++newArrInd;
        }

        while (arr1Ind != (arr1.length)) {
            newArray[newArrInd] = arr1[arr1Ind];
            ++arr1Ind;
            ++newArrInd;
        }

        while (arr2Ind != (arr2.length)) {
            newArray[newArrInd] = arr2[arr2Ind];
            ++arr2Ind;
            ++newArrInd;
        }
        return newArray;
    }
}
