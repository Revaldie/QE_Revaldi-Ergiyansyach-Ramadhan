package com.company;

public class bilanganprima {


    public static boolean primeNumber (int Number) {
        boolean prime = true;
        int limit = (int) Math.sqrt ( Number );

        for ( int i = 2; i <= limit; i++ )
        {
            if ( Number % i == 0 )
            {
                prime = false;
                break;
            }
        }

        return prime;
    }

    public static void main ( String[] args )
    {
        System.out.println(primeNumber(7));
        System.out.println(primeNumber(10));
    }

}

