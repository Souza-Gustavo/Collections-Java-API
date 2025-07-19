package Main.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributos

    private Map<String, Integer> agendaContatoMap;
    
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(String nome){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gustavo", 123456);
        agendaContatos.adicionarContato("Gustavo", 5665);
        agendaContatos.adicionarContato("Gustavo Souza", 111111);
        agendaContatos.adicionarContato("Gustavo Ramos", 654987);
        agendaContatos.adicionarContato("Larissa Ramos", 111111);
        agendaContatos.adicionarContato("Gustavo", 444444);


        agendaContatos.exibirContato(null);

        agendaContatos.removerContato("Gustavo Souza");
        agendaContatos.exibirContato(null);

        System.out.println("O numero é " + agendaContatos.pesquisarPorNome("Gustavo Ramos"));
 }
}
