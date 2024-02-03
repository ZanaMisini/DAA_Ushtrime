package algoritmet_sortimit;

//Time Complexity
/*Varet nga gap dhe madhesia e array. Per best case array eshte gati ose e tera e sortuar
* dhe eshte zgjedhur nje gap ideal (Pratt sequence or Sedgewick sequence). Ne rastin e average case
* eshte e veshtire te percaktohet sepse varet nga gap por i afrohet nlogn
* Ne rastin e worst case, array eshte e sortuar ne descending order dhe ne secilin iteracion
* duhet te behet krahasim dhe swap, secili element me secilin element*/
    //Iterative
        //Big O(n^2)
        //Big Theta(nlogn) - varet nga numri i gap qe zgjedhe programeri
        //Big Omega(nlogn) - kur array eshte e sortuar dhe numri i krahasimeve eshte i barabarte me nr te antareve ne varg

//Space Complexity
    //Iterative
        //Konstant O(1) - nuk i nevojitet ndonje variabel, apo nuk rritet me rritjen e hyrjeve


//pseudocode
//    funtion shellSort(vargu)
//        size -> gjatesia e vargut
//        for gap = size / 2 ; gap > 0 ; gap /= 2
//            for i from gap to size
//                j = i
//                while j is equal or greater than gap AND vargu[j] is less than vargu[j-gap]
//                    swap vargu[j] with vargu[j-gap]
//                    decrement j to j-gap

import static algoritmet_sortimit.HelperClass.*;

public class ShellSort extends HelperClass{
    public static void main(String[] zanamaemira){
        int[] array = {1, 6, 7, 3, 22, 3, -2, 55, 32};
        ShellSortI shellSortI = new ShellSortI(array);
    }
}
class ShellSortI{
    int[] array;
    ShellSortI(int[] array){
        this.array = array;
        constructorPrint(this.array, "shell");
        int[] sortedArray = this.shellSort(this.array);
        printArray(sortedArray);
    }
    public int[] shellSort(int[] array){
        int size = array.length;
        for(int gap = size/2; gap>0; gap/=2){
            for(int i=gap; i<size; i++){
                int j = i;
                while(j>=gap && array[j] < array[j-gap]){
                    swap(array, j-gap, j);
                    j-=gap;
                }
            }
        }
        return array;
    }

}