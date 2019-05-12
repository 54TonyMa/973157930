package day04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        List list1 = list.subList(3,7);
        System.out.println(list1);

        for(int i = 0; i < list1.size(); i++){
            int temp = (int)list1.get(i);
            int num = temp *10;
            list1.set(i, num);

        }
        System.out.println(list1);
        System.out.println(list);

        list.remove(7);
        list.remove(7);
        list.remove(7);
        System.out.println(list);
    }
}
