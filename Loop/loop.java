package loop;

public class loop {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
           for (int j = 1; j <= i; i++) {
               System.err.println("*");
           } 
           System.out.println();
        }
        for (int i = 4; i <= 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.err.println();
        }
    }
}
