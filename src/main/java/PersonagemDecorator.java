import java.util.ArrayList;
import java.util.List;

public abstract class PersonagemDecorator implements Personagem {

    private Personagem personagem;
    public String equipamento;

    public PersonagemDecorator(Personagem personagem) {
        this.personagem = personagem;
    }

    public PersonagemDecorator() {

    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public abstract String getBonus();

    public List<String> getListaBonus(){
        if (!this.personagem.getListaBonus().contains(this.getBonus())) {
            this.personagem.getListaBonus().add(this.getBonus());
        }
        return this.personagem.getListaBonus();
    }

    public abstract String getNomeEquipamento();

    public String getEquipamento(){
        return this.personagem.getEquipamento() + " >> " + this.getNomeEquipamento();
    }

    public void setEquipamento(){
        this.equipamento = equipamento;
    }

}
