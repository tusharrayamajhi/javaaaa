public class queueUSEarray {
    public static class Queues{
        static int rare;
        static int arr[];
        static int size;
        Queues(int n){
           arr = new int[n];
           size = n;
           rare = -1;
        }
        public static  boolean isEmpty(){
            return rare == -1;
        }
        public static void add(int data){
            if(rare == size-1){
                System.out.println("Queue is full");
                return;
            }
            arr[rare+1] = data;
            rare = rare + 1;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queus is empty");
                return -1;
            }
            int rem = arr[0];
            for(int i = 0;i<rare;i++){
                arr[i] = arr[i+1];
            }
            rare--;
            return rem;

        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queues is emoty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queues q = new Queues(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
