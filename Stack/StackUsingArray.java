package Stack;

public class StackUsingArray {
    private String[] s;
    private  int N=0;
    public StackUsingArray(int capacity){
         s=new String[1];
    }
    public  void push(String item){
        if(N==s.length) resize(2*s.length); // Repeated Doubling: resizes the array to twice the size if the length of elements in array is equal to the length of array
        s[N++]=item;
    }
    public String pop(){
        String item=s[--N];
        s[N]=null; //To avoid loitering so that the pointer to N is set to null and garbage collector can reuse it
        if(N>0 && N==s.length/4) resize(s.length/2);// resizes the array to 1/2 if the elements are half of the stack
        return item;
    }

    //resize the array if the according to the cases mentioned above
    private  void resize(int capacity){
        String[] copy=new String[capacity];
        for(int i=0;i<N;i++){
            copy[i]=s[i];
            s=copy;
        }
    }
}
