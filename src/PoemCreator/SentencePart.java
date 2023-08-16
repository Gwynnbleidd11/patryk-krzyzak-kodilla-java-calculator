package PoemCreator;

import java.util.Random;

abstract public class SentencePart {
    abstract public String generate();
    Random random = new Random();
}
