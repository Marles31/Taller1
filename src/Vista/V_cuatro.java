
package Vista;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Controlador.ControladorCuatro;

public class V_cuatro extends javax.swing.JFrame {

    public V_cuatro() {
        initComponents();
    }

    ControladorCuatro cuatro = new ControladorCuatro();


    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        generate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ejercicio 4");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); 
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("EJERCICIO 4");

        jLabel2.setText("Ingrese el número de nombres a ingresar:");

        generate.setText("Generar");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        result.setColumns(20);
        result.setRows(5);
        jScrollPane1.setViewportView(result);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(generate))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {
        
        V_Menu menu = new V_Menu();
        menu.setVisible(true);
        
    }

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {
        


    }

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {

        String numero = input.getText();
        String textArea = "";
        ArrayList <String> lista = new ArrayList<String>();

        if(!numero.isEmpty() && !numero.equals("0") && Integer.parseInt(numero)>0){
        for (int i = 0; i < Integer.parseInt(numero); i++) {
            String nombre = JOptionPane.showInputDialog(null, "Ejercicio 4:\n" + " Ingrese el nombre #" + (i + 1) + ":");
            lista.add(nombre);
        }
        
        String resultadoUno=cuatro.validNameNumber(lista);
        String resultadoDos=cuatro.deleteInvalidName(lista);
        String resultadoTres=cuatro.validNameNumber(lista);
        
        textArea = "- "+resultadoUno+"\n\n"+"- "+resultadoDos+"\n\n"+"- "+resultadoTres;
        
        result.setText(textArea);
        }else{
            JOptionPane.showMessageDialog(null, "El campo está vacío", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_cuatro().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton generate;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea result;
}
