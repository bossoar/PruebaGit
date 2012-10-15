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
public class abrirDNF extends ifCommand {

    public abrirDNF() {
        this.commandId = 0x48;
        this.name = "abrirDocumentoNoFiscal";
        this.nombreA = "ABRIRDNF";
        this.descripcionComando = "Este comando es el primer paso en la producción de un Documento No Fiscal. Se imprime el encabezado del comprobante fiscal, pero se lo identifica claramente como \"NO FISCAL\".";

    }

    @Override
    public boolean interpretaRespuesta(byte[] resp) {
        return true;
    }
}
