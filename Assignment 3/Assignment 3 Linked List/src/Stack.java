
public class Stack {
    protected int top, head, tail, max;
    int[] stackArray;

    public Stack(int stackSize){
        this.max = stackSize;
        stackArray = new int[stackSize];
        top = 0;
    }



    public boolean stackEmpty(){
        if(this.top == 0){
            return true;
        }
        else{
            return false;
        }
    }



    public void push(int val){
        ++this.top;
        this.stackArray[this.top] = val;
        
        System.out.println("Added: " + this.stackArray[this.top] + " to the stack");
    }

    public void pop(){
        if(this.stackEmpty()){
            throw new Error("Underflow (The Stack is empty)");
        }
        else{
            --this.top;
            System.out.println("Removed: " + this.stackArray[this.top] + " from the stack");

        }
    }

    public void printStack(){
        System.out.print("The stack currently holds: ");

        for(int i = 0; i < this.top; i++){
            System.out.print(this.stackArray[i] + ", ");
        }
        System.out.println(this.stackArray[this.top]);

    }


    public static void main(String[] args) throws Exception {
        Stack myStack = new Stack(10);
        myStack.push(7);
        myStack.pop();
        myStack.push(5);
        myStack.push(9);
        myStack.pop();
        myStack.push(11);
        myStack.push(3);
        myStack.push(17);
        myStack.printStack();

    }
}
