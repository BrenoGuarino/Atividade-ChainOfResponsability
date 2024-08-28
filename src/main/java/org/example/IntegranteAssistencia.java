package org.example;

public class IntegranteAssistencia extends IntegranteEquipe {

    public IntegranteAssistencia(IntegranteEquipe superior) {
        listaEquipamentos.add(TipoEquipamentoClaquete.getTipoEquipamentoClaquete());
        setIntegranteSuperior(superior);
    }

    public String getDescricaoEquipe() {
        return "Assistência de Direção";
    }
}