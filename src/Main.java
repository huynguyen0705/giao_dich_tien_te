import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ThucHienGiaoDich thucHienGiaoDich = new ThucHienGiaoDich();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning){
            System.out.println("Chuong trinh quan ly giao dich");
            System.out.println("1. Nhap danh sach cac giao dich");
            System.out.println("2. Tinh tong so luong cho tung loai");
            System.out.println("3. Tinh trung binh thanh tien cua giao dich tien te");
            System.out.println("4. Xuat ra cac giao dich co don gia > 1 ti");
            System.out.println("Vui long nhap lua chon: ");
            int input = scanner.nextInt();
            if (input < 1 || input > 4){
                System.out.println("Nhap khong hop le");
            }
            switch (input) {
                case 1:
                    System.out.println("1. Nhap giao dich vang");
                    System.out.println("2. Nhap giao dich tien te");
                    int input1 = scanner.nextInt();
                    if (input1 < 1 || input1 > 2) {
                        System.out.println("Chon khong hop le");
                    }
                    switch (input1) {
                        case 1:
                            System.out.println("Nhap ma giao dich: ");
                            Scanner scanner1 = new Scanner(System.in);
                            String maGiaoDich = scanner1.next();
                            System.out.println("Nhap ngay giao dich: ");
                            Scanner scanner2 = new Scanner(System.in);
                            String ngayGiaoDich = scanner2.next();
                            System.out.println("Nhap don gia: ");
                            Scanner scanner3 = new Scanner(System.in);
                            double donGia = scanner3.nextDouble();
                            System.out.println("Nhap loai dat: ");
                            Scanner scanner4 = new Scanner(System.in);
                            int soLuong = scanner4.nextInt();
                            System.out.println("Nhap loai vang: ");
                            Scanner scanner5 = new Scanner(System.in);
                            String loaiVang = scanner5.next();
                            thucHienGiaoDich.giaodichvang(maGiaoDich, ngayGiaoDich, donGia, soLuong, loaiVang);

                        case 2:
                            System.out.println("Nhap ma giao dich: ");
                            Scanner scanner6 = new Scanner(System.in);
                            String maGiaoDich1 = scanner6.next();
                            System.out.println("Nhap ngay giao dich: ");
                            Scanner scanner7 = new Scanner(System.in);
                            String ngayGiaoDich1 = scanner7.next();
                            System.out.println("Nhap don gia: ");
                            Scanner scanner8 = new Scanner(System.in);
                            double donGia1 = scanner8.nextDouble();
                            System.out.println("Nhap so luong: ");
                            Scanner scanner9 = new Scanner(System.in);
                            int soLuong1 = scanner9.nextInt();
                            System.out.println("Nhap ti gia: ");
                            Scanner scanner10 = new Scanner(System.in);
                            double tiGia = scanner10.nextDouble();
                            System.out.println("Nhap loai tien te: ");
                            Scanner scanner11 = new Scanner(System.in);
                            String loaiTienTe = scanner11.next();
                            thucHienGiaoDich.giaodichtiente(maGiaoDich1, ngayGiaoDich1, donGia1, soLuong1, tiGia, loaiTienTe);
                    }
                case 2:
                    System.out.println("1. Tinh tong so luong vang");
                    System.out.println("2. Tinh tong so luong tien te");
                    int input2 = scanner.nextInt();
                    if (input2 < 1 || input2 > 2) {
                        System.out.println("Chon khong hop le");
                    }
                    switch (input2) {
                        case 1:
                            System.out.println("Tong so luong vang: " + thucHienGiaoDich.TinhTongVang());
                        case 2:
                            System.out.println("Tong so luong tien te: " + thucHienGiaoDich.TinhTongTienTe());
                    }

                case 3:
                    System.out.println("Tong trung binh thanh tien cua giao dich tien te: " + thucHienGiaoDich.TrungBinhThanhTien());

                case 4:
                    System.out.println("GD co don gia lon hon 1 ti: ");
                    thucHienGiaoDich.XuatRaGiaoDichLonHonMotTy();
            }
        }
    }
}