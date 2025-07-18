package Main.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributos

    private Set<Contato> contatoSet;


    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato>pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContatos("Gustavo", 123456);
        agendaContatos.adicionarContatos("Gustavo", 0);
        agendaContatos.adicionarContatos("Gustavo Souza", 111111);
        agendaContatos.adicionarContatos("Luiz Gustavo", 654987);
        agendaContatos.adicionarContatos("Larissa Ramos", 111111);


        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Gustavo"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Gustavo Souza", 555555));
    }
}