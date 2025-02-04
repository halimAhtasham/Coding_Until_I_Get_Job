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
            if ((rear + 1) % size == front) {
                return -1;
            }
            // queue khali thakle ekta cell add korbo, mane -1 theke 0 index e
            else if (isEmpty()) {
                rear = front = 0;
            }
            else{
                rear = (rear + 1) % size;
            }
            return queue[rear] = data;
        }

        // start deleting from front
        public int remove(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            else if(front == rear){
                front = rear = -1;
            }
            else {
                front = (front + 1) % size;
            }
            return queue[front];
        }


        //display queue
        // public void display() {
        //     if (isEmpty()) {
        //         System.out.println("Queue is Empty");
        //     } else {
        //         int i = front;
        //         // Handle wrapping around by checking if front is before rear
        //         while (i != rear) {
        //             System.out.println(queue[i]);
        //             i = (i + 1) % size; // Circular increment
        //         }
        //         System.out.println(queue[rear]); // Display the last element
        //     }
        // }
        
    
    
    
    
        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.remove();
            q.remove();
            q.add(6);
            q.add(7);

            for (int i = 0; i < q.size; i++) {
                System.out.println("Index "+ i +": " +q.queue[i]);
            }


            // q.display();
            // how to show data from queue
    }
}
