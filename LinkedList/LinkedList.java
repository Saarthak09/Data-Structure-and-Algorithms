package LinkedList;

// Node class
class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

//Linked list class extends the Node class
public class LinkedList extends Node {
    //head node
    Node head;

    //append method
    public void append(int data){
        if(head==null){
            head=new Node(data);
            return ;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=new Node(data);
    }

    //prepend method
    public void prepend(int data){
        Node newHead=new Node(data);
        newHead.next=head;
        head=newHead;
    }


    //delete method
    public void delete(int data){
        if(head==null){
            return;
        }
        //if the node we want to delete is the head node
        if(head.data==data){
            head=head.next;
            return;
        }
        Node current=head;
        while (current.next!=null){
            //if the node we want to delete is the next node
            if(current.next.data==data){
                //then move around that node and set the pointer to next node of the node we want to delete
                current.next=current.next.next;
                return ;
            }
            //else just increment the current pointer
            current=current.next;
        }
    }

    //Constructor for LinkedList class which inherits the node class constructor
    public LinkedList(int data) {
        super(data);
    }
}


