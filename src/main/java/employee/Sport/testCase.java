package main.java.employee.Sport;

public class testCase {
    //乒乓球教练吃饭、教乒乓球、学习英语
    public void TableTennisCoach() {
        TableTennisCoachImpl ttci = new TableTennisCoachImpl("乒乓球教练", 30);
        System.out.println(ttci.getName() + "," + ttci.getAge());
        ttci.eat();
        ttci.CoachTeaching();
        ttci.Study();
    }

    //乒乓球运动员吃饭、学乒乓球、学习英语
    public void TableTennisAthletes(){
        TableTennisAthletesImpl ttai = new TableTennisAthletesImpl("乒乓球运动员",20);
        System.out.println(ttai.getName() + "，" + ttai.getAge());
        ttai.eat();
        ttai.AthletesStudy();
        ttai.Study();
    }

    //篮球教练吃饭、教篮球
    public void BasketballCoach() {
        BasketballCoach bbc = new BasketballCoach("篮球球教练", 30);
        System.out.println(bbc.getName() + "," + bbc.getAge());
        bbc.eat();
        bbc.CoachTeaching();


    }

    //篮球运动员吃饭、学篮球
    public void BasketballAthletes(){
        BasketballAthletes bba = new BasketballAthletes("篮球球运动员",21);
        System.out.println(bba.getName() + "，" + bba.getAge());
        bba.eat();
        bba.AthletesStudy();
    }
}
