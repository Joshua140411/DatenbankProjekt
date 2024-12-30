package Dtos;

public class RolleDto
{
    private int rolleID;
    private String rollenName;

    public RolleDto(int rolleID, String name) {
        this.rolleID = rolleID;
        this.rollenName = name;
    }

    public RolleDto() {
    }

    public int getRolleID() {
        return rolleID;
    }

    public void setRolleID(int rolleID) {
        this.rolleID = rolleID;
    }

    public String getRollenName() {
        return rollenName;
    }

    public void setRollenName(String rollenName) {
        this.rollenName = rollenName;
    }
}
