
public class HotelRoomBooking {

    private Pemesanan pemesan;
    private DetailBooking detailBooking;
    private Voucher voucher;

    public HotelRoomBooking(Pemesanan pemesan, DetailBooking detailBooking, Voucher voucher) {
        this.pemesan = pemesan;
        this.detailBooking = detailBooking;
        this.voucher = voucher;
    }

    public void cetakDetailPemesanan() {
        System.out.println("===== DETAIL PEMESANAN KAMAR =====");
        System.out.println(pemesan.getDetailPemesan());
        System.out.println(detailBooking.getDetailKamar());
        System.out.println("Voucher      : " + (voucher != null ? voucher.getKodeVoucher() : "Tidak Ada"));
        System.out.println("Sudah Dibayar: " + detailBooking.isSudahDibayar());
        System.out.println("Total Biaya  : Rp " + detailBooking.hitungTotalBiaya(voucher));
        System.out.println("Tipe Tamu    : " + detailBooking.klasifikasiTamu());
        System.out.println("===================================");
    }
}
