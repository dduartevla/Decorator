import java.util.ArrayList;
import java.util.List;

public abstract class PersonagemDecorator implements Personagem {

    private Personagem personagem;
    public String equipamento;

    public PersonagemDecorator(Personagem persoangem) {
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
        //return this.curso.getCargaHoraria() * (1 + (this.getPercentualCargaHoraria() / 100));
        this.personagem.getListaBonus().add(this.getBonus());
        return this.personagem.getListaBonus();
    }

    public abstract String getNomeEquipamento();

    public String getEquipamento(){
        //return this.curso.getEstrutura() + "/" + this.getNomeEstrutura();
        return this.personagem.getEquipamento() + " >> " + this.getNomeEquipamento();
    }

    public void setEquipamento(){
        this.equipamento = equipamento;
    }

}
