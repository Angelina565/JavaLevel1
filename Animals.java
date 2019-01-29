package lesson6;

public class Animals {
    protected String name;

    public Animals (){
    }

    public Animals (String name) {
        this.name = name;
    }

    public boolean run (double length) {
        return true;
    }

    public boolean swim (double length) {
        return true;
    }

    public boolean jump (double height) {
        return true;
    }
}
