public class CircularQueues {
    public static class Queues{
        static int rare;
        static int size;
        static int front;
        static int arr[];
        Queues(int n){
            rare = -1;
            front = -1;
            size = n;
            arr = new int[n];
        }
        public static boolean isEmpty(){
            return rare == -1;
        }
        public static boolean isFull(){
            return (rare+1)%size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queues is full");
                return;
            }
            rare = (rare+1)%size;
            if(front == -1){
                front = 0;
            }
            arr[rare] =data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queues is empty");
                return -1;
            }
            int tmep = arr[front];
            
            if(rare == front){
                rare =front =-1;
            }else{
                front = (front+1)%size;
            }
            return tmep;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queues is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        Queues q = new Queues(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
