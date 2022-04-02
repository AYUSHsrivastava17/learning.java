package unit_1;

import java.sql.SQLOutput;

public class P3_Task02_OperatorsInJava {

    public static void main(String[] args) {
        /*
        Operators in java is a symbol that is used to perform operations.
        sum  = a+b ;
        for example: + - * / etc.
        -> a+=1;
         */
        OperatorsInJava obj = OperatorsInJava();
        obj.UnaryOperater();;
        obj.ArithmaticOperater();
        obj.RelationalOperater();
        obj.BitwiseAndLogicalOperater();
        obj.AssignmentOperater();
    }
}
          class OperatorsInJava {
    void UnaryOperater();
              {
                 int a = 10;
                 boolean b = false ;
                  System.out.println("insideUnaryOperator");
                  System.out.println(a++);//10
                  System.out.println(a--);//11
                  System.out.println(++a);//11
                  System.out.println(--a);//10
                  /* Bitwise complement (~)
                  * this unary operator returns the ones complement represenetation of the input value
                  *  with all bits inverted , which means it makes it every o to 1 , and every 1 to 0
                  *
                  */
                  System.out.println(~a);

                  //'not' operator(!) : it is used to reverse the value of he opersand
                  System.out.println(!b);//true
                  System.out.println("/n");

              }

              void ArithmaticOperater();
              {
                  System.out.println( "inside arithmatic operator");
                int a = 10;
                int b= 5;
                  System.out.println(a + b);
                  System.out.println(a - b);
                  System.out.println(a * b);
                  System.out.println(a / b);
                  System.out.println(a % b);

                  //what is the output of this expression?
                  System.out.println( (( 10*10)/5)+3-((1*4)/2));
                  System.out.println("/n");
              }
              void ShiftOpertor();
              {
                  System.out.println("Inside ShiftOperator");
                  System.out.println(10<<2);
                  System.out.println(10<<3);
                  System.out.println(20<< 2);
                  System.out.println(15<<4);

                  System.out.println(10>>2);
                  System.out.println(20>>2);
                  System.out.println(20>>3);

                  System.out.println("/n");
              }
              void RelationalOperater();
              {
                  System.out.println("inside relational operator");
                int a = 10;
                int b = 20;
                  System.out.println(a == b);
                  System.out.println(a != b);
                  System.out.println(a > b);
                  System.out.println(a < b);
                  System.out.println(a>= b);
                  System.out.println(a<= b);
                  System.out.println( "/n");
              }

              //bitwise second condition is also checked but not in logical && and even in ||
             void BitwiseAndLogicalOperater();
              {
                  System.out.println(" inside Bitwise and logical operator");
                  int a= 10;
                  int b=5;
                  int c=20;
                  //logical and bitwise &
                  System.out.println(a<b && a++<c);
                  System.out.println(a);

                  System.out.println(a<b && a++<c);
                  System.out.println(a);

                  System.out.println(a>b||a<c);
                  System.out.println(a>b|a<b);


                  System.out.println(a);
                  System.out.println(a>b|a++<c);
                  System.out.println(a);

                  System.out.println("Bitwise inclusive OR:"+ (12|12));
                  System.out.println("Bitwise exclusive OR"+ (12^12));
              }
              void AssignmentOperater();
              {
                  System.out.println(" inside assignment operator");
                  int a=10;
                  int b=20;
                  a+=4;
                  b-=4;
                  System.out.println(a);
                  System.out.println(b);
                   b>>>=2;
                  System.out.println(b);
                  a=10;
                  a+=3;
                  System.out.println(a);
                  a-=4;
                  System.out.println(a);
                  a*=2;
                  System.out.println(a);
                  a/=2;
                  System.out.println(a);

                  System.out.println("/n");
              }

}




