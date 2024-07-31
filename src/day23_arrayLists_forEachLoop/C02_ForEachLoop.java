package day23_arrayLists_forEachLoop;

public class C02_ForEachLoop {

    public static void main(String[] args) {

        /*
            For-each loop array veya arrayList gibi birden fazla element barindiran yapilardaki
            TUM ELEMENTLERI elden gecrmek istedigimizde kullanilir

            For-Each loop index kullanmaz
            verilen coklu element barindiran yapidaki
            TUM ELEMENTLERI siraya bagli olmaksizin bize getirir

         */

        int[] arr = {3,7,1,0,5};
        // arr'deki tum elementlerin toplamini yazdirin

        int toplam = 0;

        for ( int each : arr ){

            toplam += each;
        }

        System.out.println(toplam); // 16
    }
}
