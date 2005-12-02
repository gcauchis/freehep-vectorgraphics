// Copyright 2002, FreeHEP.
package org.freehep.graphicsio.emf;

import java.io.IOException;

/**
 * SetTextAlign TAG.
 * 
 * @author Mark Donszelmann
 * @version $Id: freehep-graphicsio-emf/src/main/java/org/freehep/graphicsio/emf/SetTextAlign.java f24bd43ca24b 2005/12/02 00:39:35 duns $
 */
public class SetTextAlign extends EMFTag implements EMFConstants {

    private int mode;

    SetTextAlign() {
        super(22, 1);
    }

    public SetTextAlign(int mode) {
        this();
        this.mode = mode;
    }

    public EMFTag read(int tagID, EMFInputStream emf, int len)
            throws IOException {

        SetTextAlign tag = new SetTextAlign(emf.readDWORD());
        return tag;
    }

    public void write(int tagID, EMFOutputStream emf) throws IOException {
        emf.writeDWORD(mode);
    }

    public String toString() {
        return super.toString() + "\n" + "  mode: " + mode;
    }
}