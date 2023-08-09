import java.util.*;
public class Arraylist{
    public static int height(ArrayList<Integer> height){
        int total=0;
        for(int i = 0;i<height.size();i++){
            for(int j =i+1;j<height.size();j++){
                // int minh = ;
                // int width = j-i;
                // int curr = minh*width;
                total = Math.max(total, Math.min(height.get(i), height.get(j))*(j-i));
            }
        }
        return total;
    }
 public static void main(String args[]){
    // ArrayList<Integer> height = new ArrayList<>();
    // height.add(1);
    // height.add(8);    
    // height.add(6);
    // height.add(2);
    // height.add(5);
    // height.add(4);
    // height.add(8);        
    // height.add(3);
    // height.add(8);

    // System.out.println(height(height));
    List<List<String>> arr = new ArrayList<>();
    for(int i = 0;i<4;i++){
        arr.add(new ArrayList<>());
    }
    System.out.print(arr);
    


 }
}