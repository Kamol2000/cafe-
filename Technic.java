package by.cafe.models;

public class Technic {
    private String tec_name;
    private int action_time;


    public Technic() {
    }

    public Technic(String tec_name, int action_time) {
        this.tec_name = tec_name;
        this.action_time = action_time;
    }


    public String getTec_name() {
        return tec_name;
    }

    public void setTec_name(String tec_name) {
        this.tec_name = tec_name;
    }

    public int getAction_time() {
        return action_time;
    }

    public void setAction_time(int action_time) {
        this.action_time = action_time;
    }


    @Override
    public String toString() {
        return "Technic: " +
                "tec_name: " + tec_name + '\'' +
                ", action_time: " + action_time;
    }
}
