package AnimalRescue;

public class Animal {
    private byte age ;
    private float weight ;
    private int heightInCm ;
    private String name ;
    private String color;

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(){
        System.out.println("Eating");
    }

    public void sleep(){
        System.out.println("zzz");
    }

    public void play(){
        System.out.println("playing");
    }

    public void speak(){
        System.out.println("aaa");
    }
}
