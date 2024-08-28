import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EquipamentoTeste {

    IntegranteDirecao direcao;
    IntegranteProducao producao;
    IntegranteAssistencia assistencia;
    IntegranteFilmagem filmagem;

    @BeforeEach
    void setUp() {
        direcao = new IntegranteDirecao(null);
        producao = new IntegranteProducao(direcao);
        assistencia = new IntegranteAssistencia(producao);
        filmagem = new IntegranteFilmagem(assistencia);
    }

    @Test
    void deveRetornarFilmagemParaRequisitarCamera() {
        assertEquals("Filmagem", filmagem.requisitarEquipamento(new Equipamento(TipoEquipamentoCamera.getTipoEquipamentoCamera())));
    }

    @Test
    void deveRetornardirecaoParaRequisitarMonitor() {
        assertEquals("Direção", filmagem.requisitarEquipamento(new Equipamento(TipoEquipamentoMonitor.getTipoEquipamentoMonitor())));
    }

    @Test
    void deveRetornarAssistenciaParaRequisitarClaquete() {
        assertEquals("Assistência de Direção", filmagem.requisitarEquipamento(new Equipamento(TipoEquipamentoClaquete.getTipoEquipamentoClaquete())));
    }

    @Test
    void deveRetornarProducaoParaRequisitarObjetosProducao() {
        assertEquals("Produção", filmagem.requisitarEquipamento(new Equipamento(TipoEquipamentoObjetosProducao.getTipoEquipamentoObjetosProducao())));
    }

    @Test
    void deveRetornarSemAssinaturaParaRequisitarRefletor() {
        assertEquals("Sem requisição", filmagem.requisitarEquipamento(new Equipamento(TipoEquipamentoRefletor.getTipoEquipamentoRefletor())));
    }

}