package Factory;

import entity.Computer;
import entity.PC;
import entity.Server;
import entityXeHoi.Honda;
import entityXeHoi.Nexus;
import entityXeHoi.Toyota;
import entityXeHoi.Xe;

public class XeFactory {
    public static Xe getXe(String type,String dongCo, String nhaSanXuat){
        if("Honda".equalsIgnoreCase(type)) return new Honda(dongCo, nhaSanXuat);
        else if("Nexus".equalsIgnoreCase(type)) return new Nexus(dongCo, nhaSanXuat);
        else if("Toyota".equalsIgnoreCase(type)) return new Toyota(dongCo, nhaSanXuat);

        return null;
    }
}
