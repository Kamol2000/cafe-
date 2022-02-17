package by.cafe.models;

public class Ingredient {
    private String name;
    private int num;

    public Ingredient() {
    }

    public Ingredient(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Ingredient: " +
                "name: " + name +
                ", num: " + num;
    }
}
