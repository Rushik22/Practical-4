public class  FullPyramidPattern {
    public static void main(String[] args) {
        
        for (int i = 5; i >= 1; i--) {   // Outer loop for rows
            
            for (char ch = 'A'; ch < 'A' + i; ch++) {  // Print letters
                System.out.print(ch + " ");
            }
            
            System.out.println();  // Move to next line
        }
    }
}