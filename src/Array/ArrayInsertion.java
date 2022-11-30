package Array;

import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        int n, index, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element of element you want in array :");
        n = sc.nextInt();
        int array [] = new int [n];
        int arr [] = new int [n+1];
        System.out.println("Enter all the element :");
        for (int i = 0; i <n ; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("enter the index of new value to be inserted :");
        index = sc.nextInt();
        System.out.println("Enter the element you want to insert :");
        x=sc.nextInt();
        for (int i = 0; i < n+1; i++) {
            if (i<index){
                arr[i] = array[i];
            } else if (i==index) {
                arr[i] =x;
            }
             else {
                arr[i]=array[i-1];
            }
            }
        System.out.println("elements are :");
        for (int i = 0; i <n+1 ; i++) {
            System.out.println(arr[i]);
        }
        }
    }

