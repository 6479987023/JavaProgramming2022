package day11;

public class Ternary {

    public static void main(String[] args) {

        int num = 99;
        String result ="";

        result = (num % 2 ==0)? "Even" : "Odd";
        System.out.println(result);


        int num2 = 1000;
        String s1 = "";

        s1 = (num2 > 0) ? "Positive" : (num2 < 0) ? "Negative" : "Zero";







    }

}
