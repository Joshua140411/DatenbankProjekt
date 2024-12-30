package Dtos;

public class RuestungstypDto
{
    private int ruestungstypID;
    private String bezeichnung;

    public RuestungstypDto(int ruestungstypID, String ruestungstypName) {
        this.ruestungstypID = ruestungstypID;
        this.bezeichnung = ruestungstypName;
    }

    public RuestungstypDto() {
    }

    public int getRuestungstypID() {
        return ruestungstypID;
    }

    public void setRuestungstypID(int ruestungstypID) {
        this.ruestungstypID = ruestungstypID;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
