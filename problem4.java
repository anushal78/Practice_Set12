//Q4 : prove that you cannot access deafault property but can access protected properly from the subclass.   

import folder.folderl1.folderl2;
class c1 extends problem3 {
    void problem3(){
        System.out.println(proInt);
        System.out.println(defInt);
    }
}

public class problem4 {
    public static void main(String[] args) {
        System.out.println("I am main method");
        c1 c = new c1();
    }
}