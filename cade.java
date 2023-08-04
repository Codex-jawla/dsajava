import java.util.ArrayList;

class stack<t>{

    private int top=-1,size;
    private ArrayList<t> st= new ArrayList<>();
    stack(int siz){
        this.size=siz;
    }

    public void push(t data){
        if(top+1==size) {
            System.out.println("Stack overflow !!!");
        }else {
            top++;
            st.add(top,data);
            System.out.println(st.get(top)+" Pushed successfully");
        }
    }

    public void pop(){
        if(top==-1) {
            System.out.println("Stack underflow !!!");
        }else {
            System.out.println(st.get(top)+ " Popped successfully");
            st.remove(top);
            top--;
        }
    }

    public void printst(){
        System.out.println(st);
    }
}

class queue<t>{

    private int front=0,rear=0,size;
    private ArrayList<t> qe= new ArrayList<>();
    queue(int siz){
        this.size=siz;
    }

    public void enqueue(t data){
        if(rear==size) {
            System.out.println("Queue overflow !!!");
        }else {
            qe.add(rear,data);
            System.out.println(qe.get(rear)+" Pushed successfully");
            rear++;
        }
    }

    public void dequeue(){
        if(rear==-1) {
            System.out.println("Queue underflow !!!");
        }else {
            System.out.println(qe.get(front)+ " Removed successfully");
            qe.remove(front);
            rear--;
        }
    }

    public void printst(){
        System.out.println(qe);
    }
}

public class lineardsa {
    public static void main(String[] args) {
    }
}
