package lesson6;

public class Dog extends Animals {
    protected String breed;

    public Dog (String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public boolean run(double length) {
        if (length > 500) {
            System.out.print("собака столько не пробежит ");
            return false;
        }
        if (breed == "mongrel" && length > 500) {
            System.out.print("");
            return false;
        }

        if (breed == "badger-dog" && length > 300) {
            System.out.print("многовато для таксы");
            return false;
        }

        if (breed == "yorkshire terrier" && length > 150) {
            System.out.print("Йорки ручные собаки, а ты меня бегать заставляешь ");
            return false;
        }

        return super.run(length);
    }

    @Override
    public boolean jump(double height) {
        if (height > 0.5) {
            System.out.print("Слишком высокий прыжок для собаки ");
            return false;
        }
        return super.jump(height);
    }

    @Override
    public boolean swim(double length) {
        if (length > 10) {
            System.out.print("Я же собака, а не дельфин!!! ");
            return false;
        }
        return super.swim(length);
    }
}
