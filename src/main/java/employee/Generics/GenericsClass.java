package main.java.employee.Generics;

public class GenericsClass<T> {
    /**
     * 泛型类
     * 跟在类明后面 初始化类的时候指定这个泛型是什么类型
     *  如：GenericsClass<String> = new GenericsClass<String>();
     *  再在类中使用泛型变量类型T，T就代表了String类型
     * */

    T t;

    public GenericsClass() {
    }

    public GenericsClass(T t) {
        this.t = t;
    }
    public void printT(T t){
        System.out.println("T的类型：" + getType(t));
    }
    //判断传入参数是什么类型的变量，并返回
    public static String getType(Object a){
        return a.getClass().toString();
    }
}
