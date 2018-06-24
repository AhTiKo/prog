
public class DynamicList {

	private class Node{
		Object element;
		Node next;
		Node prev;
		
		Node (Object element, Node prevNode, Node nextNode){
			this.element = element;
			this.prev = prevNode;
			this.next = nextNode;	
		}	
	}
	
	private Node head;
	private Node tail;
	private int count;
	
	public DynamicList(){
		this.head = null;
		this.tail = null;
		this.count = 0;
	}
	
	public void add(Object item){
		if (head == null){
			head = new Node(item, null, null);
			tail = head;
		}else{
			Node newNode = new Node(item, tail, null);
			tail.next = newNode;
			tail = newNode;
		}
		count ++;
	}
	
	public void add(int index, Object item){
		if(index >= count || index < 0){
			throw new IndexOutOfBoundsException("Invalid index:" + index);
		}
		
		if (index == 0){
			Node newNode = new Node(item, null, head );
			head.prev = newNode;
			head = newNode;
		}else{
			Node prevNode = this.head;
			for (int i = 0; i < index - 1; i ++){
				prevNode = prevNode.next;
			}
			Node nextNode = prevNode.next;
			Node newNode = new Node(item, prevNode, nextNode);
			prevNode.next = newNode;
			nextNode.prev = newNode;
		}
		count ++;
	} 
	
	public Object get(int index){
		if (index >= count || index < 0){
			throw new IndexOutOfBoundsException("Invalid index:" + index);
		}
		Node tempNode = this.head;
		for (int i = 0; i < index; i ++){
			tempNode = tempNode.next;
		}
		return tempNode.element;
		
	}
	
	public int size(){
		return count;
	}
	
	public boolean isEmpty(){
		return (count == 0);
	}
	
	public void remove(int index){
		if (index >= count || index < 0){
			throw new IndexOutOfBoundsException("Invalid index:" + index);
		}
		Node tempNode = this.head;
		
		if (index == 0){
			head = head.next;
			head.prev = null;
	
		}else{
			for (int i = 0; i < index; i ++){
				tempNode = tempNode.next;
			}
			tempNode.prev.next = tempNode.next;
			tempNode.next.prev = tempNode.prev;
		}
		count --;
		System.out.println("index "+ index + "; "+ tempNode.element + " removed");
		
	}
	
	public void remove(Object item){
		Node tempNode = head;
		int maches = 0;
		for (int i = 0; i < count; i ++){
			if (tempNode.element == item){
				 remove(i);
				 maches = 1;
			}
			tempNode = tempNode.next;
		}
		if (maches == 0){
			System.out.println("Element is not found in the list!");
		}
	}
	
	public int indexOf(Object item){
		Node tempNode = this.head;
		int maches = -1;
		for (int i = 0; i < count; i ++){
			if (tempNode.element == item){
				 maches = i;	
			}
			tempNode = tempNode.next;
		}
		return maches;	
	}
	
	public boolean contains(Object item) {
		int index = indexOf(item);
		boolean found = (index != -1);
		return found;
	}
	
	public void clear(){
		head = null;
		tail = null;
		count = 0;	
	}
	
	public void sortInt(){
		Node bubbleNode = this.head;
		for (int i = 0; i < count; i ++){
			for ( int j = 0; j < count; j ++){
				if ((Integer) bubbleNode.element > (Integer) bubbleNode.next.element){
					Node tempNode = bubbleNode;
					bubbleNode.element = bubbleNode.next.element;
					bubbleNode.next.element = tempNode.element;
					
				}
				bubbleNode = bubbleNode.next;
			}
		}
	}
	
	public static void main(String[] args){
		DynamicList shoppingList = new DynamicList();
		shoppingList.add("Milk");
		shoppingList.add("Honey");
		shoppingList.add("Olives");
		shoppingList.add("Beer");
		shoppingList.remove("Olives");
		System.out.println("We need to buy:");
		for (int i=0; i<shoppingList.size(); i++) {
		System.out.println(shoppingList.get(i));
		}
		System.out.println("Do we have to buy Bread? " +
		shoppingList.contains("Bread"));
		shoppingList.add(2,"Bread");
		System.out.println("We need to buy:");
		for (int i=0; i<shoppingList.size(); i++) {
		System.out.println(shoppingList.get(i));
		}
	}
	
	
}