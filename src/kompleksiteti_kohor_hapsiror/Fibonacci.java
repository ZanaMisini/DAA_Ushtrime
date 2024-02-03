package kompleksiteti_kohor_hapsiror;

//Time Complexity
    //For recursive fibonacci
        //Big O - eksponencial 2^n
        //Big Theta - njejte
        //Big Omega - njejte vec nese jane te dhenat cached edhe e gjen me tparen eshte constant 1
    //For iterative fibonacci
        //Big O - kuadratik n^2
        //Big Theta - kuadratik n^2
        //Big Omega - konstant 1 nese duhet vetem nje iteracion, a.k.a per 1 ose 0
//Space Complexity
    //For recursive fibonacci
        //O(n)
    //For iterative fibonacci
        //O(1) because as the input increases the size of the variables remains the same

//pseudocode for fibonacci
//function fibonacciRecursive(n)
//    if n <= 1
//        return n
//    else
//        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2)

//pseudocode for fibonacci iterative
//function fibonacciIterative(n)
//    if n<=1
//        return n
//    a = 0
//    b = 1
//    for i from 2 to n{
//            temp=b
//            b=a+b
//            a=temp
//    }
//  return b

public class Fibonacci {
    public static void main(String[] zanamaemira){
        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive(10);
        System.out.println();
        FibonacciIterative fibonacciIterative = new FibonacciIterative(10);
    }
}

class FibonacciRecursive{
    int n;
    FibonacciRecursive(int n){
        this.n = n;
        System.out.println("!!!Fibonacci Recursive!!!");
        this.printFibonacciRecursive(this.n);
    }

    public void printFibonacciRecursive(int n){
        int[] array = new int[n];
        for(int i=0; i<n; i++) array[i] = this.fibonacciRecursive(i);
        for(int i : array) System.out.print(i + " ");
    }

    public int fibonacciRecursive(int n){
        if(n<=1) return n;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
}

class FibonacciIterative{
    int n;
    FibonacciIterative(int n){
        this.n = n;
        System.out.println("!!!Fibonacci Iterative!!!");
        this.printFibonacciIterative(this.n);
    }

    public void printFibonacciIterative(int n){
        int[] array = new int[n];
        for(int i=0; i<n; i++) array[i] = this.fibonacciIterative(i);
        for(int i : array) System.out.print(i + " ");
    }

    public int fibonacciIterative(int n){
        int a = 0;
        int b = 1;
        if(n <= 1) return n;
        for(int i=2; i<=n; i++){
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}
