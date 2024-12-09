package Dtos;

public class RuestungDto {
    private int ruestungsId;
    private String ausruestungsTyp;
    private int ruestungsTypId;
    private int itemLevel;
    private int mindestLevel;
    private int ruestungsPunkte;

    public RuestungDto() {}

    public RuestungDto(int ruestungsId, String ausruestungsTyp, int ruestungsTypId, int itemLevel, int mindestLevel, int ruestungsPunkte) {
        this.ruestungsId = ruestungsId;
        this.ausruestungsTyp = ausruestungsTyp;
        this.ruestungsTypId = ruestungsTypId;
        this.itemLevel = itemLevel;
        this.mindestLevel = mindestLevel;
        this.ruestungsPunkte = ruestungsPunkte;
    }

    public int getRuestungsId() {
        return ruestungsId;
    }

    public void setRuestungsId(int ruestungsId) {
        this.ruestungsId = ruestungsId;
    }

    public String getAusruestungsTyp() {
        return ausruestungsTyp;
    }

    public void setAusruestungsTyp(String ausruestungsTyp) {
        this.ausruestungsTyp = ausruestungsTyp;
    }

    public int getRuestungsTypId() {
        return ruestungsTypId;
    }

    public void setRuestungsTypId(int ruestungsTypId) {
        this.ruestungsTypId = ruestungsTypId;
    }

    public int getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(int itemLevel) {
        this.itemLevel = itemLevel;
    }

    public int getMindestLevel() {
        return mindestLevel;
    }

    public void setMindestLevel(int mindestLevel) {
        this.mindestLevel = mindestLevel;
    }

    public int getRuestungsPunkte() {
        return ruestungsPunkte;
    }

    public void setRuestungsPunkte(int ruestungsPunkte) {
        this.ruestungsPunkte = ruestungsPunkte;
    }
}
