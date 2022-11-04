import java.util.*;
public class PalindromePattern {
    public static void main(String[] args) {
        int m = 5;

        for (int i = 1; i <=m ; i++) {
            //Spaces
            for (int j = 1; j < m-i; j++) {
                System.out.print(" ");
            }
            //1st Half Numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //2nd Half Numbers
            for (int j = 2  ; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
