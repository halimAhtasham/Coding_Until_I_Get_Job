public class Stack {
    public int top;
    public int size;
    public int[] stack;

    public Stack(int n){
        top = -1;
        size = n;
        stack = new int[n];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public int push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
        }

        return stack[++top] = data;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }

        return stack[top--];
    }

    public int peek(){
        return stack[top];
    }

    public static void main(String[] args) {

        try {
            Stack s = new Stack(5);
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
//            s.push(6);
            while (!s.isEmpty()) {
                System.out.println("Peek is : " + s.peek());
                System.out.println("Popping : " + s.pop());
            }
            s.pop();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
