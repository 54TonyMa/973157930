package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<Emp> list = new ArrayList<Emp>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(int i = 0; i < 2; i++){
            System.out.println("请输入员工信息：");
            String str = sc.next();
            String[] strArray = str.split(",");
            String name = strArray[0];
            Integer age = new Integer(strArray[1]);
            String gender = strArray[2];
            Integer salary = new Integer(strArray[3]);
            Date date = sdf.parse(strArray[4]);

            Emp emp = new Emp(name, age, gender, salary, date);
            list.add(emp);
        }

        for(Emp emp : list){
            System.out.println(emp);
        }

        for(Emp emp : list){
            Date date = emp.date;
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.MONTH, 3);
            System.out.println(emp.name + "的转正时间为：");
            System.out.println(sdf.format(cal.getTime()));
        }

    }
}
