import java.util.Scanner;

public class SuratDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat03 stack = new StackSurat03(10);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt(); sc.nextLine();

                    Surat03 surat = new Surat03(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;

                case 2:
                    Surat03 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.printf("Memproses surat dari %s (%s)\n", diproses.namaMahasiswa, diproses.idSurat);
                    }
                    break;

                case 3:
                    Surat03 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.printf("Surat terakhir dari %s, jenis: %c, durasi: %d hari\n",
                            terakhir.namaMahasiswa, terakhir.jenisIzin, terakhir.durasi);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
