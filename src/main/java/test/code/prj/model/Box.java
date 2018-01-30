package test.code.prj.model;

/**
 * Created by Administrator on 2018/1/20.
 */
public class Box<T> {
    private T data;

    public Box(){

    }

    public Box(T data){
        setData(data);
    }

    public void setData(T data){
        this.data=data;
    }

    public T getData(){
        return data;
    }
}
