
public class MyStack {
    public static int i = 19;

    private int arr[];
    private int top = -1;
    
    public MyStack(){
        System.out.println("Constructor Called");
        this.arr = new int[5];
    }

    public  MyStack(int size){
        System.out.println("Parameterized Constructor Called");
        this.arr = new int[size];
    }

    public boolean isEmpty(){
        if(top == -1)
            return true;

        return  false;
    }

    public boolean isFull(){        
        return top == (arr.length - 1);
    }

    public void push(int val){
        if(isFull()){
            return;
        }
        top++;
        arr[top] = val;        
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty");
            // return -1;
        }

        int temp = arr[top];
        arr[top] = 0;
        top--;
        return temp;
    }

    public int peek(){
        if(isEmpty())
            return -1;
        
        return arr[top];
    }

    public void display(){
        for(int i=top; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
