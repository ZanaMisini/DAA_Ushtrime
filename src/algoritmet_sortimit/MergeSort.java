package algoritmet_sortimit;

//Time Complexity
    //Recursive
        //Big O(nlogn)
        //Big Theta(nlogn)
        //Big Omega(nlogn)
//Space Complexity
    //Recursive
        //O(n) te gjitha elementet duhet te kopjohen ne nje varg ndihmes

//pseudocode
//    function mergeSort(vargu, left, right)
//        if left is smaller than right
//            middle = left + (right - left) / 2
//            mergeSort(vargu, left, middle)
//            mergeSort(vargu, middle+1, right)
//            merge(vargu, left, middle, right)

//    function merge(vargu, left, middle, right)
//        n1 = middle - left + 1
//        n2 = right - middle
//        L[n1] , R[n2]
//        for i from 0 to n1
//            L[i] = vargu[i+l]
//        for i from 0 to n2
//            R[i] = vargu[middle + 1 + i]
//            i and j = 0
//            k = l
//        while left is smaller than right
//            if L[i] < R[j]
//                array[k] = L[i]
//                increment i by 1
//            else
//                array[k] = R[j]
//                increment j by 1
//            increment k by 1
//
//        while i<n1
//            array[k] = L[i]
//            k++ i++
//        while R still has elements
//            add to array[k]
//            increment k and j by one

public class MergeSort {
    public static void main(String[] zanamaemira){
        int[] array = {1, 6, 7, 3, 22, 3, -2,  55, 32};
        MergeSortR mergeSortR = new MergeSortR(array);
    }
}
class MergeSortR extends HelperClass{
    int[] array;
    MergeSortR(int[] array){
        this.array = array;
        constructorPrint(this.array, "merge");
        int[] sortedArray = this.mergeSort(this.array, 0, this.array.length-1);
        printArray(sortedArray);
    }

    public int[] mergeSort(int[] array, int l, int r){
        if(l < r){
            int m = l + (r - l ) / 2;
            mergeSort(array, l, m);
            mergeSort(array, m+1, r);
            merge(array, l, m, r);
        }
        return array;
    }
    public int[] merge(int[] array, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0; i<n1; i++)
            L[i] = array[i+l];
        for(int i=0; i<n2; i++)
            R[i] = array[m+1+i];

        int i=0, j=0, k=l;
        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                array[k] = L[i];
                i++;
            }else{
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            array[k] = L[i];
            i++; k++;
        }
        while (j < n2){
            array[k] = R[j];
            j++; k++;
        }
        return array;
    }
}
