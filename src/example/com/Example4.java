package example.com;

import java.awt.*;
import java.awt.event.InputEvent;

public class Example4 {
    public static void main(String[] args) throws AWTException {

        Robot robot = new Robot();
        robot.delay(3000);
        int startX = 500;
        int startY = 300;
        int sideLength = 100;

        robot.mouseMove(startX, startY);

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        robot.mouseMove(startX + sideLength, startY);
        robot.delay(500);
        robot.mouseMove(startX + sideLength, startY + sideLength);
        robot.delay(500);
        robot.mouseMove(startX, startY + sideLength);
        robot.delay(500);
        robot.mouseMove(startX, startY);
        robot.delay(500);

        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        System.out.println("Kwadrat został narysowany!");
    }
}