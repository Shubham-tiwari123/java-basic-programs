/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquestions;

import java.util.Scanner;

public class ArrayProblems {
    private int A[] = new int[5];
    private int B[] = new int[5];
    private int C[] = new int[5];
    private int D[] = new int[10];
    private int mat1[][] = new int[3][3];
    private int mat2[][] = new int[3][3];
    private int result[][] = new int[3][3];
    private int num,temp,max,temp1,min;
    
    Scanner sc = new Scanner(System.in);
    
    public void largestElement(){
        System.out.print("\nEnter 5 elements:-");
        for(int i=0;i<5;i++)
            A[i] = sc.nextInt();
        max = A[0];
        for(int i=0;i<5;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        System.out.println("\nLargest element is:-"+max);
    }
    
    public void secondLargestElement(){
        System.out.print("\nEnter 5 elements:-");
        for(int i=0;i<5;i++)
            A[i] = sc.nextInt();
        max = A[0];
        for(int i=0;i<5;i++){
            if(A[i]>max){
                temp = max;
                max = A[i];
            }
        }
        System.out.println("\n2nd Largest element is:-"+temp);
    }
    
    public void thirdLargestElement(){
        System.out.print("\nEnter 5 elements:-");
        for(int i=0;i<5;i++)
            A[i] = sc.nextInt();
        temp=temp1=max=Integer.MIN_VALUE;
        for(int i=0;i<5;i++){
            if(A[i]>max){
                temp1=temp;
                temp=max;
                max=A[i];
            }
        }
        System.out.println("\n3rd Largest element is:-"+temp1);
    }
    
    public void smallestElement(){
        System.out.print("\nEnter 5 elements:-");
        for(int i=0;i<5;i++)
            A[i] = sc.nextInt();
        min=A[0];
        for(int i=0;i<5;i++){
            if(A[i]<min)
                min=A[i];
        }
        System.out.println("\nSmallest element is:-"+min);
    }
    
    public void secondSmallestElement(){
        temp = Integer.MAX_VALUE;
        temp1 = Integer.MAX_VALUE;
        System.out.print("\nEnter 5 elements:-");
        for(int i=0;i<5;i++)
            A[i] = sc.nextInt();
        for(int i=0;i<5;i++){
            if(A[i]<temp){
                temp1=temp;
                temp=A[i];
            }
            else if (A[i] < temp1){
                temp1 = A[i];
            }
        }
        System.out.println("\nSmallest element is:-"+temp1);
    }
    
    public void addTwoMatrix(){
        System.out.print("\nEnter 1st matrix[3][3]:-");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                mat1[i][j]=sc.nextInt();
        }
        System.out.print("\nEnter 2st matrix[3][3]:-");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                mat2[i][j]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.print("\nMatrix 1:-");
        for(int i=0;i<3;i++){
            System.out.print("\n");
            for(int j=0;j<3;j++){
                System.out.print(mat1[i][j]+" ");
            }
        }
        System.out.print("\nMatrix 2:-");
        for(int i=0;i<3;i++){
            System.out.print("\n");
            for(int j=0;j<3;j++){
                System.out.print(mat2[i][j]+" ");
            }
        }
        System.out.print("\nResult of addition:-");
        for(int i=0;i<3;i++){
            System.out.print("\n");
            for(int j=0;j<3;j++){
                System.out.print(result[i][j]+" ");
            }
        }
        
    }
    
    public void multiplyMatrix(){
        System.out.print("\nEnter 1st matrix[3][3]:-");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                mat1[i][j]=sc.nextInt();
        }
        System.out.print("\nEnter 2st matrix[3][3]:-");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                mat2[i][j]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                result[i][j]=0;
                for(int k=0;k<3;k++){
                    result[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        
        System.out.print("\nMatrix 1:-");
        for(int i=0;i<3;i++){
            System.out.print("\n");
            for(int j=0;j<3;j++){
                System.out.print(mat1[i][j]+" ");
            }
        }
        System.out.print("\nMatrix 2:-");
        for(int i=0;i<3;i++){
            System.out.print("\n");
            for(int j=0;j<3;j++){
                System.out.print(mat2[i][j]+" ");
            }
        }
        System.out.print("\nResult of addition:-");
        for(int i=0;i<3;i++){
            System.out.print("\n");
            for(int j=0;j<3;j++){
                System.out.print(result[i][j]+" ");
            }
        }
    }
    
    public void oddOrEven(){
        int j=0,z=0;
        System.out.print("\nEnter 5 elements:-");
        for(int i=0;i<5;i++)
            A[i] = sc.nextInt();
        for(int i=0;i<5;i++){
            if(A[i]%2==0){
                B[j]=A[i];
                j++;
            }
            else{
                C[z]=A[i];
                z++;
            }
        }
        System.out.print("\nEven number:-");
        for(int i=0;i<j;i++)
            System.out.print(B[i]+" ");
        
        System.out.print("\nOdd number:-");
        for(int i=0;i<z;i++)
            System.out.print(C[i]+" ");
    }
    
    public void transposeMatrix(){
        System.out.print("\nEnter matrix[3][3]:-");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                mat1[i][j]=sc.nextInt();
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                result[i][j]=mat1[j][i];
            }
        }
        
        System.out.print("\nMatrix:-");
        for(int i=0;i<3;i++){
            System.out.print("\n");
            for(int j=0;j<3;j++){
                System.out.print(mat1[i][j]+" ");
            }
        }
        System.out.print("\nTranspose:-");
        for(int i=0;i<3;i++){
            System.out.print("\n");
            for(int j=0;j<3;j++){
                System.out.print(result[i][j]+" ");
            }
        }
    }
    
    public void removeDuplicate(){
        int[] temp = new int[10];  
        System.out.print("\nEnter 10 elements:-");
        for(int i=0;i<10;i++)
            D[i] = sc.nextInt();
        int j=0;
        for (int i=0; i<10; i++){  
            if (D[i] != D[i+1]){  
                temp[j++] = D[i];  
            }  
        }
        for (int i=0; i<j; i++){  
            D[i] = temp[i];  
        }
        System.out.print("\nPrinting:-");
        for(int i=0;i<j;i++){
            System.out.print(D[j]+" ");
        }
        
    }
}
