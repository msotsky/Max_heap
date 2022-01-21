
/*
 * This is a class for a binary tree that uses an array for the underlying implementation
 * 
 * For purposes of this question, you may assume that all input will be a complete tree
 * 
 */

public class BinTree {
	
	private int root;
	private int[] bTree;
	private int size;
	
	BinTree(int[] givenArray){
		bTree = givenArray.clone();
		root = bTree[0];
		size = bTree.length;
	}

	public Boolean isEmpty() {
		return (size == 0);
	}
	
	public Boolean isMaxHeap() {
		boolean ans = this.satisfiesMaxHeapProperty();
		if(ans)
			return true;
		else
			return false;
		
	}
	private Boolean satisfiesMaxHeapProperty() {
		if(this.size == 0)
			return false;
		for(int i = 0; i < this.size; i++){
			if((2* i + 1 < this.size) && (bTree[i] < bTree[(i * 2) + 1])){
				return false;
			}
		}
		return true;
	}
}
