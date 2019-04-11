package khoapham.ptp.phamtanphat.oop;

public class Person {
    private String ten;
    private Integer tuoi;
    private String Phuongtien;

    //To hop phim chuc nang alt + insert

    public Person(String ten , Integer tuoi , String phuongtien){
        this.ten = ten;
        this.tuoi = tuoi;
        Phuongtien = phuongtien;

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getPhuongtien() {
        return Phuongtien;
    }

    public void setPhuongtien(String phuongtien) {
        Phuongtien = phuongtien;
    }
}
