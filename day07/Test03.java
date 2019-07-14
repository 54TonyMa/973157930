package day07;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
 * 一条员工信息，格式如:张三,25,男,5000,2006-3-18
 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException, Exception {
        System.out.println("请输入想要输入的员工人数：");
        Scanner sc = new Scanner(System.in);
        int personNum = sc.nextInt();
        for(int i = 0; i < personNum; i++){
            System.out.println("请输入第" + i +"位员工信息:");
            Emp emp = writeEmp();
            writeFile(emp);
        }
        System.out.println("员工信息写入完毕！");
    }

    public static Emp writeEmp() throws ParseException {

        Scanner sc = new Scanner(System.in);
        String info = sc.nextLine().trim();
        String[] strs = info.split(",");
        String name = strs[0];
        int age = Integer.parseInt(strs[1]);
        String gender = strs[2];
        int salary = Integer.parseInt(strs[3]);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date hiredate = sdf.parse(strs[4]);

        return new Emp(name, age, gender, salary, hiredate);
    }

    public static void writeFile(Emp emp) throws Exception {
        FileOutputStream fos = new FileOutputStream(emp.getName() + ".obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(emp);
        oos.close();
    }
}
