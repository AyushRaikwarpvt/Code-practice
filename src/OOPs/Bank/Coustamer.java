package OOPs.Bank;

public class Coustamer {

    private int AcountBalance;
    private  String Coustamer_Name;
    private String Account_Number;

    public int getAcountBalance() {
        return AcountBalance;
    }

    public void setAcountBalance(int acountBalance) {
        if (acountBalance > 0) {
            AcountBalance = acountBalance;
        }
        else {
            System.out.println("Balance nhi  h");
        }
    }

    public String getCoustamer_Name() {
        return Coustamer_Name;
    }

    public void setCoustamer_Name(String coustamer_Name) {
        Coustamer_Name = coustamer_Name;
    }

    public String getAccount_Number() {
        return Account_Number;
    }
    public void setAccount_Number(String account_Number) {
        Account_Number = account_Number;
    }

    public Coustamer(int acountBalance, String coustamer_Name, String account_Number) {
        AcountBalance = acountBalance;
        Coustamer_Name = coustamer_Name;
        Account_Number = account_Number;
    }

    public void Withdraw(int Amou){
        if ( Amou > 0 && Amou <= AcountBalance ){
            Amou = Amou - AcountBalance;
            System.out.println("Withdraw Sucessfully");
        }else{
            System.out.println("Neggative Amount Are Not Allow");
        }
    }
    public void Deposite(int Amou){
        if (Amou > 0){
            this.AcountBalance = Amou + AcountBalance;
            System.out.println("Deposite SucessFully");
        }
        else {
            System.out.println("Only Positive Value Are Store");
        }
    }
    public static void ShowAcountBal(Coustamer Cou){
        System.out.println("Your AccountBal Are :"+Cou.AcountBalance);
    }
}
