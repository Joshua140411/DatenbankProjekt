package Dtos;

public class ruestungstypDto
{
    private int ruestungstypID;
    private String bezeichnung;

    public ruestungstypDto(int ruestungstypID, String ruestungstypName) {
        this.ruestungstypID = ruestungstypID;
        this.bezeichnung = ruestungstypName;
    }
}
