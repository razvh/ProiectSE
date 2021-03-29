import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class GuiGeneric implements ActionListener {
    private InferenceEngine inferenceEngine = new InferenceEngine("test2.txt");
    private JPanel JPanel;
    private JPanel JPanel2;
    private JButton JButton;
    private JLabel intrebare;
    private final JFrame JFrame;
    private final JFrame f;
    private JPanel JPanel3 =new JPanel();
    private ArrayList<JRadioButton> radioButtons = new ArrayList<JRadioButton>();
    private int x[] = {250,270,290,310,330,350};
    private Parser2 parser2;
    private ArrayList<String> intrebari = new ArrayList<String>();
    private ArrayList<String> raspunsuri = new ArrayList<String>();
    private ArrayList<Integer> numere = new ArrayList<Integer>();
    private int index=0;

    public GuiGeneric() throws IOException {
        JFrame = new JFrame();
        f = new JFrame("Working");
        parser2=new Parser2("intrebari.txt");
        parser2.citireIntrebari();
        intrebari=parser2.getIntrebari();
        raspunsuri=parser2.getRaspunsuri();
        numere = parser2.getNumere();
    }
    public void createButton(){
        JButton = new JButton("Incepeti diagnoza");
        JButton.setSize(200,100);
        JButton.setLocation(100,50);
        JButton.addActionListener(this);
    }
    public void createPanel1(){
        JLabel JLabel1 = new JLabel("Diagnoza Auto");
        JLabel1.setLocation(500,-100);
        JLabel1.setSize(599,300);
        JLabel1.setFont(new Font ( "Serif", Font.PLAIN, 50));
        JLabel JLabel2 = new JLabel("realizat de Diatlov Ovidiu, Huple Razvan, Titel Andrei");
        JLabel2.setLocation(800,0);
        JLabel2.setSize(599,300);
        JLabel2.setFont(new Font ( "Serif", Font.PLAIN, 20));
        JPanel = new JPanel();
        JPanel.setBackground(new Color(204,255,255));
        JPanel.setLayout(null);
        JPanel.add(JLabel1);
        JPanel.add(JLabel2);
        JPanel.setBounds(0,0,2000,250);
        JPanel.setBorder(BorderFactory.createTitledBorder(""));
    }

    public void createPanel2(){
        JPanel2 = new JPanel();
        createButton();
        JPanel2.setBackground(new Color(204,255,200));
        JPanel2.setLayout(null);
        JPanel2.setBounds(0,250,2000,600);
        JPanel2.setBorder(BorderFactory.createTitledBorder(""));
        ImageIcon img = new ImageIcon("main.jpg");
        JLabel JLabel3 = new JLabel();
        JLabel3.setIcon(img);
        JLabel3.setLocation(850,50);
        JLabel3.setSize(650,350);
        JPanel2.add(JLabel3);
        JPanel2.add(JButton);

    }
    public void createFrame(){
        createPanel1();
        createPanel2();
        JFrame.setTitle("Diagnoza Auto 2021. All rights reserved");
        JFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        JFrame.setVisible(true);
        JFrame.setLayout(null);
        JFrame.setResizable(false);
        JFrame.setSize(1280,720);
        JFrame.getContentPane().setBackground(new Color(160,160,160));
        JFrame.add(JPanel);
        JFrame.add(JPanel2);
    }
    public void SecondFrame() {
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(1280,720);
        JPanel3.setBackground(new Color(204,255,200));
        JPanel3.setLayout(null);
        JPanel3.setBounds(0,250,2000,600);
        JPanel3.setBorder(BorderFactory.createTitledBorder(""));
        creareIntrebare(intrebari.get(index),numere.get(index));
        //creareIntrebare("gfgdfg?",4);
        f.add(JPanel3);
    }
    public void creareIntrebare(String text, int nr){
        System.out.println(text + " " + nr);
        ButtonGroup menu = new ButtonGroup();
        intrebare = new JLabel(text);
        intrebare.setLocation(100,50);
        intrebare.setSize(1000,300);
        intrebare.setFont(new Font ( "Serif", Font.PLAIN, 30));
        if(!radioButtons.isEmpty())
        {
            radioButtons.removeAll(radioButtons);
        }
        for(int i=0;i<nr;i++)
        {
            JRadioButton raspuns= new JRadioButton(raspunsuri.get(i));
            raspuns.setSize(100,20);
            raspuns.setLocation(100,x[i]);
            raspuns.setBackground(Color.orange);
            raspuns.addActionListener(this);
            radioButtons.add(raspuns);
            menu.add(raspuns);
        }
        for(int i=0;i<nr;i++)
            raspunsuri.remove(0);
        for(JRadioButton rasp: radioButtons)
        {
            JPanel3.add(rasp);
        }
        JPanel3.add(intrebare);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean b = true;
        if(e.getSource() == JButton){
            b=false;
            JFrame.dispose();
            SecondFrame();
        }
        else{
            System.out.println(((JRadioButton)e.getSource()).getText());
            inferenceEngine.inference(((JRadioButton)e.getSource()).getText());
            intrebare.setVisible(false);
            for(JRadioButton radioButton:radioButtons)
            {
                radioButton.setVisible(false);
            }
            index++;
            if(index<intrebari.size())
                creareIntrebare(intrebari.get(index),numere.get(index));
            else {
                intrebare.setVisible(true);
                intrebare.setText("Concluzia este:"+inferenceEngine.getConcluzie());
            }
        }
    }
    public static void main(String []args) throws IOException {
        GuiGeneric guiGeneric = new GuiGeneric();
        guiGeneric.createFrame();
    }
}
