import java.util.Scanner;

public class Phonenumber {
    long num;
    int even, odd;

    // Constructor
    Phonenumber(long num) {
        this.num = num;
    }

    // Method to calculate even/odd digits
    public void calc() {
        long temp = num;
        while (temp != 0) {
            long digit = temp % 10;
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            temp = temp / 10;
        }
        if (even == odd) {
            System.out.println("the numbers of even and odd digits are same");
        } else if (even > odd) {
            System.out.println("the even digits are greater");
        } else {
            System.out.println("the odd digits are greater");
        }
    }

    // ✅ Main method is inside the class (no extra bracket before this)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter mobile number: ");
        long num = s.nextLong();
        Phonenumber p = new Phonenumber(num);
        p.calc();
    }
}
