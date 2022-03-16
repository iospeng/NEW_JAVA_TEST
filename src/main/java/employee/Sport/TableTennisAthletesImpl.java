package main.java.employee.Sport;

/*
* 乒乓球运动员类，继承运动员抽象类，实现学习英语接口
* */
public class TableTennisAthletesImpl extends Athletes implements StudyEnglish{
    public TableTennisAthletesImpl() {
    }

    public TableTennisAthletesImpl(String name, int age) {
        super(name, age);
    }

    @Override
    public void Study() {
        System.out.println("乒乓球运动员学习英语！");
    }

    @Override
    public void AthletesStudy() {
        System.out.println("乒乓球运动员学习乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃饭");
    }
}
