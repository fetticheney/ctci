public class URLify {
    static String urlIfy(String str, Integer len) {
        StringBuilder sb = new StringBuilder(str);
        int i = sb.indexOf(" ");
        while (i != -1) {
            sb.deleteCharAt(i);
            sb.insert(i, "%20");
            i = sb.indexOf(" ", i+3);
        }
        return sb.toString();
    }
}
