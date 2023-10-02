import java.util.ArrayList;
import java.util.List;

public class PersonagemLadino implements Personagem{

    List<String> listaBonus;

    public PersonagemLadino(){
        this.listaBonus = new ArrayList<>();
    }

    public PersonagemLadino(List<String> listaBonus){
        this.listaBonus = listaBonus;
    }

    @Override
    public List<String> getListaBonus() {
        return this.listaBonus;
    }

    @Override
    public String getEquipamento() {
        return "Ladino";
    }
}
