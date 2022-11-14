package trees;

// Build a Tree
// Create Certain Nodes 
// Insert
// Find
// Traversal

class Tree {
	private class Node {
		private int value;
		private Node leftChild;
		private Node rightChild;

		public Node(int value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Node=" + value;
		}
	}

	private Node root;

	public void insert(int value) {

		var node = new Node(value);

		if (root == null) {
			root = node;
			return;
		}

		var current = root;
		while (true) {
			if (value < current.value) {
				if (current.leftChild == null) {
					current.leftChild = node;
					break;
				}
				current = current.leftChild;
			} else {
				if (current.rightChild == null) {
					current.rightChild = node;
					break;
				}
				current = current.rightChild;
			}
		}
	}

	public boolean find(int value) {
		var current = root;
		while (current != null) {
			if (value < current.value)
				current = current.leftChild;
			else if (value > current.value)
				current = current.rightChild;
			else
				return true;
		}
		return false;
	}

	public void traversePreOrder() {
		traversePreOrder(root);
	}

	private void traversePreOrder(Node root) {
		if (root == null)
			return;

		System.out.println(root.value);
		traversePreOrder(root.leftChild);
		traversePreOrder(root.rightChild);
	}

}

public class TreesExample {

	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.insert(7);
		tree.insert(4);
		tree.insert(1);
		tree.insert(9);
		tree.insert(8);
		tree.insert(10);

		System.out.println(tree.find(1));
		System.out.println(tree.find(5));
		
		tree.traversePreOrder();

	}

}
