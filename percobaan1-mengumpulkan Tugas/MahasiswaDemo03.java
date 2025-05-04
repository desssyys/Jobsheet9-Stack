import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        StackTugasMahasiswa03 stack = new StackTugasMahasiswa03(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah"); //  Menu tambahan
            System.out.println("6. Jumlah Tugas yang Sudah Dikumpulkan"); //  Menu tambahan
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    Mahasiswa03 mhs = new Mahasiswa03(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa03 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;

                case 3:
                    Mahasiswa03 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa03 bawah = stack.bottom();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                    }
                    break;

                case 6:
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.jumlahTugas());
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}
