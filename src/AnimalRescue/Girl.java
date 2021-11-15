package AnimalRescue;

public class Girl {
    byte age ;
    float weight ;
    int heightInCm ;
    String name ;
    String colorSkin;
    String nationality;
    String colorOfHair;
    public String getNationality(){
        return nationality;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
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
        System.out.println("Hello! ");
    }

    public void play(){
        System.out.println("Playing hide and seek...");
    }


}
