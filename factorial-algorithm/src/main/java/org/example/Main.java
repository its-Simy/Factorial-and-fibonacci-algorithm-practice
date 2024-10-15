package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int number = 7;
        System.out.println("This is the result of the factorial algorithm with the input of "
                + number + ": " + factorial(number));

        System.out.println();

        System.out.println("This is the result of the fibonacci algorithm with the input of "+
                number + ": " + fibonacci(number));
    }


    public static int factorial(int num){

        if(num == 1)
            return 1;

        else {
            return num * factorial(num - 1);
        }
    }


    public static int fibonacci(int num){
        if(num <= 2)
            return 1;

        else
            return fibonacci(num - 1) + fibonacci(num - 2);

    }





}