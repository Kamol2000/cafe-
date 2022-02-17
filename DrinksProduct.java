package by.cafe.models.product;

import by.cafe.models.Employee;
import by.cafe.models.Ingredient;
import by.cafe.models.Technic;

import java.util.Arrays;

public class DrinksProduct extends Product{
    private Ingredient[] recipe;
    private Technic technic;
    private Employee barista;
    private int cooking_time;
    private boolean damaged;

    public DrinksProduct(Ingredient[] recipe, Technic technic, Employee barista, int cooking_time, boolean damaged) {
        this.recipe = recipe;
        this.technic = technic;
        this.barista = barista;
        this.cooking_time = cooking_time;
        this.damaged = damaged;
    }

    public DrinksProduct(int cost, String name, Ingredient[] recipe, Technic technic, Employee barista, int cooking_time, boolean damaged) {
        super(cost, name);
        this.recipe = recipe;
        this.technic = technic;
        this.barista = barista;
        this.cooking_time = cooking_time;
        this.damaged = damaged;
    }

    public Ingredient[] getRecipe() {
        return recipe;
    }

    public void setRecipe(Ingredient[] recipe) {
        this.recipe = recipe;
    }

    public Technic getTechnic() {
        return technic;
    }

    public void setTechnic(Technic technic) {
        this.technic = technic;
    }

    public Employee getBarista() {
        return barista;
    }

    public void setBarista(Employee barista) {
        this.barista = barista;
    }

    public int getCooking_time() {
        return cooking_time;
    }

    public void setCooking_time(int cooking_time) {
        this.cooking_time = cooking_time;
    }


    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    @Override
    public String toString() {
        return "DrinksProduct: " +
                "recipe: " + Arrays.toString(recipe) +
                ", technic: " + technic +
                ", barista: " + barista +
                ", cooking time: " + cooking_time +
                ", damaged: " + damaged;
    }
}
