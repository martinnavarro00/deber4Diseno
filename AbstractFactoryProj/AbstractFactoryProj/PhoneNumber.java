
public abstract class PhoneNumber {

    protected String phoneNumber;
    protected String countryCode;

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public  String getCountryCode(){
        return countryCode;
    }
    public void setPhoneNumber(String newNumber) {
        this.phoneNumber = newNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    abstract void validatePhoneNumber(String phoneNumber);
    abstract void printPhoneNumber(String phoneNumber);


}
