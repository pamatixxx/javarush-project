package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "⚫";
    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;

    public Snake(int x, int y) {
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    public void setDirection(Direction direction) {

        if ((this.direction == Direction.LEFT || this.direction == Direction.RIGHT) && snakeParts.get(0).x == snakeParts.get(1).x) {
            return;
        } else if ((this.direction == Direction.UP || this.direction == Direction.DOWN) && snakeParts.get(0).y == snakeParts.get(1).y) {
            return;
        }


        if (direction == Direction.RIGHT && this.direction == Direction.LEFT) return;
        else if (direction == Direction.LEFT && this.direction == Direction.RIGHT) return;
        else if (direction == Direction.UP && this.direction == Direction.DOWN) return;
        else if (direction == Direction.DOWN && this.direction == Direction.UP) return;
        this.direction = direction;
    }

    public void draw(Game game) {
        Color color = isAlive ? Color.BLACK : Color.RED;

        for (int i = 0; i < snakeParts.size(); i++) {
            GameObject part = snakeParts.get(i);
            String sign = (i != 0) ? BODY_SIGN : HEAD_SIGN;
            game.setCellValueEx(part.x, part.y, Color.NONE, sign, color, 75);
        }
    }

    public void move(Apple apple) {

        GameObject proxy = createNewHead();
        isAlive = !checkCollision(proxy);
        if (isAlive) {
            if (proxy.x >= SnakeGame.WIDTH
                    || proxy.x < 0
                    || proxy.y >= SnakeGame.HEIGHT
                    || proxy.y < 0) {
                isAlive = false;
                return;
            }

            snakeParts.add(0, proxy);
            if (proxy.x == apple.x && proxy.y == apple.y) {
                apple.isAlive = false;
            } else {
                removeTail();
            }
        }
    }

    public GameObject createNewHead() {
        GameObject head = snakeParts.get(0);
        if (direction == Direction.LEFT) {
            return new GameObject(head.x - 1, head.y); // влево
        } else if (direction == Direction.DOWN) {
            return new GameObject(head.x, head.y + 1);
        } else if (direction == Direction.UP) {
            return new GameObject(head.x, head.y - 1);
        } else {
            return new GameObject(head.x + 1, head.y);//вправо
        }
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }


    public boolean checkCollision(GameObject object) {
        for (int i = 0; i < snakeParts.size(); i++) {
            if (snakeParts.get(i).x == object.x && snakeParts.get(i).y == object.y) {
                return true;
            }
        }
        return false;
    }

    public int getLength() {
        return snakeParts.size();
    }
}
