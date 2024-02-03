package algoritmet_sortimit;

//Ne insertion sort, elementi i pare(dyte) krahasohet me te gjithe elementet mbrapa tij,
//nqs eshte me i vogel, nderrojne pozitat, pastaj kalohet ne elementin e trete, katert... etj...
//Time Complexity
    //Iterative
        //Big O(n^2)
        //Big Theta(n^2)
        //Big Omega(n) - nese elementet jane te sortuara, ose te gjithe te njejte, nuk hyn fare ne while loop
//Space Complexity
    //Per te gjitha rastet O(1) - konstant

//pseudocode
    //function insertionSort(vargu)
    //    for i from 1 to size of vargu
    //        j = i
    //        while j>0 AND vargu[j] < vargu[j-1]
    //            swap vargu[j] with vargu[j-1]
    //            j--

public class InsertionSort {
    public static void main(String[] zanamaemira){
        int[] array = {1, 6, 7, 3, 22, 3, -2, 55, 32};
        InsertionSortI insertionSortI = new InsertionSortI(array);
    }
}
class InsertionSortI extends HelperClass{
    int[] array;
    InsertionSortI(int[] array){
        this.array = array;
        constructorPrint(this.array, "insertion");
        int[] sortedArray = this.insertionSort(this.array);
        printArray(sortedArray);
    }
    public int[] insertionSort(int[] array){
        int size = array.length;
        for(int i=1; i<size; i++){
            int j=i;
            while(j>0 && array[j] < array[j-1]){
                swap(array, j, j-1);
                j--;
            }
        }
        return array;
    }
}