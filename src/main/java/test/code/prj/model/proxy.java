package test.code.prj.model;

//import static sun.net.www.protocol.http.AuthCacheValue.Type.Proxy;

//import static sun.net.www.protocol.http.AuthCacheValue.Type.Proxy;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/1/16.
 */
public class proxy {
//private I i;
//private T impl;
/*
public proxy(I i,T impl){
    this.i=i;
    this.impl=impl;
}*/

    public Hello proxy_res(){

        return (Hello) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[]{Hello.class},
                new LogInvocationHandler(new HelloImp()));
    }

    public static void main(String[] args) {
        proxy proxy=new proxy();
        Hello hello=proxy.proxy_res();
        System.out.println(hello.sayHello("I am the best"));
    }

}
