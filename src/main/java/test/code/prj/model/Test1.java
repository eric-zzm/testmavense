package test.code.prj.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 *@Author:ZhouZhiMing
 *@param:
 *@Description:test
 *@Date:20:25 2018/1/14
 */
public class Test1 {

    public static String div(String v1, String v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v1);
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).toString();
    }

    public static void getData(Box<? extends Number> data){
        System.out.println("data :"+data.getData());
    }

    public static void main(String[] args){
       try {
           //Box<String> name = new Box<>("corn");
           Box<Integer> age=new Box<>(121);
           Box<Number> number=new Box<>(222);
           //getData(name);
           getData(age);
           getData(number);

           Float a=0f;
           Float b=10f;
           System.out.println(2-1.1);
            MyCallable callable1=new MyCallable("username1",5000);
            MyCallable callable2=new MyCallable("username2",4000);
            MyCallable callable3=new MyCallable("username3",3000);
            MyCallable callable4=new MyCallable("username4",2000);
            MyCallable callable5=new MyCallable("username5",1000);

            List<Callable> callableList= new ArrayList<>();
            callableList.add(callable1);
            callableList.add(callable2);
            callableList.add(callable3);
            callableList.add(callable4);
            callableList.add(callable5);
 
            ThreadPoolExecutor executor=new ThreadPoolExecutor(5,10,5,
                    TimeUnit.SECONDS, new LinkedBlockingDeque<>());
            CompletionService csRef=new ExecutorCompletionService(executor);

            for (int i = 0; i < 5; i++) {
                csRef.submit(callableList.get(i));
            }

            for (int i = 0; i < 7; i++) {
                System.out.println("等待打印第"+(i+1)+"个返回值");
                System.out.println(csRef.take().get());

            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        catch (ExecutionException e){
            e.printStackTrace();
        }
    }
}
