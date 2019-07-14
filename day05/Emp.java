package day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 * 
 * 实现Comparable接口，并重写抽象方法comparaTo()，比较规则为年龄小的人小。
 * @author Bonnie
 *
 */
public class Emp implements Comparable {
    String name;
    int age;
    String gender;
    int salary;
    Date date;
    public Emp(String name, int age, String gender, int salary, Date date){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return age == emp.age &&
                salary == emp.salary &&
                Objects.equals(name, emp.name) &&
                Objects.equals(gender, emp.gender) &&
                Objects.equals(date, emp.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, salary, date);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Emp emp = (Emp) o;
        Date date1 = emp.date;
        String dateStr1 = sdf.format(date1);
        Date date2 = this.date;
        String dateStr2 = sdf.format(date2);
        int dateInt1 = new Integer(dateStr1);
        int dateInt2 = new Integer(dateStr2);


        return dateInt1 < dateInt2 ? -1:1;
    }
}
