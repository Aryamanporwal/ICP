package Day12_Practice;

public class copylist_with_random_pointer {

    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    class Solution {
        public Node copyRandomList(Node head) {
            if(head == null) return null;

            Node curr = head;
            while(curr!= null){
                Node copy = new Node(curr.val);
                copy.next = curr.next;
                curr.next = copy;
                curr = copy.next;
            }

            curr = head;
            while(curr!= null){
                if(curr.random!=null){
                    curr.next.random = curr.random.next;
                }

                curr = curr.next.next;
            }

            curr = head;
            Node dummy = new Node(0);
            Node copy = dummy;

            while(curr!=null){
                Node front = curr.next.next;

                copy.next = curr.next;
                curr.next = front;

                curr = front;
                copy = copy.next;
            }

            return dummy.next;
        }
    }
}
