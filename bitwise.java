public class bitwise {
    public static void main(String[] args){

        // Q1.
            /*
              DECLARE a : INTEGER
              DECLARE b : INTEGER
              DECLARE c : INTEGER

              SET c:= 8 , b:= 51 , c:= 2
              c = (a^b) ^ a
              b = b MOD 4
              PRINT a + b + c
              */

        int a;
        int b;
        int c;

        a = 8;
        b = 51;
        c = 2;

        c = (a ^ b) ^ a;
        b = b % 4;
        System.out.println(a + b + c);

//----------------------------------------------------------------------------

        // Q2.
            /*
              DECLARE a : INTEGER
              DECLARE b : INTEGER
              DECLARE c : INTEGER
              SET c:= 8 , b:= 2
              a = c / b
              c = b >> a
              c = b << a
              PRINT (c)
              */

        int a;
        int b;
        int c;

        c = 8;
        b = 2;
        a = c / b;
        c = b >> a;
        c = b << a;
        System.out.println(c);

//----------------------------------------------------------------------------

        // Q3.
            /*
               DECLARE a : INTEGER
               DECLARE b : INTEGER
               SET a:= 15 , b:= 7
               a = a MOD (a-3)
               b = b MOD (b-3)
               b = b MOD 1
               PRINT a + b
               */

        int a;
        int b;
        int c;

        a = 15;
        b = 7;
        a = a % (a-3);
        b = b % (b-3);
        a = a % 1;
        b = b % 1;
        System.out.println(a + b);

//----------------------------------------------------------------------------

        // Q4.
            /*
               INTEGER pp , qq , rr
               SET  pp:= 2 , qq:= 9 , rr:= 5
               pp = (pp AND rr) + pp
               rr = rr + rr
               rr = (rr + rr) AND rr
               PRINT (pp + qq + rr)
               */

        int pp;
        int qq;
        int rr;

        pp = 2;
        qq = 9;
        rr = 5;
        pp = (pp & rr) + pp;
        rr = rr + rr;
        rr = (rr + rr) & rr;
        System.out.println(pp + qq + rr);

//----------------------------------------------------------------------------

        // Q5.
         /*
               SET INTEGER x:= 2
               SET INTEGER y:= 24
               SET INTEGER z:= 2
               z = (x^z) ^ x
               y = y MOD 2
               DISPLAY x + y + z
               */


        int x = 2;
        int y = 24;
        int z = 2;

        z = (x ^ z) ^ x;
        y = y % 2;
        System.out.println(x + y + z);

//----------------------------------------------------------------------------

        // Q6.
            /*
               DECLARE a : INTEGER
               DECLARE b : INTEGER
               DECLARE c : INTEGER

               SET b:= 40 , a:= 20, c:= 20
               a = a + c
               c = c + a
               a = a + c
               c = c + a
               print a + b + c
               */

       int a = 20;
        int b = 40;
        int c = 20;
        a = a + c;
        c = c + a;
        a = a + c;
        c = c + a;
        System.out.println(a + b + c);

    }
}
