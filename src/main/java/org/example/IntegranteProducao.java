package org.example;

public class IntegranteProducao extends IntegranteEquipe {

    public IntegranteProducao(IntegranteEquipe superior) {
        listaEquipamentos.add(TipoEquipamentoObjetosProducao.getTipoEquipamentoObjetosProducao());
        setIntegranteSuperior(superior);
    }

    public String getDescricaoEquipe() {
        return "Produção";
    }

}