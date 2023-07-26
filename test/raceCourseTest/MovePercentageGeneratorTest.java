package raceCourseTest;

import org.junit.jupiter.api.Test;
import tortoioseAndHare.contenders.MovePercentageGenerator;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovePercentageGeneratorTest {

    @Test
    public void generateMove(){
        int move = MovePercentageGenerator.generateMovePercentage();
        assertTrue(move > 0 && move < 11);
    }
}
