package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*   //=> true dönmeli(Gece 1'de köpeğimiz havlıyor)
        System.out.println( shouldWakeUp (true, 1));
        ;// => false dönmeli.(köpek havlamıyor.)
        System.out.println (shouldWakeUp (false, 2));
        ; //=> false dönmeli.(8'den sonra ise tepki vermeliyiz.)
        System.out.println(shouldWakeUp (true, 8));
       ; //=> false dönmeli(-1 geçersiz değer)
        System.out.println( shouldWakeUp (true, -1));
    }*/
       /* ; // => true dönmeli.(19 değerinden dolayı)
        System.out.println(hasTeen(9, 99, 19));
        ; //=> true dönmeli.(15 değerinden dolayı)
        System.out.println(hasTeen(23, 15, 42));
        ; //=> false dönemli(Hiçbir değer 13-19 arasında değil.)
        System.out.println(hasTeen(22, 23, 23));
        */

        ;;// => false dönmeli(sıcaklık 25-45 arasında olmalıydı)

       ;// => false dönmeli(sıcaklık 25-35 arasında olmalıydı)

        ;// => true dönmeli(sıcaklık 25-35 arasında.)

       /* System.out.println(isCatPlaying(true, 10));
        System.out.println( isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35)); gfjghjg
        */

       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter width of rectangle: ");
       double  width = scanner.nextDouble();
       System.out.println("Enter rectangle of rectangle : ");
       double heigth = scanner.nextDouble();
        System.out.println("Area of rectangle : " +area(width, heigth));

        System.out.println("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        System.out.println("area of circle: " +area(radius));





    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23 || !isBarking) {
            return false;
        }
        return clock < 8 || clock >= 20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {


        return(firstAge < 13 && firstAge <= 19) ||
                (secondAge > 13  && secondAge <= 19 ) ||
                (thirdAge > 13 && thirdAge <= 19 );
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        int highestTemp = isSummer ? 45 : 35;
        int lowestTemp = 25;
        return temp > 25 && temp <= highestTemp;


    }

   public static double area(double width, double height) {
        if (width < 0 || height < 0 )
            return -1;

            return width * height;
         }





    public static double area(double radius) {

        if (radius < 0) {
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
