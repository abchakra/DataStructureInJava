package com.darkray.datastructure.tree;

public class InOrderBST {
	public static void main(String[] args) {
		Node rootNode = new Node(20, 10, 40);

		rootNode.getLeftNode().setLeftNode(new Node(5));
		rootNode.getLeftNode().setRightNode(new Node(15));

		rootNode.getRightNode().setLeftNode(new Node(30));
		rootNode.getRightNode().setRightNode(new Node(78));

		// inOrder(rootNode);
		postOrder(rootNode);
	}

	public static void inOrder(Node node) {
		if (node != null) {
			inOrder(node.getLeftNode());
			System.out.println(node.getNodeValue());
			inOrder(node.getRightNode());
		}
	}

	public static void postOrder(Node node) {
		if (node != null) {

			System.out.println(node.getNodeValue());
			inOrder(node.getLeftNode());
			inOrder(node.getRightNode());
		}
	}

}
