public class MataPelajaran {
    private double bahasaIndonesia;
    private double bahasaInggris;
    private double matematika;

    private double ipa;

    public MataPelajaran(double bahasaIndonesia, double bahasaInggris, double matematika, double ipa) {
        this.bahasaIndonesia = bahasaIndonesia;
        this.bahasaInggris = bahasaInggris;
        this.matematika = matematika;
        this.ipa = ipa;
    }

    public MataPelajaran() {

    }



    public double getBahasaIndonesia() {
        return bahasaIndonesia;
    }

    public void setBahasaIndonesia(double bahasaIndonesia) {
        if(bahasaIndonesia <= 100){
            this.bahasaIndonesia = bahasaIndonesia;
        } else {
            this.bahasaIndonesia = 100;
        }

    }

    public double getBahasaInggris() {
        return bahasaInggris;
    }

    public void setBahasaInggris(double bahasaInggris) {
        if(bahasaInggris <= 100){
            this.bahasaInggris = matematika;
        } else {
            this.bahasaInggris = 100;
        }
    }

    public double getMatematika() {
        return matematika;
    }

    public void setMatematika(double matematika) {
        if(matematika <= 100){
            this.matematika = matematika;
        } else {
            this.matematika = 100;
        }
    }

    public double getIpa() {
        return ipa;
    }

    public void setIpa(double ipa) {
        if(ipa <= 100){
            this.ipa = ipa;
        } else {
            this.ipa = 100;
        }
    }

    @Override
    public String toString() {
        return "MataPelajaran{" +
                "bahasaIndonesia=" + bahasaIndonesia +
                ", bahasaInggris=" + bahasaInggris +
                ", matematika=" + matematika +
                '}';
    }
}
