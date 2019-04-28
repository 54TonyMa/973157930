package day01;

import java.util.Scanner;

import org.junit.Test;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 * @author Bonnie
 *
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要运算的式子：");
		String fomu = sc.nextLine();
		
		int finalNum = parseInt(fomu);
		System.out.println(finalNum);
	}
	public static int parseInt(String str){
		int num = 0;
		int index = -1;
		for(int i = 0; i < str.length(); i++) {
			if((str.charAt(i)) == '+') {
				index = i;
				num = plus(str, i);
			}else if((str.charAt(i)) == '-') {
				index = i;
				num = minus(str, i);
			}else if((str.charAt(i)) == '*') {
				index = i;
				num = multiple(str, i);
			}else if((str.charAt(i)) == '/') {
				index = i;
				num = division(str, i);
			}
			
		}
		return num;
	}
	public static int plus(String str,int index) {
		int num = 0;
		String str1 = str.substring(0, index);
		String str2 = str.substring(index + 1, str.length());//str.length()的前一位
		
		int n1 = Integer.valueOf(str1);
		int n2 = Integer.valueOf(str2);
		
		num = n1 + n2;
		return num;
	}
	
	public static int minus(String str, int index) {
		int num = 0;
		String str1 = str.substring(0, index);
		String str2 = str.substring(index + 1, str.length());//str.length()的前一位
		
		int n1 = Integer.valueOf(str1);
		int n2 = Integer.valueOf(str2);
		
		num = n1 - n2;
		return num;
	}
	
	public static int multiple(String str, int index) {
		int num = 0;
		String str1 = str.substring(0, index);
		String str2 = str.substring(index + 1, str.length());//str.length()的前一位
		
		int n1 = Integer.valueOf(str1);
		int n2 = Integer.valueOf(str2);
		
		num = n1 * n2;
		return num;
	}
	
	public static int division(String str, int index) {
		int num = 0;
		String str1 = str.substring(0, index);
		String str2 = str.substring(index + 1, str.length());//str.length()的前一位
		
		int n1 = Integer.valueOf(str1);
		int n2 = Integer.valueOf(str2);
		
		num = n1 / n2;
		return num;
	}
	
	@Test
	public void test01() {
		String str = "123+23";
		int index = -1;
		for(int i = 0; i < str.length(); i++) {
			if((str.charAt(i)) == '+') {
				index = i;
			}
		}
		
		String str1 = str.substring(0, index);
		String str2 = str.substring(index + 1, str.length());
		System.out.println(str1);
		System.out.println(str2);
	}
	
}








