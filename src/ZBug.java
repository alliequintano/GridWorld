/**
 * Created by Allie on 9/15/14.
 */

import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
    private int steps;
    private int sideLength;

    /**
     * bug draws a z starting in top left corner - must be facing east to begin
     * does not move after completed
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
        // turn bug to face east to begin
        turn();
        turn();
    }

    public void act()
    {
        if (moveLength(sideLength) == true) {
            sharpTurn(3);
            if (moveLength(sideLength) == true) {
               sharpTurn(5);
               moveLength(sideLength);
            }
        }
    }

    public boolean moveLength(int length){
        steps = 0;
        sideLength = length;

         while (steps < sideLength && canMove()) {
             move();
             steps++;
             //System.out.println(steps);
         }

        if (steps == sideLength) {
            return true;
        }
        else {
            return false;
        }

    }

    public void sharpTurn(int n){
        while (n != 0) {
            turn();
            n--;
        }
    }
}
