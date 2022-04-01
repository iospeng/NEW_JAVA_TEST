package main.java.employee.CollectionCase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/*
    测试类
 */
public class FilmDemo {
    public static void main(String[] args) {
        Collection<Film> cll = new ArrayList<Film>();
        cll.add(new Film("海贼王","路飞",9.9));
        cll.add(new Film("火影","乌漆嘛黑拿呢托",9.8));
        cll.add(new Film("死神","一护",9.7));

        //遍历集合的三种方式
        //方式一：迭代器 Iterator
//        Iterator<Film> it = cll.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        //方式二：foreach
//        for (Film film : cll) {
//            System.out.println(film);
//        }

        //方式三：Lambda方式 集合中的forEach方法 new Consumer匿名内部类
//        cll.forEach(new Consumer<Film>() {
//            @Override
//            public void accept(Film film) {
//                System.out.println(film);
//            }
//        });
        //简化方法三
//        cll.forEach(film -> System.out.println(film));
        //简化方式三
        cll.forEach(System.out::println);
    }
}
