package Forms.Main;

import Forms.Model.Formulario;


import static Forms.Model.Formulario.cadastroForms;

public class Main {
    public static void main(String[] args) {
        Formulario junior = cadastroForms();
        junior.exibirInfo();


    }
}