import java.util.Scanner;

public class SinhVien {
    int maSV;
    String hoTen;
    int ngaySinh;
    int thangSinh;
    int namSinh;
    float diemToan;
    float diemLy;
    float diemHoa;
    float diemTrungBinh;
    String XepLoai;

    public SinhVien(){}
    public SinhVien(int maSV, String hoTen, int ngaySinh, int thangSinh, int namSinh, float diemToan, float diemLy, float diemHoa){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.thangSinh = thangSinh;
        this.namSinh = namSinh;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    public SinhVien(int maSV, String hoTen, int ngaySinh, int thangSinh, int namSinh){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.thangSinh = thangSinh;
        this.namSinh = namSinh;
    }
    public SinhVien(int maSV, String hoTen){
        this.maSV = maSV;
        this.hoTen = hoTen;
    }
    // Phuong thuc nhap
    public void nhapThongTin(Scanner scanner){
        System.out.print("Nhập mã sinh viên: ");
        maSV = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập họ tên sinh viên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập ngày, tháng, năm sinh: ");
        ngaySinh = scanner.nextInt();
        thangSinh = scanner.nextInt();
        namSinh = scanner.nextInt();
        System.out.print("Nhập điểm toán: ");
        diemToan = scanner.nextFloat();
        System.out.print("Nhập điểm Lý: ");
        diemLy = scanner.nextFloat();
        System.out.print("Nhập điểm HÓa: ");
        diemHoa = scanner.nextFloat();
    }
    public void xuatThongTin(){
        System.out.print("Mã sinh viên: "+maSV+"\tHọ tên: "+hoTen+"\t"+ngaySinh+"/"+thangSinh+"/"+namSinh+"\n");
        System.out.println("Điểm toán = "+diemToan+".\tĐiểm Lý = "+diemLy+".\tĐiểm hóa = "+diemHoa);
        System.out.println("Điểm trung bình = "+diemTrungBinh+".\tXếp loại: "+XepLoai);
    }
    public float tinhDiemTrungBinh(){
        diemTrungBinh = (diemHoa+diemLy+diemToan)/3;
        return diemTrungBinh;
    }
    public void xepLoai(float diemTrungBinh){
        if (diemTrungBinh<5) setXepLoai("Kém");
        else if (diemTrungBinh<=7) setXepLoai("Trung bình");
        else if (diemTrungBinh<=8) setXepLoai("Khá");
        else setXepLoai("Giỏi");
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getThangSinh() {
        return thangSinh;
    }

    public void setThangSinh(int thangSinh) {
        this.thangSinh = thangSinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public String getXepLoai() {
        return XepLoai;
    }

    public void setXepLoai(String xepLoai) {
        XepLoai = xepLoai;
    }
}
