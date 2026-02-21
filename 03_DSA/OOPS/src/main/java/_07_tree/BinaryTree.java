package _07_tree;

import java.util.Scanner;

public class BinaryTree {

    public class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;

    Scanner sc = new Scanner(System.in);

    public BinaryTree() {
        this.root = createTree();
    }

    private Node createTree() {
        // TODO Auto-generated method stub
        int item = sc.nextInt();// val input
        Node nn = new Node();
        nn.val = item;

        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = createTree();// rec creates left subtree
        }
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = createTree();// rec creates right subtree
        }
        return nn;
    }

    public void Display() {
        display(root);
    }

    private void display(Node root) {
        // TODO Auto-generated method stub
        if (root == null) {
            return;
        }
        String s = root.val + "";
        if (root.left != null) {
            s = root.left.val + " <== " + s;
        } else {
            s = ". <== " + s;
        }
        if (root.right != null) {
            s = s + " ==> " + root.right.val;
        } else {
            s = s + " ==> .";
        }
        System.out.println(s);
        display(root.left);
        display(root.right);

    }

    public int Max() {
        return max(root);
    }

    private int max(Node root) {
        // TODO Auto-generated method stub
        return 0;
    }
}