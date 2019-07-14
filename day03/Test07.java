package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        /*Emp person1 = new Emp("张三",20,"男",2000, "2006-02-15");
        Emp person2 = new Emp("李四",30,"男",2500, "2004-02-15");
        Emp person3 = new Emp("张三",19,"男",2000, "2006-02-15");*/
        Scanner sc = new Scanner(System.in);

        int index = 0;
        boolean flag = true;
        ArrayList<Emp> arr = new ArrayList<Emp>();
        Emp[] emps = {};
        while (flag){

            System.out.println("请输入员工姓名：");
            String name = sc.next();
            System.out.println("请输入员工年龄：");
            int age = sc.nextInt();
            System.out.println("请输入员工性别：");
            String gender = sc.next();
            System.out.println("请输入员工薪水：");
            int salary = sc.nextInt();
            System.out.println("请输入员工入职时间（xxxx-xx-xx）：");
            String date = sc.next();

            emps = Arrays.copyOf(emps, emps.length + 1);
            emps[index] = new Emp(name, age, gender, salary, date);

            if(index >= 1){
                for(int i = 0; i < emps.length - 1; i++){
                    if(emps[index].getName().equals(emps[i].getName())){
                        System.out.println("已包含-" + emps[index].getName() + "-员工的信息，请核对后再输入");
                        break;
                    }else{
                        arr.add(emps[index]);
                    }
                }

            }else if(index == 0){
                arr.add(emps[index]);
            }

            System.out.println("---------------");
            System.out.println("全部员工信息：");
            for(int i = 0; i < arr.size(); i++){
                System.out.println(arr.get(i).toString());
            }
            System.out.println("---------------");

            System.out.println("是否完成输入？已完成请按q；未完成输入c。");
            String isEnd = sc.next();
            if(isEnd.equals("q")){
                flag = false;
                System.out.println("欢迎您的使用~");
            }else{
                System.out.println("请继续输入");
                index = index + 1;
            }
        }




    }
}
