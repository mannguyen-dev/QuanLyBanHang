package xuLyDuLieu;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import model.NhanVien;


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
        return new NhanVien(rs.getString("MANV"), rs.getString("HOTEN"),rs.getString("SODT"),
				rs.getDate("NGVL"),rs.getString("MATKHAU"),rs.getString("VAITRO"));
    }
    
    
    public ArrayList<NhanVien> tatCa(){
        ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        String query = "select * from NHANVIEN";
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
        String query = "select * from NHANVIEN where MANV = '" + maNV + "'";
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
        String query = "select * from NHANVIEN where MANV = '" + maNV + "'";
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
        String query = "select * from NHANVIEN where HOTEN like N'%" + hoTen + "%'";
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
        String query = "select * from NHANVIEN where SODT like '%" + soDT + "%'";
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
        String query = "select * from NHANVIEN where NGVL = '" + ngVL + "'";
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
        String query = "select * from NHANVIEN where month(NGVL) = "
                + thang + " and year(NGVL) = "+ nam;
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
        String query = "select * from NHANVIEN where year(NGVL) = "+ nam;
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
        String query = "select * from NHANVIEN where VAITRO like N'%" + vaiTro + "%'";
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
        String query = "insert into NHANVIEN (MANV,HOTEN,SODT,NGVL,MATKHAU,VAITRO) values "
        		+ "('"+nv.getMaNV()+"',N'"+nv.getHoTen()+"','"+nv.getSoDT()+"','"+nv.getNgVL()+"','"+nv.getMatKhau()+"',N'"+nv.getVaiTro()+"')";
        return csdl.setDuLieu(query);
    }
    
    public int capNhatThongTin(NhanVien nv){
        String query = "update NHANVIEN set HOTEN = N'" +nv.getHoTen()+"', SODT = '"+nv.getSoDT()
                +"', NGVL = '" + nv.getNgVL()+"', MATKHAU = '"+nv.getMatKhau()+"', VAITRO = N'"+nv.getVaiTro()+
                "' where MANV = '" +nv.getMaNV()+"'";
        return csdl.setDuLieu(query);
    }
    
    public int xoaNhanVien(String manv){
        String query = "delete from NHANVIEN where MANV = '"+manv+"'";
        return csdl.setDuLieu(query);
    }
    
    public int xoaMem(String manv){
        String query = "update NHANVIEN set IS_DELETED = 'TRUE' where MANV = '"+manv+"'";
        return csdl.setDuLieu(query);
    }
    
    public ArrayList<NhanVien> topNVCoDoanhSoCaoNhat(int top){
    	ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        
        String query = "select top "+top+" with ties A.tong as doanhSo, nv.MANV, nv.HOTEN, nv.NGVL, nv.SODT, nv.VAITRO, nv.MATKHAU, nv.IS_DELETED "
        		+ "	from (select HOADON.MANV, sum (HOADON.TRIGIA) as 'tong' from HOADON group by MANV) A right join NHANVIEN nv"
        		+ "	on A.MANV = nv.MANV where nv.IS_DELETED is null order by doanhSo desc";
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
        
        String query = "select top "+top+" with ties A.tong as doanhSo, nv.MANV, nv.HOTEN, nv.NGVL, nv.SODT, nv.VAITRO, nv.MATKHAU, nv.IS_DELETED "
        		+ "	from (select HOADON.MANV, sum (HOADON.TRIGIA) as 'tong' from HOADON group by MANV) A right join NHANVIEN nv"
        		+ "	on A.MANV = nv.MANV where nv.IS_DELETED is null order by doanhSo asc";
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
	        String query = "select A.tong as doanhSo, nv.MANV, nv.HOTEN, nv.NGVL, nv.SODT, nv.VAITRO, nv.MATKHAU, nv.IS_DELETED "
	        		+ "	from (select HOADON.MANV, sum (HOADON.TRIGIA) as 'tong' from HOADON group by MANV) A right join NHANVIEN nv"
	        		+ "	on A.MANV = nv.MANV where A.tong >= "+doanhSo;
	        ResultSet rs = csdl.getDuLieu(query);
	        while (rs.next()) {                
	        	if (rs.getString("IS_DELETED")==null) list.add(getNhanVien(rs));
	        }
	        
	        // Neu doanhSo bang 0, ta can them cac Result Set co gia tri doanh so la null, hay cac nv co doanh so bang 0
	        if (doanhSo == 0) {
		        query = "select A.tong as doanhSo, nv.MANV, nv.HOTEN, nv.NGVL, nv.SODT, nv.VAITRO, nv.MATKHAU, nv.IS_DELETED "
		        		+ "	from (select HOADON.MANV, sum (HOADON.TRIGIA) as 'tong' from HOADON group by MANV) A right join NHANVIEN nv"
		        		+ "	on A.MANV = nv.MANV where A.tong is null";
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
        
        String query = "select A.tong as doanhSo, nv.MANV, nv.HOTEN, nv.NGVL, nv.SODT, nv.VAITRO, nv.MATKHAU, nv.IS_DELETED "
        		+ "	from (select HOADON.MANV, sum (HOADON.TRIGIA) as 'tong' from HOADON group by MANV) A right join NHANVIEN nv"
        		+ "	on A.MANV = nv.MANV where A.tong <= "+doanhSo +" or A.tong is null";
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
    	String query = "select * from (select HOADON.MANV, sum (HOADON.TRIGIA) as doanhso from HOADON group by MANV) A, NHANVIEN nv "
    			+ "where A.MANV = nv.MANV and nv.MANV = '"+maNV+"'";
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
}
