
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<String> activeHeroes = new ArrayList<>();
        List<String> allHeroes = new ArrayList<>();
        String Superman;
        String WonderWomen;
        String SpiderMan;
        String Batman;
        String Wolverine;
        allHeroes.add("Superman");
        allHeroes.add("WonderWomen");
        allHeroes.add("SpiderMan");
        allHeroes.add("Batman");
        allHeroes.add("Wolverine");

        Scanner read = new Scanner(System.in);
        HeroFactory factory = new HeroFactory();
        System.out.println("Süper Kahramanlar gösterisine hoş geldiniz...");
        System.out.println("Mevcut Süper Kahramanlar: " + allHeroes);
        System.out.println("Çıkmak için q'ya basın...");

        while (true) {
            System.out.print("Lutfen bir kahraman seciniz= ");
            String secilenKahraman = read.nextLine();
            SuperHeroes kahraman = factory.produceSuperHero(secilenKahraman);

            if (secilenKahraman.equalsIgnoreCase("q")) {
                System.out.println("Super kahraman dunyasindan cikis yaptiniz");
                break;
            }

            else if (kahraman != null) {
                kahraman.printInfo();
                kahraman.attack();
                kahraman.exposeSecretPower();
                activeHeroes.add(secilenKahraman);
                System.out.println(secilenKahraman + "aktif kahraman listesine eklendi");
                System.out.println("eklenmemis kahramanlar=" + getRemainingHeroes(allHeroes, activeHeroes));
            }
            else if (!allHeroes.contains(secilenKahraman)) {
                System.out.println("gecersiz kahraman adi. lutfen tekrar deneyiniz");
            }
        }
    }
    private static List<String> getRemainingHeroes(List<String> allHeroes, List<String> activeHeroes) {
        List<String> remainingHeroes = new ArrayList<>(allHeroes);
        remainingHeroes.removeAll(activeHeroes);
        return remainingHeroes;
    }
}
