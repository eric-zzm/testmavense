package test.code.prj.model;

import org.hsqldb.lib.StopWatch;
import org.junit.Test;

import java.util.*;

/**
 * Created by Administrator on 2017/9/18.
 */
public class PersonTest {
    @Test
    public void sayHello() throws Exception {
        //Runner1 r=new Runner1();
        //r.run();//这是方法调用，而不是开启一个线程
        StopWatch s=new StopWatch();
        //s.start();
        Person person=new Person();
        String res= person.sayHello();
        System.out.println(res);
        Thread.sleep(1000);
        //s.elapsedTime(TimeUnit.MINUTES);
        //s.stop();
        List list= new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        for (int i=0;i<list.size();i++)
        {
            //System.out.println(String.join("11",list));
        }
        System.out.println(String.join("11",list));
        System.out.println(list.size());
        String[] arrStr=new String[]{"a","b","c"};
        Iterator<String> inter = list.iterator();
        while (inter.hasNext())
        {
            System.out.println(inter.next());
        }
        System.out.println(String.join("-", arrStr));
        System.out.println(s.elapsedTime());
    }



}
