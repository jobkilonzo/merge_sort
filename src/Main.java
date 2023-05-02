class MergeSort{
    static void mergeSort(int[] arrayNumber, int l, int m, int r){
        int n1 = m-l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];
        //System.arraycopy(arrayNumber, 1, L, 0, n1);

        System.arraycopy(arrayNumber, l, L, 0, n1);
        for (int j = 0; j< n2; ++j){
            R[j] = arrayNumber[m+ 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i <n1 && j < n2){
            if (L[i] <= R[j]){
                arrayNumber[k] = L[i];
                i++;
            }else {
                arrayNumber[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arrayNumber[k] = L[i];
            i++;
            k++;
        }
        while (j <n2){
            arrayNumber[k] = R[j];
            j++;
            k++;
        }
    }
    static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            mergeSort(arr, l, m, r);
        }
    }

}
public class Main {
    public static void main(String[] args) {

        int[] arrayVariable = {10, 50, 110, 90, 1, 9, 200, 4, 2000};
        System.out.println("This is the Array values before Sorting");
        for (int j : arrayVariable) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Sorting the elements using Merge Sorting Algorithm
        MergeSort.sort(arrayVariable, 0, arrayVariable.length-1);
        System.out.println("This is the value of the Array after Sorting");
        for (int j : arrayVariable) {
            System.out.print(j + " ");
        }
    }
}