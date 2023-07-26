package tortoioseAndHare.contenders;

import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class MovePercentageGenerator {
    public static int generateMovePercentage(){
        int result = BigDecimal.ZERO.intValue();
        try {
            result = SecureRandom.getInstanceStrong().nextInt(BigDecimal.TEN.intValue());
            ++result;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }
}
