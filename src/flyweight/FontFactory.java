package flyweight;

import java.util.HashMap;
import java.util.Map;

class FontFactory {

    private static final Map<String, FontStyle> estilos = new HashMap<>();

    public static FontStyle getFont(String fontFamily, int fontSize, boolean bold, boolean italic) {
        String key = fontFamily + fontSize + bold + italic;
        if (!estilos.containsKey(key)) {
            estilos.put(key, new FontStyle(fontFamily, fontSize, bold, italic));
        }
        return estilos.get(key);
    }
}
