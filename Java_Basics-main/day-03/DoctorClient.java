public class DoctorClient {

    public static void main(String[] args) {
        // Doctor doctor = new Doctor(12,"Akansha");

        // Doctor knee = new KneeSurgeon(22, "Akansha");
        // knee.conductKneeSurgery(); //Error conductKneeSurgery() canot be called using parent reference.
        // ((KneeSurgeon)knee).conductKneeSurgery();
        // knee.treatPatient();

        // Doctor ortho = new OrthoPadeician(22, "Akansha");
        //ortho.conductKneeSurgery();//Compile Time Error
        //((KneeSurgeon)ortho).conductKneeSurgery(); //Runtime ortho cannot be casted to knee
        //ortho.treatPatient();

        Doctor dent = new Dentist(22, "Akansha");
        // ((KneeSurgeon)dent).conductKneeSurgery();//Run Time Error
        dent.treatPatient();
        dent.chargeConsultationFee();




    }
    
}
