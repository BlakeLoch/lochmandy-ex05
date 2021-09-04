/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;

public class Solution05 {
    /*
        Print "What is the first number?"
        'number1String' = read input from user
        Print "What is the second number?"
        'number2String' = read input from user
        'number1' = parse number1String as integer
        'number2' = parse number2String as integer
        'addition' = 'number1' + 'number2'
        'subtraction' = 'number1' - 'number2'
        'multiplication' = 'number1' * 'number2'
        'division' = 'number1' / 'number2'
        print "'number1' + 'number2' = 'addition'
               'number1' - 'number2' = 'subtraction'
               'number1' * 'number2' = 'multiplication'
               'number1' / 'number2' = 'division'"
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String number1String = input.nextLine();
        System.out.print("What is the second number? ");
        String number2String = input.nextLine();

        int number1 = Integer.parseInt(number1String);
        int number2 = Integer.parseInt(number2String);

        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;

        System.out.printf("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n%d / %d = %d", number1, number2, addition, number1, number2, subtraction, number1, number2, multiplication, number1, number2, division);
    }
}
