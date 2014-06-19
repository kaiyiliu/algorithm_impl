import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Luhn10{

     public static int luhn(int[] n) {
         int sum = 0;
         for (int i = 1; i <= n.length; i++) {
            if (i % 2 == 1) {
                sum += n[n.length - i];
            }
            else if (n[n.length - i] * 2 <= 10) {
                sum += n[n.length - i] * 2;
            } else {
                sum += (n[n.length - i] * 2) % 10 + (n[n.length - i] * 2) / 10;
            }
         }
         return sum;
     }
     
     public static void main(String []args){
        int[] n = new int[16];
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < 16; i++) {
                    n[i] = Character.getNumericValue(line.charAt(i));
                }
            }
        } catch (IOException e){
            System.out.println(e);
        }
        System.out.println(n.length);
        int r = luhn(n);
        System.out.println(r);
    }
}
