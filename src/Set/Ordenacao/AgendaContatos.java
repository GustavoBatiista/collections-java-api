package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatoSet.add(new Contato(nome, telefone));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarContatoPorNome(String nome, int novoTelefone) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoTelefone);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Gustavo", 123456);
        agendaContatos.adicionarContato("Gustavo", 0);
        agendaContatos.adicionarContato("Gustavo Batista", 111111);
        agendaContatos.adicionarContato("Gustavo Dev", 654987);
        agendaContatos.adicionarContato("Jaine", 111111);
        agendaContatos.adicionarContato("Jaine Damasceno", 123456);
        agendaContatos.adicionarContato("Jaine Esposa", 125488);
        System.out.println("===========================");
        agendaContatos.exibirContato();
        System.out.println("===========================");
        System.out.println(agendaContatos.pesquisarPorNome("Gustavo"));
        System.out.println("===========================");
        System.out.println(agendaContatos.atualizarContatoPorNome("Jaine", 333333));
    }
}
