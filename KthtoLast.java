package returnKthtoLast;

public class KthtoLast {
	
	
	public static int returnKth(LinkedListNode head, int k){
		if (head == null){
			return 0;
		} else {
			int index = returnKth(head.next, k) + 1;
			if (index == k){
				System.out.println(k + "th to last node is" + head.data);
			}
			return index; 
		}	
	}
}
