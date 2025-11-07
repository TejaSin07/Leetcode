/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        
        Node temp = head;
       
        while(temp != null ){
            Node nextNode = temp.next;
            if(temp.child != null){
                temp.next = temp.child;
                temp.child = null;
                temp.next.prev = temp;
                Node newPrev = helper(temp.next);
                newPrev.next = nextNode;
                if(nextNode!=null)nextNode.prev = newPrev;
            }
            temp = nextNode;    
        }
        return head;
    }
    private Node helper(Node head){
        Node temp = head;
        
        while(temp.next != null){
            Node nextNode = temp.next;
            if(temp.child != null){
                temp.next = temp.child;
                temp.child = null;
                temp.next.prev = temp;
                Node newPrev = helper(temp.next);
                newPrev.next = nextNode;
                nextNode.prev = newPrev;
            }
            temp = nextNode;
        }
        while(temp.child != null){
            temp.next = temp.child;
            temp.child = null;
            temp.next.prev = temp;
            temp = temp.next;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
    
}