package Dtos;

public class GebietDto
{
    private int gebietID;
    private String bezeichnung;
    private String kontinent;
    private String biom;
    private boolean istHauptstadt;
    private int obergebiet;

    public GebietDto(int gebietID, String bezeichnung, String kontinent, String biom, boolean istHauptstadt, int obergebiet) {
        this.gebietID = gebietID;
        this.bezeichnung = bezeichnung;
        this.kontinent = kontinent;
        this.biom = biom;
        this.istHauptstadt = istHauptstadt;
        this.obergebiet = obergebiet;
    }

    public GebietDto() {
    }

    public int getGebietID() {
        return gebietID;
    }

    public void setGebietID(int gebietID) {
        this.gebietID = gebietID;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getKontinent() {
        return kontinent;
    }

    public void setKontinent(String kontinent) {
        this.kontinent = kontinent;
    }

    public String getBiom() {
        return biom;
    }

    public void setBiom(String biom) {
        this.biom = biom;
    }

    public boolean isIstHauptstadt() {
        return istHauptstadt;
    }

    public void setIstHauptstadt(boolean istHauptstadt) {
        this.istHauptstadt = istHauptstadt;
    }

    public int getObergebiet() {
        return obergebiet;
    }

    public void setObergebiet(int obergebiet) {
        this.obergebiet = obergebiet;
    }

    public String gebietIdBezeichnungToString() {
        return "ID: " + getGebietID() + ", Bezeichnung: " + getBezeichnung();
    }
}