package algoritmet_sortimit;

//Time Complexity
    //Iterative
        //Varet nga variabla MAX (k), a.k.a cili numer ka me shume shifra, aq here do te perseritet loop
        //dhe nga numri i antareve ne varg (n)
            //Big O(nk)
            //Big Theta(nk)
            //Big Omega(n) - ne rastin kur te gjithe numrat kane the same number of digits, k mund te konsiderohet konstante
//Space Complexity
    //O(n + k) - n: numri i antareve ne varg, k: numri i shifrave te numrit me te madh ne varg

//pseudocode
    //function radixSort(vargu)
    //    m = max nga vargu
    //    for exp from 1 to m/exp > 0, with exp = exp * 10
    //        bubbleSortForRadix(vargu, exp)

    //function bubbleSortForRadix(vargu, exp)
    //for i from 1 to size of varg
    //    for j from 0 to size of varg - 1
    //        firstNo = (varg[j] / exp) % 10
    //        successor = (varg[j+1] / exp) % 10
    //        if firstNo > successor
    //            swap varg[j+1] with varg[j]

import static algoritmet_sortimit.HelperClass.constructorPrint;
import static algoritmet_sortimit.HelperClass.printArray;

public class RadixSort extends HelperClass{
    public static void main(String[] zanamaemira){
        int[] array = {140, 612, 743, 3124, 5422, 5365, -2, 4355, 22132};
        RadixSortI radixSortI = new RadixSortI(array);
    }
}
class RadixSortI{
    int[] array;
    RadixSortI(int[] array){
        this.array = array;
        constructorPrint(this.array, "radix");
        int[] sortedArray = this.radixSort(this.array);
        printArray(sortedArray);
        System.out.println("Radix sort finished!");
    }

    public int[] radixSort(int[] array){
        int max = 0;
        for(int i : array){
            if(i > max)
                max = i;
        }
        int counter = 1;
        for(int exp=1; max/exp>0; exp*=10){
            array = BubbleSortI.bubbleSortForRadixSort(array, exp);
            System.out.print("Array after " + counter + (counter==1 ? " iteration: " : " iterations: "));
            printArray(array);
            counter++;
        }
        return array;
    }
}