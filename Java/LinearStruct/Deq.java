
public class Deq {
	
	private class Node{
		Object element;
		Node next;
		
		Node(Object element, Node prevNode){
			this.element = element;
			this.next = prevNode;
		}
	}
	
	private Node first;
	private Node last;
	private int size;
	
	Deq(){
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public void addFirst(Object item){
		if (first == null){
			Node newNode = new Node(item, null);
			first = newNode;
		}else{
			Node newNode = new Node(item,first);
			first = newNode;
		}
		size ++;
	}
	
	public void addLast(Object item){
		if (last == null){
			Node newNode = new Node(item, null);
			last = newNode;
		}else{
			Node newNode = new Node(item,last);
			last = newNode;
		}
		size ++;
	}
	
	public Object removeFirst(){
		if (first != null){
			Node tempNode = first;
			first = first.next;
			size --;
			return tempNode.element;
		}else{
			return null;
		}
	}
	
	public Object removeLast(){
		if (last != null){
			Node tempNode = last;
			last = last.next;
			size --;
			return tempNode.element;
		}else{
			return null;
		}
	}
	
	public Object first(){
		return first.element;
	}
	
	public Object last(){
		return last.element;
	}
	
	public boolean isEmpty(){
		return (first == null || last == null);
	}
	
	public int size(){
		return size;
	}
	
	public void clear(){
		while (first != null){
			first = first.next;
		}
		while (last != null){
			last = last.next; 
		}
	}

}
