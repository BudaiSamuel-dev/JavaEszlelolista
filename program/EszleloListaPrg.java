package program;

import classes.Egitest;
import classes.Kettoscsillag;
import classes.MelysegObjektum;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EszleloListaPrg {

    private static final File FILE_IN_OBJ = new File("C:\\Dev\\FeladatForrasok\\BudaiS\\EszleloLista\\obj-adatok.txt");

    static void main(String[] args) {

        ArrayList<Egitest> egitestek = new ArrayList<>();

        try {
            Scanner fileScanner = new Scanner(FILE_IN_OBJ);

            while (fileScanner.hasNextLine()){
                String record = fileScanner.nextLine();

                if (!record.isEmpty()){
                    String[] data  = record.split("\\|");

                    String[] datum = data[0].split("\\.");
                    LocalDate megfigyelesDatuma = LocalDate.of(Integer.parseInt(datum[0]), Integer.parseInt(datum[1]), Integer.parseInt(datum[2]));
                    String nev = data[1];
                    String rektaszencio = data[2];
                    String deklinacio = data[3];

                    if (data[5].contains(" / ")){
                        egitestek.add(new Kettoscsillag(megfigyelesDatuma, nev, rektaszencio, deklinacio, data[4], data[5]));
                    }else {
                        egitestek.add(new MelysegObjektum(megfigyelesDatuma, nev, rektaszencio, deklinacio, data[4], data[5]));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("A fájl beolvasása során hiba lépett fel!");
            System.exit(0);
        }

        int kettoscsillagokSzama = 0;
        int melysegObjektumokSzama = 0;
        for (Egitest egitest : egitestek){
            if (egitest instanceof Kettoscsillag) {
                kettoscsillagokSzama++;
            } else {
                melysegObjektumokSzama++;
            }
        }

        System.out.printf("%d mélyég-objektumot, valamint %d kettőscsillagot figyelt meg az amatőrcsillagász!\n", melysegObjektumokSzama, kettoscsillagokSzama);

        boolean vanHianyoshonap = false;
        for (int i = 1; i < 13; i++) {
            for (Egitest egitest : egitestek){
                if (egitest.getMegfigyelesDatuma().getMonthValue() != i){
                    vanHianyoshonap = true;
                }
            }
        }

        if (vanHianyoshonap){
            System.out.println("Van(nak) hiányos hónap(ok)!");
        }else {
            System.out.println("Nincs hiányos hónap!");
        }

        try {
            Scanner nevScanner = new Scanner(new File("C:\\Dev\\FeladatForrasok\\BudaiS\\EszleloLista\\csillagképek.txt"));

            while (nevScanner.hasNextLine()){
                String record = nevScanner.nextLine();

                if(!record.startsWith("*") && !record.isEmpty()){
                    String[] nevek = record.split(",");

                    for (Egitest egitest : egitestek){
                        if (egitest instanceof MelysegObjektum){
                            if (((MelysegObjektum) egitest).getCsillagkepRovidites().equals(nevek[1])){
                                ((MelysegObjektum) egitest).setCsillagkepLatinNev(nevek[0]);
                                ((MelysegObjektum) egitest).setCsillagkepMagyarNev(nevek[2]);
                            }
                        }
                    }
                }
            }

            nevScanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        HashMap<String, Integer> csillagkepMelysegObjektumSzama = new HashMap<String, Integer>();

        for (Egitest egitest : egitestek){
            
        }


    }
}
