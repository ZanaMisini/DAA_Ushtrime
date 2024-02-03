package algoritmet_kerkimit;
//nese vlera nuk gjendet aspak ne varg
//Time Complexity
    //Iterative
        //Big O - log n, logaritmik
        //Big Theta - log n, logaritmik
        //Big Omega - 1, konstant
    //Recursive
        //Big O - log n, logaritmik
        //Big Theta - log n, logaritmik
        //Big Omega - 1, konstant

//Space Complexity
    //Iterative
        //1, constant in all cases
    //Recursive
        //best case 1, worst edhe average logn
//Te gjithe logn jane me baze 2

//pseudocode for iterative
//function binarySearchIterative(vargu, noKerkim)
    //left = 0
    //right = vargu.size - 1
    //if left<=right
        //mid = left + (right-left)/2
        //if vargu[mid] == noKerkim
            //return vargu[mid]
        //else if vargu[mid] < noKerkim
                //left = mid + 1
        //else
            //right = mid - 1
    //return -1

//pseudocode for recursive
    //function binarySearchRecursive(vargu, noKerkim, left, right, iterative)
    //if left<=right
    //        mid = left + (right - left) / 2
    //    if vargu[mid] == noKerkim
    //        return vargu[mid]
    //    else if vargu[mid] < noKerkim
    //        return binarySearchRecursive(vargu, noKerkim, left+1, right, iterative+1)
    //    else
    //        return binarySearchRecursive(vargu, noKerkim, left, right-1, iterative+1)

public class BinarySearch {
    public static void main(String[] zanamaemira){
        int[] array = {-4, 1, 2 ,3, 4, 5, 6, 7};
        BinarySearchRI binarySearchRI = new BinarySearchRI(array, 6);
        BinarySearchRI binarySearchRI1 = new BinarySearchRI(array, 4);
        BinarySearchRI binarySearchRI2 = new BinarySearchRI(array, 1);
        BinarySearchRI binarySearchRI3 = new BinarySearchRI(array, 12);
        BinarySearchRI binarySearchRI4 = new BinarySearchRI(array, -4);

    }
}

class BinarySearchRI{
    int[] array;
    int noSearch;

    BinarySearchRI(int[] array, int noSearch){
        this.array = array;
        this.noSearch = noSearch;
        String result = binarySearchIterative(this.array, this.noSearch);
        System.out.println(result);
        String result1 = binarySearchRercursive(this.array, this.noSearch, 0, this.array.length-1, 0);
        System.out.println(result1);
    }

    public String binarySearchIterative(int[] array, int noSearch){
        String result = "";
        int count = 0;
        int size = array.length;
        int l = 0;
        int r = size - 1;
        while(l<=r){
            int m = l + (r-l) / 2;
            if(array[m] == noSearch){
                result = "Numri " + noSearch + " eshte gjetur ne poziten " + (m+1) + " pas " + count + " kerkimeve";
                break;
            }else if(array[m] < noSearch){
                l = m+1;
                count++;
            }
            else{
                r = m-1;
                count++;
            }
        }
        if(l>r) result = "Numri " + noSearch + " nuk ndodhet ne varg";
        return result;
    }

    public String binarySearchRercursive(int[] array, int noSearch, int l, int r, int count) {
        if(l <= r) {
            int m = l + (r - l) / 2;
            if (array[m] == noSearch) return "Number " + noSearch + " found at " + (m+1) + " position after " + count + " iterations";
            else if (array[m] < noSearch) return binarySearchRercursive(array, noSearch, (l + 1), r, count+1);
            else return binarySearchRercursive(array, noSearch, l, (r - 1), count+1);
        }
        return "Number " + noSearch + " not found";
    }
}