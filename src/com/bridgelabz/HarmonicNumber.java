package com.bridgelabz;
import java.util.*;

public class HarmonicNumber {

    public static double harmonicCalculation(double N)
    {
        double val=0.0;

        for (int i=1; i<=N; i++)
        {
            val = val+(1.0/i);
        }
        return val;
    }

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double N=in.nextInt();

        double result=harmonicCalculation(N);

        if(N>0)
        {
            System.out.println("Harmonic Value of "+N+" = "+result);
        }
    }
}
