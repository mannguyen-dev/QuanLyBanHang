/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuLyDuLieu;

import model.HoaDon;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author 20520
 */
public class HoaDonDB {
    private KetNoiCSDL csdl;
    private Calendar cal = Calendar.getInstance();

    public HoaDonDB() {
        csdl = new KetNoiCSDL();
    }
    
    private HoaDon getHoaDon(ResultSet rs)throws Exception{
        return new HoaDon(rs.getInt("sohd"), rs.getDate("nghd"), rs.getString("makh"), rs.getString("manv"), rs.getDouble("trigia"));
    }
    
    public ArrayList<HoaDon> tatCa(){
        ArrayList<HoaDon> list = new ArrayList<>();
        String query = "select * from hoadon";
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
        String query = "select * from hoadon where sohd = '"
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
        String query = "select * from hoadon where nghd = '"
                + date + "'";
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
        String query = "select * from hoadon where month(nghd) = "
                + thang + " and year(nghd) = "+ nam;
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
        String query = "select * from hoadon where year(nghd) = "+ nam;
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
        String query = "select * from hoadon where makh = '"
                + maKH + "'";
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
        String query = "select * from hoadon where manv = '"
                + maNV + "'";
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
        String query = "select * from hoadon hd, nhanvien nv where hd.MANV=nv.MANV and nv.HOTEN like N'%"+tenNV+"%'";
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
        String query = "select * from hoadon hd, khachhang kh where hd.MAKH=kh.MAKH and kh.HOTEN like N'%"+tenKH+"%'";
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
        String query = "select * from hoadon where trigia = " + triGia;
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
        String query = "select * from hoadon where trigia >= " + triGia;
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
        String query = "select * from hoadon where trigia <= "+ triGia + "";
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
        String query = "insert into hoadon (nghd,makh,manv,trigia) values "
        		+ "('"+hd.getNgayHoaDon()+"',"+maKH+","+maNV+",'"+hd.getTriGia()+"')";
        csdl.setDuLieu(query);
    }
    
    public void capNhatThongTin(HoaDon hd){
    	String maNV = (hd.getMaNhanVien() == null?"null":"'"+hd.getMaNhanVien()+"'");
    	String maKH = (hd.getMaKhachKhang() == null?"null":"'"+hd.getMaKhachKhang()+"'");
        String query = "update hoadon set nghd = '" +hd.getNgayHoaDon()+"', makh = "+ maKH
                +", manv = " + maNV +", trigia = "+hd.getTriGia()+
                " where sohd = '" +hd.getSoHoaDon()+"'";
        csdl.setDuLieu(query);
    }
    
    public double tongDoanhSo(){
        double tong = 0;
        String query = "select SUM(hoadon.trigia) tong from hoadon";
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
        String query = "select top "+top+" with ties trigia as trigia,sohd,nghd, makh, manv "
        		+ "from hoadon order by trigia desc";
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
        String query = "select top "+top+" with ties trigia as trigia,sohd,nghd, makh, manv "
        		+ "from hoadon order by trigia asc";
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
        String query = "delete from hoadon where sohd = '"+mahd+"'";
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
