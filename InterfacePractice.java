package Interface;
interface ProcessorVendor {
    void chipDetails();
}

interface Machine extends ProcessorVendor,Vendor {
    void code();
}


interface Vendor {
    void vendorDetails();
}

class Desktop implements Machine, Vendor {
    public void code() {
        System.out.println("Mac");
    }

    @Override
    public void vendorDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vendorDetails'");
    }

    @Override
    public void chipDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chipDetails'");
    }
}

class Laptop implements Machine {
    public void code() {
        System.out.println("Dell");
    }

    @Override
    public void chipDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chipDetails'");
    }

    @Override
    public void vendorDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vendorDetails'");
    }
}

class Programmer {
    public void buildApp(Machine machine) {
       machine.code();
    }

}
public class InterfacePractice {
    public static void main(String[] args) {
        Machine m = new Laptop();

        Machine m1 = new Desktop();

        Programmer p = new Programmer();
        p.buildApp(m);
    }
}
