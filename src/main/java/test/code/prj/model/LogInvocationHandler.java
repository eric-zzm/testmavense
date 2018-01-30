package test.code.prj.model;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/1/16.
 */
public class LogInvocationHandler implements InvocationHandler {

    private Hello hello;
    public LogInvocationHandler(Hello hello){
        this.hello=hello;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("sayHello".equals(method.getName())){

        }
        return method.invoke(hello,args);
    }
}
