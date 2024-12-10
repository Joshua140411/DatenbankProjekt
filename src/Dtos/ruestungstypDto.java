package Dtos;

public class ruestungstypDto
{
    private int ruestungstypID;
    private String bezeichnung;

    public ruestungstypDto(int ruestungstypID, String ruestungstypName) {
        this.ruestungstypID = ruestungstypID;
        this.bezeichnung = ruestungstypName;
    }

    public ruestungstypDto() {
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
