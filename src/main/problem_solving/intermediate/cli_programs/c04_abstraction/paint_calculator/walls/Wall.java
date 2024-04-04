package main.problem_solving.intermediate.cli_programs.c04_abstraction.paint_calculator.walls;

public abstract class Wall {

    private String name;
    private String color;

    public abstract int getArea();

    public Wall(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

}
