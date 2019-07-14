package day06;

import java.io.File;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
    static int i = 0;
    public static void main(String[] args) {
        File file = new File("D:\\IDEAworkspace\\ZhiZhenHomeWork\\src\\day06\\Files\\test");
        create(file);
    }

    public static void create(File file){
        if(! file.exists()){
            file.mkdir();
        }else{
            i++;
            File tempFile = new File("D:\\IDEAworkspace\\ZhiZhenHomeWork\\src\\day06\\Files\\test_副本" + i);
            create(tempFile);
        }
    }
}
