package PoemCreator;

public class Subject extends SentencePart {

    public String[] subjectWords;

    public Subject() {
        subjectWords = new String[20];
        subjectWords[0] = "Kot";
        subjectWords[1] = "Pies";
        subjectWords[2] = "Kaczka";
        subjectWords[3] = "Patryk";
        subjectWords[4] = "Daniel";
        subjectWords[5] = "Andrzej";
        subjectWords[6] = "Jan";
        subjectWords[7] = "Trzewik";
        subjectWords[8] = "Burak";
        subjectWords[9] = "Kapusta";
        subjectWords[10] = "Marchew";
        subjectWords[11] = "Płaszcz";
        subjectWords[12] = "Szafa";
        subjectWords[13] = "Zdjęcie";
        subjectWords[14] = "Szklanka";
        subjectWords[15] = "Zegar";
        subjectWords[16] = "Natalia";
        subjectWords[17] = "Karolina";
        subjectWords[18] = "Justna";
        subjectWords[19] = "Czesław";
    }

    @Override
    public String generate() {
        int index = random.nextInt(subjectWords.length);
        return subjectWords[index];
    }
}
