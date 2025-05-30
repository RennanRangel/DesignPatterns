package one.digitalInnovation.gof.Facade;

import one.digitalInnovation.gof.subsistema1.crm.CrmService;
import one.digitalInnovation.gof.subsistema2.cep.CepApi;

public class Facade {

   public void migrarCliente(String nome, String cep,String cidade,String estado){

       cidade = CepApi.getInstance().recuperarCidade(cep);
       estado = CepApi.getInstance().recuperarEstado(cep);


       CrmService.gravarCliente(nome,cep,cidade,estado);
   }
}
