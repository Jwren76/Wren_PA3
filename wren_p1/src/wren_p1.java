import java.util.Scanner;
import java.security.SecureRandom;

public class wren_p1 {
    public static int randGen() {
        SecureRandom random = new SecureRandom();
        int randNum = random.nextInt(4);
        return randNum;
    }
    public static int randOper(int diffSel) {
        int sysAns = 0;
        switch (randGen()) {
            case 0:
                sysAns = Sum(diffSel);
                break;
            case 1:
                sysAns = Difference(diffSel);
                break;
            case 2:
                sysAns = Product(diffSel);
                break;
            case 3:
                sysAns = Quotient(diffSel);
                break;
        }
        return sysAns;
    }
    public static int operSel(int operNum, int diffSel){
        int sysAns = 0;
        switch (operNum) {
            case 1:
                sysAns = Sum(diffSel);
                break;
            case 2:
                sysAns = Difference(diffSel);
                break;
            case 3:
                sysAns = Product(diffSel);
                break;
            case 4:
                sysAns = Quotient(diffSel);
                break;
            case 5:
                sysAns = randOper(diffSel);
                break;
        }
        return sysAns;
    }
    public static int randGen(int diffSel) {
        SecureRandom random = new SecureRandom();
        int randNum= 0;
        switch (diffSel) {
            case 1:
                randNum = random.nextInt(9) + 1;
                return randNum;
            case 2:
                randNum = random.nextInt(99) + 1;
                return randNum;
            case 3:
                randNum = random.nextInt(999) + 1;
                return randNum;
            case 4:
                randNum = random.nextInt(9999) + 1;
                return randNum;
        }
        return randNum;
    }
    public static int Product(int diffSel){
        int sysNum1 = randGen(diffSel);
        int sysNum2 = randGen(diffSel);
        int sysAns = sysNum1 * sysNum2;
        System.out.println("What is " + sysNum1 + " times " + sysNum2 + "?");
        return sysAns;
    }
    public static int Sum(int diffSel) {
        int sysNum1 = randGen(diffSel);
        int sysNum2 = randGen(diffSel);
        int sysAns = sysNum1 + sysNum2;
        System.out.println("What is " + sysNum1 + " plus " + sysNum2 + "?");
        return sysAns;
    }
    public static int Difference(int diffSel) {
        int sysNum1 = randGen(diffSel);
        int sysNum2 = randGen(diffSel);
        int sysAns;
        if (sysNum1 > sysNum2) {
            sysAns = sysNum1 - sysNum2;
            System.out.println("What is " + sysNum1 + " minus " + sysNum2 + "?");
        } else {
            sysAns = sysNum2 - sysNum1;
            System.out.println("What is " + sysNum2 + " minus " + sysNum1 + "?");
        }
        return sysAns;
    }
    public static int Quotient(int diffSel) {
        int sysNum1 = randGen(diffSel);
        int sysNum2 = randGen(diffSel);
        int sysDivide = sysNum1 * sysNum2;
        int sysAns = sysNum2;
        System.out.println("What is " + sysDivide + " divided by " + sysNum1 + "?");
        return sysAns;
    }
    public static int posResponse() {
        int posOption = randGen();
        switch (posOption) {
            case 0:
                System.out.println("Very good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
        return posOption;
    }
    public static int negResponse() {
        int negOption = randGen();
        switch (negOption) {
            case 0:
                System.out.println("No. Please try again.");
                break;
            case 1:
                System.out.println("Wrong. Try once more.");
                break;
            case 2:
                System.out.println("Don't give up!");
                break;
            case 3:
                System.out.println("No. Keep trying.");
                break;
        }
        return negOption;

    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double userAns;
        char nextStudent = 'y';
        while (nextStudent == 'y' || nextStudent == 'Y') {
            System.out.println ("Please select difficulty level: 1-4");
            int userDiff = scnr.nextInt();
            System.out.println ("Please select what type of quiz you wish to take:");
            System.out.println ("Press 1 for addition.");
            System.out.println ("Press 2 for subtraction.");
            System.out.println ("Press 3 for multiplication.");
            System.out.println ("Press 4 for division.");
            System.out.println ("Press 5 for random operations.");
            int userOper = scnr.nextInt();
            double userCorr = 0;
            double userWrong = 0;
            for (int i = 0; i <= 9; ++i) {
                int sysAns = operSel(userOper, userDiff);
                userAns = scnr.nextInt();
                if (userAns == sysAns) {
                    posResponse();
                    ++ userCorr;

                }
                else {
                    negResponse();
                    ++ userWrong;
                }
            }
            if (userCorr == 1) {
                System.out.println("You answered " + userCorr + " question correct.");
                System.out.println("You answered " + userWrong + " questions incorrect.");
            }
            else if (userWrong == 1){
                System.out.println("You answered " + userCorr + " questions correct.");
                System.out.println("You answered " + userWrong + " question incorrect.");
            }
            else {
                System.out.println("You answered " + userCorr + " questions correct.");
                System.out.println("You answered " + userWrong + " questions incorrect.");
            }
            if ((userCorr / 10) >= .75) {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            else {
                System.out.println("Please ask your teacher for extra help.");
            }
            System.out.println("To begin a new session, please press 'y'. Press any other key to exit.");
            nextStudent = scnr.next().charAt(0);
        }
    }
}
