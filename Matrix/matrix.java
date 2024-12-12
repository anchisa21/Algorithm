package matrix;

import java.util.Scanner;

public class matrix {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int[][] matrix = new  int[3][3]; // สร้าง Matrix ขนาด 3x3
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               System.out.print("Enter Matrix index of["+ i +"][" + j +"]:");
               matrix[i][j] = scanner.nextInt();
           }
       }
       System.out.println("\nNormal Matrix is");
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               System.out.println(matrix[i][j] + " ");
           }
           System.err.println();
       }
       int[][] transpose = new  int[3][3]; //สร้าง Matrix
       for (int i =  0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = matrix[i][j];
            }
       }
        System.err.println("\nMatrix Transpose is"); //เเสดงผล Matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(transpose[i][j] + " ");
            }
            System.out.println();
        }  
        scanner.close(); 
    }
} 
