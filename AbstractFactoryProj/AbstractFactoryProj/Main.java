public class Main {

    public static void main(String[] args) {
        // Create a correct French address
        // Create a correct Freach phone number
        // Define a daily rental fee in French francs
        // Print the French address using the correct format
        // Print the French phone number using the correct format
        // Print the daily rental fee in French francs. (The client just defines a value
        // and the code automatically prints the correct currency in terms of symbol, etc.)
        System.out.print(String.format("\n\n%s\n\n","French Rental Info:"));
        RentalInfoFactory FRRentalInfo=new FrenchRentalInfoFactory();
        Address frAddress=FRRentalInfo.createCountryAddress();
        PhoneNumber frPhone= FRRentalInfo.createCountryPhoneNumber();
        FeeInLocalCurrency frdollar= FRRentalInfo.createFeeInLocalCurrency();

        frAddress.setAddresse("Jean Luc PICARD");
        frAddress.setStreet("52 RUE DES FLEURS");
        frAddress.setCity("PARIS");
        frAddress.setPostalCode("33500");
        frAddress.setCountry("FRANCE");
        System.out.print(frAddress.printFullAddress());
        frPhone.setCountryCode("+33");
        frPhone.setPhoneNumber("686579014");
        frPhone.validatePhoneNumber("686579014");
        frPhone.printPhoneNumber("+33686579014");
        frdollar.setDailyFee(150);
        frdollar.printDailyRentalFeeInLocalCurrency();

        System.out.print(String.format("\n\n%s\n\n","US Rental Info:"));

        // Create a correct US address
        // Create a correct US phone number
        // Define a daily rental fee in US dollars
        // Print the US address using the correct format
        // Print the US phone number using the correct format
        // Print the daily rental fee in US dollars. (The client just defines a value
        // and the code automatically prints the correct currency in terms of symbol, etc.)
        RentalInfoFactory USRentalInfo=new USRentalInfoFactory();
        Address UsAddress=USRentalInfo.createCountryAddress();
        PhoneNumber usPhone= USRentalInfo.createCountryPhoneNumber();
        FeeInLocalCurrency usdollar= USRentalInfo.createFeeInLocalCurrency();

        UsAddress.setAddresse("Monica Galler");
        UsAddress.setStreet("495 Groove Street");
        UsAddress.setCity("New York");
        UsAddress.setPostalCode("NY 10014");
        UsAddress.setCountry("USA");
        System.out.print(UsAddress.printFullAddress());
        usPhone.setCountryCode("+1(222)");
        usPhone.setPhoneNumber("2322322");
        usPhone.validatePhoneNumber("2322322");
        usPhone.printPhoneNumber("2322322");
        usdollar.setDailyFee(88);
        usdollar.printDailyRentalFeeInLocalCurrency();
        USRentalInfo.createCountryAddress();

    }
}
