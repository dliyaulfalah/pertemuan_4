import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan jumlah baris yang diinginkan: ");
            int jumlahBaris = Integer.parseInt(reader.readLine());

            for (int i = jumlahBaris; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input!");
            e.printStackTrace();
        }
    }
}


