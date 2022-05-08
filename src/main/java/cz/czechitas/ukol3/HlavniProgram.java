package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        System.out.println("Program spuštěn.");

        Pocitac lenkyPocitac;
        lenkyPocitac = new Pocitac();

        Pamet lenkyPamet = new Pamet();
        lenkyPamet.setKapacita(4_000_000_000L);
        System.out.println(lenkyPamet.toString());

        Procesor lenkyProcesor = new Procesor();
        lenkyProcesor.setRychlost(2_700_000_000_000L);
        lenkyProcesor.setVyrobce("Intel");
        System.out.println(lenkyProcesor.toString());

        Disk lenkyDisk = new Disk();
        lenkyDisk.setKapacita(119_932_973_056L);
        lenkyDisk.setVyuziteMisto(97_016_714_312L);
        System.out.println(lenkyDisk.toString());

        lenkyPocitac.setCpu(lenkyProcesor);
        lenkyPocitac.setRam(lenkyPamet);
        lenkyPocitac.setPevnyDisk(lenkyDisk);
        System.out.println(lenkyPocitac.toString());

        lenkyPocitac.zapniSe();
        lenkyPocitac.zapniSe();
        lenkyPocitac.vytvorSouborOVelikosti(97_016_714_312L);
        lenkyPocitac.vytvorSouborOVelikosti(1L);
        lenkyPocitac.vymazSouboryOVelikosti(229_932_973_056L);
        lenkyPocitac.vymazSouboryOVelikosti(312L);
    }
}
