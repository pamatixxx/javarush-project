package com.javarush.games.snake;

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {

    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private Snake snake;
    private int turnDelay;
    private Apple apple;
    private boolean isGameStopped;
    private static final int GOAL = 28;
    private int score;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();

    }

    private void createGame() {
        turnDelay = 300;
        setTurnTimer(turnDelay);
        snake = new Snake(WIDTH / 2, HEIGHT / 2);
        createNewApple();
        isGameStopped = false;
        this.score = 0;
        setScore(this.score);
        drawScene();
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
        } else if (Key.SPACE == key && isGameStopped) {
            createGame();
        }
    }

    @Override
    public void onTurn(int step) {
        snake.move(apple);
        if (!apple.isAlive) {
            createNewApple();
            this.score += 5;
            setScore(this.score);
            turnDelay -= 10;
            setTurnTimer(turnDelay);
        }
        if (!snake.isAlive) {
            gameOver();
        }
        if (snake.getLength() > GOAL) {
            win();
        }
        drawScene();
    }



    private void createNewApple() {
        Apple newApple;
        do {
            int x = getRandomNumber(WIDTH);
            int y = getRandomNumber(HEIGHT);
            newApple = new Apple(x, y);
        } while (snake.checkCollision(newApple));
        apple = newApple;
    }


    private void gameOver() {
        isGameStopped = true;
        stopTurnTimer();
        showMessageDialog(Color.RED, "GAME OVER", Color.BLACK, 5);
    }


    private void win() {
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.RED, "YOU WIN", Color.BLACK, 5);
    }
}
