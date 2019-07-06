package day07;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 读取当前项目根目录下所有后缀为.obj的文件，将这些Emp对象读取出来
 * 并存入到一个List集合中，然后按照员工工资从多到少的顺序依次输出员工信息
 * @author Bonnie
 *
 */

/*
    思路：
        1. 创建当前目录的File对象
        2. 对该目录下的所有文件进行判断是否以".obj"结尾
        3.
 */
public class Test04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File dir = new File(".");
        Test04 t = new Test04();
        List<Emp> list = t.loadEmps(dir);
        Collections.sort(list, new Comparator<Emp>(){

            @Override
            public int compare(Emp o1, Emp o2) {
                return o2.getSalary() - o1.getSalary();
            }
        });

        for(Emp e : list){
            System.out.println(e);
        }
    }

    public static Emp loadEmp(File file) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Emp emp = (Emp)ois.readObject();
        ois.close();
        return emp;
    }

    public static List<Emp> loadEmps(File dir) throws IOException, ClassNotFoundException {
        List<Emp> list = new ArrayList<Emp>();
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".obj");
            }
        });

        for(File empFile : files){
            Emp emp = loadEmp(empFile);
            list.add(emp);
        }
        return list;
    }
}
