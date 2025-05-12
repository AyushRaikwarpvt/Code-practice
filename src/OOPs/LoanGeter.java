package OOPs;

public class LoanGeter implements KycDepartment , CiviVerification {
    @Override
    public void AnalysingAccount() {
        System.out.println("Your Account Are Analysing.....");
        System.out.println("Done");
        KycDepartment.Information();
    }

    @Override
    public void CheackOutstandingLoan() {
        System.out.println("No Such as A Loans");
    }

    @Override
    public void AdharVerify() {
        System.out.println("Completr your Adhar Veryfication");

    }

    @Override
    public void PanVerify() {
        System.out.println("Complet Your Adhar Veryfication");

    }
}


class Coustamers  extends LoanGeter{
    public static void main(String[] args) {

        Coustamers AyushRaikwar = new Coustamers();

        AyushRaikwar.AdharVerify();
        AyushRaikwar.AnalysingAccount();
        AyushRaikwar.PanVerify();
        AyushRaikwar.CheackOutstandingLoan();


    }
}
