package com.javarush.games.snake;

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {

    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private Snake snake;
    private int turnDelay;
    private Apple apple;


    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();

    }

    private void createGame() {
        this.snake = new Snake(WIDTH / 2, HEIGHT / 2);
        createNewApple();
        drawScene();
        this.turnDelay = 300;
        setTurnTimer(this.turnDelay);

    }

    private void drawScene() {

        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellValueEx(x, y, Color.AZURE, "");
            }
        }
        snake.draw(this);
        apple.draw(this);
    }

    public void onKeyPress(Key key) {
        if (Key.LEFT == key) {
            snake.setDirection(Direction.LEFT);
        } else if (Key.RIGHT == key) {
            snake.setDirection(Direction.RIGHT);
        } else if (Key.UP == key) {
            snake.setDirection(Direction.UP);
        } else if (Key.DOWN == key) {
            snake.setDirection(Direction.DOWN);
        }
    }

    @Override
    public void onTurn(int step) {
        snake.move(apple);
        if (!apple.isAlive) {
            createNewApple();
        }
        drawScene();
    }


    private void createNewApple() {
        apple = new Apple(getRandomNumber(WIDTH), getRandomNumber(HEIGHT));
    }
}
