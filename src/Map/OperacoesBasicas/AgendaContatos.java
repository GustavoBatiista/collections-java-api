package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
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

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPornome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPornome = agendaContatoMap.get(nome);
        }
        return numeroPornome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gustavo", 123456);
        agendaContatos.adicionarContato("Gustavo", 222222);
        agendaContatos.adicionarContato("Gustavo Batista", 987654);
        agendaContatos.adicionarContato("Gustavo Dev", 232323);
        agendaContatos.adicionarContato("Jaine", 987654);
        agendaContatos.adicionarContato("Gustavo", 444444);

        agendaContatos.exibirContatos();
        System.out.println("============================");
        agendaContatos.removerContato("Jaine");
        agendaContatos.exibirContatos();
        System.out.println("============================");
        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Gustavo Batista"));
    }
}
