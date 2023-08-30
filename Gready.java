import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Gready{
    public static void activitySelect(int start[],int end[]){
        int arr[][] = new int[start.length][end.length];
        for(int i = 0;i<start.length;i++){
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }
        Arrays.sort(arr,Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0][0]);
        int minh = arr[0][2];
        for(int i = 0;i<start.length;i++){
            if(arr[i][1]>=minh){
                ans.add(arr[i][0]);
                minh = arr[i][2];
            }
        }
        for(int i = 0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
    public static void main(String args[]){
        int start[] = {1,0,3,5,8,5};
        int end[] =   {2,6,4,7,9,9,};
        activitySelect(start, end);
    }
}