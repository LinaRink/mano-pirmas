import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//       private List<String> kolekcija = new ArrayList<>();
//        kolekcija.add("Labas");
//        kolekcija.add("Ate");
//        kolekcija.add("Iki");
//        kolekcija.add("Laba diena");
//        kolekcija.add("Gero vakaro");
//
//        System.out.println(kolekcija.get(3));
//        System.out.println(kolekcija.size());
//        System.out.println(kolekcija.remove(1));
//        System.out.println(kolekcija.set(1, "Viso gero"));
//        System.out.println(kolekcija.indexOf("Gero vakaro"));
//        System.out.println(kolekcija.toString());
//
//
//       private Set<String> kolekcija2 = new HashSet<>();
//        kolekcija2.add("Muse");
//        kolekcija2.add("Bite");
//        kolekcija2.add("Drugelis");
//        kolekcija2.add("Uodas");
//        kolekcija2.add("Kamane");
//
//        System.out.println(kolekcija2.size());
//        System.out.println(kolekcija2.remove("Drugelis"));
//
//        kolekcija2.add("Uodas");
//        kolekcija2.add("Bite");
//
//
//        System.out.println(kolekcija2.size());
//        System.out.println(kolekcija2.remove("Bite"));
//        System.out.println(kolekcija2);

        Map<String, AutomobilioInformacija> kolekcija3 = new HashMap<>();

        AutomobilioInformacija auto = new AutomobilioInformacija("Audi", "2015", "012345", "benzinas");
        AutomobilioInformacija auto2 = new AutomobilioInformacija("Subaru", "2016", "123456", "dyzelinas");
        AutomobilioInformacija auto3 = new AutomobilioInformacija("Opel", "2017", "123589", "dyzelinas");

        kolekcija3.put("ABC123", auto);
        kolekcija3.put("DEF456", auto2);
        kolekcija3.put("GHI789", auto3);
        System.out.println(kolekcija3);

        System.out.println(kolekcija3.get("ABC123"));
        System.out.println("----------------");

        for (Map.Entry<String, AutomobilioInformacija> entry : kolekcija3.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

    }
}


