package algoritmet_sortimit;

abstract public class HelperClass {
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array){
        for(int i : array)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void constructorPrint(int[] array, String sortingAlgorithm){
        if(sortingAlgorithm == "radix"){
            System.out.println("Before radix sort: ");
            printArray(array);
            System.out.println();
            System.out.println("Radix sort starting...");
            System.out.println();
            System.out.println("After radix sort: ");
        }
        else {
            System.out.println("Array before sorting: ");
            printArray(array);
            System.out.println("Array after " + sortingAlgorithm + " sort: ");
        }
    }
}
