package LR_8;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Program 
{
	private JLabel prev;
    private JLabel resultX;
    private JLabel resultY;
    private JLabel resultN;
    private JTextField mnozhX;
    private JTextField mnozhY;
    private JTextField mnozhN;
    public Program ()
    {
        final JFrame jfrm = new JFrame ( "Лабораторная №8" );
        jfrm.setSize ( 270, 200 );
        jfrm.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        jfrm.setLayout ( new FlowLayout ( FlowLayout.LEFT ) );
        jfrm.setLocationRelativeTo(null);

        prev = new JLabel ( "Введите число x:" );
        jfrm.add ( prev );
        mnozhX = new JTextField ( 10 );
        jfrm.add ( mnozhX );
        resultX = new JLabel (); 
        jfrm.add ( resultX );
        
        prev = new JLabel ( "Введите число y:" );
        jfrm.add ( prev );
        mnozhY = new JTextField ( 10 );
        jfrm.add ( mnozhY );
        resultY = new JLabel (); 
        jfrm.add ( resultY );
        
        prev = new JLabel ( "Введите количество итераций:" );
        jfrm.add ( prev );
        mnozhN = new JTextField ( 3 );
        jfrm.add ( mnozhN );
        resultN = new JLabel (); 
        jfrm.add ( resultN );
        
        final JButton bt = new JButton ( "Высчитать" ); 
        bt.addActionListener ( new ActionListener()
        {
            public void actionPerformed ( ActionEvent e )
            {
                String numberX = mnozhX.getText ();
                String numberY = mnozhY.getText ();
                String numberN = mnozhN.getText ();
                try
                {
                    int numberx = Integer.parseInt ( numberX );
                    int numbery = Integer.parseInt ( numberY );
                    int numbern = Integer.parseInt ( numberN );
                    
                    Decision d = new Decision();
                     d.FirstDecision(numbery, numberx, numbern);
                    d.SecondDecision(numbery, numberx, numbern);
                }
                catch ( NumberFormatException ex )
                {
                    JOptionPane.showMessageDialog ( jfrm, "Введите корректное число", "Ошибка",
                            JOptionPane.ERROR_MESSAGE );
                }
            }
        } );
        jfrm.add ( bt );
        jfrm.setVisible ( true );
    }
    public static void main ( String[] args )
    {
        SwingUtilities.invokeLater ( new Runnable()
        {
            public void run ()
            {
                new Program ();
            }
        } );
    }
}
