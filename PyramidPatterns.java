public class PyramidPatterns {
    public static void main(String[] args) {

        // ===== Right Half Number Pyramid =====
        int num = 1;  // Starting number
        
        for (int i = 1; i <= 5; i++) {        // Outer loop for rows
            for (int j = 1; j <= i; j++) {    // Inner loop for numbers
                System.out.print(num + " ");
                num++;                        // Increase number
                
                if (num == 10) {              // Reset after 9
                    num = 1;
                }
            }
        }


        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}