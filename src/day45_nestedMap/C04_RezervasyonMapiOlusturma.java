package day45_nestedMap;

import java.util.HashMap;
import java.util.Map;

public class C04_RezervasyonMapiOlusturma {

    public static void main(String[] args) {

        /*
                asagidaki rezervasyon map'ini olusturun
           {
                "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
                       "checkin" : "2024-07-21",
                       "checkout" : "2024-08-10"
                          },
                "additionalneeds" : "wi-fi"
            }
         */

        Map<String, Object > rezervasyonMapi = new HashMap<>();

        rezervasyonMapi.put("firstname" , "Ahmet");
        rezervasyonMapi.put("lastname" , "Bulut");
        rezervasyonMapi.put("totalprice" , 500);
        rezervasyonMapi.put("depositpaid" , false);


        Map<String,String> bookingdatesMapi = new HashMap<>();
        bookingdatesMapi.put("checkin" , "2024-07-21");
        bookingdatesMapi.put("checkout" , "2024-08-10");

        rezervasyonMapi.put("bookingdates",bookingdatesMapi);
        rezervasyonMapi.put("additionalneeds" , "wi-fi");


        System.out.println(rezervasyonMapi);

        /*
                {
                  firstname=Ahmet,
                  additionalneeds=wi-fi,
                  bookingdates=
                                {checkin=2024-07-21,
                                checkout=2024-08-10},
                  totalprice=500,
                  depositpaid=false,
                  lastname=Bulut
                  }
         */

        // rezervasyondaki firstname'i yazdirin
        System.out.println(rezervasyonMapi.get("firstname")); // Ahmet

        // rezervasyondaki depositpaid'i yazdirin
        System.out.println(rezervasyonMapi.get("depositpaid")); // false

        // rezervasyondaki checkin'i yazdirin
        System.out.println(rezervasyonMapi.get("bookingdates"));
        // {checkin=2024-07-21, checkout=2024-08-10}

        System.out.println(((Map<String, String>) rezervasyonMapi.get("bookingdates")).get("checkin"));
        // 2024-07-21
    }
}
