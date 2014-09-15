/**
 * Created by Allie on 9/15/14.
 */
public class MyTermite extends Termite {

    public void act() {
        if (getGrid() == null)
            return;

        if (seeFlower()) {
            pickUpFlower();
        }
        if (hasFlower()) {
            dropFlower();
        }

        if (canMove()) {
            move();
        }
        randomTurn();
    }
}