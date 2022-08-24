package main;

public class NumberTranslator {


    public int translate(String romanNumber) {


        romanNumber = romanNumber.strip().replace(" ", "").toLowerCase();
        int result = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            switch (romanNumber.charAt(i)) {
                case 'i':
//                    if (i + 1 < romanNumber.length() && (romanNumber.charAt(i + 1) == 'v' || romanNumber.charAt(i + 1) == 'x')) {
//                        result -= 1;
//                    } else {
//                        result += 1;
//                    }

                   result += (i + 1 < romanNumber.length() && (romanNumber.charAt(i + 1) == 'v' || romanNumber.charAt(i + 1) == 'x')) ? -1 : +1;
                    break;
                case 'v':
                    result += 5;
                    break;
                case 'x':
                    result += 10;
            }
        }
        return result < 1 || result > 12 ? -1 : result;
//        return result;
    }

    public static void main(String[] args) {
        System.out.println(new NumberTranslator().translate("X X")   );
    }
}
