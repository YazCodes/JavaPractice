package OOP;

public class Encapsulation {

    //Encapsulation  combines a group or related functions and variables into an object.
    //variable = properties
    //functions = method
    //in OOP functions have fewer parameters, therefore easier to use


    public int baseSalary = 30000;
    public int overtime = 10;
    public int rate = 20;

    public int employee(int rate, int overtime, int baseSalary) {
        return this.baseSalary + (this.overtime * this.rate);

    }




}




   // public int getSalary(int rate, int baseSalary, int overtime) { // this has 3 parameters, not very OO
  //      return baseSalary + (overtime * rate);

    //}

    //Make an employee object, that has three properties and one method.





