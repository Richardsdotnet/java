package raceCourse;

import tortoioseAndHare.HareMoveTypes;

import java.math.BigDecimal;

public class Hare {
int position = BigDecimal.ONE.intValue();

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void move(HareMoveTypes moveType){
        if(moveType.equals(HareMoveTypes.BIG_HOP)){
            this.position += 9;
        } else if (moveType.equals(HareMoveTypes.BIG_SLEEP)) {
            this.position -= 12;
            if(this.position < 1){
                this.position = BigDecimal.ONE.intValue();
            }
        }

    }

    public void move(int move){
        // do nothing for 1 or 2
        if(move >= 3 && move <= 4){
            move(HareMoveTypes.BIG_HOP);
        } else if (move == 5) {

        }
    }
}
