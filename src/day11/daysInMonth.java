package day11;

public class daysInMonth {
    public static void main(String[] args) {

        int month = 13;

        boolean has30day = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has31day = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean has28day = month == 2;

        if (has30day){
            System.out.println("30 days");
        }
        if (has31day){
            System.out.println("31 days");
        }
        if (has28day){
            System.out.println("28 days");
        }



    }


}
