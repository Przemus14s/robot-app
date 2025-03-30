package example.com;

import java.awt.*;

public class AutoScroller {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        robot.delay(3000);

        int scrollAmount = 5;
        int delayBetweenScrolls = 1000;

        for (int i = 0; i < scrollAmount; i++) {
            robot.mouseWheel(1);
            robot.delay(delayBetweenScrolls);
        }

        robot.delay(2000);

        for (int i = 0; i < scrollAmount; i++) {
            robot.mouseWheel(-1);
            robot.delay(delayBetweenScrolls);
        }

        System.out.println("Automatyczne przewijanie zakończone!");
    }
}

