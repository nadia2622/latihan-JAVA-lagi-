public class method {
    public static void main(String[] args) {
        
        printAngka(10);
        printAngka(10.5f);
        int hasil = tambah(4, 5);
        printAngka(hasil);
        System.out.println();
    }

    private static int tambah(int angkaInt1, int angkaInt2) {
        return angkaInt1 + angkaInt2;
    }

    private static void printAngka(float angkaFloat){
        System.out.println("Angka ini adalah float dengan nilai = " + angkaFloat);
    
    }

    private static void printAngka(int angkaInt) {
        System.out.println("Angka ini adalah integer dengan nilai = " + angkaInt);
    }
    
}
