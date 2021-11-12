package AnimalRescue;

public class Dog {
    private String breed ;
    byte age ;
    float weight ;
    int heightInCm ;
    private String name ;
    String color;

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("zzZZ..(snore)");
    }

    public void speak(){
        System.out.println("Bark! ");
    }

    public void play(){
        System.out.println("Playing fetch...");
    }
}
