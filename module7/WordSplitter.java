package main.module7;


public class WordSplitter {
    public String[] split(String phrase){
        return phrase.toLowerCase().split("[^A-Za-zА-Яа-я]+");
    }
}


