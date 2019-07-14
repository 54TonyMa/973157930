package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;
 * 王五,35,男,6000,2008-12-15;
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<Emp> list = new ArrayList<Emp>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        for(int i = 0; i < 3; i++){
            System.out.println("请输入员工信息：");
            String info = sc.next();
            String[] strArray = info.split(",");
            String name = strArray[0];
            int age = new Integer(strArray[1]);
            String gender = strArray[2];
            int salary = new Integer(strArray[3]);
            Date date = sdf.parse(strArray[4]);

            Emp emp = new Emp(name, age, gender, salary, date);
            list.add(emp);
        }

        Collections.sort(list);
        System.out.println("按照入职时间排序（晚的在前）：");
        for(Emp emp : list){
            System.out.println(emp);
        }



    }
}
