package day44_maps;

import day43_map.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C07_EntryIleUpdate {

    public static void main(String[] args) {

        // Entry kullanarak, 11/M sinifindaki ogrencileri
        // 11/T olarak guncelleyin

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti){

            String[] valueArr = eachEntry.getValue().split("-");

            if (valueArr[2].equals("11") && valueArr[3].equalsIgnoreCase("M")) {
                valueArr[3] = "T";
                // guncellemeyi array'de yaptik

                String yeniValue = String.join("-",valueArr);

                // yeni value ile Entry'i update edelim

                eachEntry.setValue(yeniValue);

            }

        }

        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF,
        //  105=Sevgi-Cem-11-T-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-T-SOZ}

    }
}
