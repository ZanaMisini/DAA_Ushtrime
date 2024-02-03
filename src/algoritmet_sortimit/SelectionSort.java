package algoritmet_sortimit;

//Ne selection sort fiksohet elementi i pare, krahasohet me te gjithe te tjeret dhe nderron poziten
//me elementin me te vogel te gjetur ne ate varg nese ka. Pastaj e njejta ndodhe edhe me elementet e tjera
//ne rend, deri te elementi i parafundit
//Time Complexity
    //Iterative
        //Big O, Theta, Omega - n^2 - kuadratik
//Space Complexity
    //Iterative
        //Constant O(1)

import static algoritmet_sortimit.HelperClass.*;

//pseudocode
//    function selectionSort(vargu)
//        for i from 0 to size-1
//            jMin = i
//            for j from i to size
//                if vargu[j] < vargu[jMin]
//                    jMin = j
//        if jMin != i
//            swap vargu[i] with vargu[jMin]
public class SelectionSort extends HelperClass{
    public static void main(String[] zanamaemira){
        int[] array = {1, 6, 7, 3, 22, 3, -2, 55, 32};
        SelectionSortI selectionSortI = new SelectionSortI(array);
    }
}
class SelectionSortI{
    int[] array;

    SelectionSortI(int[] array){
        this.array = array;
        constructorPrint(this.array, "selection");
        int[] sortedArray = this.selectionSort(this.array);
        printArray(sortedArray);
    }
    public int[] selectionSort(int[] array){
        int size = array.length;
        for(int i=0; i<size-1; i++){
            int jMin = i;
            for(int j=i+1; j<size; j++){
                if(array[jMin] > array[j])
                    jMin = j;
            }
            if(jMin != i){
                swap(array, jMin, i);
            }
        }
        return array;
    }
}