package permbledhje_detyrash__afate;

//Detyra 16. Të shkruhet kodi i cili përmes inputit të userit krijon vargun vargu me n elemente
//        numra të plotë. Të kontrollohet nëse ekziston modeli (ang. Pattern) 132 i tre numrave të
//        plotëvargu[i], vargu[j] dhe vargu[k], ashtu që të vlej kushti: i<j<k dhe
//        vargu[i]<vargu[k]>vargu[j].
//        Shfaq true nëse ekziston 132 modeli ne atë varg, përndryshe shfaq false.
//        Shembull:
//        a)
//        Hyrja: vargu[3,1,4,2]
//        Dalja: true
//        b)
//        Hyrja: vargu[1,2,3,4]
//        Dalja: false

public class Pattern132 {
    public static void main(String[] zanamaemira){
        int[] array = {1, 2, 5, 1, 5, 4};
        String output = pattern132NonAdjecent(array);
        System.out.println(output);

        String output1 = pattern132Adjecent(array);
        System.out.println(output1);

    }

    //nqs numrat jane i<j<k por jo domosdoshmerisht te njepasnjeshem
    public static String pattern132NonAdjecent(int[] array){
        System.out.println("!!!!!!!USING NON ADJECENT ALGORITHM!!!!!!!!!!!!!!!");
        boolean cond = false;
        for(int i=0; i<array.length-2; i++){
            for(int j=i+1; j<array.length-1; j++){
                for(int k=j+1; k<array.length; k++){
                    if(array[i] < array[k] && array[j] > array[k]) {
                        System.out.print("The pattern was found in: ");
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        cond = true;
                        break;
                    }
                }
            }
        }

        if(cond)
            return "Ekziston 132 modeli ne kete varg";
        return "Nuk ekziston 132 modeli ne kete varg";
    }

    //nqs numrat i<j<k dhe duhet te jene te njepasnjeshem
    public static String pattern132Adjecent(int[] array){
        System.out.println("\n");
        System.out.println("!!!!!!!USING ADJECENT ALGORITHM!!!!!!!!!!!!!!!");
        boolean condition = false;
        for(int i=0; i<array.length-2; i++){
            int j = i+1;
            int k = j+1;
            while(array[i] < array[k] && array[j] > array[k]){
                System.out.print("The pattern was found in: ");
                System.out.println(array[i] + " " + array[j] + " " + array[k]);
                condition = true;
                break;
            }
        }
        if(condition)
            return "Ekziston 132 modeli ne kete varg";
        return "Nuk ekziston 132 modeli ne kete varg";

    }
}
