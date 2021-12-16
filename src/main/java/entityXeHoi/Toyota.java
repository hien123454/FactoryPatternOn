package entityXeHoi;

public class Toyota extends  Xe{
    private String DongCo;
    private String NhaSanXuat;

    public Toyota(String dongCo, String nhaSanXuat) {
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
