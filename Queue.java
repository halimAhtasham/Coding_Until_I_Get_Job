public class Queue {
    public int front;
    public int rear;
    public int size;
    public int[] queue;
    
        // always insert from rear and delete from front
    
        public Queue(int n){
            this.front = -1;
            this.rear = -1;
            this.size = n;
            this.queue = new int[n];
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


        //display queue
        public void display(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
            }
            else{
                for (int i = front; i <= rear; i++) {
                    System.out.println(queue[i]);
                }
                
            }
        }
    
    
    
    
        public static void main(String[] args) {
            System.out.println("Hello");
            Queue q = new Queue(5);
            System.out.println("Hello");
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);

            q.display();
            // how to show data from queue
    }
}
