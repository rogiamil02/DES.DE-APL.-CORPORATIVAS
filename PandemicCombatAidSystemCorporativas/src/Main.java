import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Hospital samaritano = new Hospital(1L, "Hospital Samaritano", "09.129.222/0001-83",
                "Av. Santa Júlia, 35 - Torre", -7.1214953, -34.8591122, 85, dateFormat.format(new Date()));
        Hospital hnsn = new Hospital(1L, "Hospital Nossa Senhora das Neves", "01.817.749/0001-99",
                "R. Etelvina Macedo de Mendonça, 531 - Torre", -7.1328767, -34.8590414, 90, dateFormat.format(new Date()));

        //Atualizar porcentagem de ocupação
        samaritano.updateOcupation(80);
        hnsn.updateOcupation(95);

        //MOCK dos recursos nos hospitais
        Item medico1 = new Item(1L, "Dra Grey", ResourceType.DOCTOR.getCode());
        Item enfermeiro2 = new Item(2L, "Eddie Murphy", ResourceType.NURSE.getCode());
        Item tomografo1 = new Item(3L, "Tomografhy Xtp01", ResourceType.TOMOGRAFHY.getCode());
        Item tomografo2 = new Item(4L, "Tomografhy Pqt3", ResourceType.TOMOGRAFHY.getCode());
        Item medico2 = new Item(5L, "Dr johnny depp", ResourceType.DOCTOR.getCode());
        Item enfermeiro1 = new Item(6L, "Amber head", ResourceType.NURSE.getCode());
        Item tomografo3 = new Item(7L, "Tomografo Xtp01", ResourceType.TOMOGRAFHY.getCode());
        List<Item> recursosSamaritano = new ArrayList<>(Arrays.asList(medico1, enfermeiro2, tomografo1, tomografo2));
        List<Item> recursosHnsn = new ArrayList<>(Arrays.asList(medico2, enfermeiro1, tomografo3));
        samaritano.setItems(recursosSamaritano);
        hnsn.setItems(recursosHnsn);

        System.out.println(samaritano);
        System.out.println(hnsn);
        System.out.println("--------------------------------------------------\n");

        //Intercambio de recursos
        List<Item> recursosEnviados = new ArrayList<>(Arrays.asList(medico1, tomografo1));
        List<Item> recursosRecebidos = new ArrayList<>(Arrays.asList(enfermeiro1, tomografo3));
        ItensExchange intercambio1 = new ItensExchange(1L, samaritano, hnsn, dateFormat.format(new Date()));
        intercambio1.transaction(recursosEnviados, recursosRecebidos);

        System.out.println(samaritano);
        System.out.println(hnsn);
    }
}
