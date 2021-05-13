package Trees;

public class BinaryTree {

    //Node class
    public class Node{
        //Left and Right pointer for each child
        Node left, right;
        //data
        int data;
        //constructor
        public Node(int data){
            this.data=data;
        }

        //To insert a value in the BST
        public void insert(int value){
            if(value<=data){
                if(left==null){
                    left=new Node(value);
                }
                else{
                    left.insert(value);
                }
            }
            else{
                if(right==null){
                    right=new Node(value);
                }
                else{
                    right.insert(value);
                }
            }
        }

        //To check whether the tree contains the value or not
        public boolean contains(int value){
            if(value==data){
                return true;
            }
            else if(value<data){
                if(left==null){
                    return false;
                }
                else{
                    return left.contains(value);
                }
            }
            else{
                if(right==null){
                    return false;
                }
                else{
                    return right.contains(value);
                }
            }
        }

        //To print the In-Order traversal of the BST
        public void printInOrder(){
            if(left!=null){
                left.printInOrder();
            }
            System.out.println(data);
            if(right!=null){
                right.printInOrder();
            }
        }
    }


}
