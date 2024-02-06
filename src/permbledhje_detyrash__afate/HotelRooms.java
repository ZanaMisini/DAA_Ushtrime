package permbledhje_detyrash__afate;

//Detyra 17. Kemi një hotel me n dhoma (rooms). Dhomat pëfaqësohen nga një varg 2D i tipit
//        integer me emrin rooms ku rooms[i] = [roomIdi, sizei] tregon se ka një dhomë me numrin e
//        dhomës roomIdi dhe madhësinë e barabartë me sizei. Secila roomIdi është unike.
//        Gjithashtu kemi k pyetje/kerkesa (en. queries) në një varg 2D me emrin queries ku
//        queries[j] = [preferredj, minSizej]. Përgjigjja për kërkesen/pyetjen (en.query) e jth
//        është numri i dhomës id të një dhome të tillë që:
//        Dhoma ka një madhësi prej të paktën minSizej, dhe abs(id - preferredj) është
//        minimizuar, ku abs(x) është vlera absolute e x. Nëse ka një barazim në diferencën
//        absolute, atëherë përdorni dhomën me më të voglën id. Nëse nuk ka dhomë të tillë,
//        përgjigjja është -1.
//
//        Ktheni një varg answer të gjatësisë k ku answer[j] ka/përmban pëgjigjjen e pyetjes
//        (query) jth.

import java.util.Arrays;

public class HotelRooms {
    public static void main(String[] zanamaemira){
        int[][] rooms = {
                {101, 450},
                {102, 75},
                {103, 390},

        };

        int[][] queries = {
                {102, 70},
                {103, 400},
        };

        int[] result = findBestRoom(rooms, queries);
        System.out.println(Arrays.toString(result));

    }

   public static int[] findBestRoom(int[][] rooms, int[][] queries){
        int n = rooms.length;
        int k = queries.length;
        int[] answer = new int[k];
        Arrays.sort(rooms, (a, b) -> a[1] - b[1]);

        for(int i=0; i<k; i++){

            int preferredId = queries[i][0];
            int preferredSize = queries[i][1];

            int MIN = Integer.MAX_VALUE;
            int selectedRoom = -1;

            for(int j=0; j<n; j++){
                int roomId = rooms[j][0];
                int roomSize = rooms[j][1];

                if(roomSize >= preferredSize){
                    int absDiff = Math.abs(roomId - preferredId);
                    if(absDiff < MIN || (absDiff == MIN && roomId < selectedRoom)){
                        MIN = absDiff;
                        selectedRoom = roomId;
                    }
                }
            }
            answer[i] = selectedRoom;
        }
        return answer;
   }

}
