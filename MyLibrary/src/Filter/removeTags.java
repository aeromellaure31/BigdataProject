package Filter;

import java.util.regex.*;

public class removeTags {

    public String removeHTML(String str) {
        str = str.replaceAll("\\<[^>]*>","");
        return str;

    }

}
