public class Person {

    private name;
    private address;
    private phonenumber;
    private email;
    public Person(String name, String address, String phonenumber, String email) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email
    }

    public String getName(){
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhoneNumber(){
        return phonenumber;
    }
    public String getEmail(){
        return email;
    }
    public String setName(String name){
        this.name=name;
    }
    public String setAddress(String address){
        this.address=address;
    }
    public String setPhoneNumber(String phonenumber )
    {
        this.phonenumber=phonenumber;
    }
    public String setEmail(String email){
        this.email=email
    }
}


