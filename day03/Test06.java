package day03;
/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("one");
        sb.append("two");
        sb.append("three");

        System.out.println(sb.capacity());
        String str = sb.toString();
        if(str.contains("four")){
            System.out.println("存在字符串“four”");
        }else{
            System.out.println("不存在字符串“four”");
        }
        boolean flag = str.isEmpty();
        if(flag){
            System.out.println("该集合是空的");
        }else{
            System.out.println("该集合不是空的");
        }

        sb.delete(0, sb.length());
        System.out.println(sb.toString());
        String s2 = sb.toString();
        boolean flag2 = s2.isEmpty();
        if(flag2){
            System.out.println("不含有元素，已经是空的");
        }else{
            System.out.println("含有元素，不是空的");
        }

    }
}
