//Q1:  Create three classes calculator , Sc calculator and Hybridcalculator and group them into a package 
package calc;

class Calculator{
    public void calculate(int a, int b){
        System.out.println("sum : "+ a+b);

    }
}
class ScCalculator{
    public void calculate(int a, int b){
        System.out.println("sum : "+ Math.sin(a+b));

    }
}
class HyCalculator{
    public void calculate(int a, int b){
        System.out.println("sum : "+ a+b);
        System.out.println("sum : "+ Math.sin(a+b));

    }
}

public class problem1 {
    public static void main(String[] args){
        System.out.println("I am main method");
    }
}