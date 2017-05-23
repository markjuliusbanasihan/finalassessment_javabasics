package Assessment_5;

import static jdk.nashorn.internal.objects.NativeMath.random;

/**
 * Created by MXB2320 on 5/22/2017.
 */
public class RandomNumber {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            random(100);
            final int i1 = (int) (Math.random() * 100) + 1;

        }
    }

}
