package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.name = "Rex";
        rex.breed = "Labrador";
        rex.age = 1;
        System.out.println(rex.name);
        System.out.println(rex.breed);
        System.out.println(rex.age);
        rex.play();
        rex.name = "Blackie";
        System.out.println(rex.name);

        Dog freddie = new Dog();
        freddie.name = "Freddie";
        System.out.println(freddie.name);


        Dog max = new Dog();
        max.breed = "Bulldog";
        System.out.println(max.breed);

        Girl chica = new Girl();
        chica.name = "Sara";
        chica.nationality ="American";
        chica.colorOfHair ="Blonde";
        chica.colorSkin = "White";
        chica.heightInCm = 120;
        chica.age = 10;
        chica.weight = 35;
        System.out.println(chica.name);
        System.out.println(chica.nationality);
        System.out.println(chica.colorOfHair);
        System.out.println(chica.colorSkin);
        System.out.println(chica.heightInCm);
        System.out.println(chica.age);
        System.out.println(chica.weight);
    }
}
