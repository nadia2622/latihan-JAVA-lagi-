import java.util.*;
public class gambar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("masukkan panjang: ");
        int p = inp.nextInt();
        System.out.println("masukkan lebar: ");
        int l = inp.nextInt();

        gambar(p,l);
        luas(p,l);
    }

    private static void gambar(int p, int l) {

        for(int i = 0; i < l; i++) {
            for(int j = 0; j < p; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    private static int luas(int p, int l) {
        int hasil = p*l;
        System.out.println("Luasnya adalah: " + hasil);
        return hasil;
    }
}
