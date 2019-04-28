package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Bonnie
 * 使用StringBuilder完成
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("大家好!我是程序员!");
		StringBuilder sb1 = sb.insert(6, "优秀的");//将index该位置处原来的字符向后推
		System.out.println(sb.toString());
		StringBuilder sb2 = sb1.replace(6, 8, "牛牛的");
		System.out.println(sb2.toString());
		StringBuilder sb3 = sb2.delete(0, 4);//该子字符串从指定的 start 处开始，一直到索引 end - 1 处的字符
		System.out.println(sb3.toString());
	}
	
	
}
