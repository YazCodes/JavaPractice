package org.example;

public class Classes_PluralSight {

    // classes is a template for declaring an object

    // Achive encampulation using access modifiers

    // no access modifier = package private. You cannot access these variables outside its own package

    // public = can be accesses everywhere

    // private = only accessable in the class that it is declared

    //  int password = 1234;


//}

    public class Flight {
        // declared variables

        private int passengers;
        private int seats;

        // constructor  - initialise the object of a class

        public Flight() {
            seats = 150;
            passengers = 0;
        }

        //method

        public void add1Passenger() {
            if (passengers < seats)
                passengers += 1;
            else
                handleTooMany();
        }

        private void handleTooMany() {
            System.out.println("Too many");
        }

// Methods have a return type. if it doesn't return anything use Void
        // Also have a parameter list - a value that you can pass in a method
        //body contains curly brackets

        public void myMethod(float x, float y, int count) {

            Flight method = new Flight();
            method.myMethod(1,2,10);

            float sum = x + y;
            for (int i = 0; i < count; i++) {
                System.out.println(sum);

            }

        }




    }

}

