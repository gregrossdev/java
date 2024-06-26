package main.problem_solving.intermediate.cli_programs.c04_abstraction.paint_calculator.walls;

public class SquareWall extends RectangleWall {
    public SquareWall(String name, String color, int side) {
        super(name, color, side, side);
    }

    public String toString() {
        return String.format("%s (%dx%d) square", getName(), getLength(), getHeight());
    }
}