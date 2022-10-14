package day11;

public class largeNumbers {

    public static void main(String[] args) {

        int num1= 10;
        int num2= 20;
        int num3= 30;
        int largest = 0;
        boolean num1IsMax = num1 > num2 && num1 > num3;
        boolean num2IsMax = num2 > num3 && num2 > num1;


        if (num1IsMax){
            largest = num1;

        }else if (num2IsMax){
            largest = num2;
        }else {
            largest = num3;
        }
        System.out.println("the max number is " + largest);

    }


}
