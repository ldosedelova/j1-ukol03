package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

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
            System.out.println("Počítač nelze podruhé zapnout");
        }
        else{
            System.out.println("Počítač je úspěšně zapnutý");
            this.jeZapnuty = true;
        }
    }

    public boolean jeZapnuty() {
        if (jeZapnuty==true){
            System.out.println("Počítač je zapnutý");
            return this.jeZapnuty = true;
        }
        else{
            System.out.println("počítač je vypnutý");
            return this.jeZapnuty = false;
        }
    }

    public void vypniSe(){
        if (jeZapnuty == true){
            System.out.println("Počítač se vypnul");
            this.jeZapnuty = false;
            return;
        }
    }
}


