public abstract class Doctor extends Object {

    private int exp;
    private String name; 

    public Doctor(String name){
        this.name = name;
    }

    public Doctor(int exp, String name) {
        this.exp = exp;
        this.name = name;
        System.out.println(" Inside the constructor of Doctor....");
    }

    public abstract void treatPatient();

    public final void chargeConsultationFee(){
        System.out.println(" Charging the consultation fee of Rs 200");
    }


    
}
