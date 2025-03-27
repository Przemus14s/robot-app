package example.com;

import java.awt.*;
import java.awt.event.InputEvent;

public class Main3 {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        Color green = new Color(75, 219, 106);
        int x = 500;
        int y = 400;
        while (true){
            Color pixelColor = robot.getPixelColor(x, y);
            if (pixelColor.equals(green)){
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.delay(50);
            }
        }
    }
}
