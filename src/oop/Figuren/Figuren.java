package oop.Figuren;

public class Figuren {
    private String name;

    public Figuren(String name) {
        this.name = name;

    }

    public void Name() {
        System.out.println("Der Name der Figur ist:" + getName());
    }

    public void Flaeche() {
        double Flaeche = 0;
        System.out.println("Der Flächeninhalt beträgt:" + Flaeche);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
