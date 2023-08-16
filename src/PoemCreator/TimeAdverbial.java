package PoemCreator;

import java.util.Random;

class TimeAdverbial implements AdverbialInt {

    Random random = new Random();
    public String[] timeAdverbialWords;
    public TimeAdverbial() {
        timeAdverbialWords = new String[20];
        timeAdverbialWords[0] = "teraz";
        timeAdverbialWords[1] = "nazajutrz";
        timeAdverbialWords[2] = "za dziesięć minut";
        timeAdverbialWords[3] = "czasami";
        timeAdverbialWords[4] = "przed";
        timeAdverbialWords[5] = "po";
        timeAdverbialWords[6] = "Bóg wie ile";
        timeAdverbialWords[7] = "jutro";
        timeAdverbialWords[8] = "wczoraj";
        timeAdverbialWords[9] = "od czasu do czasu";
        timeAdverbialWords[10] = "niekiedy";
        timeAdverbialWords[11] = "tydzień temu";
        timeAdverbialWords[12] = "w zeszłym roku";
        timeAdverbialWords[13] = "za kilka dni";
        timeAdverbialWords[14] = "za chwilę";
        timeAdverbialWords[15] = "przed chwilą";
        timeAdverbialWords[16] = "za moment";
        timeAdverbialWords[17] = "pięc minut temu";
        timeAdverbialWords[18] = "pojutrze";
        timeAdverbialWords[19] = "przedwczoraj";
    }

    @Override
    public String generate() {
        int index = random.nextInt(timeAdverbialWords.length);
        return timeAdverbialWords[index];
    }

}
