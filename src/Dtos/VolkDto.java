package Dtos;

public class VolkDto
{
    private int VolkID;
    private String Name;
    private String Zugehoerigkeit;
    private int Hauptsitz;
    private String Reittier;
    private int anfuehrer;

    public VolkDto(int volkID, String name, String zugehoerigkeit, int hauptsitz, String reittier, int anfuehrer) {
        VolkID = volkID;
        Name = name;
        Zugehoerigkeit = zugehoerigkeit;
        Hauptsitz = hauptsitz;
        Reittier = reittier;
        this.anfuehrer = anfuehrer;
    }

    public VolkDto() {
    }

    public int getVolkID() {
        return VolkID;
    }

    public void setVolkID(int volkID) {
        VolkID = volkID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getZugehoerigkeit() {
        return Zugehoerigkeit;
    }

    public void setZugehoerigkeit(String zugehoerigkeit) {
        Zugehoerigkeit = zugehoerigkeit;
    }

    public int getHauptsitz() {
        return Hauptsitz;
    }

    public void setHauptsitz(int hauptsitz) {
        Hauptsitz = hauptsitz;
    }

    public String getReittier() {
        return Reittier;
    }

    public void setReittier(String reittier) {
        Reittier = reittier;
    }

    public int getAnfuehrer() {
        return anfuehrer;
    }

    public void setAnfuehrer(int anfuehrer) {
        this.anfuehrer = anfuehrer;
    }

    @Override
    public String toString() {
        return "ID: " + getVolkID() + ", Name: " + getName();
    }
}
