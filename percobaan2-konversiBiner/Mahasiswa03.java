public class Mahasiswa03 {
    String nim;
    String nama;
    String kelas;
    int nilai;

Mahasiswa03 (String nama, String nim, String kelas) {
    this.nama = nama;
    this.nim = nim;
    this.kelas = kelas;
    this.nilai = -1;
}
void tugasDinilai(int nilai) {
    this.nilai = nilai;
}
public String infoMahasiswa() {
    return nama;
}
}
