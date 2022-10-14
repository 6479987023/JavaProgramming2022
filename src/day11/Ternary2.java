package day11;

public class Ternary2 {
    public static void main(String[] args) {

        int n1 = 1000;
        int n2 = 200;
        int n3 = 300;

        int max = 0;

        max = (n1 > n2 && n1 > n3) ? n1 : (n2 > n1 && n2 > n3)? n2 : n3;

        System.out.println(max);






    }



}
