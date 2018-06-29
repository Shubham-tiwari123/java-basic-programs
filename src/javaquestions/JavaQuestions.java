package javaquestions;

public class JavaQuestions {

    public static void main(String[] args) {
        GeneralQuestions q = new GeneralQuestions();
        q.primeNumber();
        q.palindrome();
        q.factorial();
        q.armstrongNumber();
        q.fibonacciSeries();
       
        SortQuestions s = new SortQuestions();
        s.bubbleSort();
        s.selectionSort();
       
        Searching s1 = new Searching();
        s1.binarySearch();
        s1.linearSearch();
        
        ArrayProblems a = new ArrayProblems();
        a.largestElement();
        a.secondLargestElement();
        a.thirdLargestElement();
        a.smallestElement();
        a.secondSmallestElement();
        a.addTwoMatrix();
        a.multiplyMatrix();
        a.oddOrEven();
        a.transposeMatrix();
        a.removeDuplicate();
    }
}
