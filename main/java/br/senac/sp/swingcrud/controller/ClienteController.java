package br.senac.sp.swingcrud.controller;

import br.senac.sp.swingcrud.model.Cliente;
import br.senac.sp.swingcrud.view.ClienteView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteController {
    private ClienteView view;
    //referencia para DAO
    public ClienteController(ClienteView view){
        this.view = view;
//        view.addListenerSalvar(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Teste 1");
//            }
//        });
        view.addListenerSalvar(e ->{

            salvar();
        });

    }
    private void salvar(){
        if (view.getNome().trim().isEmpty()){
            System.out.println("Sem nome");
        }
    }
}
