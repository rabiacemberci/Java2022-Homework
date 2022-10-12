public class Person extends Customer{

    String FirstName;
    String LastName;
    String NationalyIdentity;

    public String getNationalyIdentity() {
        return NationalyIdentity;
    }

    public void setNationalyIdentity(String nationalyIdentity) {
        NationalyIdentity = nationalyIdentity;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
