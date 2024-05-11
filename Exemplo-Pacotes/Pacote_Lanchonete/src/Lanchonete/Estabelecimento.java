package Lanchonete;

import Lanchonete.Area.Cliente.Cliente;
import Lanchonete.Atendimento.Atendente;
import Lanchonete.Atendimento.Cozinha.Almoxarife;
import Lanchonete.Atendimento.Cozinha.Cozinheiro;

public class Estabelecimento {
   public static void main(String[] args) {
       Cozinheiro cozinheiro = new Cozinheiro();
       //ações que não precisam estarem disponiveis para toda aplicação
       //cozinheiro.lavarIngredientes();
       //cozinheiro.batendoVitaminaLiquidificador();
       //cozinheiro.selecionarIngredientesVitamina();
       //cozinheiro.prepararLanche();
       //cozinheiro.prepararVitamina();
       //cozinheiro.prepararVitamina();
       
       //ações que estabelecimento precisa ter ciência
       cozinheiro.adicionarSucoNoBalcao();
       cozinheiro.adicionarLancheNoBalcao();
       cozinheiro.adicionarComboNoBalcao();

       Almoxarife almoxarife = new Almoxarife();
       //ações que não precisam estar disponiveis para toda a aplicação
       //almoxarife.controlarEntrada();
       //almoxarife.controlarSaida();
       //almoxarife.trocarGas();
       //almoxarife.entregarIngredientes();

       Atendente atendente = new Atendente();
       //atendente.pegarLancheCozinha();
       atendente.receberPagamento();
       atendente.servindoMesa();
       //atendente.trocarGas();

       Cliente cliente = new Cliente();
       cliente.escolherLanche();
       cliente.fazerPedido();
       cliente.pagarConta();


       //não deveria mas o estabelecimento
       //ainda não defeniu normas de estabelecimento
       //cliente.pegarPedidoBalcao();

       //esta ação é muito sigilosa que tal ser privada?
       //cliente.cosultarSaldoAplicativo();

       //ja pensou os clientes ouvindo que o gás acabou
       //cozinheiro.pedirParaTrocarGas(atendente);
       //cozinheiro.pedirParaTrocarGas(almoxarife);
   } 
}
