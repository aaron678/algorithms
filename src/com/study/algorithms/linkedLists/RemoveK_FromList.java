package com.study.algorithms.linkedLists;

public class RemoveK_FromList {
	// iterative version
	ListNode<Integer> removeKFromList(ListNode<Integer> l, int k){
		ListNode<Integer> m = l;
		while (l != null){
			if (l.value == k && l == m){
				m = l.next;
				l = l.next;
			} else if (l.next != null && l.next.value == k){
				if (l.next.next == null){
					l.next = null;
				} else {
					l.next = l.next.next;
				}
			} else {
			l = l.next;
			}
		}
		
		return m;
	}
	
	// recursive not tail call optimized
	ListNode<Integer> removeKFromList2(ListNode<Integer> l, int k){
		if (l != null)
		if (l.value == k){
			l = removeKFromList(l.next, k);}
		else {
			l.next = removeKFromList(l.next, k);
		}
		
		l = l.next;
		return l;
	}
	
	void printList(ListNode<Integer> l){
		while(l != null){
			System.out.println(l.value);
			l = l.next;
		}
	}
	
	public static void main(String[] args) {
		ListNode<Integer> l = new ListNode(Integer.valueOf(1));
		l.next = new ListNode(Integer.valueOf(1));
		l.next.next = new ListNode(Integer.valueOf(2));
		l.next.next.next = new ListNode(Integer.valueOf(3));
		l.next.next.next.next = null;
		RemoveK_FromList self = new RemoveK_FromList();
		//RemoveK_FromList self = new RemoveK_FromList2();
		self.printList(l);
		l = self.removeKFromList(l,1);
		System.out.println();
		self.printList(l);
	}

}
