package main.java.employee;

import java.util.*;

public class ListTest {
    /**
     * 集合的数据类型必须是引用类型 如：String、Integer（int）
     * */
    public void LinkedTests(){
        //链表
        LinkedList<String> strList = new LinkedList<String>();
        //依次向集合中添加数据
        strList.add("张三");
        strList.add("李四");
        //在列表最前面增加数据
        strList.addFirst("第一个");
        //在列表最后增加数据
        strList.addLast("最后一个");
        strList.add("add添加最后一个");
        System.out.println(strList);
        //移除列表中第一个元素
        strList.removeFirst();
        //移除列表中最后一个元素
        strList.removeLast();
        System.out.println("移除第一个和最后一个后：" + strList);
        //获取列表第一个元素
        System.out.println("getFirst获取列表第一个元素：" + strList.getFirst());
        //获取列表最后一个元素
        System.out.println("getLast获取列表最后一个元素：" + strList.getLast());
        //获取指定位置的元素
        System.out.println("get获取第二个元素：" + strList.get(1));
        //删除指定位置的数据
        System.out.println("remove删除指定位置数据：" + strList.remove(2));
        System.out.println("删除后的数据：" + strList);

    }

    //数组集合ArrayList
    public void ArrayListTest(){
        ArrayList<String> arrList = new ArrayList<String>();
        //add 逐个追加数据
        arrList.add("赵六");
        arrList.add("李四");
        arrList.add("王五");
        arrList.add("张三");
        System.out.println("add添加数据后：" + arrList);
        //使用get访问数组集合中的第二个元素
        System.out.println("使用get访问数组集合中的第二个元素:" + arrList.get(1));
        //使用set修改数组集合中的第二个元素
        System.out.println("使用set修改数组集合中的第二个元素:" + arrList.set(1,"小李"));
        System.out.println("修改后的数组集合:" + arrList);
        //使用remove删除数组集合中的第二个元素
        System.out.println("使用remove删除数组集合中的第二个元素:" + arrList.remove(1));
        System.out.println("删除后的数组集合:" + arrList);
        //使用sort对数组集合进行排序
        ArrayList<Integer> intArrList = new ArrayList<Integer>();
        intArrList.add(1);
        intArrList.add(8);
        intArrList.add(5);
        intArrList.add(3);
        Collections.sort(intArrList);
        Collections.sort(arrList);
        System.out.println("使sort对数组集合进行排序String：" + intArrList);
        System.out.println("使sort对数组集合进行排序Integer：" + arrList);

    }
    public void HashSetTest(){
        /**
         * 重复数据不能添加进去，会自动过滤(第一个相同数据添加进集合后，后面就不能再添加相同数据)
         * 无法根据下标查找修改删除元素，因为数据是无序的，可直接根据数据内容进行删改查
         * */
        HashSet<String> hashList = new HashSet<String>();
        hashList.add("第一个");
        hashList.add("第二个");
        hashList.add("第三个");
        hashList.add("第一个");
        System.out.println("原始HashSet集合数据：" + hashList);
        //使用remove删除指定数据
        hashList.remove("第三个");
        System.out.println("使用remove删除指定数据：" + hashList);
    }
    public void HashMapList(){
        /**
         *储存键值对数据 [key,value]
         *定义时键值对的数据类型都需要声明
         * */
        HashMap <String ,String > mapList = new HashMap<String,String>();
    }


}