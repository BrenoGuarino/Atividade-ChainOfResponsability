package org.example;

public class TipoEquipamentoMonitor implements TipoEquipamento {

    private static TipoEquipamentoMonitor tipoEquipamentoMonitor = new TipoEquipamentoMonitor();

    private TipoEquipamentoMonitor() {};

    public static TipoEquipamentoMonitor getTipoEquipamentoMonitor() {
        return tipoEquipamentoMonitor;
    }

}