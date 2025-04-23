
public class Pemesan {

    private String nama;
    private String nomorKTP;
    private String nomorTelepon;
    private String email;
    private String jenisKelamin;

    public Pemesan(String nama, String nomorKTP, String nomorTelepon, String email, String jenisKelamin) {
        this.nama = nama;
        this.nomorKTP = nomorKTP;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
    }

    public String getDetailPemesan() {
        return "Nama Pemesan : " + nama + "\n"
                + "Jenis Kelamin: " + jenisKelamin + "\n"
                + "No. KTP      : " + nomorKTP + "\n"
                + "Telepon      : " + nomorTelepon + "\n"
                + "Email        : " + email;
    }
}
