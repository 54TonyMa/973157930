package day06;

import java.io.File;
import java.util.Date;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2017-06-30 14:22:16
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        String path = Test01.class.getResource("myfile.txt").getPath();
        File file  = new File(path);
        String name = file.getName();
        System.out.println(name);
        long size = file.length();
        System.out.println(size);
        long time = file.lastModified();
        Date date = new Date(time);
        System.out.println(date.toLocaleString());
    }
}
