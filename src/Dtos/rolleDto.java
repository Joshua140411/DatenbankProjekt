package Dtos;

public class rolleDto
{
    private int rolleID;
    private String rollenName;

    public rolleDto(int rolleID, String name) {
        this.rolleID = rolleID;
        this.rollenName = name;
    }

    public rolleDto() {
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
