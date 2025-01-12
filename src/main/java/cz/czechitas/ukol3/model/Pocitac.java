package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    private long velikost;
    private long vyuziteMisto;

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public long getVelikost() {
        return velikost;
    }

    public void setVelikost(long velikost) {
        this.velikost = velikost;
    }

    @Override
    public String toString() {
        return "Procesor:" + cpu + ",paměť: " + ram + ",disk:  " + pevnyDisk;
    }

    public void zapniSe() {
        if (ram == null || pevnyDisk == null || cpu==null ) {
            System.err.println("Počítač nelze zapnout, chybí důležitá součást PC!");
            return;
        }
        if(this.jeZapnuty == true){
            System.out.println("Počítač nelze podruhé zapnout.");
        }
        else{
            System.out.println("Počítač je úspěšně zapnutý.");
            this.jeZapnuty = true;
        }
    }

    public boolean jeZapnuty() {
        if (jeZapnuty==true){
            System.out.println("Počítač je zapnutý.");
            return this.jeZapnuty = true;
        }
        else{
            System.out.println("počítač je vypnutý.");
            return this.jeZapnuty = false;
        }
    }

    public void vypniSe(){
        if (jeZapnuty == true){
            System.out.println("Počítač se vypnul.");
            this.jeZapnuty = false;
            return;
        }
    }

    public void vytvorSouborOVelikosti(long velikost){
        if(jeZapnuty == true) {
            vyuziteMisto = pevnyDisk.getVyuziteMisto() + velikost;
            if (vyuziteMisto > pevnyDisk.getKapacita()) {
                System.err.println("Soubor je moc velký!!" + vyuziteMisto + " bajtů");
                vyuziteMisto = pevnyDisk.getVyuziteMisto();
                return;
            }
            if (vyuziteMisto < pevnyDisk.getKapacita()) {
                System.out.println("Nová hodnota využítého místa je: " + vyuziteMisto + " bajtů");
            }
        }
    }

    public void vymazSouboryOVelikosti(long velikost){
        if(jeZapnuty == true){
            vyuziteMisto = pevnyDisk.getVyuziteMisto() - velikost;
            if (vyuziteMisto < 0){
                System.err.println("Soubor nemůže být smazán!!!");
                vyuziteMisto = pevnyDisk.getVyuziteMisto();
                return;
            }
            if(vyuziteMisto > 0){
                System.out.println("Soubor byl smazán. Nová hodnota využitého místa je "+ vyuziteMisto + " bajtů.");
            }
        }
    }

}


