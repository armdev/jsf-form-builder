/*
 * Copyright (C) 2014 Mathias Reppe <mathias.reppe@gmail.com>
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
package at.reppeitsolutions.formbuilder.components.pdf.formbuilder;

import com.lowagie.text.Chunk;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.draw.LineSeparator;

/**
 *
 * @author Mathias Reppe <mathias.reppe@gmail.com>
 */
public class PdfFormBuilderHorizontalRule extends PdfFormBuilderItem {

    public PdfFormBuilderHorizontalRule() {
        
    }

    @Override
    public Element render() {
        Chunk c = new Chunk(new LineSeparator());
        Font f = new Font();
        f.setSize(2);
        c.setFont(f);
        return c;
    }
    
}
