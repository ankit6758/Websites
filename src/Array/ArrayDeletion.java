package Array;

import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
     int n, index, del;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element :");
        n = sc.nextInt();
        int array_1 [] = new int [n];
        int array_2 [] = new int [n-1];
        System.out.println("enter all the element :");
        for (int i = 0; i <n ; i++) {
            array_1[i]=sc.nextInt();
        }
        System.out.println("enter the index value");
        index= sc.nextInt();

        for (int i = 0; i <n-1 ; i++) {
            if (i<index){
                array_2[i]=array_1[i];
            } else if (i==index)
                continue;
            else {
                array_2[i-1]=array_1[i];
            }

        }
        System.out.println("array after deletion :");
        for (int i = 0; i <n-1 ; i++) {
            System.out.println(array_2[i]);
        }
    }
}
