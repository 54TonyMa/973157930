package day0504;

public class MyLinkedList { //LinkedList
	private Node head = new Node(); //头结点
	private int size = 0; //有效结点个数，0
	
	/**
	 *节点类就是为了LinkedList服务的，所以定义内部类
	 * @author 黄桁
	 *结点中包含两个部分：保存数据用的data，指向下一个结点的next
	 */
	public class Node{
		private Object data; //存储数据
		private Node next; //保存下一个结点的引用
	}
	
	//完成的方法参考MyArrayList
	/**
	 * 1.向集合this的末尾中中添加元素
	 */
	public void add(Object obj) {
		//只能从头开始，找到链表的末尾
		Node node = head;
		while(node.next != null) {
			node = node.next;
		}
		//node就是最后一个元素
		//创建新的结点
		Node newNode = new Node();
		newNode.data = obj;
		node.next = newNode;
		//个数+1
		size++;
	}
	/**
	 * 2.向集合index的位置中插入元素
	 */
	public void add(int index, Object obj) {
		if(index < 0 || index > size) {
			return;
		}
		Node node = head;
		Node node1 = new Node(); //前一个
		Node node2 = new Node(); //后一个
		//寻找index位置之前的一个结点
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		node1 = node;
		node2 = node.next;
		
		Node newNode = new Node();
		newNode.data = obj;
		//插入结点
		newNode.next = node2;
		node1.next = newNode;
		size++;
	}
	
	/**
	 * 3. 获得集合的元素个数
	 */
	public int size() {
		return size;
	}
	/**
	 * 4. 从集合中获得指定位置（index)的元素
	 */
	public Object get(int index) {
		
		Node node = head;
		for(int i = 0; i <= index; i++) {
			node = node.next;
		}
		return node.data;
	}
	/**
	 * 5. 删除指定位置上的元素,并返回删除的元素
	 */
	public Object remove(int index) {
		
		Node node = head;
		
		//寻找index位置之前的一个结点
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		Object obj = node.next.data;
		node.next = node.next.next;
		size--;
		return obj;
	}
	
	/**
	 * 6. 删除指定元素obj
	 */
	public void remove(Object obj) {
		Node node = head;
		int index = -1;
		while(node.next != null) {
			index++;//下标前进以为
			node = node.next;
			if(node.data.equals(obj)) {
				remove(index);
				break;
			}
		}
	}
	/**
	 * 7. 替换指定位置上的元素，修改成obj，并且返回被替换的元素
	 */
	public Object set(int index, Object obj) {
		Node node = head;
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		//保留index位置上的元素；
		Object indexObj = node.next.data;
		Node newNode = new Node();
		newNode.data = obj;
		newNode.next = node.next.next;
		node.next = newNode;
		return indexObj;
		
	}
	
	/**
	 * 8. 打印出在集合中的有效集合，不要null
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node node = head;
		while(node.next != null) {
			node = node.next;
			sb.append(node.data);
			sb.append(",");
		}
		sb.append("]");
		sb.deleteCharAt(sb.length() - 2);
		return sb.toString();
	}
	/**
	 * 9. 判断集合中是否存在指定元素obj
	 */
	public boolean contain(Object obj) {
		Node node = head;
		while(node.next != null) {
			node = node.next;
			if(node.data.equals(obj)) {
				return true; //方法遇到return 直接结束
			}
		}
		return false;
	}
	/**
	 * 10. 判断是否为空
	 */
	public boolean isEmpty() {
		return size == 0;
	}
}
