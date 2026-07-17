package view;

import javax.swing.*;
import java.awt.*; //Abstact windows Toolkit

public class FormularioPersona extends JFrame{
    //Componenetes de entrada
    private JTextField txtNombre, txtEdad, txtPeso;(
    private JButton btnCalcular;

    //Constructor de la clase de FormularioPersona
    public FormularioPersona(){
        //Configuracion de tu ventana
        setTitle(title: "Datos de la persona para IMC"); //Ttulo de la ventana
        setSize(width: 500, height: 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cuando se cierra la ventana
        setLocationRelativeTo(c: null);
        setResizable(resizable: false);

        //Definir tipo de diseño BorderLayout
        setLayout(new BorderLayout(hgap: 10, vgap: 10));

        //Se agrega un panel para los componentes del formulario
        JPanel panelCaptura = new JPanel(new GridLayout(rows: 4,hgap:5, vgap:5));
        panelCaptura.setBorder(BorderFactory.createEmpyBorder(top: 10, left: 10, bottom: 5, right: 10));

        panelCaptura.add(new JLabel(text: "Nombre: "));
        txtNombre=new JTextField(); //Revisar propiedd txt
        panelCaptura.add(txtNombre);

        panelCaptura.add(newJLabel(text: "Estatura: "));
        txtEst9=new JTextField();
        TextPrompt
        panelCaptura.add(txtEst);

        panelCaptura.add(newJLabel(text: "Peso: "));
        txtPeso=new JTextField();
        panelCaptura.add(txtPeso);



        add(panelCaptura, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(())->{
            new ForuormularioPersona().setVisible(b: true);
        });

    }
}