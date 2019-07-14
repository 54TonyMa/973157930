package day05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 有下列字符串:
 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
 * 分析上述字符串然后统计每个职位总共多少人?
 * 使用Map保存统计的结果，其中key:职位,value为该职位人数
 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
 *
 * @author Bonnie
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要分析的字符串：");
        String str = sc.nextLine();
        String[] strArray = str.split(";");
        int salesNum = 0;
        int financeNum = 0;
        int programNum = 0;
        int artNum = 0;
        int frontNum = 0;
        for (String s : strArray) {
            if (s.contains("销售")) {
                salesNum++;
            } else if (s.contains("财务")) {
                financeNum++;
            } else if (s.contains("程序")) {
                programNum++;
            } else if (s.contains("美工")) {
                artNum++;
            } else if (s.contains("前端")) {
                frontNum++;
            }
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("销售", salesNum);
        map.put("财务", financeNum);
        map.put("程序", programNum);
        map.put("美工", artNum);
        map.put("前端", frontNum);

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println("职位:" + key);
        }

        Set<Map.Entry<String, Integer>> entrys = map.entrySet();
        for(Map.Entry<String, Integer> entry : entrys){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("职位"+ key + "有" + value + "人");
        }
    }
}
