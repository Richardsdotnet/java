package raceCourseTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tortoioseAndHare.contenders.Hare;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static tortoioseAndHare.enums.HareMoveType.*;

class HareTest {
  private Hare hare;

  @BeforeEach
  void setUp(){
    hare = new Hare();
  }

  @Test
  void hareExists(){
    assertNotNull(hare);
  }
  @Test
  void hareStartsRaceFromSquareOne(){
    assertEquals(1, hare.getPosition());
  }
  @Test
  void sleepMoveForHare(){
    assertEquals(1, hare.getPosition());
    hare.hareMove(SLEEP);
    assertEquals(1, hare.getPosition());
  }
  @Test
  void bigHopMoveForHare(){
    assertEquals(1, hare.getPosition());
    hare.hareMove(BIG_HOP);
    assertEquals(10, hare.getPosition());
  }
  @Test
  void bigSlipMoveForHare(){
    assertEquals(1, hare.getPosition());
    hare.setPosition(20);
    hare.hareMove(BIG_SLIP);
    assertEquals(8, hare.getPosition());
  }
  @Test
  void smallHopMoveForHare(){
    assertEquals(1, hare.getPosition());
    hare.hareMove(SMALL_HOP);
    assertEquals(2, hare.getPosition());
  }


}