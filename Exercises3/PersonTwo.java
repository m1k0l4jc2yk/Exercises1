
public class PersonTwo {
    public StringBuilder name = new StringBuilder(6);
    public StringBuilder phoneNumber = new StringBuilder();
    
    public void displayPersonInfo(){
        name.append("Tomasz");
        name.append(" ");
        name.append("Gonzalez");
        System.out.println("Name: "+ name.toString());
        System.out.println("Name object capacity: " + name.capacity());

        phoneNumber.append("123456789");
        phoneNumber.insert(3, "-");
        phoneNumber.insert(7, "-");
        System.out.println("Phone number: " + phoneNumber.toString());

        System.out.println("First Name: "+ name.substring(0, 6));
    }
}
