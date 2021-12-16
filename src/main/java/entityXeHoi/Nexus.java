package entityXeHoi;

public class Nexus extends  Xe{
    private String DongCo;
    private String NhaSanXuat;

    public Nexus(String dongCo, String nhaSanXuat) {
        DongCo = dongCo;
        NhaSanXuat = nhaSanXuat;
    }

    @Override
    public String getDongCo() {
        return this.DongCo;
    }

    @Override
    public String getNhaSanXuat() {
        return this.NhaSanXuat;
    }
}
