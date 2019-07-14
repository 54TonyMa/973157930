package day07;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 使用文件流复制myfile.txt文件为myfile_cp.txt
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) throws Exception {
        //1. 创建字符输入流对象
        FileReader fr = new FileReader("D:\\IDEAworkspace\\ZhiZhenHomeWork\\src\\day07\\myfile.txt");
        //2. 创建字符输出流对象
        FileWriter fw = new FileWriter("e:\\myfile_cp.txt");

        //3. 一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while((len = fr.read(chs)) != -1){
            fw.write(chs,0, len);
            fw.flush();
        }
        fw.close();
        fr.close();


    }
}
