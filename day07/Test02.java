package day07;

import java.io.*;

/**
 * 使用缓冲流复制myfile.txt文件为myfile_cp2.txt
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws Exception {
        //1. 创建高速缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("D:\\IDEAworkspace\\ZhiZhenHomeWork\\src\\day07\\myfile.txt"));
        //2. 创建高速缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("e:\\myfile_cp2.txt"));

        //3. 读写
        int len;
        char[] chs = new char[1024];
        while((len = br.read(chs)) != -1){
            bw.write(chs, 0, len);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
