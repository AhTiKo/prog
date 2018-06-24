
public class CyclicQueue {

	private Object[] array;
	private int head;
	private int tail;
	private int size;
	private int capacity = 4;
	
	public CyclicQueue(){
		array = new Object[capacity];
		this.head = 0;
		this.tail = 0;
		this.size = 0;
	}
	
	public int size(){
		return size;
	}
	
	public void offer(Object element){
		if (size == capacity){
			resize();
		}
		if (tail == capacity){
			tail = 0;
		}
		array[tail] = element;
		tail ++;
		size ++;
	}
	
	private void resize(){
		Object[] newArray = new Object[capacity*2];
		if (head < tail){
			int count = 0;
			for (int i = head; i < tail; i++){
				newArray[count] = array[i];
				count ++;
			}
			head = 0;
			tail = count;
		}else{
			int count = 0;
			for (int i = head; i < capacity; i ++){
				newArray[count] = array[i];
				count ++;
			}
			for (int i= 0; i < tail; i ++){
				newArray[count] = array[i];
				count ++;
			}
			head = 0;
			tail = count;
			capacity = capacity*2;
			array = newArray;
		}
	}
	
	public Object poll(){
		if (size == 0){
			throw new IndexOutOfBoundsException("Queue is empty!");
		}
		if (head == capacity - 1){
			head = 0;
			size --;
			return array[capacity - 1];
		}
		size --;
		head ++;
		return array[head - 1];
		
	}
	
	public Object peek(){
		if (size == 0){
			throw new IndexOutOfBoundsException("Queue is empty!");
		}
		return array[head];
	}
	
	public boolean contains(Object element){
		boolean flag = false;
		if (head < tail){
			for (int i = head; i <= tail; i ++){
				if (element == array[i]){
					flag = true; 
				}
			}
		}else{
			for (int i = 0; i < tail; i ++){
				if (element == array[i]){
					flag = true;
				}
			}
			for (int i = head; i < capacity; i ++){
				if (element == array[i]){
					flag = true;
				}
			}
		}
		return flag;
	}
	
	public void clear(){
		capacity = 4;
		array = new Object[capacity];
		head = 0;
		tail = 0;
		size = 0;	
	}
}

