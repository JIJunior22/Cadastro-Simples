package Forms.Model;


import java.util.Scanner;
import java.util.UUID;

public class Formulario {
    //Atributos
    public String nome;
    public UUID id;
    public int idade;
    public String email;
    public String usuario;
    public String cpf;


    //Construtor


    public Formulario(String nome, int idade, String email, String cpf) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.usuario = email.split("@")[0];
        this.cpf = cpf;
    }

    public void exibirInfo() {
        System.out.println("=== INFORMAÇÕES GERAIS ===");
        System.out.println("Chave de segurança: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("E-mail: " + this.email);
        System.out.println("Usuário de acesso: " + this.usuario);
    }

    public static Formulario cadastroForms() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--= CADASTRO DE PESSOAS =--");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("E-mail: ");
        String email = sc.next();

        System.out.print("CPF: ");
        String cpf = sc.next();

        System.out.println("==".repeat(10));

        Formulario novoCadastro = new Formulario(nome, idade, email, cpf);
        System.out.printf("Cadastro de %s realizado com sucesso!!!%n", nome);
        System.out.println("--".repeat(15));


        return novoCadastro;
    }
}

