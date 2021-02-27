package io.rhpatrick.test;

public class ReleaseTester {

    int x, y;

    public ReleaseTester() {
        x = 0;
        y = 0;
    }

    public ReleaseTester(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int add() {
        return getX() + getY();
    }

    public int subtract() {
        return getX() - getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
