package example.com;

import java.awt.*;
import java.awt.event.InputEvent;

public class DoubleClicker {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        robot.delay(3000);

        int x = 600; 
        int y = 400;

        robot.mouseMove(x, y);
        performDoubleClick(robot);

        System.out.println("Podwójne kliknięcie zostało wykonane!");
    }

    public static void performDoubleClick(Robot robot) {
        for (int i = 0; i < 2; i++) {
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(100);
        }
    }
}