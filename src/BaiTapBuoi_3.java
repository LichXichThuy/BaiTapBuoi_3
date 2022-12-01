import java.util.Scanner;

public class BaiTapBuoi_3 {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        Scanner scanner = new Scanner(System.in);
        sinhVien.nhapThongTin(scanner);
        sinhVien.tinhDiemTrungBinh();
        sinhVien.xepLoai(sinhVien.diemTrungBinh);
        sinhVien.xuatThongTin();
    }
}
