package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Random random = new Random();

       long start = System.currentTimeMillis();
       int x = random.nextInt(400) +1;
       int[][] matrix = new int [x][x];

       for(int i =0; i < x; i++){
           for(int k = 0; k<x; k++){
               matrix[i][k] = random.nextInt(10);
           }
       }
       sum(matrix);
       long finish = System.currentTimeMillis();

       long time = finish - start;

       printMatrix(matrix);
       System.out.println("Start time: " + start);
       System.out.println("Finish time: " + finish);
       System.out.println("Execution time: " + time + " ms");
    }


    public static void sum(int[][] matrix){
        int size = matrix.length;
        for(int col =0; col<size; col++){
            int sum =0;
            for(int row = 0; row<size;row++){
                sum+=matrix[row][col];
            }
            matrix[col][col]=sum;
        }
    }
    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for( int num: row){
                System.out.printf("%d ", num );
            }
            System.out.println();
        }
    }
}



