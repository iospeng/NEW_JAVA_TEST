package main.java.employee;

import main.java.Enums.ColorEnum;

public class ColorTest {
    public void choice(){
        System.out.println("直接使用枚举类类名点出枚举值：" + ColorEnum.BLUE);
        System.out.println("使用valueof()方法获取枚举值,该方法不存在报错（IllegalArgumentException）：" + ColorEnum.valueOf("RED"));
        for(ColorEnum clr:ColorEnum.values()){
            System.out.println("使用values()返回枚举类中所有值：" + clr + "\n使用ordinal返回枚举值的下标" + clr.ordinal());
        }
    }
}
