package Character;

import java.util.Scanner;

public class character {
      public static boolean isLetter(char ch) {
        return Character.isLetter(ch);
    }

    // ตรวจสอบว่าเป็นตัวพิมพ์เล็กหรือไม่
    public static boolean isLower(char ch) {
        return Character.isLowerCase(ch);
    }

    // แปลงเป็นตัวพิมพ์ใหญ่
    public static char toUpper(char ch) {
        return Character.toUpperCase(ch);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar;
        boolean validInput = false;

        // รับค่าจากผู้ใช้
        while (!validInput) {
            System.out.print("Enter a letter: ");
            inputChar = scanner.next().charAt(0);

            if (isLetter(inputChar)) { // ตรวจสอบว่าเป็นตัวอักษรหรือไม่
                validInput = true; // อินพุตถูกต้อง

                if (isLower(inputChar)) { // ถ้าเป็นตัวพิมพ์เล็ก
                    inputChar = toUpper(inputChar); // แปลงเป็นตัวพิมพ์ใหญ่
                }

                // แสดงผลลัพธ์
                System.out.println(inputChar);
            } else {
                System.out.println("Not a letter.");
            }
        }

        scanner.close();
    }
}