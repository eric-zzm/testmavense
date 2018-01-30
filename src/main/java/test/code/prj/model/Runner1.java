package test.code.prj.model;

/**
 * Created by Administrator on 2017/12/24.
 */
public class Runner1 implements Runnable{
    @Override
    public void run() {
        pong();
    }
    static void pong()
    {
        System.out.print("pong");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
