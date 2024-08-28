package org.example;

import java.util.ArrayList;

public abstract class IntegranteEquipe {

    protected ArrayList listaEquipamentos = new ArrayList();
    private IntegranteEquipe integranteSuperior;

    public IntegranteEquipe getIntegranteSuperior() {
        return integranteSuperior;
    }

    public void setIntegranteSuperior(IntegranteEquipe integranteSuperior) {
        this.integranteSuperior = integranteSuperior;
    }

    public abstract String getDescricaoEquipe();

    public String requisitarEquipamento(Equipamento equipamento) {
        if (listaEquipamentos.contains(equipamento.getTipoEquipamento())) {
            return getDescricaoEquipe();
        }
        else {
            if (integranteSuperior != null) {
                return integranteSuperior.requisitarEquipamento(equipamento);
            }
            else
            {
                return "Sem requisição";
            }
        }
    }
}