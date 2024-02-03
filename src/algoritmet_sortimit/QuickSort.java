package algoritmet_sortimit;

//Time Complexity
    //Recursive
        //Big O(n^2) - nqs pivoti e ndan vargun ne menyre te pabalancuar, quick sort ben thirrje rekursive 2 here
        //for loop ekzekutohet 2 here
        //Big Theta(nlogn) - nese pivoti zgjedhet perafersisht ne mes
        //Big Omega(nlogn) - nese pivoti eshte gjithmone ne mes
        //edhe pse quick sort nuk e bashkon ne fund vargun sikur merge sort, ne secilen thirrje rekursive
        //kryhet nje "pune" lineare (O(n)) (funksioni partition)
//Space complexity
    //Recursive
        //O(logn)
        //unlike merge sort in which complexity is nlogn, quick sort doesnt merge the array back together

//pseudocode
    //function quickSort(vargu, low, high)
    //    if left is smaller than right
    //        pivot = partition(vargu, left, right)
    //        quickSort(vargu, low, pivot-1)
    //        quickSort(vargu, pivot+1, high)
    //function partition(vargu, low, high)
    //    pivot = vargu[high]
    //    i = low
    //    for j from low to high
    //        if vargu[j] < pivot
    //            swap j with i
    //            increment i by one
    //    swap high with i
    //    return i
public class QuickSort {
    public static void main(String[] zanamaemira){
        int[] array = {1, 6, 7, 3, 22, 3, -2, 55, 32, -5};
        QuickSortR quickSortR = new QuickSortR(array);
    }
}
class QuickSortR extends HelperClass{
    int[] array;
    QuickSortR(int[] array){
        this.array = array;
        constructorPrint(this.array, "quick");
        int[] sortedArray = this.quickSort(this.array, 0, this.array.length-1);
        printArray(sortedArray);
    }
    public int[] quickSort(int[] array, int low, int high){
        if(low < high){
            int pivot = this.partition(array, low, high);
            this.quickSort(array, low, pivot-1);
            this.quickSort(array, pivot+1, high);
        }
        return array;
    }
    public int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low;
        for(int j=low; j<high; j++){
            if(array[j] < pivot){
                swap(array, i, j);
                i++;
            }
        }
        swap(array, i, high);
        return i;
    }
}