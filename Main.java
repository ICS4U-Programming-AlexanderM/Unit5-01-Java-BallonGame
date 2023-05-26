import java.awt.Color;
/**
* This file contains the main class.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-05-25
*/

public final class Main {
    /**
    * For style checker.
    *
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private Main() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Print messages.
    *
    * @param args Unused
    */
    public static void main(String[] args) {
        // Create balloon.
        final Balloon balloonA = new Balloon(32, 41, Color.RED, 1);

        // Move balloon to place.
        System.out.println("Current location of balloon: " + balloonA.getPos());
        balloonA.moveBalloon(40, -41);
        System.out.println("New location: " + balloonA.getPos());

        // Change balloon color.
        System.out.println(balloonA.getColor());
        balloonA.colorChange(Color.BLUE);
        System.out.println(balloonA.getColor());

        // Create spike.
        final Spike spike = new Spike(52);

        // Move spike to balloon and pop ballon;
        System.out.println("Is the balloon popped? " + balloonA.getStatus());
        System.out.println("Spike position: " + spike.getX());
        // Equation to match xPos of balloon.
        spike.moveSpike(balloonA.getX() - spike.getX());
        System.out.println("New position: " + spike.getX());
        spike.popBalloon(balloonA);
        System.out.println("Is the balloon popped? " + balloonA.getStatus());
    }
}
