package entityNganHang;

public abstract class NganHang {
    public abstract String getDongCo();
    public abstract String getNhaSanXuat();
    @Override
    public String toString(){
        return "DongCo= "+this.getDongCo()+", NhaSanXuat="+this.getNhaSanXuat();
    }
}
