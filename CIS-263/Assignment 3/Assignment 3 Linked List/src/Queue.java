public class Queue {
   
    protected int top, head, tail, max;
    int[] queueArray;

   
    public Queue(int queueSize){
        this.max = queueSize;
        queueArray = new int[this.max];
        head = 0;
        tail = 0;
    }


    public void printQueue(){
        System.out.print("The queue currently holds: ");

        for(int i = this.head; i < this.tail - 1; i++){
            System.out.print(this.queueArray[i] + ", ");
        }
        System.out.println(this.queueArray[this.tail - 1]);

    }


    public void enqueue(int val){
        this.queueArray[this.tail] = val;
        if(this.tail == this.max){
            this.tail = 1;
        }
        else{
            ++this.tail;
        }
    }

    public void dequeue(){
        int val = this.queueArray[this.head];
        if(this.head == this.max){
            this.head = 1;
        }
        else{
            ++this.head;
        }
        System.out.println("Removed " + val + "from the queue");
    }

    public static void main(String[] args) throws Exception {
        Queue myQueue= new Queue(10);
        myQueue.enqueue(15);
        myQueue.enqueue(6);
        myQueue.enqueue(2);
        myQueue.enqueue(9);
        myQueue.enqueue(17);
        myQueue.enqueue(3);
        myQueue.printQueue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.printQueue();
        myQueue.dequeue();
        myQueue.dequeue();
    }
}
 

