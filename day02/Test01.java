package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();
        judge(str);

    }

    public static void judge(String str){
        String regex1 = "[0-9]{1,}";
        String regex2 = "[0-9]{1,}\\.[0-9]{1,}";
        if(str.matches(regex1)){
            int num = Integer.parseInt(str);
            num = num * 10;
            System.out.println(num);
        }else if(str.matches(regex2)){
            double num = Double.parseDouble(str);
            num = num * 5;
            System.out.println(num);
        }else{
            System.out.println("不是数字");
        }
    }

}
