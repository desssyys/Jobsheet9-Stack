public class Surat03 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // 'S' = sakit, 'I' = izin
    int durasi;

    public Surat03() {
    }

    public Surat03(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}
