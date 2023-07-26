package tortoioseAndHare.contenders;

import tortoioseAndHare.enums.TortoiseMoveType;

import static tortoioseAndHare.enums.TortoiseMoveType.*;

public class Tortoise {
    private int position = 1;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void tortoiseMove(TortoiseMoveType moveType){
        if(moveType == FAST_PLOD){
            this.position += 3;
        } else if (moveType == SLIP) {
            this.position -= 6;
            if(this.position < 1){
                this.position = 1;
            }
        }
        else if(moveType == SLOW_PLOD){
            this.position += 1;
        }
    }
    public void tortoiseMove(int move){
        if(move >= 1 && move <= 5){
            this.tortoiseMove(FAST_PLOD);
        } else if (move >= 8 && move <= 10) {
            this.tortoiseMove(SLOW_PLOD);
        } else if (move >= 6 && move <= 7) {
            this.tortoiseMove(SLIP);
        }
    }

}
