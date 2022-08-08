package xuLyDuLieu;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.HoaDon;

/**
 *
 * @author 20520
 */
public class HoaDonDB {
    private KetNoiCSDL csdl;
    
    public HoaDonDB() {
        csdl = new KetNoiCSDL();
    }
    
    private HoaDon getHoaDon(ResultSet rs)throws Exception{
        return new HoaDon(rs.getInt("SOHD"), rs.getDate("NGHD"), rs.getString("MAKH"), rs.getString("MANV"), 
        		rs.getDouble("TRIGIA"));
    }
    
    public ArrayList<HoaDon> tatCa(){
        ArrayList<HoaDon> list = new ArrayList<>();
        String query = "select * from HOADON";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }  finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public HoaDon timTheoSoHD(int sohd){
        HoaDon hd = null;
        String query = "select * from HOADON where SOHD = '"
                + sohd + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            if (rs.next()) {                
                hd = getHoaDon(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return hd;
    }
    
    public ArrayList<HoaDon> timTheoNgHD(Date date){
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        String query = "select * from HOADON where NGHD = '" + date + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<HoaDon> timTheoThangHD(int thang, int nam){
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        String query = "select * from HOADON where month(NGHD) = " + thang + " and year(NGHD) = " + nam;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<HoaDon> timTheoNamHD(int nam){
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        String query = "select * from HOADON where year(NGHD) = "+ nam;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<HoaDon> timTheoMaKH(String maKH){
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        String query = "select * from HOADON where MAKH = '" + maKH + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<HoaDon> timTheoMaNV(String maNV){
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        String query = "select * from HOADON where MANV = '" + maNV + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<HoaDon> timTheoTenNV(String tenNV){
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        String query = "select * from HOADON hd, NHANVIEN nv where hd.MANV=nv.MANV and nv.HOTEN like N'%"+tenNV+"%'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<HoaDon> timTheoTenKH(String tenKH){
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        String query = "select * from HOADON hd, KHACHHANG kh where hd.MAKH=kh.MAKH and kh.HOTEN like N'%"+tenKH+"%'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<HoaDon> timTriGia(double triGia){
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        String query = "select * from HOADON where TRIGIA = " + triGia;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<HoaDon> triGiaCaoHon(double triGia){
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        String query = "select * from HOADON where TRIGIA >= " + triGia;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<HoaDon> triGiaThapHon(double triGia){
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        String query = "select * from HOADON where TRIGIA <= "+ triGia + "";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public void themHoaDon(HoaDon hd){
    	String maNV = (hd.getMaNhanVien() == null?"null":"'"+hd.getMaNhanVien()+"'");
    	String maKH = (hd.getMaKhachKhang() == null?"null":"'"+hd.getMaKhachKhang()+"'");
        String query = "insert into HOADON (NGHD,MAKH,MANV,TRIGIA) values "
        		+ "('"+hd.getNgayHoaDon()+"',"+maKH+","+maNV+",'"+hd.getTriGia()+"')";
        csdl.setDuLieu(query);
    }
    
    public void capNhatThongTin(HoaDon hd){
    	String maNV = (hd.getMaNhanVien() == null?"null":"'"+hd.getMaNhanVien()+"'");
    	String maKH = (hd.getMaKhachKhang() == null?"null":"'"+hd.getMaKhachKhang()+"'");
        String query = "update HOADON set NGHD = '" +hd.getNgayHoaDon()+"', MAKH = "+ maKH
                +", MANV = " + maNV +", TRIGIA = "+hd.getTriGia()+
                " where sohd = '" +hd.getSoHoaDon()+"'";
        csdl.setDuLieu(query);
    }
    
    public double tongDoanhSo(){
        double tong = 0;
        String query = "select SUM(HOADON.TRIGIA) tong from HOADON";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                tong = tong + rs.getDouble("tong");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return tong;
    }
    
    public ArrayList<HoaDon> topHoaDonCaoNhat(int top){
        ArrayList<HoaDon> list = new ArrayList<>();
        String query = "select top "+top+" with ties TRIGIA as trigia, SOHD, NGHD, MAKH, MANV "
        		+ "from HOADON order by trigia desc";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<HoaDon> topHoaDonThapNhat(int top){
        ArrayList<HoaDon> list = new ArrayList<>();
        String query = "select top "+top+" with ties TRIGIA as trigia, SOHD, NGHD, MAKH, MANV "
        		+ "from HOADON order by trigia asc";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public void xoaHoaDon(int mahd){
        String query = "delete from HOADON where SOHD = "+mahd;
        csdl.setDuLieu(query);
    }
    
    public ArrayList<HoaDon> topHoaDonMoiNhat(int top){
        ArrayList<HoaDon> list = new ArrayList<>();
        String query = "select top "+top+" * from HOADON order by NGHD desc";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<HoaDon> topHoaDonCuNhat(int top){
        ArrayList<HoaDon> list = new ArrayList<>();
        String query = "select top "+top+" * from HOADON order by NGHD asc";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getHoaDon(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
}
