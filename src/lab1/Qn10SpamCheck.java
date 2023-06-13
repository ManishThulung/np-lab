// Manish Rai
// 18
package lab1;

public class Qn10SpamCheck {

    public static void main(String[] args) {
        String emailText = "Buy cheap Bottles now!";
        if (emailText.matches("(?i).*\\b(bottles|cialis|rolex|prince\\s+of\\s+nigeria)\\b.*")) {
            System.err.println("This email is spam");
        } else {
            System.out.println("This email is not spam(ham).");
        }
    }
}
