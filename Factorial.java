import java.io.*;
import java.util.Scanner;
class Factorial{
    void fact{
        int fact=1,i,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        n=s.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The factorial is:"+fact);
    }
}
class FactorialDemo{
    public static void main(String args[]){
        Factorial f = new Factorial();
        f.fact();
    }
}