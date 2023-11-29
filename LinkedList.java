public class LinkedList {
    public static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
       public static Node head;
       public static Node tail;

       public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

       }
       public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
       }

       //printing
       public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
       }


       public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;

        if(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1 temp-prev
        newNode.next=temp.next;
        temp.next=newNode;
       }
       public void length(){
        Node current=head;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }
        System.out.println("Length of the linked list is "+count);
       }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        
        ll.addFirst(1);
      
        ll.addLast(4);
        
        ll.addLast(5);
       
        ll.add(2, 3);
        ll.print();
        ll.length();
        
    }
}
