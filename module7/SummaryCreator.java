package main.module7;

public class SummaryCreator {
    public String create(String text){
        if(text.length() > 15) {
            if(text.charAt(16) == 32){
                return text.substring(0,15) + "...";
            } else {
                return text.substring(0,15);
            }
        }


        return text;
    }
}


