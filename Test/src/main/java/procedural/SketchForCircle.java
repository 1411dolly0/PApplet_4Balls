package procedural;

import processing.core.PApplet;

public class SketchForCircle extends PApplet {
    public static final int WIDTH_OF_WINDOW = 1000;
    public static final int HEIGHT_OF_WINDOW = 1000;
    public static final int DIAMETER_OF_BALL = 20;

    int STARTING_POINT_BALL_1 = 0;
    int STARTING_POINT_BALL_2 = 0;
    int STARTING_POINT_BALL_3 = 0;
    int STARTING_POINT_BALL_4 = 0;

    int[] BALL_NUMBER = {1, 2, 3, 4};
    int BALL_COUNT = BALL_NUMBER.length + 1;


    @Override
    public void settings() {
        size(WIDTH_OF_WINDOW, HEIGHT_OF_WINDOW);
        super.settings();
    }

    @Override
    public void draw() {
        for (int number : BALL_NUMBER) {
            drawCircle(number);
        }
    }

    private void drawCircle(int ballNumber) {
        switch (ballNumber) {
            case 1:
                ellipse(STARTING_POINT_BALL_1 += ballNumber, getBallHeight(ballNumber), DIAMETER_OF_BALL, DIAMETER_OF_BALL);
                break;
            case 2:
                ellipse(STARTING_POINT_BALL_2 += ballNumber, getBallHeight(ballNumber), DIAMETER_OF_BALL, DIAMETER_OF_BALL);
                break;
            case 3:
                ellipse(STARTING_POINT_BALL_3 += ballNumber, getBallHeight(ballNumber), DIAMETER_OF_BALL, DIAMETER_OF_BALL);
                break;
            case 4:
                ellipse(STARTING_POINT_BALL_4 += ballNumber, getBallHeight(ballNumber), DIAMETER_OF_BALL, DIAMETER_OF_BALL);
                break;
            default:
                break;
        }

    }

    private int getBallHeight(int ballNumber) {
        return (WIDTH_OF_WINDOW * ballNumber) / BALL_COUNT;
    }

}
