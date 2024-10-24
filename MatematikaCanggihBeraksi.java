import java.util.Scanner;
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mc = new MatematikaCanggih();
        Scanner scanner = new Scanner(System.in);

        try {
            // Input angka pertama
            System.out.print("Masukkan angka pertama: ");
            int angka1 = scanner.nextInt();
            scanner.nextLine();

            // Input angka kedua
            System.out.print("Masukkan angka kedua: ");
            int angka2 = scanner.nextInt();
            scanner.nextLine(); 

            // Menampilkan hasil operasi
            System.out.println("-------------------------------");
            System.out.println("Hasil Operasi");
            System.out.println(angka1 + " + " + angka2 + " = " + mc.tambah(angka1, angka2));
            System.out.println(angka1 + " - " + angka2 + " = " + mc.kurang(angka1, angka2));

            if (angka2 != 0) {
                System.out.println(angka1 + " % " + angka2 + " = " + mc.modulus(angka1, angka2));
            } else {
                System.out.println("Modulus tidak dapat dilakukan karena angka kedua adalah 0.");
            }
        } finally {
            scanner.close();
        }
    }
}
