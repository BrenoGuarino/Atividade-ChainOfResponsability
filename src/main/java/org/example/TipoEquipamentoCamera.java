package org.example;

public class TipoEquipamentoCamera implements TipoEquipamento {

    private static TipoEquipamentoCamera tipoEquipamentoCamera = new TipoEquipamentoCamera();

    private TipoEquipamentoCamera() {};

    public static TipoEquipamentoCamera getTipoEquipamentoCamera() {
        return tipoEquipamentoCamera;
    }
}