package org.example;

public class IntegranteFilmagem extends IntegranteEquipe {

    public IntegranteFilmagem(IntegranteEquipe superior) {
        listaEquipamentos.add(TipoEquipamentoCamera.getTipoEquipamentoCamera());
        setIntegranteSuperior(superior);
    }

    public String getDescricaoEquipe() {
        return "Filmagem";
    }

}
