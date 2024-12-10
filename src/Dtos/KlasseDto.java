package Dtos;

public class KlasseDto {

    private int klassenId;
    private String klassenName;
    private int ruestungsTypId;
    private int waffenTypId;
    private String beschreibung;
    private String einfuehrung;

    public KlasseDto() {

    }

    public KlasseDto(int klassenId, String klassenName, int ruestungsTypId, int waffenTypId, String beschreibung, String einfuehrung) {
        this.klassenId = klassenId;
        this.klassenName = klassenName;
        this.ruestungsTypId = ruestungsTypId;
        this.waffenTypId = waffenTypId;
        this.beschreibung = beschreibung;
        this.einfuehrung = einfuehrung;
    }

    public int getKlassenId() {
        return klassenId;
    }

    public void setKlassenId(int klassenId) {
        this.klassenId = klassenId;
    }

    public String getKlassenName() {
        return klassenName;
    }

    public void setKlassenName(String klassenName) {
        this.klassenName = klassenName;
    }

    public int getRuestungsTypId() {
        return ruestungsTypId;
    }

    public void setRuestungsTypId(int ruestungsTypId) {
        this.ruestungsTypId = ruestungsTypId;
    }

    public int getWaffenTypId() {
        return waffenTypId;
    }

    public void setWaffenTypId(int waffenTypId) {
        this.waffenTypId = waffenTypId;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getEinfuehrung() {
        return einfuehrung;
    }

    public void setEinfuehrung(String einfuehrung) {
        this.einfuehrung = einfuehrung;
    }
}
