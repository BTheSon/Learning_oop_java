package FSoft.tbao;


public class Motorbike extends Vehicle {
	
	private String doCaoYen;
	private String soPhanKhoi;
	
	public Motorbike(String soKhung, String soMay, String mauSon, String hieuXe, String loaiDongCo, int namSanXuat,
			String xuatXu, String ngayNhap, long giaBan, String doCaoYen, String soPhanKhoi) {
		super(soKhung, soMay, mauSon, hieuXe, loaiDongCo, namSanXuat, xuatXu, ngayNhap, giaBan);
		this.doCaoYen = doCaoYen;
		this.soPhanKhoi = soPhanKhoi;
	}
	
	public String getDoCaoYen() {
		return doCaoYen;
	}
	
	public String getSoPhanKhoi() {
		return soPhanKhoi;
	}
	
	public void setDoCaoYen(String doCaoYen) {
		this.doCaoYen = doCaoYen;
	}
	
	public void setSoPhanKhoi(String soPhanKhoi) {
		this.soPhanKhoi = soPhanKhoi;
	}
	
}