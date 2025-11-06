package questions;

import java.applet.Applet;
import java.awt.*;

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        // Set color and draw a line
        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 200, 50);
        g.drawString("Line", 100, 70);

        // Draw rectangle
        g.setColor(Color.BLUE);
        g.drawRect(50, 100, 100, 60);
        g.drawString("Rectangle", 70, 180);

        // Draw rounded rectangle
        g.setColor(Color.MAGENTA);
        g.drawRoundRect(200, 100, 100, 60, 20, 20);
        g.drawString("Rounded Rectangle", 200, 180);

        // Draw filled rectangle
        g.setColor(Color.GREEN);
        g.fillRect(50, 200, 100, 60);
        g.setColor(Color.BLACK);
        g.drawString("Filled Rectangle", 60, 280);

        // Draw filled rounded rectangle
        g.setColor(Color.ORANGE);
        g.fillRoundRect(200, 200, 100, 60, 20, 20);
        g.setColor(Color.BLACK);
        g.drawString("Filled Rounded Rectangle", 190, 280);

        // Draw circle
        g.setColor(Color.RED);
        g.drawOval(350, 100, 80, 80);
        g.drawString("Circle", 370, 200);

        // Draw filled ellipse
        g.setColor(Color.PINK);
        g.fillOval(350, 220, 120, 60);
        g.setColor(Color.BLACK);
        g.drawString("Filled Ellipse", 365, 300);
    }
}
