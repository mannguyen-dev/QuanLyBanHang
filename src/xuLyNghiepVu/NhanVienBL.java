package xuLyNghiepVu;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.NhanVien;

public class NhanVienBL {
	private CSDL csdl = new CSDL();
	Statement stm = null;
	
	private NhanVien khoiTao(ResultSet rs) throws SQLException {
		return new NhanVien(rs.getString("MANV"), rs.getString("HOTEN"),rs.getString("SODT"),
				rs.getDate("NGVL"),rs.getString("MATKHAU"),rs.getString("VAITRO"));
	}
	
	public List<NhanVien> getTatCa(){
		List<NhanVien> list = new ArrayList<NhanVien>();
		String query = "SELECT * FROM NHANVIEN";
		ResultSet rs = csdl.truyVan(query);
		try {
			while (rs.next()) {
				list.add(khoiTao(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public NhanVien timTheoMaNV(String maNV){
		NhanVien nv = null;
		String query = "SELECT * FROM NHANVIEN WHERE MANV='"+maNV+"'";
		ResultSet rs = csdl.truyVan(query);
		try {
			if (rs.next()) {
				nv = khoiTao(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nv;
	}
	
	
	public void themNhanVien(NhanVien nv){
		String query =  "insert into NHANVIEN (MANV,HOTEN,SODT,NGVL,MATKHAU,VAITRO) values "
				+ "('"+nv.getMaNV()+"','"+nv.getHoTen()+"','"+nv.getSoDT()+"',"+nv.getNgVL()+",'"+nv.getMatKhau()+"','"+nv.getVaiTro()+"')";
		try {
			
			stm = csdl.getConn().createStatement();
			stm.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void capNhat(NhanVien nv){
		String query =  "update NHANVIEN set HOTEN = '"+nv.getHoTen()+"', SODT ='"+nv.getSoDT()+"', "
				+ "NGVL='"+nv.getNgVL()+"' where MANV='"+nv.getMaNV()+"'";
		try {
			
			stm = csdl.getConn().createStatement();
			stm.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void xoaTheoMaNV(String maNV){
		String query =  "delete from NHANVIEN where MANV ='"+maNV+"'";
		try {
			stm = csdl.getConn().createStatement();
			stm.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		NhanVienBL nhanVienBL = new NhanVienBL();
		List<NhanVien> list = nhanVienBL.getTatCa();
		list.forEach(s->System.out.println(s.getHoTen()));
//		NhanVien nv = nhanVienBL.timTheoMaNV("NV01");
//		System.out.println(nv.getHoTen());
//		nv.setMaNV("NV07");
//		nhanVienBL.themNhanVien(nv);
//		nhanVienBL.capNhat(nv);
	}
}
