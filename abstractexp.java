abstract class Appliance {
    abstract void start();
}

class Fan extends Appliance {
    void start() {
        System.out.println("Fan is starting...");
    }
}

class WashingMachine extends Appliance {
    void start() {
        System.out.println("Washing Machine is starting...");
    }
}

public class ApplianceDemo {
    public static void main(String[] args) {
        Appliance a1 = new Fan();
        Appliance a2 = new WashingMachine();
        a1.start();
        a2.start();
    }
}
