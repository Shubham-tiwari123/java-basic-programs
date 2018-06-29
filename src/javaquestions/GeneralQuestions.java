/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquestions;

import java.util.Scanner;
import java.lang.Math;

public class GeneralQuestions{
    private double flag, temp, sum,remainder,len,temp1;
    private int num;
    Scanner sc = new Scanner(System.in);
    
    public void primeNumber(){
        flag=0;
        System.out.print("\nEnter a numbere:-");
        num = sc.nextInt();
        if(num==0||num==1){
            System.out.print("\nNot a prime number.");
            return;
        }
        for(int i=2;i<num;i++){
            if(num%i==0)
                flag=1;
        }
        if(flag==0)
            System.out.print("\nPrime number.");
        else
            System.out.print("\nNot a prime number.");
            
        System.out.println(num);
    }
    
    public void palindrome(){
        System.out.print("\nEnter a number:-");
        num = sc.nextInt();
        temp = num;
        while(num>0){
            remainder = num%10;
            sum = (sum*10)+remainder;
            num = num/10;
        }
        if(temp==sum)
            System.out.print("\nNumber is palindrome\n");
        else
            System.out.print("\nNumber not a palindrome\n");
    }
    
    public void factorial(){
        sum=0;
        temp=1;
        System.out.print("\nEnter a number:-");
        num = sc.nextInt();
        for(int i=1;i<=num;i++){
            temp = temp*i;
        }
        System.out.println("\nFcatorial of "+num+" is "+temp);
    }
    
    public void armstrongNumber(){
        System.out.print("\nEnter a number:-");
        num = sc.nextInt();
        len = Integer.toString(num).length();
        temp = num;
        while(num>0){
            temp1=0;
            remainder = num%10;
            temp1=Math.pow(remainder, len);
            sum= sum+temp1;
            num = num/10;
        }
        if(sum==temp)
            System.out.print("\nArmstrong Number");
        else
            System.out.println("\nNot an armstrong num");
    }
    
    public void fibonacciSeries(){
        int count=10;
        int n1=0,n2=1,n3;
        System.out.print("\nEnter a number:-");
        num = sc.nextInt();
        for(int i=2;i<count;++i){    
         n3=n1+n2;    
         System.out.print(" "+n3);    
         n1=n2;    
         n2=n3;    
        }  
    }
}
