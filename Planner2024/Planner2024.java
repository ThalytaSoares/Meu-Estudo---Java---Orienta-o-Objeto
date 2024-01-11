import java.text.SimpleDateFormat;
import java.util.*;

class Tarefa {
    String descricao;
    Date dataHora;
    String lembrete;

    public Tarefa(String descricao, Date dataHora, String lembrete) {
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.lembrete = lembrete;
    }
}

public class Planner2024 {
    private Map<Date, List<Tarefa>> calendario;

    public Planner2024() {
        calendario = new HashMap<>();
    }

    public void adicionarTarefa(Date data, Tarefa tarefa) {
        if (!calendario.containsKey(data)) {
            calendario.put(data, new ArrayList<>());
        }
        calendario.get(data).add(tarefa);
    }

    public void exibirPlanner() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        for (Map.Entry<Date, List<Tarefa>> entry : calendario.entrySet()) {
            Date data = entry.getKey();
            List<Tarefa> tarefas = entry.getValue();

            System.out.println("Data: " + dateFormat.format(data));

            for (Tarefa tarefa : tarefas) {
                SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
                System.out.println("  Tarefa: " + tarefa.descricao);
                System.out.println("    Horário: " + timeFormat.format(tarefa.dataHora));
                System.out.println("    Lembrete: " + tarefa.lembrete);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Planner2024 planner = new Planner2024();

        // Exemplo de adição de tarefas
        Calendar calendar = Calendar.getInstance();

        calendar.set(2024, Calendar.JANUARY, 11, 10, 0);
        Date data1 = calendar.getTime();
        Tarefa tarefa1 = new Tarefa("Reunião de trabalho", data1, "Lembrete: Trabalho em equipe");
        planner.adicionarTarefa(data1, tarefa1);

        calendar.set(2024, Calendar.JANUARY, 15, 15, 30);
        Date data2 = calendar.getTime();
        Tarefa tarefa2 = new Tarefa("Estudo Java", data2, "Lembrete: Preparação para certificação");
        planner.adicionarTarefa(data2, tarefa2);

        // Exibe o planner
        planner.exibirPlanner();
    }
}
