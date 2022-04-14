public class FrenchAddress extends Address{
    public void validateAddress(Address addr){
        if(country=="FRANCE"){
            country=getCountry();
        }
        else{
            country="Not Valid address";
            city="Not Valid address";
            street="Not Valid address";
            postalCode="Not Valid address";
        }
        if(street.startsWith("1")||street.startsWith("2")||street.startsWith("3")
                ||street.startsWith("4")||street.startsWith("5")||street.startsWith("6")||
                street.startsWith("7")||street.startsWith("8")||street.startsWith("9")||
                street.startsWith("0"))
        {
            street=getStreet();
        }

    }
    public String printFullAddress()
    {
        String print=String.format("%s\n%s\n%s\n%s\n%s\n",addresse,street,postalCode,city,country);
        return print;
    }

}