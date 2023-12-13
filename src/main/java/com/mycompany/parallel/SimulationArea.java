
package com.mycompany.parallel;


import javax.swing.*;
import java.awt.*;
import java.util.Random;




public class SimulationArea extends JPanel {
    private int numPoints;
    private JLabel pointsLabel;

    public SimulationArea(JPanel placeholder) {
        this.setLayout(new BorderLayout());

        // Create a JLabel to display points
        pointsLabel = new JLabel();
        this.add(pointsLabel, BorderLayout.CENTER);

        // Rest of your code
        placeholder.setVisible(false);
        this.setBounds(placeholder.getBounds());
        this.setBorder(placeholder.getBorder());
        System.out.println(this.getBounds());
    }

    public void generateRandomPoints(int numPoints) {
        this.numPoints = numPoints; // Adjust the number of points as needed
        Random random = new Random();
        
        int width = Math.abs(getWidth());
        int height = Math.abs(getHeight());


        StringBuilder pointsText = new StringBuilder("<html>");

        for (int i = 0; i < numPoints; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            pointsText.append("(").append(x).append(", ").append(y).append(")<br>");
        }

        pointsText.append("</html>");
        pointsLabel.setText(pointsText.toString());
    }
}

