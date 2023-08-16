package PoemCreator;

import java.util.Random;

class PlaceAdverbial implements AdverbialInt{

    Random random = new Random();
    public String[] placeAdverbialWords;

    public PlaceAdverbial() {
        placeAdverbialWords = new String[20];
        placeAdverbialWords[0] = "tam";
        placeAdverbialWords[1] = "miejscami";
        placeAdverbialWords[2] = "nad rzeką";
        placeAdverbialWords[3] = "za ścianą";
        placeAdverbialWords[4] = "gdzie";
        placeAdverbialWords[5] = "w Polsce";
        placeAdverbialWords[6] = "za granicą";
        placeAdverbialWords[7] = "w sklepie";
        placeAdverbialWords[8] = "w domu";
        placeAdverbialWords[9] = "nad morzem";
        placeAdverbialWords[10] = "z Francji";
        placeAdverbialWords[11] = "pod dachem";
        placeAdverbialWords[12] = "na działce";
        placeAdverbialWords[13] = "w muzeum";
        placeAdverbialWords[14] = "w kinie";
        placeAdverbialWords[15] = "na plaży";
        placeAdverbialWords[16] = "w lesie";
        placeAdverbialWords[17] = "na drodze";
        placeAdverbialWords[18] = "na drzewie";
        placeAdverbialWords[19] = "w toalecie";
    }

    @Override
    public String generate() {
        int index = random.nextInt(placeAdverbialWords.length);
        return placeAdverbialWords[index];
    }
}
