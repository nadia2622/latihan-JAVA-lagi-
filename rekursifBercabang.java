import java.util.*;
import java.lang.String;
public class rekursifBercabang {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("masukkan nilai n: ");
        int nilai = inp.nextInt();
        int nilai_fibonacci = fibonacci(5, "atas");
        System.out.println("nilai fibonacci ke - " + nilai + " adalah " + nilai_fibonacci);
    }


    private static int fibonacci (int n, String daun) {
        System.out.println("daun " + daun);
        System.out.println("fibonacci ke- " + n);
        if(n == 1 || n == 0) {
            return n;
        }
        else{
        return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        }
    }
    
}
