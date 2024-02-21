import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Lucas Vicente", 22);
        Pessoa pessoa2 = new Pessoa("Rafaella", 21);
        Pessoa pessoa3 = new Pessoa("Jeferson",12);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("TAMANHO DA LISTA DE PESSOAS: " + listaDePessoas.size());
        System.out.println("PRIMEIRO DA LISTA: " + listaDePessoas.get(0));
        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }


    }
}
