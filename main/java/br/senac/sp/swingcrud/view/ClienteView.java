package br.senac.sp.swingcrud.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ClienteView extends JFrame {
    private JLabel lbID;
    private JLabel lbNome;
    private JLabel lbEmail;
    private JLabel lbEndereco;

    private JTextField tfID;
    private JTextField tfNome;
    private JTextField tfEmail;
    private JTextArea taEndereco;

    private JPanel pnBotoes;
    private JButton btSalvar;
    private JButton btExluir;
    private JButton btLimpar;

    public ClienteView(){

        //Titulo da Janela
        setTitle("CRUD Cliente");

        //Tamanho
        setSize(700, 500);

        //Define o fechamento da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Inicia no centro da tela
        setLocationRelativeTo(null);
        //Retira o redimensionamento
        setResizable(false);
        //Retira o gerenciador de layout
        setLayout(null);

        //lbID
        lbID = new JLabel("Id:");
        lbID.setBounds(10, 10, 50, 30);
        lbID.setForeground(Color.blue);
        //lbID.setBackground(Color.white);
        //Para aparecer a cor de fundo precisa ser Opaco true
        lbID.setOpaque(true);

        //tfID
        tfID = new JTextField();
        tfID.setBounds(70, 10, 50,30);
        //Centralizacao horizontal
        tfID.setHorizontalAlignment(SwingConstants.CENTER);
        //Sem permissao para editar ou copiar
        //tfID.setEditable(false);
        tfID.setEnabled(false);

        //lbNome
        lbNome = new JLabel("Nome:");
        lbNome.setBounds(10, 50, 50, 30);
        lbNome.setForeground(Color.blue);
        lbNome.setOpaque(true);

        //tfNome
        tfNome = new JTextField();
        tfNome.setBounds(70, 50, 300,30);
        tfNome.setHorizontalAlignment(SwingConstants.CENTER);
        tfNome.setEnabled(true);

        //lbEmail
        lbEmail = new JLabel("Email:");
        lbEmail.setBounds(10, 90, 50, 30);
        lbEmail.setForeground(Color.blue);
        lbEmail.setOpaque(true);

        //tfEmail
        tfEmail = new JTextField();
        tfEmail.setBounds(70, 90, 300,30);
        tfEmail.setHorizontalAlignment(SwingConstants.CENTER);
        tfEmail.setEnabled(true);

        //lbEndereco
        lbEndereco = new JLabel("Endereco:");
        lbEndereco.setBounds(10, 130, 60, 30);
        lbEndereco.setForeground(Color.blue);
        lbEndereco.setOpaque(true);

        //taEndereco
        taEndereco = new JTextArea();
        taEndereco.setBounds(70, 130, 300, 50);
        //quebrar linha no final
        taEndereco.setLineWrap(true);

        //botoes
        btSalvar = new JButton("Salvar");
        btExluir = new JButton("Excluir");
        btLimpar = new JButton("Limpar");

        //pnBotoes
        pnBotoes = new JPanel();
        pnBotoes.add(btSalvar);
        pnBotoes.add(btExluir);
        pnBotoes.add(btLimpar);
        pnBotoes.setBounds(10, 190, 400, 50);

        //Adicionando componentes
        getContentPane().add(lbID);
        getContentPane().add(tfID);
        getContentPane().add(lbNome);
        getContentPane().add(tfNome);
        getContentPane().add(lbEmail);
        getContentPane().add(tfEmail);
        getContentPane().add(lbEndereco);
        getContentPane().add(taEndereco);
        getContentPane().add(pnBotoes);
    }

    public void addListenerSalvar(ActionListener listener){
        btSalvar.addActionListener(listener);
    }

    public String getNome(){
        return tfNome.getText();
    }

    public String getEmail(){
        return tfEmail.getText();
    }

    public String getEndereco(){
        return taEndereco.getText();
    }
}
