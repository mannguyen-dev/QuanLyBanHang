/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuLyDuLieu;

import java.util.ArrayList;

import model.KhachHang;
import model.NhanVien;
import model.SanPham;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


/**
 *
 * @author 20520
 */
public class NhanVienDB {
    private KetNoiCSDL csdl;

    public NhanVienDB() {
        csdl = new KetNoiCSDL();
    }
    
    private NhanVien getNhanVien(ResultSet rs) throws Exception {
        return new NhanVien(rs.getString("manv"), rs.getString("hoten"),rs.getString("sodt"),
				rs.getDate("ngvl"),rs.getString("matkhau"),rs.getString("vaitro"));
    }
    
    
    public ArrayList<NhanVien> tatCa(){
        ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        String query = "select * from nhanvien";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getNhanVien(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        
        return list;
    }
    
    public NhanVien timTheoMaNV(String maNV){
        NhanVien nv = null;
        String query = "select * from nhanvien where manv = '" + maNV + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            if (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) nv = getNhanVien(rs);
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return nv;
    }
    
    public NhanVien kiemTraTonTaiMaNV(String maNV){
        NhanVien nv = null;
        String query = "select * from nhanvien where manv = '" + maNV + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            if (rs.next()) {                
            	nv = getNhanVien(rs);
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return nv;
    }
    
    public ArrayList<NhanVien> timTheoHoTen(String hoTen){
        ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        String query = "select * from nhanvien where hoten like N'%" + hoTen + "%'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getNhanVien(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    
    public ArrayList<NhanVien> timTheoSoDT(String soDT){
        ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        String query = "select * from nhanvien where sodt like '%" + soDT + "%'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getNhanVien(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<NhanVien> timTheoNgVL(Date ngVL){
        ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        String query = "select * from nhanvien where ngvl = '" + ngVL + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getNhanVien(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<NhanVien> timTheoThangVL(int thang, int nam){
        ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        String query = "select * from nhanvien where month(ngvl) = "
                + thang + " and year(ngvl) = "+ nam;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getNhanVien(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<NhanVien> timTheoNamVL(int nam){
        ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        String query = "select * from nhanvien where year(ngvl) = "+ nam;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getNhanVien(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<NhanVien> timTheoVaiTro(String vaiTro){
        ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        String query = "select * from nhanvien where vaitro like N'%" + vaiTro + "%'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getNhanVien(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    
    public int themNhanVien(NhanVien nv){
        String query = "insert into nhanvien (manv,hoten,sodt,ngvl,matkhau,vaitro) values "
        		+ "('"+nv.getMaNV()+"',N'"+nv.getHoTen()+"','"+nv.getSoDT()+"','"+nv.getNgVL()+"','"+nv.getMatKhau()+"',N'"+nv.getVaiTro()+"')";
        return csdl.setDuLieu(query);
    }
    
    public int capNhatThongTin(NhanVien nv){
        String query = "update nhanvien set hoten = N'" +nv.getHoTen()+"', sodt = '"+nv.getSoDT()
                +"', ngvl = '" + nv.getNgVL()+"', matkhau = '"+nv.getMatKhau()+"', vaitro = N'"+nv.getVaiTro()+
                "' where manv = '" +nv.getMaNV()+"'";
        return csdl.setDuLieu(query);
    }
    
    public int xoaNhanVien(String manv){
        String query = "delete from nhanvien where manv = '"+manv+"'";
        return csdl.setDuLieu(query);
    }
    
    public int xoaMem(String manv){
        String query = "UPDATE NHANVIEN SET IS_DELETED = 'TRUE' WHERE MANV = '"+manv+"'";
        return csdl.setDuLieu(query);
    }
    
    public ArrayList<NhanVien> topNVCoDoanhSoCaoNhat(int top){
    	ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        
        String query = "select top "+top+" with ties abc.tong as doanhSo, nv.manv, nv.hoten, nv.ngvl, nv.SODT, nv.VAITRO, nv.MATKHAU, nv.IS_DELETED "
        		+ "	from (select HOADON.manv, sum (HOADON.trigia) as 'tong' from Hoadon group by manv) abc right join nhanVien nv"
        		+ "	on abc.manv = nv.manv where nv.IS_DELETED is null order by doanhSo desc";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	list.add(getNhanVien(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<NhanVien> topNVCoDoanhSoThapNhat(int top){
    	ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        
        String query = "select top "+top+" with ties abc.tong as doanhSo, nv.manv, nv.hoten, nv.ngvl, nv.SODT, nv.VAITRO, nv.MATKHAU, nv.IS_DELETED "
        		+ "	from (select HOADON.manv, sum (HOADON.trigia) as 'tong' from Hoadon group by manv) abc right join nhanVien nv"
        		+ "	on abc.manv = nv.manv where nv.IS_DELETED is null order by doanhSo asc";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	list.add(getNhanVien(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<NhanVien> doanhSoCaoHon(double doanhSo){
    	ArrayList<NhanVien> list = new ArrayList<NhanVien>();
	        
    	try {
	        String query = "select abc.tong as doanhSo, nv.manv, nv.hoten, nv.ngvl, nv.SODT, nv.VAITRO, nv.MATKHAU, nv.IS_DELETED "
	        		+ "	from (select HOADON.manv, sum (HOADON.trigia) as 'tong' from Hoadon group by manv) abc right join nhanVien nv"
	        		+ "	on abc.manv = nv.manv where abc.tong >= "+doanhSo;
	        ResultSet rs = csdl.getDuLieu(query);
	        while (rs.next()) {                
	        	if (rs.getString("IS_DELETED")==null) list.add(getNhanVien(rs));
	        }
	        
	        // Neu doanhSo bang 0, ta can them cac Result Set co gia tri doanh so la null, hay cac nv co doanh so bang 0
	        if (doanhSo == 0) {
		        query = "select abc.tong as doanhSo, nv.manv, nv.hoten, nv.ngvl, nv.SODT, nv.VAITRO, nv.MATKHAU, nv.IS_DELETED "
		        		+ "	from (select HOADON.manv, sum (HOADON.trigia) as 'tong' from Hoadon group by manv) abc right join nhanVien nv"
		        		+ "	on abc.manv = nv.manv where abc.tong is null";
		        rs = csdl.getDuLieu(query);
		        while (rs.next()) {                
	            	if (rs.getString("IS_DELETED")==null) list.add(getNhanVien(rs));
	            }
	        }
            
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
          
        return list;
    }
    
    public ArrayList<NhanVien> doanhSoThapHon(double doanhSo){
    	ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        
        String query = "select abc.tong as doanhSo, nv.manv, nv.hoten, nv.ngvl, nv.SODT, nv.VAITRO, nv.MATKHAU, nv.IS_DELETED "
        		+ "	from (select HOADON.manv, sum (HOADON.trigia) as 'tong' from Hoadon group by manv) abc right join nhanVien nv"
        		+ "	on abc.manv = nv.manv where abc.tong <= "+doanhSo +" or abc.tong is null";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getNhanVien(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public double doanhSoCuaNhanVien(String maNV) {
    	String query = "select * from (select HOADON.manv, sum (HOADON.trigia) as doanhso from Hoadon group by manv) A, NHANVIEN nv "
    			+ "where A.manv = nv.manv and nv.manv = '"+maNV+"'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
        	if (rs.next()) {
				return rs.getDouble("doanhso");
        	}
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return 0;
    }
    		
    public static void main(String[] args) {
		NhanVienDB nvDB = new NhanVienDB();
		nvDB.doanhSoThapHon(500000).forEach(s->System.out.println(s.getHoTen()));
//		System.out.println(nvDB.doanhSoCuaNhanVien("NV0s1"));
	}
}
