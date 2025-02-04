public class Queue {
    public static int front = -1;
    public static int rear = -1;
    public static int size;
    public static int[] queue;

    // always insert from rear and delete from front

    public Queue(int n){
        this.size = n;
        int[] queue = new int[n];
    }

    // -1 means array has no element
    public boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    // rear diya value dei, so rear jodi (size - 1) hoy, tahole array full hoye geche
    public boolean isFull(){
        return rear == size - 1;
    }


    // start adding with rear
    public int add(int data){
        if (isFull()) {
            System.out.println("Queue is Full");
            return -1;
        }
        // queue khali thakle ekta cell add korbo, mane -1 theke 0 index e
        else if (isEmpty()) {
            rear = front = 0;
        }
        else{
            rear++;
        }
        return queue[rear] = data;
    }




    public static void main(String[] args) {
        
    }
}
