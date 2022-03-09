package main.java.employee;

public class TestCase {
    public void sum(){
        int [] num = {68,27,95,88,171,996,51,210};
        int sum = 0;
        for (int i:num){
            if (i%2 == 0 && i/10%10 != 7){
                sum += i;
            }
        }
        System.out.println("数组和：" + sum);
    }
}
