package day1601_˫�����������;

import java.util.Iterator;

public class Test1_1 <T> implements Iterable<T>{
	private Node first;
	private Node last;
	private int size;
	public void add(T value) {
		Node n = new Node();
		n.value = value;
		if(size==0) {
			n.prev = n;
			n.next = n;
			this.first = n;
			this.last = n;
		}else {
			n.prev = last;
			last.next = n;
			n.next = first;
			first.prev = n;
			last = n;		
		}
		this.size++;
	}
	public T get(int i) {
		Node n = getNode(i);
		return n.value;
	}
	
	
	
	private Test1_1<T>.Node getNode(int i) {
		if(i<0||i>=size) {
			throw new IndexOutOfBoundsException(" "+i);
		}
		if(i==0) {
			return first;
		}else if(i==size-1) {
			return last;
		}
		Node n = null;
		if(i<size/2) {
			n = first;
			for(int j =1;j<i;j++) {
				n=n.next;
			}
		}else {
			n = last;
			for(int j =size-2;j>=i;j--) {
				n = n.prev;
			}
		}
		return n;
	}
	public int size() {
		return size;
	}
	public Iterator<T> iterator(){
		return new Itr();
	}
	private class Itr implements Iterator<T>{
		Node n = null;

		@Override
		public boolean hasNext() {
			if(size==0) {
				return false;
			}
			return n != first;
		}

		@Override
		public T next() {
			if(n==null) {
				n= first;
			}
			T v = n.value;//ȡ��ǰ�ڵ������
			n = n.next;//��nָ����һ���ڵ�
			return v;//����ȡ��������
		}
		
	}


	private class Node{
		T value;
		Node prev;
		Node next;
	}

}
