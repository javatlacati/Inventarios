/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.util;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FontFactory {

    private static final Map<String, Font> FONT_CACHE = new ConcurrentHashMap<String, Font>();
    private static final Logger LOGGER = Logger.getLogger(FontFactory.class.getName());

    public Font getFont(String name) {
        final Optional<Font> cachedFont = Optional.ofNullable(FONT_CACHE.get(name));
        boolean isCached = cachedFont.isPresent();
        Font font = cachedFont.orElseGet(() -> {
            try {
                return Font.createFont(
                        Font.TRUETYPE_FONT,
                        getClass()
                                .getResourceAsStream("/fonts/" + name)
                ).deriveFont(25f);
            } catch (FontFormatException | IOException ex) {
                LOGGER.log(Level.SEVERE, null, ex);
                return new Font("serif", Font.PLAIN, 24); // fallback
            }
        }
        );

        if (!isCached) {
            LOGGER.log(Level.INFO, "cached font: {0}", name);
            FONT_CACHE.put(name, font);
        }

        return font;
    }

}
