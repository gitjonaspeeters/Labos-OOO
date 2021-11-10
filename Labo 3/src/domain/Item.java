package domain;

public class Item {
    private State uitleenbaar;
    private State uitgeleend;
    private State verwijderd;
    private State beschadigd;

    private double prijs;
    private int id;
    private State state;

    public Item(State uitleenbaar, State uitgeleend, State verwijderd, State beschadigd) {
        this.uitleenbaar = uitleenbaar;
        this.uitgeleend = uitgeleend;
        this.verwijderd = verwijderd;
        this.beschadigd = beschadigd;
    }

    public State getUitleenbaar() {
        return uitleenbaar;
    }

    public void setUitleenbaar(State uitleenbaar) {
        this.uitleenbaar = uitleenbaar;
    }

    public State getUitgeleend() {
        return uitgeleend;
    }

    public void setUitgeleend(State uitgeleend) {
        this.uitgeleend = uitgeleend;
    }

    public State getVerwijderd() {
        return verwijderd;
    }

    public void setVerwijderd(State verwijderd) {
        this.verwijderd = verwijderd;
    }

    public State getBeschadigd() {
        return beschadigd;
    }

    public void setBeschadigd(State beschadigd) {
        this.beschadigd = beschadigd;
    }
}
