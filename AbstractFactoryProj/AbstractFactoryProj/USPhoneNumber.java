public class USPhoneNumber extends PhoneNumber{

   public void validatePhoneNumber(String phoneNumber){
      if(countryCode.startsWith("+1"))
      {
         countryCode=countryCode;
      }
      else{
         countryCode="Not Valid Country Code ";
      }
      if(phoneNumber.length()==7){
         phoneNumber=phoneNumber;
      }
      else{
         phoneNumber="Not Valid Phone";
      }
      
   }
  
    public void printPhoneNumber(String phoneNumber)
    {
      System.out.print(countryCode+phoneNumber+"\n");
    }
}