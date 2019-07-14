package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<Date> list = new ArrayList<Date>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        for(int i = 0; i < 3; i++){
            System.out.println("请输入第"+ (i + 1) + "个日期：");
            String str = sc.next();
            Date date = sdf.parse(str);
            list.add(date);
        }

        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(sdf.format(list.get(i)));
        }
    }
}
