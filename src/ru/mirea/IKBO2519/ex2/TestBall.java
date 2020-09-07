package ru.mirea.IKBO2519.ex2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(1,2);
        Ball ball2 = new Ball(6,7);
        Ball ball3 = new Ball(123,412);
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
        ball1.move(123,435);
        ball2.move(987,235);
        ball3.move(876,2);
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}