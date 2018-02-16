
public class BST {
	
	BSTNode root;
	
	BST(){
		root = null;
	}
	
	void insert(int key) {
		root = insertkey(root, key);
	}
	
	BSTNode insertkey(BSTNode root, int key) {
		if(root == null) {
			root = new BSTNode(key);
			return root;
		}
		if(key < root.key) {
			root.left = insertkey(root.left, key);
		}else {
			root.right = insertkey(root.right, key);
		}
		return root;
	}
	
	void inorder() {
		System.out.println("In Order Traversal");
		inorderTraverse(root);
	}
	void inorderTraverse(BSTNode root){
		if(root != null) {
			inorderTraverse(root.left);
			System.out.print(root.key);
			inorderTraverse(root.right);
		}
	}
	
	void preorder() {
		System.out.println("Pre Order Traversal");
		preorderTraverse(root);
	}
	void preorderTraverse(BSTNode root){
		if(root != null) {
			System.out.print(root.key);
			preorderTraverse(root.left);
			preorderTraverse(root.right);
		}
	}
	
	void postorder() {
		System.out.println("Post Order Traversal");
		postorderTraverse(root);
	}
	void postorderTraverse(BSTNode root){
		if(root != null) {
			preorderTraverse(root.left);
			preorderTraverse(root.right);
			System.out.print(root.key);
		}
	}
	
	boolean searchForAKey(int key) {
		return search(root,key);
	}
	
	boolean search(BSTNode root, int key) {
		if(root == null) {
			return false;
		}
		if(root.key == key) {
			return true;
		}else if(root.key > key) {
			return search(root.left, key);
		}else {
			return search(root.right, key);
		}
	}
	
	void delete(int key) {
		deleteKey(root,key);
	}
	
	BSTNode deleteKey(BSTNode root, int key) {
		if(root.key == key){
			inorder();
			if(root.left == null && root.right == null) {
				root = null;
				return root;
			}
			return root;
		}else if(root.key>key) {
			return root.left = deleteKey(root.left,key);
		}else{
			return root.right = deleteKey(root.right,key);
		}
	}
	
	public static void main(String args[]) {
		BST tree = new BST();
		
		tree.insert(5);
		tree.insert(1);
		tree.insert(8);
		tree.insert(4);
		tree.delete(4);
		tree.inorder();
		tree.preorder();
		System.out.println(tree.searchForAKey(2));
	}
	
}

class BSTNode {
	int key;
	BSTNode left;
	BSTNode right;
	
	public BSTNode(int key) {
		this.key = key;
		left = null;
		right = null;
	}
}
