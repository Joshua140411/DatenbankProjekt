package Dtos;

public class KlasseHasRolleDto {

    private int klassenId;
    private int rollenId;

    public KlasseHasRolleDto() {

    }

    public KlasseHasRolleDto(int klassenId, int rollenId) {
        this.klassenId = klassenId;
        this.rollenId = rollenId;
    }

    public int getKlassenId() {
        return klassenId;
    }

    public void setKlassenId(int klassenId) {
        this.klassenId = klassenId;
    }

    public int getRollenId() {
        return rollenId;
    }

    public void setRollenId(int rollenId) {
        this.rollenId = rollenId;
    }
}
