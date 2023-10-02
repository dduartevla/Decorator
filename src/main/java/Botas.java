public class Botas extends PersonagemDecorator{

    public Botas (Personagem personagem){
        super(personagem);
    }
    @Override
    public String getBonus() {
        return "Aumenta Stamina em 30 pontos e o dano de ataques furtivos em 30%";
    }

    @Override
    public String getNomeEquipamento() {
        return "Botas do Assassino";
    }
}


