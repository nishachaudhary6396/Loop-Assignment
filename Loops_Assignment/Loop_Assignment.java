package PwLoopAssignment;
import java.util.Scanner;
// Q1 :- Write a java program to calculate the sum of natural numbers up to a given numbers up to a given positive integer 'n'.
public class AssignmentQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum+i;
        }
        System.out.print(sum);
    }
}

package PwLoopAssignment;
import java.util.Scanner;
//Q2 :- Write a java program to print a multiplication table for a given number 'n'.
public class AssignmentQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n;i++){
            System.out.println( n +" * "+ i +" = "+ n*i );
        }
    }

}

package PwLoopAssignment;
import java.util.Scanner;
//Q3 :- Write a java program to find the GCD of two numbers using a loop.
public class AssignmentQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int g = 0;
        for(int i = 1 ; i<= n1; i++){
            if(n1%i==0 && n2%i==0)
                g=i;
            }
        System.out.print("GCD = "+ g);
        }
    }

package PwLoopAssignment;
// Q4:- Write a java program to check if a given string is a palindrome or not using a loop.
public class AssignmentQ4 {
    public static void main(String[] args) {
        String x = "abcba";
        int i = 0, j = x.length()-1;
        while(i<j){
            if(x.charAt(i) != x.charAt(j)){
                    System.out.println("String is not palindrome");
                    break;
                }
            i++;
            j--;
            }
        System.out.println("String is palindrome");
        }
    }

package PwLoopAssignment;
import java.util.Scanner;
//Q5 :- Write a java program to generate and print the first 'n' terms of the fibonacci series;
public class AssignmentQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int a=0,b=1;
        for(int i = 1;i<=n;i++){
            int sum = a+b;
            System.out.print(sum);
            a=b;
            b=sum;
        }
    }

}