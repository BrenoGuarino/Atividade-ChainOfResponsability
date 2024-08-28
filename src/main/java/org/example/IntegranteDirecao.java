package org.example;

public class IntegranteDirecao extends IntegranteEquipe {

    public IntegranteDirecao(IntegranteEquipe superior) {
        listaEquipamentos.add(TipoEquipamentoMonitor.getTipoEquipamentoMonitor());
        setIntegranteSuperior(superior);
    }

    public String getDescricaoEquipe() {
        return "Direção";
    }

}
