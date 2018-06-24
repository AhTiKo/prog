
public class DynamicStack {

	private class Node{
		Object element;
		Node next;
	
		Node(Object element, Node prevNode){
			this.element = element;
			this.next = prevNode;
		}
	}
	
	private Node top;
	private int size;
	
	DynamicStack(){
		this.top = null;
		this.size = 0;
	}
	
	public void push(Object item){
		if (size==0){
			Node newNode = new Node(item, null);
			top = newNode;
		}else{
			Node newNode = new Node(item, top);
			top = newNode;
		}
		size ++;
	}
	
	public Object pop(){
		
		if (size > 0){
			Node tempNode = top;
			top = tempNode.next;
			size --;
			return tempNode.element;
		}else{
			return null;
		}
	}
	
	public Object peek(){
		return top.element;
	}
	
	public int size(){
		return size;
	}
	
	public void clear(){
		Node tempNode = top;
		for (int i = 0; i < size; i ++){
			tempNode = top.next;
			top = null;
			top = tempNode;
		}
		top = null;
		size = 0;
	}
	
	public boolean contains(Object item){
		Node tempNode = top;
		while (tempNode != null) {
			if ((tempNode.element!=null && tempNode.element.equals(item))
			|| (tempNode.element==null) && (item==null)) {
			return true;
			}
			tempNode = tempNode.next;
		}
		return false;
	}
	
	public Object[] toArray(){
		Node tempNode = top;
		Object[] stackArray = new Object[size];
		for (int i = 0; i < stackArray.length; i ++){
			stackArray[i] = tempNode.element;
			tempNode = tempNode.next;
		}
		return stackArray;
	}
	
	public static void main(String[] args){
		DynamicStack stack = new DynamicStack();
		stack.push("1.Ivan");
		stack.push("2.Petar");
		stack.push("3.Stoian");
		stack.push("4.Vasil");
		stack.push("5.Nikolay");
		stack.push("6.Bojidar");
		System.out.println("Top: "+ stack.peek());
		System.out.println("Size "+ stack.size());
		System.out.println(stack.contains("4.Vasil"));
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("Size "+ stack.size());
		stack.push("end or start");
		while (stack.size > 0){
			System.out.println(stack.pop());
		}
		Object[] stackArray = stack.toArray();
		for(int i = 0; i < stackArray.length; i++){
			System.out.println(stackArray[i]);
		}
		System.out.println(stack.size);
		stack.push("1.Ivan");
		stack.push("2.Petar");
		stack.push("3.Stoian");
		System.out.println(stack.size);
		stack.clear();
		System.out.println(stack.size);
		
	}
}
