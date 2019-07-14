package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 * 330281 19961215 0437
 *
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while(!flag){
            System.out.println("请输入身份证号：");
            String idNumber = sc.nextLine();
            if(isIdNumber(idNumber)){
                printBirthday(idNumber);
                flag = true;
            }else{
                System.out.println("您输入的身份证号码有误，请核对后重新输入！");
                flag = false;
            }
        }
    }

    public static boolean isIdNumber(String idNumber){
        String regex = "[1-9][0-9]{17}[a-zA-Z]{0}";
        if(idNumber.matches(regex)){
            return true;
        }else{
            return false;
        }
    }

    //330281 19961215 0437
    public static void printBirthday(String idNumber){
        String year = idNumber.substring(6, 10);
        String month = idNumber.substring(10,12);
        String day = idNumber.substring(12, 14);
        int year_int = new Integer(year);
        int month_int = new Integer(month)-1;
        int day_int = new Integer(day);

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year_int);
        cal.set(Calendar.MONTH, month_int);
        cal.set(Calendar.DAY_OF_MONTH, day_int);
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String d = sdf.format(date);
        System.out.println(d);
    }
}
