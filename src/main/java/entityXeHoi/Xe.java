package entityXeHoi;

public abstract class Xe {

    public abstract String getDongCo();
    public abstract String getNhaSanXuat();
    @Override
    public String toString(){
        return "DongCo= "+this.getDongCo()+", NhaSanXuat="+this.getNhaSanXuat();
    }
}
