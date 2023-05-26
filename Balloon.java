import java.awt.Color;

/**
* This file contains the balloon class.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-05-25
*/
public class Balloon {
    private int xpos;
    private int ypos;
    private Color color;
    private Boolean isPopped;
    private int id;

    /**
    * The constructor.
    *
    * @param xPosition from main
    * @param yPosition from main
    * @param color1 from main
    * @param idFromMain from main
    */
    public Balloon(int xPosition, int yPosition,
        Color color1, int idFromMain) {
        isPopped = false;
        xpos = xPosition;
        ypos = yPosition;
        color = color1;
        id = idFromMain;
    }

    /**
    * To move the balloon.
    *
    * @param xChange from main
    * @param yChange from main
    */
    public void moveBalloon(int xChange, int yChange) {
        xpos = xpos + xChange;
        ypos = ypos + yChange;
    }

    /**
    * To change the color.
    *
    * @param newColor from main
    */
    public void colorChange(Color newColor) {
        color = newColor;
    }

    /**
    * To pop the balloon.
    *
    */
    public void pop() {
        isPopped = true;
    }

    /**
    * Access method.
    *
    * @return requested variable.
    */
    public String getPos() {
        return xpos + ", " + ypos;
    }

    /**
    * Access method.
    *
    * @return requested variable.
    */
    public Boolean getStatus() {
        return isPopped;
    }

    /**
    * Access method.
    *
    * @return requested variable.
    */
    public int getX() {
        return xpos;
    }

    /**
    * Access method.
    *
    * @return requested variable.
    */
    public int getY() {
        return ypos;
    }

    /**
    * Access method.
    *
    * @return requested variable.
    */
    public Color getColor() {
        return color;
    }
}
