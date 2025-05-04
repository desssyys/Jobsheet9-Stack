public class StackTugasMahasiswa03 {
    Mahasiswa03[] stack;
    int top;
    int size;

    public StackTugasMahasiswa03(int size) {
        this.size = size;
        stack = new Mahasiswa03[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa03 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa03 pop() {
        if (!isEmpty()) {
            Mahasiswa03 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa03 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    //  Method tambahan untuk melihat tugas terbawah
    public Mahasiswa03 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas.");
            return null;
        }
    }

    //  Method tambahan untuk menghitung jumlah tugas yang dikumpulkan
    public int jumlahTugas() {
        return top + 1;
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}
