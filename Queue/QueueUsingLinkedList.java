package Queue;

public class  QueueUsingLinkedList {
    private Node head,last; // two pointers one for head of the linked list and the other one for the last node of the linked list ..

    //Node class declaration
    private static class Node{
        String item;
        Node next;
    }
    // method to check whether the queue is empty or not
    public boolean isEmpty(){
        return head==null;
    }
    //An element in an queue is inserted from the enqueue
    public void enqueue(String item){
        Node oldlast=last; // store the last pointer address in the new array
        Node last=new Node();// declare a new node
        last.item=item;
        last.next=null;
        if(isEmpty()) head=last; //if the array is empty intialise the last poiter to be equal to the head node
        else oldlast.next=last;//point the pointer of oldlast node to the next node
    }
    //deletion of an element form the queue is from the dequeue side
    public String dequeue(){
        String item=head.item;
        head=head.next;
        if(isEmpty()) last=null;
        return item;
    }


}
