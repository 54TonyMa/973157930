package day0504;

import java.util.Arrays;

public class MyArrayList {
	private Object[] arr = new Object[10];
	private int size = 0;
	/**
	 * 1.向集合this中添加元素
	 * @param obj
	 */
	public void add(Object obj) {
		if(size == arr.length) {
			arr = Arrays.copyOf(arr, arr.length * 2);
		}
		arr[size] = obj;
		size ++;
	}
	
	/**
	 * 2.向集合index的位置中插入元素
	 */
	public void add(int index, Object obj) {
		if(index > size || index < 0) {
			return;
		}
		if(size == arr.length) {
			arr = Arrays.copyOf(arr, arr.length * 2);
		}
		for(int i = size - 1; i >= index; i--) {
			arr[i+1] = arr[i];
		}
		arr[index] = obj;
		size ++;
	}
	
	/**
	 * 3. 获得集合的元素个数
	 */
	public int size() {
	/*	int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				count++;
			}
		}*/
		return size;
	}
	/**
	 * 4. 从集合中获得指定位置（index)的元素
	 *
	 */
	
	public Object get(int index) {
		
		return arr[index];
	}
	/**
	 * 5. 删除指定位置上的元素,并返回删除的元素
	 */
	public Object remove(int index) {
		if(index > size - 1 || index < 0) {
			return null;
		}
		Object removed = arr[index];
		for(int i = index; i < size - 1; i++) {
			arr[i] = arr[i+1];
		}
		
		size--;
		return removed;
	}
	/**
	 * 6. 删除指定元素obj
	 */
	public void remove(Object obj) {
		
		for(int i = 0; i < size; i++) {
			if(arr[i].equals(obj)) {
				remove(i);
				break;
			}
		}
		/*for(int j = index; j < arr.length - 1; j++) {
			arr[j] = arr[j + 1];
		}
		size --;
		arr = Arrays.copyOf(arr, arr.length - 1);*/
	}
	/**
	 * 7. 替换指定位置上的元素，修改成obj，并且返回被替换的元素
	 */
	public Object set(int index, Object obj) {
		if(index > size - 1 || index < 0) {
			return null;
		}
		Object removed = arr[index];
		arr[index] = obj;
		return removed;
	}
	
	/**
	 * 8. 打印出在集合中的有效集合，不要null
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < size; i++) {
			sb.append(arr[i] + ",");
		}
		sb.append("]");
		sb.deleteCharAt(sb.length()-2);
		return sb.toString();
	}
	/**
	 * 判断集合中是否存在指定元素obj
	 * 
	 */
	public boolean contain(Object obj) {
		for(int i = 0; i < size; i++) {
			if(arr[i].equals(obj)) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 判断是否为空
	 */
	public boolean isEmpty() {
		return size == 0;
	}
}
