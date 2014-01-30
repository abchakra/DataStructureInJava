package com.darkray.datastructure.tree;

public class BalancedTree {
	public static void main(String[] args) {
		Node rootNode = new Node(20, 10, 40);

		Node left1 = rootNode.getLeftNode();
		Node right1 = rootNode.getRightNode();
		left1.setNodes(5, 15);

		// correct balanced
		// right1.setNodes(30, 78);

		// unbalanced test
		right1.setLeftNode(new Node(60));
		right1.getLeftNode().setLeftNode(new Node(89));

		System.out.println(isBalanced(rootNode));
	}

	public static int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.getLeftNode()),
				maxDepth(root.getRightNode()));
	}

	public static int minDepth(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.min(minDepth(root.getLeftNode()),
				minDepth(root.getRightNode()));
	}

	public static boolean isBalanced(Node root) {
		return (maxDepth(root) - minDepth(root) <= 1);
	}
}
