package day1601_˫�����������;

import java.util.Iterator;

public class Test1 <T> implements Iterable<T>{
	private Node first;//ͷ���ڵ㣬��ʼֵnull
	private Node last;//β���ڵ㣬��ʼֵnull
	private int size;//��������
	public void add(T value) {
		Node n = new Node();
		n.value = value;//���ݷ�װ���ڵ�
		//��û�����ݣ���һ���ڵ�����
		if(size==0) {
			n.prev = n;//n��ǰ����
			n.next = n;//n�������
			this.first = n;//n��ͷ���ڵ�
			this.last = n;//n��β���ڵ�
		}else {
			//n��last
			n.prev = last;//n��ǰ����β���ڵ�
			last.next =n;//β���ڵ��������n
			//n��first
			n.next = first;//n�������ͷ���ڵ�
			first.prev = n;//ͷ���ڵ���ǰ����n
			//last����Ϊ�½ڵ�n
			last =n;
		}
		this.size ++;//�����������½������ھɵ������ size������
		
	}
	public T get(int i) {
		//û������
	Node n =getNode(i);	
	return n.value;//�ڵ��з�װ������
	}
	private Test1<T>.Node getNode(int i) {
		if(i<0||i>=size) {//Խ�� �׳��쳣
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
				n = n.next;
			}
		}else {
			n = last;
			for(int j =size-2;j>=i;j--) {
				n = n.prev;
			}
		}
		return n;
	}
	public int size () {
		return size;
	}
	private class Node {
		T value;//�ڵ��з�װ������
		Node prev;//����ǰһ���ڵ����
		Node next;//������һ���ڵ����
	}
	public Iterator<T> iterator(){//���������������ķ���
		return new Itr();
	}
	private class Itr implements Iterator<T>{
		Node n = null;
		@Override
		public boolean hasNext() {
			//�ص�first����ʾû�и�������
			if(size==0) {
				return false;
			}
			return n != first;
		}
		@Override
		public T next() {
			if(n==null) {
				n=first;
				
			}
			T v = n.value;//ȡ��ǰ�ڵ������
			n = n.next;//��nָ����һ���ڵ�
			return v;//����ȡ��������
			
		}
		
	}
}
