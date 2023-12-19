package com.himanshu.dsa;
public class LL {
    private Node head;
    private Node tail;
    private int size;
    LL(){
        this.size=0;
    }
    static class Node{
        private Node next;
        private int data;
        Node(int data){
            this.data=data;
        }
    }
    public void insertFront(int data){
        Node nd=new Node(data);
        if (head!=null)
            nd.next=head;
        head=nd;
        if (tail==null)
            tail=head;
        size++;
    }
    public void deleteFront(){
        head=head.next;
        if (head==null)
            tail=null;
        size--;
    }

    public void insertBetween(int data,int pos){
        Node nd=new Node(data);
        Node temp=head;
        int i=1;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        nd.next=temp.next;
        temp.next=nd;
        size++;
    }
    public void deleteBetween(int pos){
        Node temp=head;
        int i=1;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        Node temp2=temp.next;
        temp.next=temp.next.next;
        temp2=null;
        size--;
    }
    public void insertEnd(int data){
        Node nd=new Node(data);
        tail.next=nd;
        tail=nd;
        size++;
    }
    public void deleteEnd(){
        Node temp=head;
        while (temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }
    public void add(int data){
        if (tail==null)
            insertFront(data);
        else
            insertEnd(data);
    }
    public void remove(){
        deleteEnd();
    }
    public void add(int data,int pos){
        if (pos==1){
            insertFront(data);
        } else if (pos==size+1) {
            insertEnd(data);
        }else {
            insertBetween(data,pos);
        }
    }
    public void remove(int pos){
        if (pos==1){
            deleteFront();
        } else if (pos==size+1) {
            deleteEnd();
        }else {
            deleteBetween(pos);
        }
    }
    public void update(int newdata, int pos){
        Node temp=head;
        int i=1;
        while(i<pos){
            temp=temp.next;
            i++;
        }
        temp.data=newdata;
    }
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public void Size(){
        System.out.println(size);
    }
}




























//    LL list1=new LL();
//        list1.add(1);
//                list1.add(2);
//                list1.add(3);
//                list1.add(33);
//                list1.add(53);
//                list1.add(3);
//                list1.add(28);
//                list1.add(487);
//                list1.add(584);
//                list1.add(6);
//                int i=1;
//                do {
//                System.out.println("Enter choice");
//                System.out.println("For sequential data 'addition' press 1");
//                System.out.println("For specific position data 'addition' press 2");
//                System.out.println("For sequential data 'deletion' press 3");
//                System.out.println("For specific position data 'deletion' press 4");
//                System.out.println("For data 'Updation' press 5");
//                System.out.println("To print linkedlist press 6");
//                System.out.println("To print size of Linkedlist press 7");
//                System.out.println("To exit press 0");
//                Scanner sc=new Scanner(System.in);
//                int ans= sc.nextInt();
//                int data,pos;
//                i=ans;
//                switch (i){
//                case 1:
//                System.out.println("Enter data to add : ");
//                data=sc.nextInt();
//                list1.add(data);
//                break;
//                case 2:
//                System.out.println("Enter data and position to add : ");
//                data=sc.nextInt();
//                pos=sc.nextInt();
//                list1.add(data,pos);
//                break;
//                case 3:
//                list1.remove();
//                break;
//                case 4:
//                System.out.println("Enter position to delete data : ");
//                pos=sc.nextInt();
//                list1.remove(pos);
//                break;
//                case 5:
//                System.out.println("Enter new data value and position to update : ");
//                data=sc.nextInt();
//                pos=sc.nextInt();
//                list1.update(data,pos);
//                break;
//                case 6:
//                list1.print();
//                break;
//                case 7:
//                list1.Size();
//                break;
//                case 0:
//                break;
//                default:
//                System.out.println("Invalid input");
//                System.out.println("Invalid input");
//                break;
//                }
//                }while(i!=0);




 class DLL {
    private NodeD head;
    private NodeD tail;
    private int size;
    DLL(){
        this.size=0;
    }
    static class NodeD{
        private NodeD next;
        private NodeD pre;
        private int data;
        NodeD(int data){
            this.data=data;
        }
    }
    public void insertFront(int data){
        NodeD nd=new NodeD(data);
        if (head!=null){
            nd.next=head;
            head.pre=nd;
        }
        head=nd;
        if (tail==null)
            tail=head;
        size++;
    }
    public void deleteFront(){
        head=head.next;
        head.pre=null;
        if (head==null)
            tail=null;
        size--;
    }

    public void insertBetween(int data,int pos){
        NodeD nd=new NodeD(data);
        NodeD temp=head;
        int i=1;
        while(i<pos){
            temp=temp.next;
            i++;
        }
        temp.pre.next=nd;
        nd.next=temp;
        nd.pre=temp.pre;
        temp.pre=nd;
        size++;
    }
    public void deleteBetween(int pos){
        NodeD temp=head;
        int i=1;
        while(i<pos){
            temp=temp.next;
            i++;
        }
        temp.pre.next=temp.next;
        temp.next.pre=temp.pre;
        size--;
    }
    public void insertEnd(int data){
        NodeD nd=new NodeD(data);
        tail.next=nd;
        nd.pre=tail;
        tail=nd;
        size++;
    }
    public void deleteEnd(){

        tail=tail.pre;
        tail.next=null;
        size--;
    }
    public void add(int data){
        if (tail==null)
            insertFront(data);
        else
            insertEnd(data);
    }
    public void remove(){
        deleteEnd();
    }
    public void add(int data,int pos){
        if (pos==1){
            insertFront(data);
        } else if (pos==size+1) {
            insertEnd(data);
        }else {
            insertBetween(data,pos);
        }
    }
    public void remove(int pos){
        if (pos==1){
            deleteFront();
        } else if (pos==size+1) {
            deleteEnd();
        }else {
            deleteBetween(pos);
        }
    }

    public void update(int newdata, int pos){
        NodeD temp=head;
        int i=1;
        while(i<pos){
            temp=temp.next;
            i++;
        }
        temp.data=newdata;
    }
    public void print(){
        NodeD temp=head;
        while (temp!=null){
            System.out.print(temp.data+" <--> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public void Size(){
        System.out.println(size);
    }
}












class CLL{
    private NodeC head;
    private NodeC tail;
    private int size;
    CLL(){
        this.size=0;
    }
    static class NodeC{
        private NodeC next;
        private int data;
        NodeC(int data){
            this.data=data;
        }
    }
    public void insertFront(int data){
        NodeC nd=new NodeC(data);
       if (head==null){
           head=tail=nd;
           nd.next=nd;
           return;
       }

        tail.next=nd;
        nd.next=head;
        head=nd;
        size++;
    }
    public void deleteFront(){
        tail.next=head.next;
        head=tail.next;
        size--;
    }

    public void insertBetween(int data,int pos){
        NodeC nd=new NodeC(data);
        NodeC temp=head;
        int i=1;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        nd.next=temp.next;
        temp.next=nd;
        size++;
    }
    public void deleteBetween(int pos){
        NodeC temp=head;
        int i=1;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        size--;
    }
    public void insertEnd(int data){
        NodeC nd=new NodeC(data);
        tail.next=nd;
        nd.next=head;
        tail=nd;
        size++;
    }
    public void deleteEnd(){
        NodeC temp=head;
        while(temp.next!=tail){
            temp=temp.next;

        }
        temp.next=head;
        temp=tail;
        size--;
    }
    public void print(){
        NodeC temp=head;
        while (temp!=tail){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println(head.data);
    }
    public void add(int data){
        if (tail==null)
            insertFront(data);
        else
            insertEnd(data);
    }
    public void remove(){
        deleteEnd();
    }
    public void add(int data,int pos){
        if (pos==1){
            insertFront(data);
        } else if (pos==size+1) {
            insertEnd(data);
        }else {
            insertBetween(data,pos);
        }
    }
    public void remove(int pos){
        if (pos==1){
            deleteFront();
        } else if (pos==size+1) {
            deleteEnd();
        }else {
            deleteBetween(pos);
        }
    }

    public void update(int newdata, int pos){
        NodeC temp=head;
        int i=1;
        while(i<pos){
            temp=temp.next;
            i++;
        }
        temp.data=newdata;
    }
    public void Size(){
        System.out.println(size);
    }
}



















