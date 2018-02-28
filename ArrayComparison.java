package Odev2;

import java.util.Scanner;
public class ArrayComparison {
    public static int compareNthSum(int arr1[], int arr2[]) {
        int size = arr1.length;
        int size2 = arr2.length;
        int sum1 = 0;
        int sum2 = 0;
        int n = 1;
        int max = 0;
        if (size < size2) {
            for (int i = 0; i < size; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];

                if (sum1 == sum2) {
                    max = n;
                }
                n++;
            }
            if (max != 0) {
                return max;
            } else
                return -1;
        } else {
            for (int i = 0; i < size2; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];

                if (sum1 == sum2) {
                    max = n;
                }
                n++;
            }
            if (max != 0) {
                return max;
            } else
                return -1;
        }
    }

    public static void main(String args[]) {
        //int arr1[] = {3, 4, 3, 4, 5, 6};
       // int arr2[] = {2, 5, 1, 6, 8, 1};
        //int arr1[] ={1,2,3,4,5};
        //int arr2[]={4,1,1,7,8};
        int arr1[] ={1,2,3};
        int arr2[] ={7,10,8};
        System.out.println(compareNthSum(arr1, arr2));
        //System.out.println("{3,4,3,4,5,6} ve {2,5,1,6,8,1} dizilerinin ilk " + compareNthSum(arr1, arr2) + " terim toplamı eşittir.");
        System.out.println("{1,2,3} ve {7,10,8} dizilerinin ilk n terim toplamı eşit değildir.");


    }
}











