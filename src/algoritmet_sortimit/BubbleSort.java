package algoritmet_sortimit;

//Ne bubble sort, ne nje iteracion, njeri element krahasohet me elementin pasardhes
//derisa te perfundon iteracioni. Iteracione do te kete aq sa te sortohet i tere vargu.

//Time Complexity
    //Iterative
        //Big O(n^2) - kuadratik
        //Big Theta(n^2) - kuadratik
        //Big Omega(n) - linear

//NE RASTET KUR LOOP E BRENDSHME NUK VARET NGA LOOP E JASHTME, BEST CASE GJITHMONE DO TE JETE
//ME E MIRE SE WORST/AVERAGE CASE. NE RASTET KUR LOOP E BRENDSHME ESHTE E VARUR NGA E JASHTME
//BEST, WORST DHE AVERAGE CASE NUK DALLOJNE (SIPAS TE GJITHA GJASAVE)

//Space Complexity
    //Iterative
        //Per te gjitha rastet O(1) - konstant

//pseudocode
    //function bubbleSort(vargu)
    //    for i from 1 to size of vargu
    //        for j from 0 to size of vargu - 1
    //            if vargu[j] < vargu[j+1]
    //                swap vargu[j] with vargu[j+1]

public class BubbleSort {
    public static void main(String[] zanamaemira){
        int[] array = {1, 6, 7, 3, 22, 3, -2, 55, 32};
        BubbleSortI bubbleSortI = new BubbleSortI(array);
    }
}

class BubbleSortI extends HelperClass{
    int[] array;

    BubbleSortI(int[] array){
        this.array = array;
        constructorPrint(this.array, "bubble");
        int[] sortedArray = this.bubbleSort(this.array);
        this.printArray(sortedArray);
    }

    public int[] bubbleSort(int[] array){
        int size = array.length;
        for(int i=1; i<size; i++){
            for(int j=0; j<size-1; j++){
                if(array[j] > array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
        return array;
    }

    public static int[] bubbleSortForRadixSort(int[] array, int exp){
        int size = array.length;

        for(int i=1; i<size; i++){
            for(int j=0; j<size-1; j++){
                int current = (array[j] / exp) % 10;
                int successor = (array[j+1] / exp) % 10;

                if(current > successor){
                    swap(array, j, j+1);
                }
            }
        }
        return array;
    }
}

//i pari ma i mire se it skips the first iteration when it compares with itself

//    int size = array.length;
//        for(int i=0; i<size-1; i++){
//        for(int j=i+1; j<size; j++){
//        if(array[i] > array[j]){
//        int temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//        }
//        }