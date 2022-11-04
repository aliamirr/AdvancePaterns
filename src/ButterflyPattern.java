public class ButterflyPattern {
    public static void main(String[] args) {
        int m = 4;
       //Upper Half of Pattern
        for (int i = 1; i <= m; i++) {
        //Upper Left Half of Pattern
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            // Spaces
            int spaces = 2 * (m-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //Upper Right Half of Pattern
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = m; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2*(m-i)); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
