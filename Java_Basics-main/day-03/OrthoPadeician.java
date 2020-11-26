public class OrthoPadeician extends Doctor {
    
    public OrthoPadeician(int exp, String name){
        super(exp, name);
        System.out.println(" Inside the constrcutor of OrthoPadeician");
    }

    @Override
    public void treatPatient(){
        conductXRay();
        conductCTScan();
    }

    public void conductXRay(){
        System.out.println("Conducting X Ray");
    }

    public void conductCTScan(){
        System.out.println("Conducting CT Scan");
    }

}
