package Dtos;

public class VolkDto
{
    private int volkID;
    private String name;
    private String zugehoerigkeit;
    private int hauptsitz;
    private String hauptsitzBezeichnung;
    private String reittier;
    private int anfuehrer;

    public VolkDto(int volkID, String name, String zugehoerigkeit, int hauptsitz, String hauptsitzBezeichnung, String reittier, int anfuehrer) {
        this.volkID = volkID;
        this.name = name;
        this.zugehoerigkeit = zugehoerigkeit;
        this.hauptsitz = hauptsitz;
        this.hauptsitzBezeichnung = hauptsitzBezeichnung;
        this.reittier = reittier;
        this.anfuehrer = anfuehrer;
    }

    public VolkDto() {
    }

    public int getVolkID() {
        return volkID;
    }

    public void setVolkID(int volkID) {
        this.volkID = volkID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZugehoerigkeit() {
        return zugehoerigkeit;
    }

    public void setZugehoerigkeit(String zugehoerigkeit) {
        this.zugehoerigkeit = zugehoerigkeit;
    }

    public int getHauptsitz() {
        return hauptsitz;
    }

    public void setHauptsitz(int hauptsitz) {
        this.hauptsitz = hauptsitz;
    }

    public String getReittier() {
        return reittier;
    }

    public void setReittier(String reittier) {
        this.reittier = reittier;
    }

    public int getAnfuehrer() {
        return anfuehrer;
    }

    public void setAnfuehrer(int anfuehrer) {
        this.anfuehrer = anfuehrer;
    }

    public String getHauptsitzBezeichnung() {return hauptsitzBezeichnung;}

    public void setHauptsitzBezeichnung(String hauptsitzBezeichnung) {this.hauptsitzBezeichnung = hauptsitzBezeichnung;}

    @Override
    public String toString() {
        return "ID: " + getVolkID() + ", Name: " + getName();
    }

    public String volkWithHauptsitzbezeichnungToString() {
        return "ID: " + getVolkID() + ", Name: " + getName() + ", Hauptsitz: " + getHauptsitzBezeichnung();
    }
}
