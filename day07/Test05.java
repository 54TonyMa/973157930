package day07;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * 使用字符流复制当前程序的源文件到当前项目根目录下。
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws Exception {
        //1. 从文件中读取 没用高速缓冲流
//        method01();

        //2. 从文件中读取 使用高速缓冲流
//        method02();

        //3. 直接控制台中输入 不使用高速缓冲流（读）
//        method03();

        //4. 直接控制台中输入 使用高速缓冲流(读)
//        method04();


    }

    public static void method04() throws IOException {
        InputStream is = System.in;
        Reader r = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(r);
        FileWriter fw = new FileWriter("e:\\myfile_cp3.txt");
        String line;
        while((line = br.readLine()) != null){
            fw.write(line);
            fw.flush();
        }
        fw.close();
        br.close();
    }

    public static void method03() throws IOException {
        InputStream is = System.in;

        FileWriter fw = new FileWriter("e:\\myfile_cp3.txt");
        int len;
        byte[] bytes = new byte[1024];
        while((len = is.read(bytes)) != -1){
            fw.write(new String(bytes,0,len));
            fw.flush();
        }
        fw.close();
        is.close();
    }

    public static void method02() throws IOException {
        File pathname = new File("e:\\myfile_cp2.txt");
        BufferedReader br = new BufferedReader(new FileReader(pathname));
        BufferedWriter bw = new BufferedWriter(new FileWriter("e:\\myfile_cp3.txt"));

        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
        }
        bw.close();
        br.close();
    }

    public static void method01() throws IOException {
        File path = new File("e:\\myfile_cp2.txt");
        FileReader fr = new FileReader(path);
        FileWriter fw = new FileWriter("e:\\myfile_cp3.txt");
        int len;
        char[] chs = new char[1024];
        while((len = fr.read(chs)) != -1){
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }
}
