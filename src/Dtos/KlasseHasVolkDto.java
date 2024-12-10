package Dtos;

public class KlasseHasVolkDto {

    private int klassenId;
    private int volkId;

    public KlasseHasVolkDto() {

    }

    public KlasseHasVolkDto(int klassenId, int volkId) {
        this.klassenId = klassenId;
        this.volkId = volkId;
    }

    public int getKlassenId() {
        return klassenId;
    }

    public void setKlassenId(int klassenId) {
        this.klassenId = klassenId;
    }

    public int getVolkId() {
        return volkId;
    }

    public void setVolkId(int volkId) {
        this.volkId = volkId;
    }
}
