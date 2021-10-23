public class SLL {
    protected Node head;
    protected int size;

    public SLL(){
        head = null;
        size = 0;
    }

    protected class Node {
        public Integer data;
        public Node next;

        public Node(int d){
            data = d;
            next = null;
        }
        public Node(){
            data = null;
            next = null;
        }
    }


    public Node Search(int val){
        Node h = this.head;
 
        if(h == null){
            throw new NullPointerException(val +" not Found");
         }

         while(h != null && h.data != val ){
            h = h.next;
        }


         return h;
    }


    public void Insert(int insertdata){
        Node n = new Node(insertdata);
        n.next = this.head;
        this.head = n;
        size++;
    }

    public void Print(){
        Node h = this.head;

        if(h == null){
            throw new NullPointerException("The List is Empty");
         }


         while(h != null){
            if(h.next == null){
                System.out.println(h.data);
            }

            else{
                System.out.print(h.data + ", ");
            }
            h = h.next;
       }
    }

    


    public void Swap(int x1, int x2){
        Node curr1 = this.head, curr2 = this.head,
        prev1 = null, prev2 = null;
 
        while(curr1 != null && curr1.data != x1){
            prev1 = curr1;
            curr1 = curr1.next;
        }

        while(curr2 != null && curr2.data != x2){
            prev2 = curr2;
            curr2 = curr2.next;
        }
      
        //Swap the previous node(s) next pointer
        prev1.next = curr2;
        prev2.next = curr1;
        

        Node tmp = curr1.next;

        curr1.next = curr2.next;
        curr2.next = tmp;

    }



    public static void main(String[] args) throws Exception {
        SLL nums = new SLL();


        for(int i = 0,n = 0; i < 6; i++, n += 2){
            nums.Insert(13 - n);
        }

        nums.Print();
        nums.Swap(9,11);
        nums.Print();
    }
}
