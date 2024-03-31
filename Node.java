import java.util.*;
import java.lang.*;
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int key){
            data=key;
        }
    public static void inorderTraversal(Node root){
        if(root==null){
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal( root.right);
    }
    public static void preorderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static void postorderTraversal(Node root){
        if(root==null){
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        Node root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        //inorderTraversal(root);{4,2,5,1,6,3,7}
       //preorderTraversal(root);{1,2,4,5,3,6,7}
      // postorderTraversal(root);{4,5,2,6,7,3,1}
    }
}

