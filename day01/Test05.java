package day01;

import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
//		System.out.println((char)('A'+25));
		char[] code = new char[5];
		for(int i = 0; i < code.length; i++) {
			double n = Math.random();
			int index = (int)(Math.random() * 25 + 1);
			if(n < 0.5) {
				code[i] = (char)('A' + index);
			}else {
				code[i] = (char)('a' + index);
			}
		}
		String password = new String(code);
		System.out.println("生成的验证码：" + password );
		System.out.println("---------------------");
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		while(!flag){
			System.out.println("请输入验证码：");
			String str = sc.nextLine();
			
			String pwIgnoreCase = password.toLowerCase();
			String strIgnoreCase = str.toLowerCase();
			if(strIgnoreCase.equals(pwIgnoreCase)) {
				System.out.println("验证通过！");
				flag = true;
				break;
			}else {
				System.out.println("验证不通过，请重新输入！");
				flag = false;
			}
		}
		
	}
	
}
