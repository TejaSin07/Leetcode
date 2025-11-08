class Solution {
    public Node copyRandomList(Node head) {
        
        Node temp = head;

        //creating copy node in between original node
        while(temp != null){
            
            Node next = temp.next;
            Node newNode = new Node(temp.val);
            temp.next = newNode;
            newNode.next = next;
            temp = next;
        }

        //giving random point ref to copied node
        temp = head;
        while(temp != null){
            if(temp.random != null)temp.next.random = temp.random.next;
            temp = temp.next.next;
        }

   
        //remove original node;
        Node newList = new Node(-1);
        Node dummy = newList;

        temp = head;
        while(temp != null){

            Node nextNode = temp.next;
            dummy.next = nextNode;
            temp.next = temp.next.next;
            temp = temp.next;
            dummy = dummy.next;
        }
        return newList.next;
    }
}