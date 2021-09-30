public class Account {
    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    Account(String accountNumber,int balance,String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;


    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phno) {
        this.phoneNumber = phno;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(int balance) {
        this.balance += balance;
        System.out.println(balance +" has been credited your Account");
        System.out.println("remaining balance : " + this.balance);
    }

    public void withdraw(int balance) {
        if(this.balance - balance < 0) {
            System.out.println("Only " + balance + " available. Withdrawal not processed");
//            System.out.println("Your Account balance is less than 1000.");
//            System.out.println("withdrawal process are denied");
        }else{
            this.balance -= balance;
            System.out.println(balance + " was debited in your Account");
            System.out.println("remaining balance : " + this.balance);
        }

    }

    public static void main(String[] args) {
        Account SBI = new Account("7530",10_000,"Mahudoom","abc@gmail.com","7530062545");
        SBI.deposit(5000);
        SBI.withdraw(500);
        SBI.withdraw(10000);
        SBI.withdraw(3000);
        SBI.withdraw(1000);
        SBI.withdraw(500);

    }
}
