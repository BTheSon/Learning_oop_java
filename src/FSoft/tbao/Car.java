package FSoft.tbao;

public class Car extends Vehicle {
	
	private int soChoNgoi;
	private String dongCo;
	private String maLuc;
	private String phienBan;
	private String khoangSangGamXe;
	
	public Car(String soKhung, String soMay, String mauSon, String hieuXe, String loaiDongCo, int namSanXuat,
			String xuatXu, String ngayNhap, long giaBan, int soChoNgoi, String dongCo, String maLuc, String phienBan,
			String khoangSangGamXe) {
		super(soKhung, soMay, mauSon, hieuXe, loaiDongCo, namSanXuat, xuatXu, ngayNhap, giaBan);
		this.soChoNgoi = soChoNgoi;
		this.dongCo = dongCo;
		this.maLuc = maLuc;
		this.phienBan = phienBan;
		this.khoangSangGamXe = khoangSangGamXe;
	}
	
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	
	public String getDongCo() {
		return dongCo;
	}
	
	public String getMaLuc() {
		return maLuc;
	}
	
	public String getPhienBan() {
		return phienBan;
	}
	
	public String getKhoangSangGamXe() {
		return khoangSangGamXe;
	}
	
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	
	public void setDongCo(String dongCo) {
		this.dongCo = dongCo;
	}
	
	public void setMaLuc(String maLuc) {
		this.maLuc = maLuc;
	}
	
	public void setPhienBan(String phienBan) {
		this.phienBan = phienBan;
	}
	
	public void setKhoangSangGamXe(String khoangSangGamXe) {
		this.khoangSangGamXe = khoangSangGamXe;
	}
	
}