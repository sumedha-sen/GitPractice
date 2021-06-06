package com.tyss.elftraining.sortingtechniques;

public class MyLinkedList {

	private Node first = null;
	private int count = 0;

	public void add(Object e) {
		if (first == null) {
			first = new Node(e, null);
			count++;
			return;
		}
		Node last = first;
		while (last.next != null) {
			last = last.next;
		}
			last.next = new Node(e, null);
			count++;
		

	}

	public int size() {
		return count;
	}
	
	public void remove(int index) {
		if(index==size()) {
			throw new IndexOutOfBoundsException();
			
		}
		if(index==0) {
			first=first.next;
			count--;
			return;
			
		}
		Node currNode=first;
		for (int i = 1; i <index; i++) {
			currNode=currNode.next;
			
		}
		currNode.next=currNode.next.next;
		count--;
		
		
	}

	public String toString() {
		if (first == null) 
			return "[]";
		
		String s = "[" + first.ele;
		Node temp = first;
		while (true) {
			temp = temp.next;
             if(temp==null) 
		      break;
			s += "," + temp.ele;
		}
			return s += "]";

		}
		

	}

