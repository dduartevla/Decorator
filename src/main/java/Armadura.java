import java.util.List;

public class Armadura extends PersonagemDecorator{

    public Armadura(Personagem personagem){
        super(personagem);
    }
    @Override
    public String getBonus() {
        return "Aumenta Stamina em 40 Pontos e em 50% a Furtividade";
    }

    @Override
    public String getNomeEquipamento() {
        return "Armadura do Assassino";
    }
}
