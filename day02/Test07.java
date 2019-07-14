package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数学计算表达式：");
        String str = sc.nextLine();
        if(str.contains("+")){
            int index = str.indexOf("+");
            String s1 = str.substring(0, index);
            String s2 = str.substring(index+1);
            if(s1.contains(".") || s2.contains(".")){
                Double s1_d = new Double(s1);
                Double s2_d = new Double(s2);
                double sum = s1_d + s2_d;
                System.out.println(sum);
            }else{
                Integer s1_i = new Integer(s1);
                Integer s2_i = new Integer(s2);
                int sum = s1_i + s2_i;
                System.out.println(sum);
            }
        }else if(str.contains("-")){
            int index = str.indexOf("-");
            String s1 = str.substring(0, index);
            String s2 = str.substring(index+1);
            if(s1.contains(".") || s2.contains(".")){
                Double s1_d = new Double(s1);
                Double s2_d = new Double(s2);
                double sum = s1_d - s2_d;
                System.out.println(sum);
            }else{
                Integer s1_i = new Integer(s1);
                Integer s2_i = new Integer(s2);
                int sum = s1_i - s2_i;
                System.out.println(sum);
            }
        }else if(str.contains("*")){
            int index = str.indexOf("*");
            String s1 = str.substring(0, index);
            String s2 = str.substring(index+1);
            if(s1.contains(".") || s2.contains(".")){
                Double s1_d = new Double(s1);
                Double s2_d = new Double(s2);
                double sum = s1_d * s2_d;
                System.out.println(sum);
            }else{
                Integer s1_i = new Integer(s1);
                Integer s2_i = new Integer(s2);
                int sum = s1_i * s2_i;
                System.out.println(sum);
            }
        }else if(str.contains("/")){
            int index = str.indexOf("/");
            String s1 = str.substring(0, index);
            String s2 = str.substring(index+1);
            if(s1.contains(".") || s2.contains(".")){
                Double s1_d = new Double(s1);
                Double s2_d = new Double(s2);
                double sum = s1_d / s2_d;
                System.out.println(sum);
            }else{
                Double s1_i = new Double(s1);
                Double s2_i = new Double(s2);
                Double sum = s1_i / s2_i;
                System.out.println(sum);
            }
        }else{
            System.out.println("您输入的公式有误！");
        }
    }
}
