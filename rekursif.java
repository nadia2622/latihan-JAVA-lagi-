import java.util.*;
public class rekursif {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");

        int nilai = inp.nextInt();
        System.out.println("anda memasukkan nilai: " + nilai);

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);

        int faktorial = faktorial(nilai);
        System.out.println("Hasil faktorial = " + faktorial);
    }
    private static int faktorial(int parameter) {
        System.out.println("parameter = " + parameter);

        if(parameter == 1){
            return parameter;
        }
        return parameter * faktorial(parameter - 1);

    }

    private static int jumlahNilai(int parameter) {
        System.out.println("parameter = " + parameter);

        if(parameter == 0){
            return parameter;
        }
        return parameter + jumlahNilai(parameter - 1);

    }
    private static void printNilai (int parameter) {
        System.out.println("nilai = " + parameter);
        if (parameter == 0) {
            return;
        }
        parameter--;
        printNilai(parameter);
        
    }
}
