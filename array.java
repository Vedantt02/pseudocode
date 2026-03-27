import java.util.Scanner;
public class array {
    public static void main(String[] args){

        // Array of integers:
        /*
         DECLARE a : ARRAY[0:4] OF INTEGER
         FOR i:= 0 TO 4
            READ a[i]
         END FOR

         FOR i:= 0 TO 4
            PRINT a[i]
         END FOR
         */

        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The integers are: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

//----------------------------------------------------------------------------

        // Sum of Elements in an Array:
        /*
         DECLARE a : ARRAY[0:4] OF INTEGER
         DECLARE sum : INTEGER
         sum = 0
         FOR i:= 0 TO 4
            READ a[i]
         END FOR

         FOR i:= 0 TO 4
            sum = sum + a[i]
         END FOR
         PRINT sum
         */

        int[] arr = new int[5];
        int sum = 0;
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the integers is: " + sum);


//----------------------------------------------------------------------------

        // Max Value in an Array:
        /*
         DEACLARE a : ARRAY[0:4] OF INTEGER
         DECLARE max : INTEGER
         FOR i:= 0 TO 4
            READ a[i]
         END FOR
         max = a[0]
         FOR i:= 1 TO 4
            IF a[i] > max THEN
            max = a[i]
            END IF
         END FOR
         PRINT max
         */

        int[] arr2 = new int[5];
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }
        int max = arr2[0];
        for (int i = 1; i < 5; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
            }
        }
        System.out.println("The maximum value in the array is: " + max);


//----------------------------------------------------------------------------

        // Multi-Dimensional Array:
        /*
         DECLARE a : ARRAY[2][2] OF INTEGER
         FOR r:= 0 TO 1
            FOR c:= 0 TO 1
            READ a[r][c]
            END FOR
         END FOR
         FOR r:= 0 TO 1
            FOR c:= 0 TO 1
            PRINT a[r][c]
            END FOR
         END FOR
         */

        int[][] a2 = new int[2][2];
        System.out.println("Enter 4 integers for a 2x2 array:");
        for (int r=0; r<2; r++) {
            for (int c=0; c<2; c++) {
                a2[r][c] = sc.nextInt();
            }
        }
        System.out.println("The 2x2 array you entered is:");
        for (int r=0; r<2; r++) {
            for (int c=0; c<2; c++) {
                System.out.print(a2[r][c] + " ");
            }
            System.out.println();
        }

//----------------------------------------------------------------------------


        // Count how many values are Even / Odd in 3x3 Array:
        /*
         DECLARE a : ARRAY[2][2] OF INTEGER
         DECLARE even_Count : INTEGER
         DECLARE odd_Count : INTEGER
         even_Count = 0
         odd_Count = 0
         FOR r:= 0 TO 2
            FOR c:= 0 TO 2
                READ a[r][c]
            END FOR
         END FOR
         FOR r:= 0 TO 2
            FOR c:= 0 TO 2
                IF a[r][c] MOD 2 == 0 THEN
                    INCREMENT even_Count
         ELSE
             INCREMENT odd_Count
           END IF
            END FOR
         END FOR
         PRINT even_Count
         PRINT odd_Count
         */

        int[][] a3 = new int[3][3];
        int even_Count = 0;
        int odd_Count = 0;
        System.out.println("Enter 9 integers for a 3x3 array: ");
        for (int r=0; r<3; r++) {
            for (int c=0; c<3; c++) {
                a3[r][c] = sc.nextInt();
            }
        }
        for (int r=0; r<3; r++) {
            for (int c=0; c<3; c++) {
                if (a3[r][c] % 2 == 0) {
                    even_Count++;
                } else {
                    odd_Count++;
                }
            }
        }
        System.out.println("Number of even values: " + even_Count);
        System.out.println("Number of odd values: " + odd_Count);


//----------------------------------------------------------------------------

        // Addition of Two 3x3 Arrays:
        /*
         DECLARE x : ARRAY[2][2] OF INTEGER
         DECLARE y : ARRAY[2][2] OF INTEGER
         DECLARE z : ARRAY[2][2] OF INTEGER
         FOR r:= 0 TO 2
            FOR c:= 0 TO 2
                READ x[r][c]
                READ y[r][c]
            END FOR
         END FOR
         FOR r:= 0 TO 2
            FOR c:= 0 TO 2
                z[r][c] = x[r][c] + y[r][c]
            END FOR
         END FOR
         FOR r:= 0 TO 2
            FOR c:= 0 TO 2
                PRINT z[r][c]
            END FOR
         END FOR
         */

        int[][] x = new int[3][3];
        int[][] y = new int[3][3];
        int[][] z = new int[3][3];
        System.out.println("Enter 9 integers for the first 3x3 array:");
        for (int r=0; r<3; r++) {
            for (int c=0; c<3; c++) {
                x[r][c] = sc.nextInt();
            }
        }
        System.out.println("Enter 9 integers for the second 3x3 array:");

        for (int r=0; r<3; r++) {
            for (int c=0; c<3; c++) {
                y[r][c] = sc.nextInt();
            }
        }
        for (int r=0; r<3; r++) {
            for (int c = 0; c < 3; c++) {
                z[r][c] = x[r][c] + y[r][c];
            }
        }
        System.out.println("The 3x3 array after addition is:");
        for (int r=0; r<3; r++) {
            for (int c=0; c<3; c++) {
                System.out.print(z[r][c] + " ");
            }
            System.out.println();
        }
        sc.close();


    }
}