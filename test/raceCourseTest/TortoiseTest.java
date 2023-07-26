package raceCourseTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tortoioseAndHare.contenders.Tortoise;

import static org.junit.jupiter.api.Assertions.*;
import static tortoioseAndHare.enums.TortoiseMoveType.*;

class TortoiseTest {
    private Tortoise tortoise;

    @BeforeEach
    void setUp(){
        tortoise = new Tortoise();
    }

    @Test
    void tortoiseExist(){
        assertNotNull(tortoise);
    }
    @Test
    void tortoiseStartsRaceFromSquareOne(){
        assertEquals(1,tortoise.getPosition());
    }
    @Test
    void fastPlodMoveForTortoise(){
        assertEquals(1,tortoise.getPosition());
        tortoise.tortoiseMove(FAST_PLOD);
        assertEquals(4,tortoise.getPosition());
    }
    @Test
    void slipMoveForTortoiseAfterEightSquares(){
        assertEquals(1,tortoise.getPosition());
        tortoise.setPosition(8);
        tortoise.tortoiseMove(SLIP);
        assertEquals(2,tortoise.getPosition());
    }
    @Test
    void slipMoveForTortoiseAfterThreeSquares(){
        assertEquals(1,tortoise.getPosition());
        tortoise.setPosition(3);
        tortoise.tortoiseMove(SLIP);
        assertEquals(1,tortoise.getPosition());
    }
    @Test
    void slowPlodMoveForTortoise(){
        assertEquals(1,tortoise.getPosition());
        tortoise.tortoiseMove(SLOW_PLOD);
        assertEquals(2,tortoise.getPosition());
    }
    @Test
    public void tortoiseFastPlodWithInteger(){
        assertEquals(1,tortoise.getPosition());
        tortoise.tortoiseMove(3);
        assertEquals(4,tortoise.getPosition());
    }
    @Test
    public void tortoiseSlowPlodWithInteger(){
        assertEquals(1,tortoise.getPosition());
        tortoise.tortoiseMove(9);
        assertEquals(2,tortoise.getPosition());
    }
    @Test
    public void tortoiseSliPlodWithInteger(){
        assertEquals(1,tortoise.getPosition());
        tortoise.setPosition(10);
        tortoise.tortoiseMove(6);
        assertEquals(4,tortoise.getPosition());
    }


}