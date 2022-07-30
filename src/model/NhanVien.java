package model;

import java.sql.Date;

public class NhanVien {
	// thuoc tinh
	private String maNV;
	private String hoTen;
	private String soDT;
	private Date ngVL;
	private String matKhau;
	private String vaiTro;
	
	//getter, setter
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public Date getNgVL() {
		return ngVL;
	}
	public void setNgVL(Date ngVL) {
		this.ngVL = ngVL;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getVaiTro() {
		return vaiTro;
	}
	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}
	
	// constructor
	public NhanVien() {
		super();
	}
	public NhanVien(String maNV, String hoTen, String soDT, Date ngVL, String matKhau, String vaiTro) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.soDT = soDT;
		this.ngVL = ngVL;
		this.matKhau = matKhau;
		this.vaiTro = vaiTro;
	}
}
