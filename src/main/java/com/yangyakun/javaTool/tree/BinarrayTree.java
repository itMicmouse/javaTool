package com.yangyakun.javaTool.tree;

public class BinarrayTree {

    Node<String> root;

    public BinarrayTree(String data) {
        root = new Node<>(data,null,null);
    }

    public void create() {

        Node<String> nodeB = new  Node<String>("B",null,null);
        Node<String> nodeC = new  Node<String>("C",null,null);
        Node<String> nodeD = new  Node<String>("D",null,null);
        Node<String> nodeE = new  Node<String>("E",null,null);
        Node<String> nodeF = new  Node<String>("F",null,null);
        Node<String> nodeG = new  Node<String>("G",null,null);
        Node<String> nodeH = new  Node<String>("H",null,null);
        Node<String> nodeI = new  Node<String>("I",null,null);
        Node<String> nodeJ = new  Node<String>("J",null,null);

        root.leftChild = nodeB;
        root.rightChild = nodeC;
        nodeB.leftChild = nodeD;
        nodeD.leftChild = nodeG;
        nodeD.rightChild = nodeH;
        nodeH.leftChild = nodeI;
        nodeC.leftChild = nodeE;
        nodeE.rightChild = nodeJ;
        nodeC.rightChild = nodeF;

    }

    /**
     * 中序遍历
     */
    public void middle(Node<String> root){
        if(root == null){
            return;
        }
        middle(root.leftChild);
        System.out.println("middle:"+root.data);
        middle(root.rightChild);
    }

    /**
     * 前序遍历
     */
    public void left(Node<String> root){
        if(root == null){
            return;
        }
        System.out.println("left:"+root.data);
        left(root.leftChild);
        left(root.rightChild);
    }
    /**
     * 后序遍历
     */
    public void right(Node<String> root){
        if(root == null){
            return;
        }
        right(root.leftChild);
        right(root.rightChild);
        System.out.println("right:"+root.data);
    }

    public static void main(String[] args) {
        BinarrayTree tree = new BinarrayTree("A");
        tree.create();
        tree.middle(tree.root);
        tree.left(tree.root);
        tree.right(tree.root);

    }

    public class Node<T>{
        T data;
        Node<T> leftChild;
        Node<T> rightChild;

        public Node(T data, Node<T> leftChild, Node<T> rightChild) {
            this.data = data;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }

}
