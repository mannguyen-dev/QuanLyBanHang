/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuLyDuLieu;

import java.util.ArrayList;
import model.NhanVien;
import java.sql.ResultSet;
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
    
    public NhanVien timTheoMaNV(String maNV){
        NhanVien nv = null;
        String query = "select * from nhanvien where manv = '" + maNV + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
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
    
    
    public ArrayList<NhanVien> timTheoSoDT(String sodt){
        ArrayList<NhanVien> list = new ArrayList();
        String query = "select * from nhanvien where sodt like '%" + sodt + "%'";
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
    
    public ArrayList<NhanVien> timNgayVaoLamNhanVien(Date date){
        ArrayList<NhanVien> list = new ArrayList();
        String query = "select * from nhanvien where ngvl = '" + date + "'";
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
    
    public ArrayList<NhanVien> timVaiTroNhanVien(String vaitro){
        ArrayList<NhanVien> list = new ArrayList();
        String query = "select * from nhanvien where vaitro like N'%" + vaitro + "%'";
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
    
    
    public void themNhanVien(NhanVien nv){
        String query = "insert into nhanvien (manv,hoten,sodt,ngvl,matkhau,vaitro) values "
	+ "('"+nv.getMaNV()+"',N'"+nv.getHoTen()+"','"+nv.getSoDT()+"','"+nv.getNgVL()+"','"+nv.getMatKhau()+"',N'"+nv.getVaiTro()+"')";
        csdl.setDuLieu(query);
    }
    
    public void capNhatThongTin(NhanVien nv){
        String query = "update nhanvien set hoten = N'" +nv.getHoTen()+"', sodt = '"+nv.getSoDT()
                +"', ngvl = '" + nv.getNgVL()+"', matkhau = '"+nv.getMatKhau()+"', vaitro = N'"+nv.getVaiTro()+
                "' where manv = '" +nv.getMaNV()+"'";
        csdl.setDuLieu(query);
    }
    
    public void xoaNhanVien(String manv){
        String query = "delete from nhanvien where manv = '"+manv+"'";
        csdl.setDuLieu(query);
    }
}
