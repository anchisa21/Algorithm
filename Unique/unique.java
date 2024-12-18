package Unique;

import java.util.HashSet;
import java.util.Scanner;

public class unique {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; // อาเรย์สำหรับเก็บ 10 ตัวเลข
        HashSet<Integer> uniqueNumbers = new HashSet<>(); // ใช้ HashSet เก็บตัวเลขไม่ซ้ำ

        // รับอินพุต 10 ตัวเลข
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Integers " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            uniqueNumbers.add(numbers[i]); // เพิ่มเข้า HashSet (จะเก็บเฉพาะตัวไม่ซ้ำ)
        }

        // แสดงผลลัพธ์ตัวเลขที่ไม่ซ้ำกัน
        System.out.print("Unique numbers is: ");
        for (int number : uniqueNumbers) {
            System.out.print(number + " ");
        }
    }
}