import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Declarando e instanciando ArrayList
        List<String> listaFrutas = new ArrayList<String>();

        // Frutas a serem adicionadas na lista
        String s = "uva";
        listaFrutas.add("melancia");
        listaFrutas.add(s);
        listaFrutas.add("caju");

        // Criando string para exibir a lista
        String saida = "";
        saida += "Frutas da Lista: " + listaFrutas.toString();
        saida += "\nTotal de Frutas na lista: " + listaFrutas.size();
        saida += "\nA lista possui pera? " + listaFrutas.contains("pera");
        saida += "\nA lista possui caju? " + listaFrutas.contains("caju");

        // Excluindo uma fruta da lista
        listaFrutas.remove("uva");

        // Adicionando a lista atualizada
        saida += "Total de Frutas da lista após remover uva: " + listaFrutas.size();
        saida += "\nFrutas na lista após remover uva: " + listaFrutas.toString();
        saida += "\nÍndice da fruta caju na lista: " + listaFrutas.indexOf("caju");

        // Configurando a TextArea
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);

        // Exibindo ArrayList com caixa de diálogo
        JOptionPane.showMessageDialog(null,saidaArea,"Trabalhando com ArrayList",JOptionPane.INFORMATION_MESSAGE);

        // Saindo do sistema
        System.exit(0);

    }
}
