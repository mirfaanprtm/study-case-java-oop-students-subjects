import java.util.Scanner;

public class Utility {
    static void utility () {
        Siswa siswa1 = new Siswa("A001", "Budi Hartono", "Bandung", 21);
        Siswa siswa2 = new Siswa("A002", "Bude Hartini", "Ciamis", 22);

        MataPelajaran matpel1 = new MataPelajaran();
        MataPelajaran matpel2 = new MataPelajaran();

        siswa1.setMataPelajaran(matpel1);
        siswa2.setMataPelajaran(matpel2);

        matpel1.setBahasaIndonesia(90.29);
        matpel1.setBahasaInggris(60.43);
        matpel1.setMatematika(78.01);
        matpel1.setIpa(87.90);

        matpel1.setBahasaIndonesia(80.39);
        matpel1.setBahasaInggris(70.45);
        matpel1.setMatematika(68.25);
        matpel1.setIpa(70.93);

        siswa1.setName("Budi Hartono");
        siswa2.setName("Bude Hartini");

        siswa1.setNim("A001");
        siswa2.setNim("A002");

        siswa1.setAlamat("Bandung");
        siswa2.setAlamat("Ciamis");

        siswa1.setUmur(21);
        siswa2.setUmur(22);

        siswa1.nilai();
        siswa2.nilai();

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== DATA SISWA SMK ENIGMA ===");
        System.out.print("Silahkan Masukkan Nama Anda : ");
        String inputName = scanner.nextLine();
        switch (inputName){
            case "Budi Hartono":
                System.out.println("NIM : " + siswa1.getNim() + ", \n" +
                        "Nama : " + siswa1.getName() + ", \n" +
                        "Alamat : " + siswa1.getAlamat() + ", \n" +
                        "Umur : " + siswa1.getUmur() + ", \n" +
                        "Bahasa Indonesia : " + siswa1.getMataPelajaran().getBahasaIndonesia() + ", \n" +
                        "Bahasa Inggris : " + siswa1.getMataPelajaran().getBahasaInggris() + ", \n" +
                        "Matematika : " + siswa1.getMataPelajaran().getMatematika() + ", \n" +
                        "IPA : " + siswa1.getMataPelajaran().getIpa() + ", \n" +
                        "GPA : " +  siswa1.nilai());
                break;
            case "Bude Hartini":
                System.out.println("NIM : " + siswa2.getNim() + ", \n" +
                        "Nama : " + siswa2.getName() + ", \n" +
                        "Alamat : " + siswa2.getAlamat() + ", \n" +
                        "Umur : " + siswa2.getUmur() + ", \n" +
                        "Bahasa Indonesia : " + siswa2.getMataPelajaran().getBahasaIndonesia() + ", \n" +
                        "Bahasa Inggris : " + siswa2.getMataPelajaran().getBahasaInggris() + ", \n" +
                        "Matematika : " + siswa2.getMataPelajaran().getMatematika() + ", \n" +
                        "IPA : " + siswa2.getMataPelajaran().getIpa() + ", \n" +
                        "GPA : " +  siswa2.nilai());
                break;
            default:
                System.out.println("Inputan Tidak Valid!");
                utility();
        }
    }
}
