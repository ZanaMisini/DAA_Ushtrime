package kompleksiteti_kohor_hapsiror;
//Time complexity

    //Big O = lineare O(n)
    //Big Theta = lineare O(n)
    //Big Omega = constant O(1)

//Space Complexity
    //Recursive: O(n) - linear (because of the stack)
    //Iterative: O(1) - just the addition variable

//pseudocode recursive
//    function factorialRecursive(n)
//        if n is 1 or 0
//            return 1
//        else
//            return n * factorialRecursive(n-1)

//pseudocode iterative
//    function factorialIterative(n)
//        result = 1
//        for i from 1 to n
//            result = result * i
//    return result


public class Faktorieli {
    public static void main(String[] zanamaemira){
        FactorialRecursion fr = new FactorialRecursion(5);
        FactorialIterative fi = new FactorialIterative(5);
    }
}

class FactorialRecursion{
    int n;
    FactorialRecursion(int n){
        this.n = n;
        System.out.println(this.n + "! = " + this.factorialRecursive(this.n));
    }

    public int factorialRecursive(int n){
        if(n < 1) return 1;
        return n * factorialRecursive(n-1);
    }
}

class FactorialIterative{
    int n;
    FactorialIterative(int n){
        this.n = n;
        System.out.println(this.n + "! = " + this.factorialIterative(this.n));
    }

    public int factorialIterative(int n) {
        int addition = 1;
        for(int i=1; i<=n; i++) addition *= i;
        return addition;
    }
}
