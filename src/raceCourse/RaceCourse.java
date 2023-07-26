package raceCourse;

public class RaceCourse {
    int [] raceCourse;

    public int[] getRaceCourse() {
        return raceCourse;
    }

    public void setRaceCourse(int[] raceCourse) {
        this.raceCourse = raceCourse;
    }

    public void race(Tortoise tortoise, Hare hare){
        System.out.println("Bang!!");
        System.out.println("And they are off!!");
        do{
            int tortoiseMove = MovePercentageGenerator.generateMove
        }
        while (tortoise.getPosition() < 70 || hare.getPosition() < 70){

        }
    }

    public void displayRaceCourse(Tortoise tortoise, Hare hare){
        for (int i = 1; i < raceCourse.length; i++) {
            if(i == 1 && tortoise.getPosition() == 1 && hare.getPosition() == 1){
                System.out.print("T  H ");
            }else if( i > 1 && tortoise.getPosition() == 1 && hare.position == 1) {
                System.out.println(" Ouch!!! ");
            }else {
                if(tortoise.getPosition() == 1){
                    System.out.println("T ");
                }else if(hare.getPosition() == 1){
                    System.out.print("H ");
                }else {
                    System.out.print("_");
                }
            }
        }
    }
}
