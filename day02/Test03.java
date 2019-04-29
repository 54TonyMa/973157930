package day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个ip地址");
        String str = sc.nextLine();
        String[] strs = str.split("\\.");//.在正则表达式中是代表所有值的意思，必须双转义
        for (String s : strs
             ) {
            System.out.println(s);
        }

    }
}
