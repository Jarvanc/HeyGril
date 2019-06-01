package day1601_双向链表迭代器;

import java.util.Iterator;

public class Test1 <T> implements Iterable<T>{
	private Node first;//头部节点，初始值null
	private Node last;//尾部节点，初始值null
	private int size;//数据数量
	public void add(T value) {
		Node n = new Node();
		n.value = value;//数据封装到节点
		//还没有数据，第一个节点数据
		if(size==0) {
			n.prev = n;//n向前引用
			n.next = n;//n向后引用
			this.first = n;//n是头部节点
			this.last = n;//n是尾部节点
		}else {
			//n和last
			n.prev = last;//n向前引用尾部节点
			last.next =n;//尾部节点向后引用n
			//n和first
			n.next = first;//n向后引用头部节点
			first.prev = n;//头部节点向前引用n
			//last设置为新节点n
			last =n;
		}
		this.size ++;//无论是链表新建还是在旧的上添加 size都自增
		
	}
	public T get(int i) {
		//没有数据
	Node n =getNode(i);	
	return n.value;//节点中封装的数据
	}
	private Test1<T>.Node getNode(int i) {
		if(i<0||i>=size) {//越界 抛出异常
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
		T value;//节点中封装的数据
		Node prev;//引用前一个节点对象
		Node next;//引用下一个节点对象
	}
	public Iterator<T> iterator(){//辅助创建迭代器的方法
		return new Itr();
	}
	private class Itr implements Iterator<T>{
		Node n = null;
		@Override
		public boolean hasNext() {
			//回到first，表示没有更多数据
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
			T v = n.value;//取当前节点的数据
			n = n.next;//让n指向下一个节点
			return v;//返回取出的数据
			
		}
		
	}
}
