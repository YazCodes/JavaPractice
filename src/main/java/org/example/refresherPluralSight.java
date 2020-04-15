package org.example;

public class refresherPluralSight {

    //strongly typed lang
    //rules and naming conventions (use letters or numbers)
    //camel case

    //declare a varable and assigning values

    int accountBalance = 100;

//    int myVar;
//    myVar = 50;
//
//        System.out.println(myVar);

    //primative data types - int, floats, character, boolean, short, long
//primative types are stored by-value - each primative type value has its own seperate copy of the data.
    int copyOne = 100;
    int copyTwo = copyOne;
//    copyTwo= 50;
//        System.out.println(copyTwo);

//math opperators

    // Add +
    //sub -
    //multiply *
    //divide /    >when dividing floats you will get a decimal point e.g 2.4, but with ints you get whole numbers 2.
    //Modulus (remainder) %

    //increment ++
    //decrements --

    //compound assignment operators - applies the results of the right side to the left side, stores that result in varaible on left side
    //    int myValue = 20;
//    myValue -= 10;
//        System.out.println(myValue); = 10

// int result = 100;
    // int val1 = 5;
    // int

    int myNumber = 5;
    int yourNumber = 2;
//        System.out.println(myNumber * yourNumber);


    // Type conversion
    // Implicit type conversion - conversions automatically by thr compiler
    //Explicit type conversion - conversions performed via code

    // casting

    long oneNumber = 50;
    int twoNumber = (int) oneNumber;

    //Relational opperators
    // > greater than
    //< less than
    // 5 >= 2      5 is greater than or equal to 2
    // ==     equal to
    // !=   not equal to


    //conditional assignment

    int a1 = 7;
    int a2 = 5;

    // result = condition ? true- value : false value ;
    int value = a1 > a2 ? a1 : a2;
    // print (value)  = 7


    // If- else statement

    int b1 = 10;
    int b2 = 20;

//    int b1 = 10;
//    int b2 = 20;
//
//        if(b1 < b2)
//            System.out.println("10 is bigger than 20"); // true statement
//        else {
//        System.out.println("that is wrong"); // false statement
//    }

    // if ()
//    sout
//    else if ()
//        sout
//    else if ()
//        sout
//    else


    //Block statements - executing multiple statemnts - it groups statements


    // delcaring multiple variables

    int c1 = 10, c2 = 30, diff;

    // nested

//    int cost = 10;
//    int purse = 20;
//
//        if (cost < purse) {
//        if (purse > 5);
//        System.out.println("you can buy");
//    } else {
//        System.out.println("you cannot buy");
//    }


    // And opperator &

    int a = 20, b = 14, c = 5;

//    if (a > b & b > c)
//            System.out.println(" c is the smallest number ");


    // Or operator |


    // condtional logical operators && (both sides have to be true)
    // || (only excutes the right side if the left side is false)

    public static void main(String[] args) {

        int a = 20, b = 14, c = 5;

        if (a > b & b > c)
            System.out.println(" c is the smallest number ");


    }

}
