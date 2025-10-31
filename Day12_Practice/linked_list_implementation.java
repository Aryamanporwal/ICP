package Day12_Practice;

public class linked_list_implementation {
    public static class Node{
        int val;
        Node next;
        Node(int data){
            this.val = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            tail.next = temp;
            tail = temp;
        }

        public void insertAtend( int val){
            Node temp= new Node(val);
            Node t = head;
            while(t.next !=null){
                t = t.next;
            }
            t.next = temp;
        }

        public void deleteAtBegin(){
            head = head.next;
            head.next = head.next;
        }

        public void deleteAtEnd(){
            Node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }

            temp.next = null;
        }


        public  void insertAtBegin( int val){
                Node temp = new Node(val);
                temp.next = head;
                head = temp;
        }

        public  void insertAtMiddle( int val){
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }

            Node temp = new Node(val);
            temp.next = slow.next;
            slow.next = temp;
        }

        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+"->");
                temp = temp.next;
            }
        }

        public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.insertAtEnd(0);
            ll.insertAtEnd(1);
            ll.insertAtEnd(2);
            ll.insertAtEnd(3);
            ll.insertAtEnd(4);

            ll.insertAtMiddle(9);
            ll.deleteAtBegin();
            ll.deleteAtEnd();   

            ll.display();

        }
    }
}
