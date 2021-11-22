package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.setName("Rex");
        rex.setBreed ("Labrador");
        String breed =rex.getBreed();
        rex.age = 1;
        System.out.println(rex.getName());
        System.out.println(rex.getBreed());
        System.out.println(rex.age);
        rex.play();
        rex.setName("Blackie");
        System.out.println(rex.getName());

        Dog freddie = new Dog();
        freddie.setName("Freddie");
        System.out.println(freddie.getName());



        Dog max = new Dog();
        max.setName("Max");
        System.out.println(max.getName());


        Persian tommy = new Persian();
        tommy.setName("Tommy");

        Girl chica = new Girl();
        chica.setName("Sara");
        chica.setNationality("American");
        chica.colorOfHair ="Blonde";
        chica.colorSkin = "White";
        chica.heightInCm = 120;
        chica.age = 10;
        chica.weight = 35;
        System.out.println(chica.getName());
        System.out.println(chica.getNationality());
        System.out.println(chica.colorOfHair);
        System.out.println(chica.colorSkin);
        System.out.println(chica.heightInCm);
        System.out.println(chica.age);
        System.out.println(chica.weight);

        Veterinary vet = new Veterinary();
        vet.name = "Liam";
        vet.nationality ="Chinese";
        vet.colorOfHair ="Black";
        vet.colorSkin = "Yellow";
        vet.heightInCm = 170;
        vet.age = 30;
        vet.weight = 80;
        System.out.println(vet.name);
        System.out.println(vet.nationality);
        System.out.println(vet.colorOfHair);
        System.out.println(vet.colorSkin);
        System.out.println(vet.heightInCm);
        System.out.println(vet.age);
        System.out.println(vet.weight);
    }
}
