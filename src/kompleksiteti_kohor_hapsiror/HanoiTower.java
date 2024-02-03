package kompleksiteti_kohor_hapsiror;


//Time Complexity
    //For recursive hanoi tower algorithm
        //Big O - exponential 2^n
        //Big theta - check Big O
        //Big Omega - eshte 2^n por ne rast se n=0 dhe nuk ka disqe per te levizur, eshte konstante O(1)
    //For iterative hanoi tower algorithm
        //eksponencial 2^n sepse duhet te gjeneroje dhe procesoje te gjitha kombinimet e mundshme
        //per n disqe, dhe numri rritet ne menyre eksponenciale
//Space Complexity
    //For recursive hanoi tower algorithm
        //O(n) - function call stack space
    //For iterative hanoi tower
        //O(n)

//pseudocode per hanoi tower rekursiv
    //function hanoiTowerRecursive(n, from, to, aux)
    //    if(n==0) return
    //    hanoiTowerRecursive(n-1, from, aux, to)
    //    hanoiTowerRecursive(n-1, aux, to, from)
public class HanoiTower {
    public static void main(String[] zanamaemira){
        HanoiTowerRecursive hanoiTowerRecursive = new HanoiTowerRecursive(3, 'A', 'C', 'B');
        //ne A gjenden disqet fillimisht
        //ne C deshirojme me i vendose
        //duke perdorur B si shtylle ndihmese mund te i vendosim
    }
}
class HanoiTowerRecursive{
    int n;
    char from, to, aux;

    HanoiTowerRecursive(int n, char from, char to, char aux){
        this.n = n;
        this.from = from;
        this.to = to;
        this.aux = aux;
        this.hanoiTowerRecursive(this.n, this.from, this.to, this.aux);
    }

    public void hanoiTowerRecursive(int n, char from, char to, char aux){
        if(n==0) return;
        //duke perdorur to, vendosi disqet nga from ne aux
        this.hanoiTowerRecursive(n-1, from, aux, to);
        System.out.println("Move " + from + " to " + to);
        //duke perdorur from, vendosi disqet nga aux ne to
        this.hanoiTowerRecursive(n-1, aux, to, from);
    }
}