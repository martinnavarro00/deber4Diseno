public class FrenchPhoneNumber extends PhoneNumber{

    public void validatePhoneNumber(String phoneNumber){
        if(countryCode.startsWith("+33"))
        {
            countryCode=this.countryCode;
        }
        else{
            countryCode="Not Valid Country Code ";
        }
        if(phoneNumber.length()==12){
            phoneNumber=phoneNumber;
        }
        else{
            phoneNumber="Not Valid Phone";
        }

    }

    public void printPhoneNumber(String phoneNumber)
    {
        System.out.print(phoneNumber+"\n");
    }
}