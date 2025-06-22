package OOPs.Bank;

public class Bank extends Coustamer{

    final String Bank_Name = "State Bank of India";

    public Bank(int acountBalance, String coustamer_Name, String account_Number) {
        super(acountBalance, coustamer_Name, account_Number);
    }


    public static void main(String[] args) {

        Coustamer Ayush = new Coustamer(1000,"Ayush Raikwar","43911");
        Coustamer Varun = new Coustamer(20000,"Vaurn Kashyap","43912");

        Varun.Deposite(10000);
       ShowAcountBal(Varun);
    }

}
