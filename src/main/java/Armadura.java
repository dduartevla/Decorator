public class Armadura {
    public class Amuleto extends PersonagemDecorator{

        public Amuleto (Personagem personagem){
            super(personagem);
        }
        @Override
        public String getBonus() {
            return "Bônus de 30% em Furtividade. Ataques furtivos tem dano crítico automático";
        }

        @Override
        public String getNomeEquipamento() {
            return "Amuleto do Assassino";
        }
    }

}
