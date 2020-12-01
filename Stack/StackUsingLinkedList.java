package Stack;

public class StackUsingLinkedList {
    private Node head;

    private static class Node{
        String item;
        Node next;
    }

    public boolean isEmpty(){
            return head==null;
    }

    public String pop(){
        String item=head.item;
        head=head.next;
        return item;
    }

    public void push(String item){
        Node oldHead=head;
        Node newHead = new Node();
        newHead.item=item;
        newHead.next=oldHead;
    }

}
