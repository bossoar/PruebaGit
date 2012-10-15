/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ifepson.ifepson.commands;

import ifepson.ifepson.ifCommand;

/**
 *
 * @author guillermot
 */
public class cortarPapel extends ifCommand {

    public cortarPapel() {
        this.commandId = 0x4B;
        this.name = "cortarPapel";
        this.descripcionComando = "Corta el papel";
    }

    @Override
    public boolean interpretaRespuesta(byte[] resp) {
        return true;
    }

}
