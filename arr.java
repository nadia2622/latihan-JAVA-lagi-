import java.util.*;
import java.util.stream.IntStream;
public class arr {
    public static void main(String[] args) {
        int[] arrAngka1 = {1,2,3,4,5};

        // 1. merubah array menjadi string
        System.out.println("\n1. Merubah Array menjadi String\n ==============");
        printtArr(arrAngka1);

        // 2. mengcopy array
        System.out.println("\n2. Mengcopy Array\n ==============");
        int[] arrAngka2 = new int[5];
        printtArr(arrAngka1);
        printtArr(arrAngka2);

        // dengan loop
        System.out.println("\nmengcopy dengan loop\n ==============");
        for(int i = 0; i < arrAngka1.length; i++){
            arrAngka2[i] = arrAngka1[i];
        }
        printtArr(arrAngka1);
        printtArr(arrAngka2);

        // dengan copyOf
        System.out.println("\nmengcopy dengan copyOf\n ==============");
        int[] arrAngka3 = Arrays.copyOf(arrAngka1, 5);
        printtArr(arrAngka1);
        printtArr(arrAngka3);
        
        // dengan copyOfRange
        System.out.println("\nmengcopy dengan copyOfRange\n ==============");
        int[] arrAngka4 = Arrays.copyOfRange(arrAngka1,3, 5);
        printtArr(arrAngka1);
        printtArr(arrAngka4);
        
        // 3. fill 
        System.out.println("\n3. fill Array\n ==============");
        int[] arrAngka5 = new int[10];
        Arrays.fill(arrAngka5,1);
        printtArr(arrAngka5);
        
        // 4. Komparasi array
        System.out.println("\n4. komparasi Array\n ==============");
        int[] arrAngka6 = {1,2,9,4,5};
        int[] arrAngka7 = {1,2,3,4,5};
        System.out.println(Arrays.equals(arrAngka6,arrAngka7));
        if(Arrays.equals(arrAngka6,arrAngka7)){
            System.out.println("Array ini sama");
        }else{
            System.out.println("Array ini beda");
        }
        
        // ngecek array mana yang lebih besar
        System.out.println("\nCek Array mana yang lebih, besar pake compare\n ==============");
        System.out.println(Arrays.compare(arrAngka6,arrAngka7)); //kalau hasilnya 1=yg kiri lebih gede, -1=yg kanan lebih gede, 0=equal
        
        // ngecek index mana yang beda
        System.out.println("\nCek index mana yang beda, pake mismatch\n ==============");
        System.out.println(Arrays.mismatch(arrAngka6,arrAngka7));
        
        // 5. Sort array
        System.out.println("\n5. Sort array\n ==============");
        int[] arrAngka8 = {1,4,2,6,7,9,0,13,24,35,11};
        printtArr(arrAngka8);
        Arrays.sort(arrAngka8);
        printtArr(arrAngka8);
        
        // 6. Search array
        System.out.println("\n6. Search array\n ==============");
        int angka = 35;
        int posisi = Arrays.binarySearch(arrAngka8,angka);
        System.out.println("angka " + angka + " ada di index ke- " + posisi);
        
        // ==>tugas sort kebalik
        System.out.println("\ntugas 1 dari bang faqihza");
        int[] arrAngka9 = {1,4,2,6,7,9,0,13,24,35,11};
        System.out.println("array asal = " + Arrays.toString(arrAngka9));
        arrAngka9 = IntStream.of(arrAngka9).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        // ubah tipe data primitif ke wrapper class karena sorted(Collections.reverseOrder()) gabisa dipake buat data primitif
        // maksude tipe data int ke Integer
        // lah bedanya apa?
        // int = tipe data dasar yang langsung menyimpan nilai.
        // Integer = versi objek dari tipe data primitif.
        System.out.print("array hasil setelah diurutkan dari yang terbesar. ");
        printtArr(arrAngka9);
        
        // ==>tugas menjumlahkan 2 arr dengan fungsi
        System.out.println("\ntugas 2 dari bang faqihza");
        int[] arrA = {1,3,5,7,9};
        int[] arrB = {2,4,6,8,10,11};
        System.out.println("array pertama " + Arrays.toString(arrA));
        System.out.println("array kedua " + Arrays.toString(arrB));
        int[] jumlah = jumlahArr(arrA, arrB);
        System.out.print("Hasil penjumlahan 2 data array. ");
        printtArr(jumlah);
        
        // ==> tugas menggabungkan 2 arr
        System.out.println("\ntugas 3 dari bang faqihza");
        int[] arrC = {2,3,5,7,9};
        int[] arrD = {2,4,6,8,10,11};
        System.out.println("array pertama " + Arrays.toString(arrC));
        System.out.println("array kedua " + Arrays.toString(arrD));
        int[] gabung = gabungan(arrC, arrD);
        System.out.print("Hasil gabungan 2 data array. ");
        printtArr(gabung);
        
    }

    private static void printtArr(int[] dataArr) {
        System.out.println("Array = " + Arrays.toString(dataArr));

    }

    private static int[] jumlahArr(int[] dataArr1, int[] dataArr2){
        int max = Math.max(dataArr1.length, dataArr2.length); // cari dulu arr mana yg paling panjang
        int[] hasil = Arrays.copyOf(dataArr1, max); // trs copy konten data1 ke hasil (buat nanti dijumlah). 
                                                    //klo kontennya ga sampe max, bakal diisi 0

        for(int i = 0; i < dataArr2.length; i++){
            hasil[i] += dataArr2[i]; // ngejumlah data2 ke hasil yang tadi dah dicopy
        }
        // btw arr yg lebih pendek gabakal eror soale hanya menjumlah sampai panjang data2
        return hasil;
    }

    private static int[] gabungan(int[] dataArr1,int[] dataArr2){
        int panjangTotal = dataArr1.length + dataArr2.length;
        int[] hasil = new int[panjangTotal];

        System.arraycopy(dataArr1, 0, hasil, 0, dataArr1.length); //copy dataArr1 ke hasil
        System.arraycopy(dataArr2, 0, hasil, dataArr1.length, dataArr2.length); //copy dataArr2 ke hasil, setelah dimasukin dataArr1
        
        return hasil;
    }
}
