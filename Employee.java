package by.cafe.models;

public class Employee {
    private int character;
    private int lead_time;

    public Employee() {
    }

    public Employee(int character, int lead_time) {
        this.character = character;
        this.lead_time = lead_time;
    }


    public int getCharacter() {
        return character;
    }

    public void setCharacter(int character) {
        this.character = character;
    }

    public int getLead_time() {
        return lead_time;
    }

    public void setLead_time(int lead_time) {
        this.lead_time = lead_time;
    }


    public int performance() {
        if (character > 1) {
            lead_time = lead_time - ((lead_time/100) * (character*10));
        }
        return lead_time;
    }


    @Override
    public String toString() {
        return "Employee: " +
                "character: " + character +
                ", lead_time: " + lead_time;
    }
}
