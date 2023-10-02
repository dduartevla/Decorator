import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    List<String> listaBonus;
    @BeforeEach
    void setUp(){
        listaBonus = new ArrayList<>();
        listaBonus.add("Furtividade 80");
        listaBonus.add("Ataque 100");
    }

    @Test
    void deveRetornarBonusPersonagem(){
        Personagem personagem = new PersonagemLadino(listaBonus);
        assertEquals(listaBonus.toString(), personagem.getListaBonus().toString());
    }

    @Test
    void deveRetornarBonusPersonagemMaisArmadura(){
        Personagem personagem = new Armadura(new PersonagemLadino(listaBonus));
        String listaBonus = "[Furtividade 80, Ataque 100, Aumenta Stamina em 40 Pontos e em 50% a Furtividade]";
        assertEquals(listaBonus, personagem.getListaBonus().toString());
    }

    @Test
    void deveRetornarBonusPersonagemMaisArmaduraMaisBotas(){
        Personagem personagem = new Armadura(new Botas(new PersonagemLadino(listaBonus)));
        String listaBonus = "[Furtividade 80, Ataque 100, " +
                "Aumenta Stamina em 30 pontos e o dano de ataques furtivos em 30%, " +
                "Aumenta Stamina em 40 Pontos e em 50% a Furtividade]";
        assertEquals(listaBonus, personagem.getListaBonus().toString());
    }

    @Test
    void deveRetornarBonusPersonagemMaisArmaduraMaisBotasMaisAmuleto(){
        Personagem personagem = new Armadura(new Botas(new Amuleto(new PersonagemLadino(listaBonus))));
        String listaBonus = "[Furtividade 80, Ataque 100, " +
                "Bônus de 30% em Furtividade. Ataques furtivos tem dano crítico automático, " +
                "Aumenta Stamina em 30 pontos e o dano de ataques furtivos em 30%, " +
                "Aumenta Stamina em 40 Pontos e em 50% a Furtividade]";
        assertEquals(listaBonus, personagem.getListaBonus().toString());
    }

    @Test
    void deveRetornarBonusPersonagemMaisArmaduraMaisAmuleto(){
        Personagem personagem = new Armadura(new Amuleto(new PersonagemLadino(listaBonus)));
        String listaBonus = "[Furtividade 80, Ataque 100, " +
                "Bônus de 30% em Furtividade. Ataques furtivos tem dano crítico automático, " +
                "Aumenta Stamina em 40 Pontos e em 50% a Furtividade]";
        assertEquals(listaBonus, personagem.getListaBonus().toString());
    }

    @Test
    void deveRetornarEquipamentoPersonagem(){
        Personagem personagem = new PersonagemLadino(listaBonus);
        String equipamento = "Ladino";
        assertEquals(equipamento, personagem.getEquipamento());
    }

    @Test
    void deveRetornarEquipamentoPersonagemMaisArmadura(){
        Personagem personagem = new Armadura(new PersonagemLadino(listaBonus));
        String equipamento = "Ladino" + " >> " + "Armadura do Assassino";
        assertEquals(equipamento, personagem.getEquipamento());
    }

    @Test
    void deveRetornarEquipamentoPersonagemMaisArmaduraMaisBotas() {
        Personagem personagem = new Armadura(new Botas(new PersonagemLadino(listaBonus)));
        String equipamento = "Ladino" + " >> " +
                "Botas do Assassino" + " >> " +
                "Armadura do Assassino";
        assertEquals(equipamento, personagem.getEquipamento());
    }

    @Test
    void deveRetornarEquipamentoPersonagemMaisArmaduraMaisBotasMaisAmuleto() {
        Personagem personagem = new Armadura(new Botas(new Amuleto(new PersonagemLadino(listaBonus))));
        String equipamento = "Ladino" + " >> " +
                "Amuleto do Assassino" + " >> " +
                "Botas do Assassino" + " >> " +
                "Armadura do Assassino";
        assertEquals(equipamento, personagem.getEquipamento());
    }

    @Test
    void deveRetornarEquipamentoPersonagemMaisArmaduraMaisAmuleto() {
        Personagem personagem = new Armadura(new Amuleto(new PersonagemLadino(listaBonus)));
        String equipamento = "Ladino" + " >> " +
                "Amuleto do Assassino" + " >> " +
                "Armadura do Assassino";
        assertEquals(equipamento, personagem.getEquipamento());
    }

}