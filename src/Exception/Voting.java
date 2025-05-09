package Exception;


class VotingRight extends RuntimeException {
    VotingRight(String msg) {
        super(msg);
    }
}

class A{
    void ZeroDivide(int B) throws ArithmeticException{
      int a = 12 / 0;
    }
}

public class Voting {

    public static void main(String[] args) {
        int age = 17; // ✅ Follow camelCase
        try {
            if (age >= 18) {
                System.out.println("You are eligible for voting");
            } else {
                // ✅ Corrected spelling in class and message
                throw new VotingRight("You are not eligible for voting");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Thankyou For Intresting in Voting");
        }

        A obj = new A();
        try{
            obj.ZeroDivide(10);
        } catch (ArithmeticException e) {
            System.out.println("bhai tu zero se divide kyu lr rh h ");;
        }

    }
}
