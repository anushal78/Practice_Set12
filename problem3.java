//Q3 : Create a package in class with three package levels folder , folderL1 , folderL2  
package folder.folderl1.folderl2;

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

public class problem3 {
    protected int proInt = 4;
    int defInt = 41;
    public static void main(String[] args){
        System.out.println("I am main method");
    }
}