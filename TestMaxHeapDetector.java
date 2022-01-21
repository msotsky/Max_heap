
public class TestMaxHeapDetector {

	public static void main(String[] args) {

		// Some very feeble testing
		
		int[] maybeMaxHeap = {1, 2, 3, 4, 5, 6};
		BinTree beeTree = new BinTree(maybeMaxHeap);
		int[] maybeMaxHeap2 = {6, 5, 4, 3, 2, 1};
		BinTree beeTree2 = new BinTree(maybeMaxHeap2);
		System.out.println(" The array is a max heap (expected false): "+ beeTree.isMaxHeap());
		System.out.println(" The array is a max heap (expected true): "+ beeTree2.isMaxHeap());
		int[] maybeMaxHeap3 = {1};
		BinTree beeTree3 = new BinTree(maybeMaxHeap3);
		System.out.println(" The array is a max heap (expected true): "+ beeTree3.isMaxHeap());
		int[] maybeMaxHeap4 = {1,2,3};
		BinTree beeTree4 = new BinTree(maybeMaxHeap4);
		System.out.println(" The array is a max heap (expected true): "+ beeTree4.isMaxHeap());
	}

}
