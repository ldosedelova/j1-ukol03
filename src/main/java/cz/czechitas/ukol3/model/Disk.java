package cz.czechitas.ukol3.model;

public class Disk {
    private long kapacita;
    private long vyuziteMisto;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public long setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
        return vyuziteMisto;
    }

    @Override
    public String toString() {
        return "Kapacita disku je "+ kapacita + " bajtů a využité místo " + vyuziteMisto + " bajtů.";
    }
}
