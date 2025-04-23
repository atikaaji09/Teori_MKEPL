
public class Voucher {

    private String kodeVoucher;

    public Voucher(String kodeVoucher) {
        this.kodeVoucher = kodeVoucher;
    }

    public boolean isValid() {
        return kodeVoucher != null && kodeVoucher.length() > 3;
    }

    public double getDiskon() {
        return 50000;
    }

    public String getKodeVoucher() {
        return kodeVoucher;
    }
}
