/*
 * Copyright (C) 2019 Ruslan López Carro
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package inventarios.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
public class RoundedBorderTest {
    
    RoundedBorder roundedBorder;
    
    public RoundedBorderTest() {
        roundedBorder = new RoundedBorder();
    }

    @Test
    public void testPaintBorder() {
    }

    @Test
    public void testGetBorderInsets() {
    }

    @Test
    public void testIsBorderOpaque() {
        assertTrue(roundedBorder.isBorderOpaque());
    }

    @Test
    public void testGetRadius() {
        assertEquals(0, roundedBorder.getRadius());
        int randomRadius = (int) (Math.random()*55D);
        RoundedBorder roundedBorder1 = new RoundedBorder(randomRadius);
        assertEquals(randomRadius, roundedBorder1.getRadius());
    }

    @Test
    public void testSetRadius() {
        assertEquals(0, roundedBorder.getRadius());
        int randomRadius = (int) (Math.random() * 55D);
        roundedBorder.setRadius(randomRadius);
        assertEquals(randomRadius, roundedBorder.getRadius());
    }
    
}
