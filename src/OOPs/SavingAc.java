package OOPs;

public class SavingAc {

    private int AccountBalance ;
    private String Coustamer_Name ;
    private int ContactNumber ;
    private  int Accountnumber ;
    private  final String BankName = "Sbi";

    SavingAc(int Ac_bal , String CousName , int ContactNum , int AccoNum){
        this.AccountBalance = Ac_bal;
        this.Coustamer_Name = CousName;
        this.ContactNumber = ContactNum;
        this.Accountnumber = AccoNum;

    }


    public void getAccountBalance() {
        System.out.println(AccountBalance);
    }

    public void Deposite (int Amou){
        AccountBalance += Amou;
        System.out.println("Hey"+Coustamer_Name+"Your Deposite are" + Amou + " You are Reaming Balance This "+ AccountBalance);
    }

    public void WithDraw (int Amou){
        AccountBalance -= Amou;
        System.out.println("Hey"+Coustamer_Name+"Your Withraw are" + Amou + " You are Reaming Balance This "+ AccountBalance);
    }
}

class BankServer {
    public static void main(String[] args) {
        SavingAc CousAyush = new SavingAc(1000,"Ayush Raikwar",8120,224488);
        CousAyush.Deposite(1000);
        CousAyush.getAccountBalance();


    }
}
