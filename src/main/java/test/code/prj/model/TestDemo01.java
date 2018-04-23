package test.code.prj.model;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Administrator on 2017/9/26.
 */
public class TestDemo01 {
    private static TestDemo01 tester = new TestDemo01(); //step 1
    private static int count1;               //step 2
    private static int count2 = 2;           //step 3
    public TestDemo01(){                           //step 4
        count1++;
        count2++;
        System.out.println("" + count1 + count2);
    }
    public static TestDemo01 getTester(){          //step 5
        return tester;
    }

    private static final ThreadLocal<DateFormat> df = ThreadLocal.withInitial(
            () -> new SimpleDateFormat("yyyy-MM-dd"));

    public static void main(String[] args) throws InterruptedException {
        try {
            BigDecimal b = new BigDecimal("1124.4563");
            System.out.println(b.scale());
            //System.out.println(b.setScale(1));
            System.out.println(b.setScale(1,BigDecimal.ROUND_HALF_DOWN));
            TestDemo01.getTester();
            System.out.println(df.get().format(new Date()));
            Thread t= new Thread(() -> pong());
            t.start();
            //t.run();
            //System.out.print("ping");
            //Runner1 r=new Runner1();
            //r.run();//这是方法调用，而不是开启一个线程
            Runnable runnable = () -> System.out.println("打印的信息！");
            ExecutorService executorService = Executors.newCachedThreadPool();
            Future future=executorService.submit(runnable);
            System.out.println(future.get()+" "+future.isDone());
//sadsadwe
//
        } catch (ExecutionException e)
        {
            //test-2
            e.printStackTrace();
            //test--2222222
            //test--33333
            //test--44444
            //test--55555
            //test--66666
            //master1--77777
            //test--88888
            //master1--9999
            //master1--000000
            //master1--000001
            //master1--000002
            //master1--000003
            //master1--000004
            //master1--000005
            //master1--000006
            //master1--000007
            //master1--000008
            //master1--000009
            //master1--0000010
            //master1--0000011
        }

//master1--hhhh
//master1--1111
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
