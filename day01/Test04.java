package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入email地址：");
		String email = sc.nextLine();
		String userName = getUserName(email);
		System.out.println(userName);
		
		
	}
	
	public static String getUserName(String email) {
		int index = email.indexOf('@');
		String userName = email.substring(0, index);//该子字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符
		return userName;
	}
}
