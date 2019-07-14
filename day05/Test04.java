package day05;

import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < 5; i++){
            System.out.println("请输入科目：");
            String subject = sc.nextLine();
            System.out.println("请输入该科目分数：");
            Integer grades = new Integer(sc.nextLine());
            map.put(subject, grades);
        }
        int physicsGrades = map.get("物理");
        System.out.println(physicsGrades);
        map.put("化学", 96);
        map.remove("英语");
        Set<String> keys = map.keySet();
        for(String key : keys){
            int value = map.get(key);
            System.out.println("科目" + key + "的成绩是：" + value);
        }
        System.out.println("--------------");
        Set<Map.Entry<String, Integer>> entrys = map.entrySet();
        for(Map.Entry<String, Integer> entry : entrys){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("科目" + key + "的成绩是：" + value);
        }
    }
}
