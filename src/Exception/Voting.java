package Exception;


class VotingRight extends RuntimeException {
    VotingRight(String msg) {
        super(msg);
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
    }
}
