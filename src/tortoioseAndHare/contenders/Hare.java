package tortoioseAndHare.contenders;

import tortoioseAndHare.enums.HareMoveType;

import static tortoioseAndHare.enums.HareMoveType.*;

public class Hare {
    private int position = 1;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void hareMove(HareMoveType moveType){
        if (moveType == BIG_HOP) {
            this.position += 9;
        }
        else if(moveType == BIG_SLIP){
            this.position -= 12;
            if(this.position < 1){
                this.position = 1;
            }
        } else if (moveType == SMALL_HOP) {
            this.position += 1;
        } else if (moveType == SMALL_SLIP) {
            this.position -= 2;
            if(this.position < 1){
                this.position = 1;
            }
        }
    }

}
