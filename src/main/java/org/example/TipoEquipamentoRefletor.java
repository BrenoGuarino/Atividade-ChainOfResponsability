package org.example;

public class TipoEquipamentoRefletor implements TipoEquipamento {

    private static TipoEquipamentoRefletor tipoEquipamentoRefletor = new TipoEquipamentoRefletor();

    private TipoEquipamentoRefletor() {};

    public static TipoEquipamentoRefletor getTipoEquipamentoRefletor() {
        return tipoEquipamentoRefletor;
    }
}