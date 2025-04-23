
import java.util.Date;

public class DetailBooking {

    private String jenisKamar;
    private int jumlahTamu;
    private int jumlahMalam;
    private double hargaPerMalam;
    private boolean statusAktif;
    private boolean sudahDibayar;
    private Date checkin;
    private Date checkout;

    public DetailBooking(String jenisKamar, int jumlahTamu, int jumlahMalam, double hargaPerMalam,
            Date checkin, Date checkout, boolean statusAktif, boolean sudahDibayar) {
        this.jenisKamar = jenisKamar;
        this.jumlahTamu = jumlahTamu;
        this.jumlahMalam = jumlahMalam;
        this.hargaPerMalam = hargaPerMalam;
        this.checkin = checkin;
        this.checkout = checkout;
        this.statusAktif = statusAktif;
        this.sudahDibayar = sudahDibayar;
    }

    public String getDetailKamar() {
        return "Jenis Kamar  : " + jenisKamar + "\n"
                + "Jumlah Tamu  : " + jumlahTamu + "\n"
                + "Jumlah Malam : " + jumlahMalam + "\n"
                + "Harga/Malam  : " + hargaPerMalam + "\n"
                + "Check-in     : " + checkin + "\n"
                + "Check-out    : " + checkout + "\n"
                + "Status Aktif : " + statusAktif;
    }

    public double hitungTotalBiaya(Voucher voucher) {
        double total = hargaPerMalam * jumlahMalam;
        if (jumlahTamu > 2) {
            total += (jumlahTamu - 2) * 100000;
        }
        if (voucher != null && voucher.isValid()) {
            total -= voucher.getDiskon();
        }
        if (!statusAktif) {
            total = 0;
        }
        return total;
    }

    public String klasifikasiTamu() {
        return jumlahTamu == 1 ? "Individu"
                : jumlahTamu == 2 ? "Pasangan"
                        : "Keluarga";
    }

    public boolean isSudahDibayar() {
        return sudahDibayar;
    }
}
