import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tekst tekst = new Tekst();
        tekst.addTekstLinje("Linje 1");
        tekst.addTekstLinje("linje 2");
        tekst.addTekstLinje("linje 1");

        List<String> tekstlinjer = tekst.getTekstlinjer();
        for (String linje : tekstlinjer) ;
        System.out.println(tekstlinjer);

        int antalUnikke = Tekst.findAntalUnikke();
        System.out.println("Antal unikkke tekslinjer:" + antalUnikke);

    }


}
