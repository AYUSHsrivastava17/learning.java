package unit_1;

public class P3_Task01_VariablesAnddatatypes {

    static int q=11;
    int p=10;

    public static void main(String[] args) {
        //valid declaration
        int a, b, c;
        float pi;
        double d;
        char e;
        //valid initialisation
        pi = 3.14f;
        d = 20.22d;
        e = 'v';
        a = 10;
        b = 10;
        c = 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(pi);
        System.out.println(d);
        System.out.println(e);

        int mynum = 5;
        ; //integer(whole no)
        float myfloatNum = 5.99f; // floating point no
        char myletter = 'D';//character
        boolean mybool = true; // boolean
        String mytext = "Hello"; //string

        System.out.println(mynum);
        System.out.println(myfloatNum);
        System.out.println(myletter);
        System.out.println(mybool);
        System.out.println(mytext);
        /*
         * java variable type conversion & typecasting:
         */
        double f;
        int i = 10;
        f = i; //type conversion
        double g = 10;
        int j;
        j = (int) g;// type casting
        System.out.println(f);
        System.out.println(i);
        System.out.println(g);
        System.out.println(j);
        byte k = 10;//1 byte
        boolean l = true;// 1bit
        long m = 10L;
        float n = 1.2f;
        double o= 1.2d;
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);

        System.out.println(ABC.j);
        ABC obj1 = new ABC();
        System.out.println(obj1.i);
        obj1.i++;
        ABC obj2 = new ABC();
        System.out.println(obj2.i);

        System.out.println(ABC.j++);
        ABC.typeConversionandtypecasting();
    }
    int r = 10;
    void display()
    {
        int a= 5 ;//local variable
        System.out.println("display method");
        System.out.println(a);
    }
     class ABC {
        static int j = 10; //class variable
         int i = 10;
         static void display(){

             int a= 5; //local variable
             System.out.println("display method");
             System.out.println(a);

         }
         static void typeConversionandtypecasting(){
             /*
             * doublef; //8bytes
             *
              */
             double f; //64 slots
             int i=10; //32 slots
             j=(int)g;
             System.out.println(i);
             System.out.println(j);
         }
    }
}
