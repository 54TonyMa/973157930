package day07;


import java.io.*;
import java.util.Scanner;

/**
 * 要求用户输入一个文件，该文件应当是Test07程序生成的文件，然后将该文件中所有字符读取
 * 出来，并以UTF-8编码写入到另一个文件中，实现文件转码工作，该文件取名格式:原文件名_utf.txt。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件名：");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if(!file.exists()){
            System.out.println("文件不存在！");
        } else{
            changeCharSet(file, "GBK", "UTF-8");
        }
    }

    public static void changeCharSet(File file, String srcCSN, String desCSN) throws IOException {
        String fileName = file.getName();
        String name = fileName.substring(0, fileName.indexOf("."));
        String lastName = fileName.substring(fileName.indexOf(".") + 1);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), srcCSN));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(name + "_" + "." + desCSN + lastName )));
        String line = null;
        while((line = br.readLine()) != null){
            bw.write(line);
        }
        System.out.println("转码完毕！");
        bw.close();
        br.close();
    }
}
