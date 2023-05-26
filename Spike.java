/**
* This file contains the spike class.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-05-25
*/
public class Spike {
    public static final int YPOS = 0;
    private int xpos;

    /**
    * The constructor.
    *
    * @param xPosition from main
    */
    public Spike(int xPosition) {
        xpos = xPosition;
    }

    /**
    * To pop a balloon.
    *
    * @param balloon from main
    */
    public void popBalloon(Balloon balloon) {
        if (xpos == balloon.getX() && balloon.getY() == YPOS) {
            balloon.pop();
        }
    }

    /**
    * To move the spike.
    *
    * @param spaces from main
    */
    public void moveSpike(int spaces) {
        xpos = xpos + spaces;
    }

    /**
    * Access method.
    *
    * @return requested variable.
    */
    public int getX() {
        return xpos;
    }
}
