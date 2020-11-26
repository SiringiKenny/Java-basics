    public class Dentist extends Doctor{
        public Dentist(int exp, String name ){
            super(exp, name);
            System.out.println(" Inside the constrcutor of Dentist");

        }
    
        @Override
        public final void treatPatient(){
            System.out.println("Conducting Root Canal for Patient....");
        }

        // @Override
        // public void chargeConsultationFee(){
        //     System.out.println(" Charging the consultation fee of Rs 500");
        // } Error final method cannot be overriden

    }