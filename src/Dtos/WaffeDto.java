package Dtos;

public class WaffeDto {

    private int waffenId;
    private String bezeichnung;
    private int waffenTypId;
    private int itemLevel;
    private int mindestLevel;
    private double dps;
    private double tempo;

    public WaffeDto() {
        
    }

    public WaffeDto(int waffenId, String bezeichnung, int waffenTypId, int itemLevel, int mindestLevel, double dps, double tempo) {
        this.waffenId = waffenId;
        this.bezeichnung = bezeichnung;
        this.waffenTypId = waffenTypId;
        this.itemLevel = itemLevel;
        this.mindestLevel = mindestLevel;
        this.dps = dps;
        this.tempo = tempo;
    }

    public int getWaffenId() {
        return waffenId;
    }

    public void setWaffenId(int waffenId) {
        this.waffenId = waffenId;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getWaffenTypId() {
        return waffenTypId;
    }

    public void setWaffenTypId(int waffenTypId) {
        this.waffenTypId = waffenTypId;
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

    public double getDps() {
        return dps;
    }

    public void setDps(double dps) {
        this.dps = dps;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
}
