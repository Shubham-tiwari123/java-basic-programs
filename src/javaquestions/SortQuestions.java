/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquestions;

import java.util.Scanner;

public class SortQuestions{
    private int A[] = new int[5];
    private int temp,min,j;
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
    
    public void selectionSort(){
        System.out.print("\nEnter the 5 elements:-");
        for(int i=0;i<5;i++)
            A[i] = sc.nextInt();
        
        for(int i=0;i<5;i++){
            min =i;
            for(j=i+1;j<5;j++){
                if(A[j]<A[min])
                    min=j;
            }
            temp = A[min];
            A[min]= A[i];
            A[i]=temp;
        }
        for (int i=0; i<5; ++i)
            System.out.print(A[i] + " ");
    }
}
