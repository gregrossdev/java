package main.problem_solving.intermediate.cli_programs.c04_abstraction.paint_calculator.walls;

public class TriangleWall extends Wall {
    private int base;
    private int height;

    public TriangleWall(String name, String color, int base, int height) {
        super(name, color);

        this.base = base;
        this.height = height;
    }

    public int getArea() {
        return (base * height) / 2;
    }

    public String toString() {
        return String.format("%s (%dx%d) triangle", getName(), getBase(), getHeight());
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

}