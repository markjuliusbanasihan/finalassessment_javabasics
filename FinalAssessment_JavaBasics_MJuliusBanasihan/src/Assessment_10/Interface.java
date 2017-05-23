package Assessment_10;

/**
 * Created by MXB2320 on 5/22/2017.
 */
public interface Interface {

    int sum(int num1, int num2);

    default void printName(String Message){
        System.out.println(Message);
        printNewMessage("New Message");
    }

    public static void printNewMessage(String msg){
        System.out.println(msg);
    }
}
