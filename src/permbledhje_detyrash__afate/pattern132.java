package permbledhje_detyrash__afate;

public class pattern132 {
    public static void main(String[] zanamaemira){
        int[] array = {1, 2, 5, 1, 5, 4};
        String output = detyra(array);
        System.out.println(output);

        String output1 = detyra1_1(array);
        System.out.println(output1);

    }

    //nqs numrat jane i<j<k por jo domosdoshmerisht te njepasnjeshem
    public static String detyra(int[] array){
        System.out.println("!!!!!!!USING FIRST ALGORITHM!!!!!!!!!!!!!!!");
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
    public static String detyra1_1(int[] array){
        System.out.println("\n");
        System.out.println("!!!!!!!USING SECOND ALGORITHM!!!!!!!!!!!!!!!");
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
