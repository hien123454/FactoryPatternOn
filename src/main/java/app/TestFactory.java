package app;

import Factory.ComputerFactory;
import Factory.XeFactory;
import entity.Computer;
import entityXeHoi.Xe;

public class TestFactory {
    public static void main(String[] args) {
//        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
//        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
//        System.out.println("Factory PC Config::"+pc);
//        System.out.println("Factory Server Config::"+server);

        Xe honda = XeFactory.getXe("Honda","4 thi","Nhat Ban");
        Xe nexus = XeFactory.getXe("Nexus","4 thi","Duc");
        Xe toyota = XeFactory.getXe("Toyota","3 thi","Nhat Ban");
        System.out.println("Factory Honda Config::"+honda);
        System.out.println("Factory Nexus Config::"+nexus);
        System.out.println("Factory Toyota Config::"+toyota);
    }
}
