package day06;

import java.io.File;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        File file = new File("D:\\IDEAworkspace\\ZhiZhenHomeWork\\src\\day06\\Files");
        remove(file);
    }

    public static void remove(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File f : files){
                if(f.isFile()){
                    System.out.println(f.getName());
                    f.delete();
                }else if(f.isDirectory()){
                    remove(f);
                }
            }
            System.out.println(file.getName());
            file.delete();
        }
    }
}
