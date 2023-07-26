package raceCourseTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import raceCourse.Hare;
import tortoioseAndHare.HareMoveTypes;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class HareTest {
  private Hare ehoro;

  @BeforeEach

    public void setUp(){
      ehoro = new Hare();
  }

  @Test
    public void hareSleep(){
      assertEquals(1, ehoro.getPosition());
      ehoro.move(HareMoveTypes.SLEEP);
      assertEquals(1,ehoro.getPosition());
  }

    @Test
    public void hareBigHop(){
        assertEquals(1, ehoro.getPosition());
        ehoro.move(HareMoveTypes.BIG_HOP);
        assertEquals(10,ehoro.getPosition());
    }

  @Test
  public void bigSlipCloseToStart(){
    ehoro.setPosition(5);
    assertEquals(5, ehoro.getPosition());
    ehoro.move(HareMoveTypes.BIG_SLEEP);
    assertEquals(3,ehoro.getPosition());
  }
  @Test
  public void haresmallHop(){

    assertEquals(1, ehoro.getPosition());
    ehoro.move(HareMoveTypes.SMALL_HOP);
    assertEquals(2,ehoro.getPosition());
  }

  @Test
  public void haresmallslip(){
    ehoro.setPosition(7);
    assertEquals(5, ehoro.getPosition());
    ehoro.move(HareMoveTypes.SMALL_SLIP);
    assertEquals(2,ehoro.getPosition());
  }

  @Test
  public void hareSleepWithIntegerMove(){
    assertEquals(1, ehoro.getPosition());
    ehoro.move(2);
    assertEquals(1,ehoro.getPosition());
  }

  @Test
  public void hareBigHopWithIntegerMonve(){
    assertEquals(1, ehoro.getPosition());
    ehoro.move(15);
    assertEquals(10,ehoro.getPosition());
  }


}