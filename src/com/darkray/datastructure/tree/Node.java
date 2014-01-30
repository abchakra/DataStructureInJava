package com.darkray.datastructure.tree;

public class Node {

	String nodeID;
	int nodeValue;
	Node leftNode;
	Node rightNode;

	public Node(int i, int j, int k) {
		nodeValue = i;
		leftNode = new Node(j);
		rightNode = new Node(k);
	}

	public Node(int j) {
		nodeValue = j;
	}

	public String getNodeID() {
		return nodeID;
	}

	public void setNodeID(String nodeID) {
		this.nodeID = nodeID;
	}

	public int getNodeValue() {
		return nodeValue;
	}

	public void setNodeValue(int nodeValue) {
		this.nodeValue = nodeValue;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public void setNodes(int i, int j) {
		leftNode = new Node(i);
		rightNode = new Node(j);

	}

}
