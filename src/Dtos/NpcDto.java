package Dtos;

public class NpcDto
{
    private int npcID;
    private String name;
    private int volk;
    private String ambitionen;
    private String volkBezeichnug;

    public NpcDto(int npcID, String name, int volk, String ambitionen, String volkBezeichnug) {
        this.npcID = npcID;
        this.name = name;
        this.volk = volk;
        this.ambitionen = ambitionen;
        this.volkBezeichnug = volkBezeichnug;
    }

    public NpcDto() {
    }

    public int getNpcID() {
        return npcID;
    }

    public void setNpcID(int npcID) {
        this.npcID = npcID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolk() {
        return volk;
    }

    public void setVolk(int volk) {
        this.volk = volk;
    }

    public String getAmbitionen() {
        return ambitionen;
    }

    public void setAmbitionen(String ambitionen) {
        this.ambitionen = ambitionen;
    }

    public String getVolkBezeichnug(){return volkBezeichnug;}

    public void setVolkBezeichnug(String volkBezeichnug) {
        this.volkBezeichnug = volkBezeichnug;
    }

    @Override
    public String toString() {
        return "ID: " + getNpcID() + ", Name: " + getName() + ", Volk: " + getVolk() + ", Ambitionen: " + getAmbitionen();
    }

    public String allNpcByVolkIdToString() {
        return "ID: " + getNpcID() + ", Name: " + getName() + ", Ambitionen: " + getAmbitionen() + ", Volk: " + getVolkBezeichnug();
    }
}
