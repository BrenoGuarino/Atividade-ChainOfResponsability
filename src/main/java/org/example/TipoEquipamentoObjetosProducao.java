package org.example;

public class TipoEquipamentoObjetosProducao implements TipoEquipamento {

    private static TipoEquipamentoObjetosProducao tipoEquipamentoObjetosProducao = new TipoEquipamentoObjetosProducao();

    private TipoEquipamentoObjetosProducao() {};

    public static TipoEquipamentoObjetosProducao getTipoEquipamentoObjetosProducao() {
        return tipoEquipamentoObjetosProducao;
    }

}