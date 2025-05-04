public class StackSurat03 {
    Surat03[] stack;
    int top;

    public StackSurat03(int kapasitas) {
        stack = new Surat03[kapasitas];
        top = -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat03 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat berhasil diterima.");
        } else {
            System.out.println("Stack penuh, tidak bisa menerima surat lagi.");
        }
    }

    public Surat03 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong, tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat03 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                ditemukan = true;
                break;
            }
        }
        System.out.println(ditemukan ? "Surat ditemukan." : "Surat tidak ditemukan.");
    }
}
