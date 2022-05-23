package main.java.FactoryPattern;

public class FactoryDemo {
    public static Computer create(String str){
        switch (str) {
            case "Mac":
                Computer computer = new Mac();
                computer.setName("MacBook Pro");
                computer.setPrice(20000);
                return computer;
            case "HUAWEI":
                Computer computer1 = new HUAWEI();
                computer1.setName("HUAWEI");
                computer1.setPrice(8000);
                return computer1;
            default:
                return null;
        }
    }
}
