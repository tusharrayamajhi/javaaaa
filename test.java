
import java.util.ArrayList;
import java.util.List;
/*
   [[1],
   [1,1],
  [1,2,1],
 [1,3,3,1],
[1,4,6,4,1]]
 
*/
public class test {
    public static List<Integer> generate(int numRows){
        List<List<Integer>> sc = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            sc.add(new ArrayList<>());
        }
        sc.get(0).add(1);
        sc.get(1).add(1);
        sc.get(1).add(1);
        for(int i =2;i<sc.size();i++){
            for(int j = 0;j<=i;j++){
                if(j == 0 || j == i){
                    sc.get(i).add(1);
                }else{
                    sc.get(i).add(sc.get(i-1).get(j-1)+sc.get(i-1).get(j));
                }
            }
        }
        return sc.get(3);
        
    }
    
    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
       for(int i = 0;i<5;i++){
        arr.add(new ArrayList<Integer>());
       }
       arr.get(0).add(5);
       System.out.println(generate(5));
    // int a =1;
    // System.out.println((char)1);
    }
}
