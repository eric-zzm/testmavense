package test.code.prj.model;

/**
 * Created by Administrator on 2018/1/16.
 */
public class HelloImp implements Hello {
    @Override
    public String sayHello(String str) {
        return "HelloImp"+str;
    }
}
