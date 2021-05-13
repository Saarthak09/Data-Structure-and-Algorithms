package Stack;

public class StackUsingLinkedList<Item> {
    private Node head;

    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
            return head==null;
    }

    public Item pop(){
        Item item=head.item;
        head=head.next;
        return item;
    }

    public void push(String item){
        Node oldHead=head;
        Node newHead = new Node();
        newHead.item= (Item) item;
        newHead.next=oldHead;
    }

}
