public class ThucHienGiaoDich {
    GiaoDichVang[] danhSachGiaoDichVang;
    GiaoDichTienTe[] danhSachGiaoDichTienTe;

    public void ThucHienGiaoDich() {

    }

    public ThucHienGiaoDich() {
        danhSachGiaoDichVang = new GiaoDichVang[5];
        danhSachGiaoDichTienTe = new GiaoDichTienTe[5];
    }

    public void giaodichvang(String maGiaoDich, String ngayGiaoDich, Double donGia, int soLuong, String loaiVang) {
        GiaoDichVang giaoDichVang = new GiaoDichVang(maGiaoDich, ngayGiaoDich, donGia, soLuong, loaiVang);
        boolean check = true;
        for (int i = 0; i < danhSachGiaoDichVang.length; i++) {
            if (danhSachGiaoDichVang[i] == null) {
                danhSachGiaoDichVang[i] = giaoDichVang;
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println("giao dich da day");
        }
    }

    public void giaodichtiente(String maGiaoDich, String ngayGiaoDich, Double donGia, int soLuong, Double tiGia, String loaiTienTe) {
        GiaoDichTienTe giaoDichTienTe = new GiaoDichTienTe(maGiaoDich, ngayGiaoDich, donGia, soLuong, tiGia, loaiTienTe);
        boolean check = true;
        for (int i = 0; i < danhSachGiaoDichTienTe.length; i++) {
            if (danhSachGiaoDichTienTe[i] == null) {
                danhSachGiaoDichTienTe[i] = giaoDichTienTe;
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println("giao dich da day");
        }
    }

    public int TinhTongVang() {
        int TongSoLuongVang = 0;
        for (int i = 0; i < danhSachGiaoDichVang.length; i++) {
            if (danhSachGiaoDichVang[i] != null) {
                TongSoLuongVang = TongSoLuongVang + danhSachGiaoDichVang[i].SoLuong;
            }
        }
        return TongSoLuongVang;
    }

    public int TinhTongTienTe() {
        int TongSoLuongTienTe = 0;
        for (int i = 0; i < danhSachGiaoDichTienTe.length; i++) {
            if (danhSachGiaoDichTienTe[i] != null) {
                TongSoLuongTienTe = TongSoLuongTienTe + danhSachGiaoDichTienTe[i].SoLuong;
            }
        }
        return TongSoLuongTienTe;
    }


    public double TrungBinhThanhTien() {
        double TongThanhTien = 0;
        int count = 0;
        for (int i = 0; i < danhSachGiaoDichTienTe.length; i++) {
            if (danhSachGiaoDichTienTe[i] != null) {
                TongThanhTien = TongThanhTien + danhSachGiaoDichTienTe[i].ThanhTienGDTienTe();
                count++;
            }
        }
        return TongThanhTien / count;
    }


    public void XuatRaGiaoDichLonHonMotTy(){
        for (int i = 0; i < danhSachGiaoDichVang.length; i++) {
            if (danhSachGiaoDichVang[i] != null && danhSachGiaoDichVang[i].DonGia > 1000000000) {
                danhSachGiaoDichVang[i].HienThi();
            }
        }

        for (int i = 0; i < danhSachGiaoDichTienTe.length; i++) {
            if (danhSachGiaoDichTienTe[i] != null && danhSachGiaoDichTienTe[i].DonGia > 1000000000) {
                danhSachGiaoDichTienTe[i].HienThi();
            }
        }
    }
}
