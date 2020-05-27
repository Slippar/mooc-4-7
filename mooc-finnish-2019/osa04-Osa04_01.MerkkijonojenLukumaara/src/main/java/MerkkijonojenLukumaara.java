
import java.util.ArrayList;
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int count = 0;
        
        while (true) {
            String rivi = lukija.nextLine();

            if (rivi.equals("loppu")) {
                System.out.println(count);
                break;
            }
            
            count = count+1;
        }   
    }
}
