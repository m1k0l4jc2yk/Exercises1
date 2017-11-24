public class CustomerTestTwo{

    public static void main(String[] args) {
        CustomerTwo cust1, cust2;
        cust1 = new CustomerTwo();
        cust2 = new CustomerTwo();

        cust1.customerID = 123;
        cust1.name = "Leo Messi";
        cust1.emailAddress = "leo.messi@gmail.com";
        cust2.customerID = 2;
        cust2.name = "Robert Lewandowski";
        cust2.emailAddress = "r.lewandowski@gmail.com";

        cust1.displayCustomerInfo();
        cust2.displayCustomerInfo();
    }
}
