package algoritmet_sortimit;

//Time Complexity
    //Recursive
        //Big O(nlogn) - reverse array
        //Big Theta(nlogn)
        //Big Omega(nlogn) - nese array already max heap, heapify do te jete O(1) per secilen thirrje rekurzive
//Space Complexity
    //Recursive
        //Big O(1) - konstant SHUME EFIÇIENT!!!!!

//pseudocode
//    function heapSort(vargu)
//        size -> length of vargu
//        for i from last parent node to root
//            heapify(vargu, size, i)
//
//        for i from last element to root+1 (element before root)
//            swap vargu[i] with root
//            heapify(vargu, i, root)

//    function heapify(vargu, size, i)
//        largest = i
//        left = 2*i + 1
//        right = 2*i + 2
//        if left element is larger than root (or smaller for min heap) AND less than size
//            largest = left
//        if right element is larger than root AND less than size
//            largest = right
//        if largest element is not i anymore
//            swap largest with i
//            heapify(vargu, size, largest)
public class HeapSort {
    public static void main(String[] zanamaemira){
        int[] array = {1, 6, 7, 3, 22, 3, -2,  55, 32};
        HeapSortR heapSortR = new HeapSortR(array);
    }
}
class HeapSortR extends HelperClass{
    int[] array;

    HeapSortR(int[] array){
        this.array = array;
        constructorPrint(this.array, "heap");
        int[] sortedArray = this.heapSort(this.array);
        printArray(this.array);
    }
    public int[] heapSort(int[] array){
        int size = array.length;
        for(int i = 2*size-1; i>=0; i--)
            heapify(array, size, i);

        for(int i = size - 1; i>0; i--){
            swap(array, 0, i);
            heapify(array, i, 0);
        }
        return array;
    }

    public void heapify(int[] array, int size, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        //left<size se nese jena tu e check psh elementin e fundit (qe nuk eshte parent)
        //ateher ka me na dal out of bounds se elementi i fundit 8, 8*2+1 = 17 qe nuk mundet me kon pjese e pemes
        //se pema e ka size = 9
        if(left<size && array[left] > array[largest])
            largest = left;
        if(right<size && array[right] > array[largest])
            largest = right;

        if(i!=largest) {
            swap(array, largest, i);
            System.out.print("STEPS: ");
            printArray(array);
            heapify(array, size, largest);
        }
    }
}
