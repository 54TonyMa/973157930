package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int random = (int)(Math.random()*100 + 1);
            list.add(random);
        }
        System.out.println(list);
        List<Integer> sortedList = sort(list);
        System.out.println(sortedList);


    }
    public static List<Integer> sort(List<Integer> list){
//        List<Integer> sortedList = new ArrayList<Integer>();

        for(int i = 0; i < list.size() - 1; i++){
            for(int j = i+1; j < list.size(); j++ ){
                if(list.get(i) > list.get(j)){
                    int temp = list.get(i);

                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}
