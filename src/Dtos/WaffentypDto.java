package Dtos;

public class WaffentypDto
{
    private int waffentypID;
    private String bezeichnung;

    public WaffentypDto(int waffentypID, String waffentypName) {
        this.waffentypID = waffentypID;
        this.bezeichnung = waffentypName;
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
}
