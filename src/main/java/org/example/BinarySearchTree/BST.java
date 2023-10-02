package org.example.BinarySearchTree;

public class BST {

    static class Node{
        int data;
        Node left;
        Node right;


        Node(int data){
            this.data = data;
        }

    }
    public static Node insert(Node root, int val){
        if(root == null){
           root = new Node(val);
           return  root;
        }
        if(root.data > val){
          root.left =  insert(root.left,val);
        }else {
            root.right = insert(root.right,val);
        }
         return  root;
    }


    public static void inorder(Node root){
        if(root == null){
            return;
        }
            inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }


    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            return  search(root.left, key);
        } else if (root.data == key) {
            return  true;
        } else {
            return search(root.right,key);
        }
    }

    // Deleting a Node ------\
    public static Node delete(Node root, int val){
        if(root.data > val){
          root.left =  delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right,val);
        }else{
            // case 1
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2
            if(root.left == null){
                return  root.right;
            }
            else if(root.right == null){
                return  root.left;
            }
            //case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
          root.right =  delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
           while (root.left != null){
               root = root.left;
           }
           return  root;
    }

    // print numbers in range from x to y --

    public static void printInRange(Node root, int X, int Y){
        if(root == null){
            return;
        }
        if(root.data >= X && root.data <= Y){
             printInRange(root.left,X,Y);
            System.out.println(root.data+ " ");
            printInRange(root.right,X,Y);
        } else if (root.data >= Y) {
            printInRange(root.left,X,Y);
        }else{
            printInRange(root.right,X,Y);
        }
    }


    public static void main(String[] args) {
    int values[] = {8,5,3,1,4,6,10,11,19};
    Node root = null;
    for(int i=0;i<values.length;i++){
        root = insert(root,values[i]);
    }
    inorder(root);
        System.out.println();
//    delete(root,4);
//    inorder(root);
    printInRange(root,5,11);
     
//
//        if(search(root,18)){
//            System.out.println("found");
//        }else{
//            System.out.println("not found");
//        }
    }
}
