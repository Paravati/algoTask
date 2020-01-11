package randomProgramsFromCourses;

public class ProgramForBankAccount {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        account1.setAccountNumber("1234 1234 2132 1223");
        System.out.println(account1.getAccountNumber());
    }

    public static class BankAccount{
        private String accountNumber = null;
        private double balance = 0;
        private String customerName = null;
        private String email = null;
        private String phoneNumber = null;

        public String getAccountNumber(){
            return accountNumber;
        }

        public double getBalance(){
            return balance;
        }

        public String getCustomerName(){
            return customerName;
        }

        public String getEmail(){
            return email;
        }

        public String getPhoneNumber(){
            return phoneNumber;
        }

        public void setAccountNumber(String accountNumber){
            this.accountNumber = accountNumber;
        }

        public void setBalance(double balance){
            this.balance = balance;
        }

        public void setCustomerName(String customerName){
            this.customerName = customerName;
        }

        public void setEmail(String email){
            this.email = email;
        }

        public void setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
        }

        public void depositFunds(double money){
            this.balance += money;
        }

        public void withdrawFund(double money){
            if(this.balance <= 0 || (this.balance-money) < 0){
                System.out.println("You cannot withdraw money.");
            }else{
                this.balance-=money;
            }
        }
    }
}
