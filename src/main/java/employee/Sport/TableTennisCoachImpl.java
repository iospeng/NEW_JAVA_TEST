package main.java.employee.Sport;

/*
* 乒乓球教练类，继承教练抽象类，实现学习英语接口
* */
public class TableTennisCoachImpl extends Coach implements StudyEnglish{
    public TableTennisCoachImpl() {
    }

    public TableTennisCoachImpl(String name, int age) {
        super(name, age);
    }

    @Override
    public void CoachTeaching() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void Study() {
        System.out.println("乒乓球教练学习英语！");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃饭");
    }
}
