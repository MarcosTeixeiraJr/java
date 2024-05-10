package Default.Estabelicmento;

import Default.Equipamentos.Digilitadora.Digitalizadora;
import Default.Equipamentos.Impressora.Impressora;
import Default.Equipamentos.Multifuncional.EquipamentoMultifuncional;
import Default.Equipamentos.Copiadora.Copiadora;
import Default.Equipamentos.Impressora.Deskjet;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();

        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;


        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
