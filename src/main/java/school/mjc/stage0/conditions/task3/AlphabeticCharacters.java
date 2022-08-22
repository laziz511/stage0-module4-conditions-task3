package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char c = character;
        if ((c>64 && c<91) || (c>96 && c<123)){
            if (c==65 || c==69|| c==73|| c==79||c==85||c==97||c==101||c==105 ||c==111||c==117){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }else{
            System.out.println("wrong alphabet!");
        }
    }
}
