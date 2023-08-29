import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Gready{
    public static void activitySelect(int start[], int end[]){
        int activ[][] = new int[start.length][end.length];
        for(int i=0;i<start.length;i++){
            activ[i][0] = i;
            activ[i][1] = start[i];
            activ[i][2] = end[i];
        }
        Arrays.sort(activ,Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer> arr = new ArrayList<>();
        int total = 1;
        arr.add(activ[0][0]);
        int last = activ[0][2];
        for(int i = 0;i<end.length;i++){
            if(activ[i][1] >= last){
                total++;
                last = activ[i][2]; 
                arr.add(activ[i][0]);
            }
        }
        for(int i = 0;i<arr.size();i++){
            System.out.print("A" + arr.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int start[] = {1,0,3,5,8,5};
        int end[] =   {2,6,4,7,9,9,};
        activitySelect(start, end);
    }
}