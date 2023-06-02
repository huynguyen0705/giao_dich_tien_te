public class GiaoDichVang extends GiaoDich{
    private String LoaiVang;

    public String getLoaiVang() {
        return LoaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        LoaiVang = loaiVang;
    }

    public GiaoDichVang (String inputMaGiaoDich, String inputNgayGiaoDich, Double inputDonGia, int inputSoLuong, String inputLoaiVang){
        setMaGiaoDich(inputMaGiaoDich);
        setNgayGiaoDich(inputNgayGiaoDich);
        DonGia = inputDonGia;
        SoLuong = inputSoLuong;
        LoaiVang = inputLoaiVang;
    }
    public Double ThanhTienGDVang (){
        return SoLuong * DonGia;
    }

    public String HienThi(){
        System.out.println("Ma giao dich: " + getMaGiaoDich());
        System.out.println("Ngay giao dich: " + getNgayGiaoDich());
        System.out.println("Don gia: " + getDonGia());
        return "---------";
    }
}
