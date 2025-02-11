import java.util.Scanner;

public class Stack {
    public int top;
    public int size;
    public int[] stack;

    public Stack(int n){
        top = -1;
        size = n;
        stack = new int[n];
    }


    // []
    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }

    // add to the stack
    public int push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
        }

        return stack[++top] = data; // if 5 , top  = 4
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }

        return stack[top--]; // 3
    }

    public int peek(){
        return stack[top];
    }

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your stack size: ");
            int StackSize = sc.nextInt();

            // stack object
            Stack s = new Stack(StackSize);

            while(true){
                System.out.println("Enter stack element: (press -1 to exit): ");
                int a = sc.nextInt();
                if(a == -1){
                    break;
                }
                s.push(a);
            }
            sc.close();
//            s.push(6); // should give stack full statement
//            while (!s.isEmpty()) {
//                System.out.println("Peek is : " + s.peek());
//                System.out.println("Popping : " + s.pop());
//            }
//            s.pop();

            System.out.println("Top is : " + s.peek());
            System.out.println("Popping : " + s.pop());
            System.out.println("Top is : " + s.peek());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
