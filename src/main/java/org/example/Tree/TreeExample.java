package org.example.Tree;


public class TreeExample {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }



    public static void main(String[] args) {

        int[] nodes = {8, 3, 10,-1,-1, 1, 6, 14, 4, 7, 13};
       BinaryTree tree = new BinaryTree();
      Node root = tree.buildTree(nodes);
        System.out.println(root.data + "root data");
        System.out.println(sumOfNodes(root));
    }
}
