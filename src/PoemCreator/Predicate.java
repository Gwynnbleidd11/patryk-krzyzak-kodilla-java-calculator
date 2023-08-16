package PoemCreator;

public class Predicate extends SentencePart{

    public String[] predicateWords;

    public Predicate() {
        predicateWords = new String[20];
        predicateWords[0] = "je";
        predicateWords[1] = "pije";
        predicateWords[2] = "skacze";
        predicateWords[3] = "biega";
        predicateWords[4] = "bije";
        predicateWords[5] = "muczy";
        predicateWords[6] = "macha";
        predicateWords[7] = "lata";
        predicateWords[8] = "uczy się";
        predicateWords[9] = "czyta";
        predicateWords[10] = "klaszcze";
        predicateWords[11] = "pracuje";
        predicateWords[12] = "gra";
        predicateWords[13] = "tańczy";
        predicateWords[14] = "śpiewa";
        predicateWords[15] = "nuci";
        predicateWords[16] = "drapie";
        predicateWords[17] = "ogląda";
        predicateWords[18] = "idzie";
        predicateWords[19] = "robi zakupy";
    }

    @Override
    public String generate() {
        int index = random.nextInt(predicateWords.length);
        return predicateWords[index];
    }
}
