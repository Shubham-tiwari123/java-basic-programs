package javaquestions;
import java.lang.Math;
import java.util.Scanner;
class GeneralQuestions{
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
}

class SortQuestions{
    private int A[] = new int[5];
    private int temp;
    Scanner sc = new Scanner(System.in);
    
    public void bubbleSort(){
        System.out.print("\nEnter 5 elements for bubble sort:-");
        for(int i=0;i<5;i++)
            A[i] = sc.nextInt();
        
        for (int i=0;i<5;i++)
            for (int j=0;j<5-i-1;j++)
                if (A[j] > A[j+1])
                {
                    // swap temp and arr[i]
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
        for (int i=0; i<5; ++i)
            System.out.print(A[i] + " ");
    }
}


public class JavaQuestions {

    public static void main(String[] args) {
        GeneralQuestions q = new GeneralQuestions();
        q.primeNumber();
        q.palindrome();
        q.factorial();
        q.armstrongNumber();
       
       SortQuestions s = new SortQuestions();
       s.bubbleSort();
    }
    
}
