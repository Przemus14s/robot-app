package example.com;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.security.Key;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Robot robot = new Robot();
//            robot.delay(5000);
//            robot.keyPress(KeyEvent.VK_1);
//            robot.keyRelease(KeyEvent.VK_1);
//            robot.delay(500);
//            robot.keyPress(KeyEvent.VK_1);
//            robot.keyRelease(KeyEvent.VK_1);
//            robot.delay(500);
//            robot.keyPress(KeyEvent.VK_2);
//            robot.keyRelease(KeyEvent.VK_2);
//            robot.delay(500);
//            System.out.println("Podaj tekst: ");
//            String message = scanner.nextLine();
//            typeText(robot, message);
//            runProgram(robot, "notepad");

            Rectangle rectangle = new Rectangle(800, 500);
            BufferedImage image = robot.createScreenCapture(rectangle);
            System.out.println("Podaj nazwe screenu");
            String title = scanner.nextLine();
            try {
                ImageIO.write(image, "jpg", new File(title + ".jpg"));
            } catch (IOException e) {
                System.err.println("Błąd zapisu obrazu");
                e.getMessage();
            }

        } catch (AWTException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void typeText(Robot robot, String text) {
        text = text.toUpperCase();
        char[][] polishChars = {{'Ą', 'A'}, {'Ć', 'C'}, {'Ę', 'E'}, {'Ż', 'Z'}, {'Ź', 'Z'}, {'Ń', 'N'}, {'Ó', 'O'}, {'Ś', 'S'}, {'Ł', 'L'}};
        boolean isPolish = false;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0 ; j < polishChars.length; j++){
                if (text.charAt(i) == polishChars[j][0]){
                    isPolish = true;
                    robot.keyPress(KeyEvent.VK_ALT_GRAPH);
                    robot.keyPress(polishChars[j][1]);
                    robot.keyRelease(KeyEvent.VK_ALT_GRAPH);
                    robot.keyRelease(polishChars[j][1]);
                    robot.delay(500);
                    break;
                }

            }
            if (!isPolish){
                robot.keyPress(text.charAt(i));
                robot.keyRelease(text.charAt(i));
                robot.delay(500);
            }
        }

    }

    public static void runProgram(Robot robot, String program){
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_R);
        robot.delay(1000);
        typeText(robot, program);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);
    }
}