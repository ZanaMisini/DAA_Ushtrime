package permbledhje_detyrash__afate;
import java.util.Arrays;
//Detyra 6. Duke pasur parasysh detyrat e një grupi karakteresh, që përfaqësojnë detyrat që duhet
//        të bëjë një CPU, ku çdo shkronjë përfaqëson një detyrë të ndryshme. Detyrat mund të kryheshin
//        në çdo mënyrë. Çdo detyrë kryhet në një njësi të kohës. Për çdo njësi të kohës, CPU mund të
//        kryejë ose një detyrë ose thjesht të jetë boshe. Sidoqoftë, ekziston një numër i plotë jo negativ n
//        që përfaqëson periudhën e cooldown midis dy detyrave të njëjta (e njëjta shkronjë në grup),
//        domethënë duhet të ketë të paktën n njësi kohore midis çdo dy detyrash të njëjta.
//        Ktheni numrin më të vogël të njësive të kohës që CPU-ja do të marrë për të përfunduar të
//        gjitha detyrat e dhëna.
//Shembull: Input: tasks = ["A","A","A","B","B","B"], n = 2 Output: 8
//        Shpjegim: A-> B -> idle ->A-> B -> idle ->A-> B
//        Ka të paktën 2 njësi kohore ndërmjet çdo dy detyrash të njëjta.

public class CPUTasks {
    public static void main(String[] zanamaemira){

        char[] tasks = {'A', 'A', 'B', 'B'};
        int result = countCPUTasks(tasks, 2);
        System.out.println(result   );

    }

    public static int countCPUTasks(char[] tasks, int cooldownTime){
        int[] taskCount = new int[26];

        for(char task : tasks)
            taskCount[task - 'A']++;

        Arrays.sort(taskCount);

        int maxCount = taskCount[25]-1;
        int idleTime = cooldownTime * maxCount;

        for(int i=24; i>=0 && taskCount[i]>0; i--)
            idleTime -= Math.min(taskCount[i], maxCount);

        return Math.max(idleTime, 0) + tasks.length;

    }
}
