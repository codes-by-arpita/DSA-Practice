import java.util.*;
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
        if(head==null){
            return null;
        }
        Map<Node,Node> map = new HashMap<>();
        Node newhead=new Node(head.val);
        map.put(head, newhead);
        Node oldtemp=head.next;
        Node newtemp=newhead;

        while(oldtemp!=null){
            Node copy=new Node(oldtemp.val);
            map.put(oldtemp,copy);
            newtemp.next=copy;
            newtemp=newtemp.next;
            oldtemp=oldtemp.next;
        }

        oldtemp=head;
        newtemp=newhead;

        while(oldtemp!=null){
            newtemp.random=map.get(oldtemp.random);
            newtemp=newtemp.next;
            oldtemp=oldtemp.next;
        }
        return newhead;
    }
}