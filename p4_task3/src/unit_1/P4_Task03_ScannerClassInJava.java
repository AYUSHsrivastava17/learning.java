package unit_1;
import java.util.Scanner;

public class P4_Task03_ScannerClassInJava {

    public static void main(String[] args) {

        Scanner myObj1 = new Scanner(System.in); //Create a Scanner object
        Scanner myObj2 = new Scanner(System.in);


        // Read the First-Token:(_ space bar)
        String firstName = myObj1.next();
        System.out.println("Name is : " + firstName +"\n");


        String name = myObj2.nextLine();//(\n)
        String name2 = myObj2.nextLine();//(\n)

        System.out.println("Name is: " + name + "\n");
        System.out.println("Name is: " + name2 + "\n");

        boolean b = myObj2.nextBoolean();
        System.out.println(b + "\n");

        myObj1.close();
        myObj1.close();

    }

}