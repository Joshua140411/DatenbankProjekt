package Dtos;

public class npcDto
{
    private int npcID;
    private String name;
    private int volk;
    private String ambitionen;

    public npcDto(int npcID, String name, int volk, String ambitionen) {
        this.npcID = npcID;
        this.name = name;
        this.volk = volk;
        this.ambitionen = ambitionen;
    }

    public npcDto() {
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
}
