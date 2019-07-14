package day06;

import java.io.File;
import java.io.IOException;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Bonnie
 *
 */
public class Test02 {
    static int i = 0;
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\IDEAworkspace\\ZhiZhenHomeWork\\src\\day06\\Files\\test.txt");
        create(file);
    }

    public static void create(File file) throws IOException {

        if(!file.exists()){
            file.createNewFile();
        }else{
            i++;
            File tempFile = new File("D:\\IDEAworkspace\\ZhiZhenHomeWork\\src\\day06\\Files\\test_副本" + i +".txt" );
            create(tempFile);
        }
    }
}
