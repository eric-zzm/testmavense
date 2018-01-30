package test.code.prj.model;

import java.util.concurrent.Callable;

/**
 * Created by Administrator on 2018/1/14.
 */
public class MyCallable implements Callable {

    private String username;
    private long sleepValue;

    public MyCallable(String username,long sleepValue){
        super();
        this.username=username;
        this.sleepValue=sleepValue;
    }
    @Override
    public String call() throws Exception {
        System.out.println(username);
        Thread.sleep(sleepValue);
        return "return "+username;
    }
}
