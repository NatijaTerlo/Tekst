import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tekst {

    // Attributter

    private static List<String> tekstlinjer;

    public Tekst() {
        tekstlinjer = new ArrayList<>();

    }

// Metode

    public void addTekstLinje(String tekstlinje) {
        tekstlinjer.add(tekstlinje);
    }

    //getter


    public List<String> getTekstlinjer() {
        return tekstlinjer;
    }

    public static int findAntalUnikke() {
        Set<String>unikkeLinjer = new HashSet<>(tekstlinjer);
        return unikkeLinjer.size();
    }




}

