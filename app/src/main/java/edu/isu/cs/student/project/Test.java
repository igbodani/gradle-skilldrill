package edu.isu.cs.student.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class Test {

  public int factorial(int num){
        for (int i = num -1; i >0 ; i--){
            num *= i;
        }
        System.out.println(num);
        return num;
    }
    public static void main(String[] args) {


        int [][] arr = new int[3][3];
        int [][] var = new int[3][3];
        int [][] min = new int[3][3];

            Scanner scan = new Scanner(System.in);
            int value;
/*
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[i].length; j ++){
                arr[i][j] = scan.nextInt();
            }
            System.out.println();
        }
        System.out.println(" For the second matrix ");
        for(int i = 0; i < var.length; i ++){
            for(int j = 0; j < var[i].length; j ++){
                var[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        for(int i = 0; i < min.length; i ++){
            for(int j = 0; j < min[i].length; j ++){
                min[i][j] = var[i][j] - arr[i][j];
                System.out.print(min[i][j] + " ");
            }
            System.out.println();
        }

 */


}}
