import java.util.ArrayList;

class CompressionTokens {
    private char character;
    private int character_count;

    public CompressionTokens(char c) {
        this.character = c;
        this.character_count = 0;
    }

    public void addCount() {
        this.character_count++;
    }

    public int getCount() {
        return this.character_count;
    }

    public String returnToken() {
        String sb = String.valueOf(character) +
                character_count;
        return sb;
    }
}

public class StringCompression {

    static String compressString(String str) {
        ArrayList<CompressionTokens> charCounts = new ArrayList<CompressionTokens>();
        int indexCounter = 0;
        char getChar = str.charAt(0);;
        boolean worthCompression = false;
        charCounts.add(new CompressionTokens(getChar));

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != getChar) {
                indexCounter++;
                getChar = str.charAt(i);
                // move onto next compression token
                charCounts.add(new CompressionTokens(getChar));
                charCounts.get(indexCounter).addCount();
            } else {
                // add count to current compression token + if count > 2 set worthCompression = true
                charCounts.get(indexCounter).addCount();
                if (charCounts.get(indexCounter).getCount() > 2) {
                    worthCompression = true;
                }
            }
        }

        if (worthCompression) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < charCounts.size(); i++) {
                sb.append(charCounts.get(i).returnToken());
            }
            return sb.toString();
        }

        return str;
    }
}
