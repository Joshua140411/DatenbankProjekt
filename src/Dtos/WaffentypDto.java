package Dtos;

public class WaffentypDto
{
    private int waffentypID;
    private String bezeichnung;
    private String waffenBezeichnung;
    private double waffenDPS;

    public WaffentypDto(int waffentypID, String waffentypName, String waffenBezeichnung, double waffenDPS) {
        this.waffentypID = waffentypID;
        this.bezeichnung = waffentypName;
        this.waffenBezeichnung = waffenBezeichnung;
        this.waffenDPS = waffenDPS;
    }

    public WaffentypDto() {
    }

    public int getWaffentypID() {
        return waffentypID;
    }

    public void setWaffentypID(int waffentypID) {
        this.waffentypID = waffentypID;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getWaffenBezeichnung() {return waffenBezeichnung;}

    public void setWaffenBezeichnung(String waffenBezeichnung) {
        this.waffenBezeichnung = waffenBezeichnung;
    }

    public double getWaffenDPS() {
        return waffenDPS;
    }

    public void setWaffenDPS(double waffenDPS) {
        this.waffenDPS = waffenDPS;
    }

    @Override
    public String toString() {
        return "ID: " + getWaffentypID() + ", Bezeichnung: " + getBezeichnung() + ", WaffenBezeichnung: " + getWaffenBezeichnung();
    }
}
