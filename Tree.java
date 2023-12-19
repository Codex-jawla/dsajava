package com.himanshu.dsa;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        int idx=-1;
        public  Node buildtree(int[] values){
            idx++;
            if (values[idx]==-1){
                return null;
            }
            Node newnode = new Node(values[idx]);
            newnode.left=buildtree(values);
            newnode.right=buildtree(values);

            return newnode;
        }

    }

    static void preorder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    static void postorder(Node root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    static void levelorder(Node root){
        Queue<Node> q =new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currnode =q.remove();
            if (currnode==null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else{
                System.out.print(currnode.data+" ");
                if (currnode.left!=null){
                    q.add(currnode.left);
                }
                if (currnode.right!=null){
                    q.add(currnode.right);
                }
            }
        }

    }
    static void no_of_node(Node root){

    }

    public static void main(String[] args) {
        int value[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int t2[] ={1,2,4,5,-1,-1,6,-1,-1,-1,3,7,8,-1,9,-1,-1,-1,-1};
        BinaryTree tree1=new BinaryTree();
        BinaryTree tree2=new BinaryTree();
        Node root1=tree1.buildtree(value);
        Node root2=tree2.buildtree(t2);
        System.out.println(root2.data);
        preorder(root1);
        System.out.println("preorder");
        inorder(root1);
        System.out.println("inorder");
        postorder(root1);
        System.out.println("postorder");
        levelorder(root1);
        System.out.println("levelorder");
        System.out.println();
        preorder(root2);
        System.out.println("preorder");
        inorder(root2);
        System.out.println("inorder");
        postorder(root2);
        System.out.println("postorder");
        levelorder(root2);
        System.out.println("levelorder");
    }
}
