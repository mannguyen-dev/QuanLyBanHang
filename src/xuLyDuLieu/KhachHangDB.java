package xuLyDuLieu;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import model.KhachHang;

/**
 *
 * @author 20520
 */
public class KhachHangDB {
    private KetNoiCSDL csdl;

    public KhachHangDB() {
        csdl = new KetNoiCSDL();
    }
   
    private KhachHang getKhachHang(ResultSet rs) throws Exception{
       return new KhachHang(rs.getString("MAKH"), rs.getString("HOTEN"), rs.getString("DCHI"), rs.getString("SODT"), 
    		   rs.getDate("NGSINH"), rs.getDate("NGDK"), rs.getDouble("DOANHSO"), rs.getString("LOAIKH"));
    }
   
    public ArrayList<KhachHang> tatCa(){
       ArrayList<KhachHang> list = new ArrayList<>();
       String query = "select * from KHACHHANG";
       ResultSet rs = csdl.getDuLieu(query);
       try {
           while (rs.next()) {               
               if (rs.getString("IS_DELETED")==null) list.add(getKhachHang(rs));
           }
           csdl.getStmt().close();
       } catch (Exception e) {
           e.printStackTrace();
       } finally{
            csdl.offStatement();
        }
       return list;
    }

    
    public KhachHang timTheoMaKH(String maKH){
    	KhachHang kh = null;
        String query = "select * from KHACHHANG where MAKH = '" + maKH + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            if (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) kh = getKhachHang(rs);
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return kh;
    }
    
    public KhachHang kiemTraTonTaiMaKH(String maKH){
    	KhachHang kh = null;
        String query = "select * from KHACHHANG where MAKH = '" + maKH + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            if (rs.next()) {                
            	kh = getKhachHang(rs);
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return kh;
    }
    
    public ArrayList<KhachHang> timTheoHoTen(String hoTen){
        ArrayList<KhachHang> list = new ArrayList<KhachHang>();
        String query = "select * from KHACHHANG where HOTEN like N'%" + hoTen + "%'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getKhachHang(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<KhachHang> timTheoDiaChi(String diaChi){
        ArrayList<KhachHang> list = new ArrayList<KhachHang>();
        String query = "select * from KHACHHANG where DCHI like N'%" + diaChi + "%'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getKhachHang(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<KhachHang> timTheoSDT(String soDT){
        ArrayList<KhachHang> list = new ArrayList<KhachHang>();
        String query = "select * from KHACHHANG where SODT like '%" + soDT + "%'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getKhachHang(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<KhachHang> timTheoNgaySinh(Date ngaySinh){
        ArrayList<KhachHang> list = new ArrayList<KhachHang>();
        String query = "select * from KHACHHANG where NGSINH = '" + ngaySinh + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getKhachHang(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<KhachHang> timTheoNgayDKy(Date ngayDKy){
        ArrayList<KhachHang> list = new ArrayList<KhachHang>();
        String query = "select * from KHACHHANG where NGDK = '" + ngayDKy + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getKhachHang(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<KhachHang> timTheoThangDKy(int thang, int nam){
        ArrayList<KhachHang> list = new ArrayList<KhachHang>();
        String query = "select * from KHACHHANG where month(NGDK) = "
                + thang + " and year(NGDK) = "+ nam;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getKhachHang(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<KhachHang> timTheoNamDKy(int nam){
        ArrayList<KhachHang> list = new ArrayList<KhachHang>();
        String query = "select * from KHACHHANG where year(NGDK) = "+ nam;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getKhachHang(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<KhachHang> timTheoDoanhSo(double doanhSo){
        ArrayList<KhachHang> list = new ArrayList<KhachHang>();
        String query = "select * from KHACHHANG where DOANHSO = " + doanhSo;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getKhachHang(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<KhachHang> doanhSoCaoHon(double doanhSo){
        ArrayList<KhachHang> list = new ArrayList<KhachHang>();
        String query = "select * from KHACHHANG where DOANHSO >= " + doanhSo;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getKhachHang(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<KhachHang> doanhSoThapHon(double doanhSo){
        ArrayList<KhachHang> list = new ArrayList<KhachHang>();
        String query = "select * from KHACHHANG where DOANHSO <= " + doanhSo;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getKhachHang(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<KhachHang> timTheoLoaiKH(String loaiKH){
        ArrayList<KhachHang> list = new ArrayList<KhachHang>();
        String query = "select * from KHACHHANG where LOAIKH like N'%" + loaiKH + "%'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getKhachHang(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
   
    public void themKhachHang(KhachHang kh){
        String query = "insert into KHACHHANG (MAKH,HOTEN,DCHI,SODT,NGSINH,NGDK,DOANHSO,LOAIKH) values "
	+ "('"+kh.getMaKH()+"',N'"+kh.getHoTen()+"',N'"+kh.getDiaChi()+"','"+kh.getSoDT()+"','"+kh.getNgaySinh()+"','"+kh.getNgayDKy()+"',"+kh.getDoanhSo()+",N'"+kh.getLoaiKH()+"')";
        csdl.setDuLieu(query);
    }
    
    public void capNhatThongTin(KhachHang kh){
        String query = "update KHACHHANG set HOTEN = N'" +kh.getHoTen()+"', DCHI = N'"+kh.getDiaChi()
                +"', SODT = '" + kh.getSoDT()+"', NGSINH = '"+kh.getNgaySinh()+"', NGDK = '"+kh.getNgayDKy()+ "', DOANHSO = "+kh.getDoanhSo()+", LOAIKH = N'"+kh.getLoaiKH()+
                "' where MAKH = '" +kh.getMaKH()+"'";
        csdl.setDuLieu(query);
    }
    
    
    public void xoaKhachHang(String makh){
        String query = "delete from KHACHHANG where MAKH = '"+makh+"'";
        csdl.setDuLieu(query);
    }
    
    public int xoaMem(String makh){
        String query = "update KHACHHANG set IS_DELETED = 'TRUE' where MAKH = '"+makh+"'";
        return csdl.setDuLieu(query);
    }
    
    public int tongSoLuongKhachHang(){
        int tong = 0;
        String query = "select count(*) tong from KHACHHANG";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                tong =tong + rs.getInt("tong");
            }
            
        } catch (Exception e) {
        } finally{
            csdl.offStatement();
        }
        
        return tong;
    }
    
    public ArrayList<KhachHang> topKhachHangMuaNhieuNhat(int top){
        ArrayList<KhachHang> list = new ArrayList<>();
        String query = "select top "+top+" with ties * from KHACHHANG where IS_DELETED is null order by DOANHSO desc";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	list.add(getKhachHang(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<KhachHang> topKhachHangMuaItNhat(int top){
        ArrayList<KhachHang> list = new ArrayList<>();
        String query = "select top "+top+" with ties * from KHACHHANG where IS_DELETED is null order by DOANHSO asc";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getKhachHang(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
}
