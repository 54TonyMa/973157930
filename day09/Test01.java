package day09;
/**
 * 使用线程方式一创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        MyThread2 mt2 = new MyThread2();

        mt.start();
        mt2.start();
    }
}


class MyThread extends Thread{
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("你好");
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("再见");
        }
    }
}
