import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * @author Amiram Yassif
 * 314985474
 * ass7
 */
public class FileManager {
    /**
     * Can the string represent a file route?
     * @return  True if yes.
     */
    public static boolean isRoute(String str) {
        Pattern p = Pattern.compile("([A-Z|a-z]:\\\\[^*|\"<>?\\n]*)|(\\\\\\\\.*?\\\\.*)");
        Matcher m = p.matcher(str);
        return m.matches();
    }


}
