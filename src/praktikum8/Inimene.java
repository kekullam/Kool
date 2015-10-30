package praktikum8;

/**
 * Created by margus@workstation on 23.10.2015.
 */
public class Inimene {

    private String name;
    private int age;

    /**
     * constructor
     * @param name nimi
     * @param age vanus
     */
    public Inimene(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return name + " " + age;
    }
}