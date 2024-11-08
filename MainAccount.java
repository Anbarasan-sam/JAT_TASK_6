package guviTask6;

public class MainAccount {
    public static void main(String[] args) {
       
        Account acc1 = new Account();
        System.out.println("Account Number: " + acc1.getAccountNumber());
        System.out.println("Initial Balance: " + acc1.checkBalance());
        
        acc1.deposit(1000);                          
        System.out.println("Balance: " + acc1.checkBalance());  

        acc1.withdraw(500);                          
        System.out.println("Balance: " + acc1.checkBalance());  
      
        Account acc2 = new Account("123456", 500);
        System.out.println("\nAccount Number: " + acc2.getAccountNumber());
        System.out.println("Initial Balance: " + acc2.checkBalance());

        acc2.deposit(1500);                        
        acc2.withdraw(700);                         
        System.out.println("Final Balance: " + acc2.checkBalance());
    }
}
