package algoritmet_kerkimit;
//nese vlera nuk gjendet aspak ne varg
//Time Complexity
    //Recursive
        //Big O - linear O(n)
        //Big Theta - linear O(n)
        //Big Omega - linear O(1) - konstant nese gjendet numri ne poziten e pare
    //Iterative
        //Big O - linear O(n)
        //Big Theta - linear O(n)
        //Big Omega - linear O(1) - konstant nese gjendet numri ne poziten e pare
//Space Complexity
    //Recursive
        //Worst case O(1), tail recursion, rekurzioni eshte funksioni i fundit qe thirret nese duhet te perseritet
    //Iterative
        //Kosntant O(1) - nuk perdor variabla te cilat rriten me numrin e inputeve

//pseudocode per linear search iterative
    //function linearSearchIterative(vargu, noNeKerkim)
    //size = vargu.length
    //for i from 0 to size
    //    if array[i] == noKerkim
    //        return true
    //return false

//pseudocode per linar search rekurziv
    //function linearSearchRecursive(vargu, pozita, noKerkimit)
    //if pozita < 0 return false
    //if vargu[pozita] == noKerkimit return true
    //return linearSearchRecursive(vargu, pozita-1, noKerkimit)
public class LinearSearch {
    public static void main(String[] zanamaemira){
        int[] vargu = {1, 6, 44, 6, 7};
        LinarSearchRI linearSearchIterative = new LinarSearchRI(vargu, 1);
        LinarSearchRI linearSearchIterative1 = new LinarSearchRI(vargu, 55);
    }
}

class LinarSearchRI{
    int[] array;
    int noToSearch;
    public LinarSearchRI(int[] array, int noToSearch){
        this.noToSearch = noToSearch;
        this.array = array;

        String resultIterative = this.linearSearchIterative(this.array, this.noToSearch);
        String resultRecursive = this.linearSearchRecursive(this.array, this.array.length-1, this.noToSearch);
        System.out.println("Iterative approach: " + resultIterative);
        System.out.println("Recursive approach: " + resultRecursive);

    }

    public String linearSearchIterative(int[] array, int noToSearch){
        String result = "";
        int size = array.length;
        for(int i=0; i<size; i++){
            if(array[i] == noToSearch){
                result = "Numri " + noToSearch + " eshte gjendur ne poziten " + (1+i);
                break;
            }else result = "Numri " + noToSearch + " nuk ndodhet ne varg";

        }
        return result;
    }

    public String linearSearchRecursive(int[] array, int position, int noToSearch){
        if(position < 0) return "Numri " + noToSearch + " nuk ndodhet ne varg";
        if(array[position] == noToSearch) return "Numri " + noToSearch + " eshte gjetur ne poziten " + (position + 1);

        return linearSearchRecursive(array, position-1, noToSearch);
    }
}