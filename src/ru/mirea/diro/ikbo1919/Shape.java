package ru.mirea.diro.ikbo1919;

public class Shape {
    private int numberOfShapes;
    private String name;
    private int lenghtOfShape;

    public Shape(int numberOfShapes, String name, int lenghtOfShape) {
        this.numberOfShapes = numberOfShapes;
        this.name = name;
        this.lenghtOfShape = lenghtOfShape;
    }


    public void setNumberOfShapes(int numberOfShapes) {
        this.numberOfShapes = numberOfShapes;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "numberOfShapes=" + numberOfShapes +
                ", name='" + name + '\'' +
                ", lenghtOfShape=" + lenghtOfShape +
                '}';
    }
    public int getSquare() {
        return numberOfShapes*lenghtOfShape;
    }
}
