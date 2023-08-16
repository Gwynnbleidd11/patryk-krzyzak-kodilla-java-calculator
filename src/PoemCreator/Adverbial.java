package PoemCreator;

import java.util.Random;

class Adverbial extends SentencePart{

    public String generate() {
        Random random = new Random();
        int n = random.nextInt(3);
        AdverbialInt adverbialInt;
        if (n == 0)
            adverbialInt = new PlaceAdverbial();
        else if (n == 1)
            adverbialInt = new TimeAdverbial();
        else
            adverbialInt = new WayAdverbial();
        return adverbialInt.generate();
    }
}
