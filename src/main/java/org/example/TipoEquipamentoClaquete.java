package org.example;

public class TipoEquipamentoClaquete implements TipoEquipamento {

    private static TipoEquipamentoClaquete tipoEquipamentoClaquete = new TipoEquipamentoClaquete();

    private TipoEquipamentoClaquete() {};

    public static TipoEquipamentoClaquete getTipoEquipamentoClaquete() {
        return tipoEquipamentoClaquete;
    }
}