package PoemCreator;

class Poem {
    public String generate(int lines) {
        String result = "";
        for (int n = 0; n < lines; n++)
            result += newLineOfPoem();
        return result;
    }

    private String newLineOfPoem() {
        String subject = new Subject().generate();
        String predicate = new Predicate().generate();
        String adverbial = new Adverbial().generate();
        return subject + " " + predicate + " " + adverbial + "\n";
    }
}
