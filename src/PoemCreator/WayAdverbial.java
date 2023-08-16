package PoemCreator;

import java.util.Random;

class WayAdverbial implements AdverbialInt {

    Random random = new Random();
    public String[] wayAdverbialWords;

    public WayAdverbial() {
        wayAdverbialWords = new String[20];
        wayAdverbialWords[0] = "dobrze";
        wayAdverbialWords[1] = "źle";
        wayAdverbialWords[2] = "energetycznie";
        wayAdverbialWords[3] = "chętnie";
        wayAdverbialWords[4] = "starannie";
        wayAdverbialWords[5] = "dokładnie";
        wayAdverbialWords[6] = "skrupulatnie";
        wayAdverbialWords[7] = "z uwagą";
        wayAdverbialWords[8] = "beznadziejnie";
        wayAdverbialWords[9] = "niediokładnie";
        wayAdverbialWords[10] = "z entuzjazmem";
        wayAdverbialWords[11] = "bez polotu";
        wayAdverbialWords[12] = "solidnie";
        wayAdverbialWords[13] = "pięknie";
        wayAdverbialWords[14] = "pysznie";
        wayAdverbialWords[15] = "szybko";
        wayAdverbialWords[16] = "profesjonalnie";
        wayAdverbialWords[17] = "może nie najlepiej ale za to drogo";
        wayAdverbialWords[18] = "kozacko";
        wayAdverbialWords[19] = "inspirująco";
    }

    @Override
    public String generate() {
        int index = random.nextInt(wayAdverbialWords.length);
        return wayAdverbialWords[index];
    }
}
