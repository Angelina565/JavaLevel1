package lesson6;

public class Cat extends Animals {
    @Override
    public boolean run(double length) {
        if (length > 200) return false;
        return super.run(length);
    }

    @Override
    public boolean jump(double height) {
        if (height > 2) return false;
        return super.jump(height);
    }

    @Override
    public boolean swim(double length) {
        System.out.print("Кошка не умеет плавать ");
        return false;
    }
}
