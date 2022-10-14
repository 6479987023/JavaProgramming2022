package day11;

public class marks {

    public static void main(String[] args) {

        int marks = 70;
        String result = "";

        if (marks < 60){
            result = "Fail";

        }else if ( marks >= 60 && marks <90) {
            result = "Pass";
        }else {

            result = "Passed with Distinction";
        }

        System.out.println(result);

    }

}
