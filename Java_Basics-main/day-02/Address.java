public class Address{

    private String street;
    private String zipCode;
    private String city;
    private String state;
    private String country;

    public Address(String street, String zipCode, String city, String state, String country){
        this.state = state;
        this.street = street;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getStreet(){
        return this.street;
    }

    public void setZipcode(String zipCode){
        this.zipCode = zipCode;
    }

    public String getZipcode(){
        return this.zipCode;
    }

    
    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }

    
    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    
    public void setCountry(String country){
        this.country = country;
    }

    public String getCountry(){
        return this.country;
    }


    
}