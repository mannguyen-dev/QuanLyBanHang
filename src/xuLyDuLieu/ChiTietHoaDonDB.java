package xuLyDuLieu;


import java.sql.ResultSet;
import java.util.ArrayList;

import model.ChiTietHoaDon;
/**
 *
 * @author 20520
 */
public class ChiTietHoaDonDB {
    private KetNoiCSDL csdl;

    public ChiTietHoaDonDB() {
        csdl = new KetNoiCSDL();
    }
    
    private ChiTietHoaDon getChiTietHoaDon(ResultSet rs) throws Exception{
        return new ChiTietHoaDon(rs.getInt("SOHD"), rs.getString("MASP"), rs.getInt("SL"));
    }
    
    public ArrayList<ChiTietHoaDon> tatCa(){
        ArrayList<ChiTietHoaDon> list = new ArrayList<>();
        String query = "select * from CTHD";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getChiTietHoaDon(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<ChiTietHoaDon> timTheoSoHD(int soHD){
        ArrayList<ChiTietHoaDon> list = new ArrayList<ChiTietHoaDon>();
        String query = "select * from CTHD where SOHD = '" + soHD + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getChiTietHoaDon(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<ChiTietHoaDon> timTheoMaSP(String maSP){
        ArrayList<ChiTietHoaDon> list = new ArrayList<ChiTietHoaDon>();
        String query = "select * from CTHD where MASP = '" + maSP + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getChiTietHoaDon(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ChiTietHoaDon timTheoSoHDVaMaSP(int soHD, String maSP){
        ChiTietHoaDon cthd = null;
        String query = "select * from CTHD where MASP = '" + maSP + "' and SOHD = "+soHD;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            if (rs.next()) {                
                cthd = getChiTietHoaDon(rs);
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return cthd;
    }
    
    public void themCTHD(ChiTietHoaDon cthd){
        String query = "insert into CTHD (SOHD,MASP,SL) values ('" + cthd.getSoHoaDon() + "','"
        					+ cthd.getMaSP() + "','" + cthd.getSoLuong() + "')";
        csdl.setDuLieu(query);
    }
    
    public void capNhatThongTin(ChiTietHoaDon cthd){
        String query = "update CTHD set SL = '" +cthd.getSoLuong()+
                "' where SOHD = '" +cthd.getSoHoaDon()+"' and MASP = '" + cthd.getMaSP()+"'";
        csdl.setDuLieu(query);
    }
    
    public void xoaCTHD(int mahd, String masp){
        String query = "delete from CTHD where SOHD = '"+mahd+"' and MASP = '" + masp + "'";
        csdl.setDuLieu(query);
    }
    
    public int getSoLuongSPDaBan(){
        int tong = 0;
        String query = "select SUM(CTHD.SL) TONG from CTHD";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            if (rs.next()) {                
                tong = tong + rs.getInt("TONG");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return tong;
    }
}
