public final class KneeSurgeon extends OrthoPadeician {

    private double salary;

    public KneeSurgeon(int exp, String name, double salary) {
        super(exp, name);
        this.salary = salary;
        System.out.println("Called the constructor of KneeSurgeon....");
    }

    public KneeSurgeon(int exp, String name) {
        super(exp, name);
        System.out.println("Called the constructor of KneeSurgeon....");
    }

    @Override
    public void treatPatient() {
        System.out.println(" Performing the basic diagnostics ..");
        super.conductXRay();
        super.conductCTScan();
        this.conductKneeSurgery();
    }

    public void conductKneeSurgery() {
        System.out.println(" Performing the Knee surgery..");
    }

}
