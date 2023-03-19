import java.util.Scanner;

public class Siswa {
    String nim;
    String name;
    String alamat;
    int umur;
    MataPelajaran mataPelajaran;

    public Siswa(String nim, String name, String alamat, int umur) {
        this.nim = nim;
        this.name = name;
        this.alamat = alamat;
        this.umur = umur;
    }

    public double nilai(){
        double nilaiRataRata = (this.mataPelajaran.getBahasaIndonesia() + this.mataPelajaran.getBahasaInggris() + mataPelajaran.getMatematika() + mataPelajaran.getIpa()) / 4;
        return nilaiRataRata;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public MataPelajaran getMataPelajaran() {
        return mataPelajaran;
    }

    @Override
    public String toString() {
        return "Siswa{" +
                "nim='" + nim + '\'' +
                ", name='" + name + '\'' +
                ", alamat='" + alamat + '\'' +
                ", umur=" + umur +
                ", mataPelajaran=" + mataPelajaran +
                '}';
    }

    public void setMataPelajaran(MataPelajaran mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }
}
