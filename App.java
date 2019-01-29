package lesson6;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog("Barbos", "mongrel");
        Dog dog2 = new Dog("Sosisochka", "badger-dog");
        Dog dog3 = new Dog("Pugovka","yorkshire terrier" );

        System.out.println("run: " + cat1.run(150));
        System.out.println("swim: " + cat2.swim(39));
        System.out.println("jump: " + dog1.jump(20));
        System.out.println("run: " + dog2.run(40));
        System.out.println("run: " + dog3.run(200));
        System.out.println("swim: " + dog1.swim(5));
    }

}
