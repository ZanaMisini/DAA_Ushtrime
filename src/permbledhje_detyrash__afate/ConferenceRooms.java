package permbledhje_detyrash__afate;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ConferenceRooms{
    public static void main(String[] zanamaemira){
            Meetings[] meetings = {
                    new Meetings(945, 1030),
                    new Meetings(1030, 1100),
                    new Meetings(1105, 1200),
                    new Meetings(1105, 1200)
            };

            int minRooms = minRoomsMinHeap(meetings);
            System.out.println("Minimum number of rooms needed: " + minRooms);
    }


    public static int minRooms(Meetings[] meetings){
        if(meetings == null || meetings.length == 0)
            return -1;

        Arrays.sort(meetings, (a, b) -> a.start - b.start);
        int rooms = 1;
        for(int i=1; i<meetings.length; i++){
            int j = i-1;
            if(meetings[i].start < meetings[j].end)
                rooms++;
        }
        return rooms;
    }

    public static int minRoomsMinHeap(Meetings[] meetings){
        if(meetings == null || meetings.length == 0)
            return -1;

        Arrays.sort(meetings, (a, b) -> a.start - b.start);
        PriorityQueue<Integer> endTimes = new PriorityQueue<>();
        endTimes.add(meetings[0].end);
        for(int i=1; i<meetings.length; i++){
            if(meetings[i].start >= endTimes.peek())
                endTimes.poll();

            endTimes.add(meetings[i].end);
        }
        return endTimes.size();
    }
}

class Meetings{
    int start, end;
    Meetings(int start, int end){
        this.start = start;
        this.end = end;
    }
}