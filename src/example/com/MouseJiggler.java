package example.com;

import java.awt.*;

public class MouseJiggler {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        int delay = 5000;
        int moveDistance = 10;
        boolean direction = true;

        System.out.println("Mouse Jiggler uruchomiony. Przerywanie programu: Ctrl + C");

        while (true) {
            Point mousePosition = MouseInfo.getPointerInfo().getLocation();
            int newX = mousePosition.x + (direction ? moveDistance : -moveDistance);
            int newY = mousePosition.y;

            robot.mouseMove(newX, newY);
            direction = !direction;
            robot.delay(delay);
        }
    }
}