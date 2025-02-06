import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceGrafica extends JFrame {
    private JButton botaoClicar;
    private JLabel labelMensagem;

    public InterfaceGrafica() {
        setTitle("Minha Primeira Interface");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        labelMensagem = new JLabel("Clique no botão");
        labelMensagem.setBounds(100, 50, 200, 30);
        
        botaoClicar = new JButton("Clique Aqui!");
        botaoClicar.setBounds(80, 100, 120, 30);

        botaoClicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, 
                    "Olá, José Carlos! \nSeu primeiro programa gráfico!");
            }
        });

        add(labelMensagem);
        add(botaoClicar);
    }

   
}