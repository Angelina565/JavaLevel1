package lesson7;

import java.util.Random;

public class Cats {
    private String name;
    private int appetite;
    private int satiety = 0;

    public Cats (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public Cats (String name) {this.name = name;}

    public void eat (Plate plate) {
        if (appetite <= plate.getFood()) {
            plate.decreaseFood(appetite);
            satiety = appetite;
        }
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatisfied () {
        if (satiety == appetite) {
            System.out.println("эта кошка наелась");
            return true;
        } else {
            System.out.println("голодная кошка");
            return false;
        }
    }
}

class Plate {
    private int food;

    public Plate (int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void infoPlate () {
        if (getFood() <0) {
            System.out.println("В тарелке не может быть отрицательное количество еды!");
        }
        System.out.println("plate: " + food);
    }

    public void decreaseFood (int food) {
            this.food -= food;
    }

    public void addFood (int food) {
        this.food +=food;
    }
}

class Main {
    public static void main(String[] args) {

//        1 вариант создания кошек
        Cats cat1 = new Cats("Barsik", 10);
        Cats cat2 = new Cats("Murzik");
        Cats cat3 = new Cats("Marsik", 7);
        Cats cat4 = new Cats("Murchator", 13);
        Plate plate = new Plate(40);
        plate.infoPlate();
        cat1.eat(plate);
        System.out.print(cat1.getName() + ": ");
        cat1.isSatisfied();

        cat2.setAppetite(10);
        cat2.eat(plate);
        System.out.print(cat2.getName() + ": ");
        cat2.isSatisfied();

        cat3.eat(plate);
        System.out.print(cat3.getName() + ": ");
        cat3.isSatisfied();

        plate.addFood(10);

        cat4.eat(plate);
        System.out.print(cat4.getName() + ": ");
        cat4.isSatisfied();

//        2й вариант создания кошек

        Cats [] cats = new Cats[3];
        cats[0] = new Cats("Busya");
        cats[1] = new Cats("Nusha");
        cats[2] = new Cats("Furya");


        for (int i = 0; i < cats.length ; i++) {
            int temp = new Random().nextInt(15);
            cats[i].setAppetite(temp);
            cats[i].eat(plate);
            System.out.print(cats[i].getName() + ": ");
            cats[i].isSatisfied();
            if (plate.getFood() < 5) {
                plate.addFood(10);
            }
        }
    }
}