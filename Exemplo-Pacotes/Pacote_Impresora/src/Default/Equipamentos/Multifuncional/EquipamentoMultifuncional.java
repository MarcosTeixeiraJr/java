package Default.Equipamentos.Multifuncional;

import Default.Equipamentos.Copiadora.Copiadora;
import Default.Equipamentos.Digilitadora.Digitalizadora;
import Default.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento Multifuncional");
    }
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento Multifuncional");
    }
    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento Multifuncional");
    }
}
