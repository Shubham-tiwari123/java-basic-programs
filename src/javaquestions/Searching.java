/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquestions;

import java.util.Scanner;

public class Searching{
    
    private int A[] = new int[5];
    private int num,temp,n;
    Scanner sc = new Scanner(System.in);
    
    public void linearSearch(){
        System.out.print("\nEnter 5 elements:-");
        for(int i=0;i<5;i++)
            A[i] = sc.nextInt();
        System.out.print("\nEnter the element to search:-");
        num = sc.nextInt();
        for(int i=0;i<5;i++){
            if(A[i]==num)
                System.out.print("\nnumber found at:-"+i);
        }
    }
    
    public void binarySearch(){
        int left,right,mid;
        System.out.print("\nEnter 5 elements:-");
        for(int i=0;i<5;i++)
            A[i] = sc.nextInt();
        System.out.print("\nEnter the element to search:-");
        num = sc.nextInt();
        left=0;
        right=5;
        while(left<=right){
            mid = left+(right-left)/2;
            
            if(A[mid]==num){
                mid =mid+1;
                System.out.println("\nElement found at:"+mid);
                return;
            }
            else if(A[mid]<num){
                left=mid+1;
            }
            else
                right=mid-1;
        }
    }
}