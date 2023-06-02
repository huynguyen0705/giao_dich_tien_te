public class GiaoDichTienTe extends GiaoDich{
    protected Double TiGia;
    protected String LoaiTienTe;

    public Double getTiGia() {
        return TiGia;
    }

    public void setTiGia(Double tiGia) {
        TiGia = tiGia;
    }

    public String getLoaiTienTe() {
        return LoaiTienTe;
    }

    public void setLoaiTienTe(String loaiTienTe) {
        LoaiTienTe = loaiTienTe;
    }

    public GiaoDichTienTe(String inputMaGiaoDich, String inputNgayGiaoDich, Double inputDonGia, int inputSoLuong, Double inputTiGia, String inputLoaiTienTe){

    }

    public double ThanhTienGDTienTe(){
        if (TiGia == 0){
            return SoLuong * DonGia;
        }else {
            return SoLuong * DonGia * TiGia;
        }
    }
    public String HienThi(){
        System.out.println("Ma giao dich: " + getMaGiaoDich());
        System.out.println("Ngay giao dich: " + getNgayGiaoDich());
        System.out.println("Don gia: " + getDonGia());
        return "-------------";
    }
}
