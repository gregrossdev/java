package main.problem_solving.intermediate.cli_programs.c04_abstraction.paint_calculator.walls;

public class RectangleWall extends Wall {

    private int length;
    private int height;

    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }

    public int getArea() {
        return length * height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return String.format("%s (%dx%d) rectangle", getName(), getLength(), getHeight());
    }

}