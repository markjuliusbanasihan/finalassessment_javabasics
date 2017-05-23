package Assessment_6;

/**
 * Created by MXB2320 on 5/22/2017.
 */
public class TestGrade {
    public static void main(String[] args) {
        int score = 79;
        if (score >= 90) {
            System.out.println("Your score of 90 got you an A...");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Your score of 80 got you a B...");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Your score of 79 got you a C...");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Your score of 60 go you a D...");
        } else {
            if (score >= 0) ;
            System.out.println("Your score of 0 got you an F...");
            else{
                System.out.println(score + "is an invalid score.  Please use another score.");
            }
        }
    }
}