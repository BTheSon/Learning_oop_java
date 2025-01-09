package FSoft.tbao;


public abstract class Vehicle {
	
	protected String soKhung;
	protected String soMay;
	protected String mauSon;
	protected String hieuXe;
	protected String loaiDongCo;
	protected int namSanXuat;
	protected String xuatXu;
	protected String ngayNhap;
	protected long giaBan;
	
	public Vehicle(String soKhung, String soMay, String mauSon, String hieuXe, String loaiDongCo, int namSanXuat,
			String xuatXu, String ngayNhap, long giaBan) {
		super();
		this.soKhung = soKhung;
		this.soMay = soMay;
		this.mauSon = mauSon;
		this.hieuXe = hieuXe;
		this.loaiDongCo = loaiDongCo;
		this.namSanXuat = namSanXuat;
		this.xuatXu = xuatXu;
		this.ngayNhap = ngayNhap;
		this.giaBan = giaBan;
	}
	
	public String getSoKhung() {
		return soKhung;
	}
	
	public String getSoMay() {
		return soMay;
	}
	
	public String getMauSon() {
		return mauSon;
	}
	
	public String getHieuXe() {
		return hieuXe;
	}
	
	public String getLoaiDongCo() {
		return loaiDongCo;
	}
	
	public int getNamSanXuat() {
		return namSanXuat;
	}
	
	public String getXuatXu() {
		return xuatXu;
	}
	
	public String getNgayNhap() {
		return ngayNhap;
	}
	
	public long getGiaBan() {
		return giaBan;
	}
	
	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}
	
	public void setSoMay(String soMay) {
		this.soMay = soMay;
	}
	
	public void setMauSon(String mauSon) {
		this.mauSon = mauSon;
	}
	
	public void setHieuXe(String hieuXe) {
		this.hieuXe = hieuXe;
	}
	
	public void setLoaiDongCo(String loaiDongCo) {
		this.loaiDongCo = loaiDongCo;
	}
	
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	
	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}
	
	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	
	public void setGiaBan(long giaBan) {
		this.giaBan = giaBan;
	}
	
}