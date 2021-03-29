import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUI implements ActionListener {
        private final InferenceEngine inferenceEngine = new InferenceEngine("Test.txt");
        private JPanel JPanel;
        private JPanel JPanel2;
        private JLabel JLabel4;
        private JLabel JLabel5;
        private JLabel JLabel6;
        private JLabel JLabel7;
        private JLabel JLabel8;
        private final JLabel JLabel9 = new JLabel("Concluzie:");
        private final JFrame JFrame = new JFrame();
        private final JFrame f = new JFrame("Working");
        javax.swing.JPanel JPanel3 = new JPanel();
        private JButton JButton = new JButton();
        private JRadioButton buton1 = new JRadioButton("BMW");
        private JRadioButton buton2 = new JRadioButton("VOLKSWAGEN");
        private JRadioButton buton3 = new JRadioButton("AUDI");
        private JRadioButton buton4 = new JRadioButton("MERCEDES BENZ");
        private JRadioButton buton5 = new JRadioButton("FORD");
        private JRadioButton buton8 = new JRadioButton();
        private JRadioButton buton9 = new JRadioButton();
        private JRadioButton buton10 = new JRadioButton();
        private JRadioButton buton11 = new JRadioButton();
        private JRadioButton buton12 = new JRadioButton();
        private JRadioButton buton13 = new JRadioButton();
        private JRadioButton buton14 = new JRadioButton();
        private JRadioButton buton15 = new JRadioButton();
        private JRadioButton buton16 = new JRadioButton();
        private JRadioButton buton17 = new JRadioButton();
        private JRadioButton buton18 = new JRadioButton();
        private JRadioButton buton19 = new JRadioButton();
        private JRadioButton buton20 = new JRadioButton();
        private JRadioButton buton21 = new JRadioButton();
        private int counter = 0;

        public GUI() throws IOException {

        }

        @Override
    public void actionPerformed(ActionEvent e) {
        String text="";
        boolean b = true;
            if(e.getSource() == JButton){
                b=false;
                JFrame.dispose();
                SecondFrame();
            }
        if(e.getSource() == buton1){
            text = buton1.getText();
            createQuestion2("Ce model de masina aveti ?");
            JLabel4.setVisible(false);
            JPanel3.add(JLabel5);
            buton1.setVisible(false);
            buton2.setVisible(false);
            buton3.setVisible(false);
            buton4.setVisible(false);
            buton5.setVisible(false);
            buton8.setVisible(true);
            buton9.setVisible(true);
            buton10.setVisible(true);
            buton11.setVisible(true);
            buton8.setText("SERIA 3");
            buton9.setText("SERIA 4");
            buton10.setText("SERIA 5");
            buton11.setText("SERIA 6");

        }
        if(e.getSource() == buton2){
            text = buton2.getText();
            createQuestion2("Ce model de masina aveti ?");
            JLabel4.setVisible(false);
            JPanel3.add(JLabel5);
            buton1.setVisible(false);
            buton2.setVisible(false);
            buton3.setVisible(false);
            buton4.setVisible(false);
            buton5.setVisible(false);
            buton8.setVisible(true);
            buton9.setVisible(true);
            buton10.setVisible(true);
            buton11.setVisible(true);
            buton8.setText("PASSAT");
            buton9.setText("TIGUAN");
            buton10.setText("POLO");
            buton11.setText("TOUAREG");
        }
        if(e.getSource() == buton3){
            text = buton3.getText();
            createQuestion2("Ce model de masina aveti ?");
            JLabel4.setVisible(false);
            JPanel3.add(JLabel5);
            buton1.setVisible(false);
            buton2.setVisible(false);
            buton3.setVisible(false);
            buton4.setVisible(false);
            buton5.setVisible(false);
            buton8.setVisible(true);
            buton9.setVisible(true);
            buton10.setVisible(true);
            buton11.setVisible(true);
            buton8.setText("A4");
            buton9.setText("A5");
            buton10.setText("A6");
            buton11.setText("A7");
        }
        if(e.getSource() == buton4){
            text = buton4.getText();
            createQuestion2("Ce model de masina aveti ?");
            JLabel4.setVisible(false);
            JPanel3.add(JLabel5);
            buton1.setVisible(false);
            buton2.setVisible(false);
            buton3.setVisible(false);
            buton4.setVisible(false);
            buton5.setVisible(false);
            buton8.setVisible(true);
            buton9.setVisible(true);
            buton10.setVisible(true);
            buton11.setVisible(true);
            buton8.setText("E CLASS");
            buton9.setText("S CLASS");
            buton10.setText("A CLASS");
            buton11.setText("GLE");
        }
        if(e.getSource() == buton5){
            text = buton5.getText();
            createQuestion2("Ce model de masina aveti ?");
            JLabel4.setVisible(false);
            JPanel3.add(JLabel5);
            buton1.setVisible(false);
            buton2.setVisible(false);
            buton3.setVisible(false);
            buton4.setVisible(false);
            buton5.setVisible(false);
            buton8.setVisible(true);
            buton9.setVisible(true);
            buton10.setVisible(true);
            buton11.setVisible(true);
            buton8.setText("MONDEO");
            buton9.setText("MUSTANG");
            buton10.setText("RAPTOR");
            buton11.setText("KUGA");
        }
        if((e.getSource() == buton8) ){
            text = buton8.getText();
            createQuestion3("Ce tip de combustibil are masina dvs. ?");
            JLabel5.setVisible(false);
            JPanel3.add(JLabel6);
            buton8.setVisible(false);
            buton9.setVisible(false);
            buton10.setVisible(false);
            buton11.setVisible(false);
            buton12.setVisible(true);
            buton13.setVisible(true);
            buton12.setText("MOTORINA");
            buton13.setText("BENZINA");
        }
        if((e.getSource() == buton9) ){
            text = buton9.getText();
            createQuestion3("Ce tip de combustibil are masina dvs. ?");
            JLabel5.setVisible(false);
            JPanel3.add(JLabel6);
            buton8.setVisible(false);
            buton9.setVisible(false);
            buton10.setVisible(false);
            buton11.setVisible(false);
            buton12.setVisible(true);
            buton13.setVisible(true);
            buton12.setText("MOTORINA");
            buton13.setText("BENZINA");
        }
        if((e.getSource() == buton10) ){
            text = buton10.getText();
            createQuestion3("Ce tip de combustibil are masina dvs. ?");
            JLabel5.setVisible(false);
            JPanel3.add(JLabel6);
            buton8.setVisible(false);
            buton9.setVisible(false);
            buton10.setVisible(false);
            buton11.setVisible(false);
            buton12.setVisible(true);
            buton13.setVisible(true);
            buton12.setText("MOTORINA");
            buton13.setText("BENZINA");
        }
        if((e.getSource() == buton11) ){
            text = buton11.getText();
            createQuestion3("Ce tip de combustibil are masina dvs. ?");
            JLabel5.setVisible(false);
            JPanel3.add(JLabel6);
            buton8.setVisible(false);
            buton9.setVisible(false);
            buton10.setVisible(false);
            buton11.setVisible(false);
            buton12.setVisible(true);
            buton13.setVisible(true);
            buton12.setText("MOTORINA");
            buton13.setText("BENZINA");
        }
        if(e.getSource()== buton12){
            text = buton12.getText();
            createQuestion4("Ce simptom are masina dvs. ?");
            JLabel6.setVisible(false);
            JPanel3.add(JLabel7);
            buton12.setVisible(false);
            buton13.setVisible(false);
            buton14.setVisible(true);
            buton14.setText("MASINA NU MAI ARE PUTERE");
            buton15.setVisible(true);
            buton15.setText("MASINII II FIERBE APA");
            buton16.setVisible(true);
            buton16.setText("MASINA TRONCANE SI NU E STABILA IN CURBE");
            buton17.setVisible(true);
            buton17.setText("MASINA PORNESTE GREU LA RECE SI TREPIDEAZA MOTORUL");
            buton18.setVisible(true);
            buton18.setText("MOTORUL DA RATEURI LA RECE");
            buton19.setVisible(true);
            buton19.setText("MASINA TOCESTE REPEDE CAUCIUCURILE");
        }
        if(e.getSource()== buton13){
            text = buton13.getText();
            createQuestion4("Ce simptom are masina dvs. ?");
            JLabel6.setVisible(false);
            JPanel3.add(JLabel7);
            buton12.setVisible(false);
            buton13.setVisible(false);
            buton14.setVisible(true);
            buton14.setText("MASINA NU MAI ARE PUTERE");
            buton15.setVisible(true);
            buton15.setText("MASINII II FIERBE APA");
            buton16.setVisible(true);
            buton16.setText("MASINA TRONCANE SI NU E STABILA IN CURBE");
            buton17.setVisible(true);
            buton17.setText("MASINA PORNESTE GREU LA RECE SI TREPIDEAZA MOTORUL");
            buton18.setVisible(true);
            buton18.setText("MOTORUL DA RATEURI LA RECE");
            buton19.setVisible(true);
            buton19.setText("MASINA TOCESTE REPEDE CAUCIUCURILE");
        }
        if(e.getSource()== buton14){
            text = buton14.getText();
            createQuestion5("Masina da fum alb?");
            JLabel7.setVisible(false);
            JPanel3.add(JLabel8);
            buton14.setVisible(false);
            buton16.setVisible(false);
            buton17.setVisible(false);
            buton18.setVisible(false);
            buton19.setVisible(false);
            buton15.setVisible(false);
            buton20.setVisible(true);
            buton20.setText("DA");
            buton21.setVisible(true);
            buton21.setText("NU");
        }
        if(e.getSource()== buton15){
            text = buton15.getText();
            createQuestion5("Scade nivelul la antigel?");
            JLabel7.setVisible(false);
            JPanel3.add(JLabel8);
            buton14.setVisible(false);
            buton16.setVisible(false);
            buton17.setVisible(false);
            buton18.setVisible(false);
            buton19.setVisible(false);
            buton15.setVisible(false);
            buton20.setVisible(true);
            buton20.setText("DA");
            buton21.setVisible(true);
            buton21.setText("NU");
        }
        if(e.getSource()== buton16){
            text = buton16.getText();
            createQuestion5("Curge ulei din telescoape?");
            JLabel7.setVisible(false);
            JPanel3.add(JLabel8);
            buton14.setVisible(false);
            buton16.setVisible(false);
            buton17.setVisible(false);
            buton18.setVisible(false);
            buton19.setVisible(false);
            buton15.setVisible(false);
            buton20.setVisible(true);
            buton20.setText("DA");
            buton21.setVisible(true);
            buton21.setText("NU");
        }
        if(e.getSource()== buton17){
            text = buton17.getText();
            createQuestion5("Incarca alternatorul?");
            JLabel7.setVisible(false);
            JPanel3.add(JLabel8);
            buton14.setVisible(false);
            buton16.setVisible(false);
            buton17.setVisible(false);
            buton18.setVisible(false);
            buton19.setVisible(false);
            buton15.setVisible(false);
            buton20.setVisible(true);
            buton20.setText("DA");
            buton21.setVisible(true);
            buton21.setText("NU");
        }
        if(e.getSource()== buton18){
            text = buton18.getText();
            createQuestion5("Masina are peste 150 000 km?");
            JLabel7.setVisible(false);
            JPanel3.add(JLabel8);
            buton14.setVisible(false);
            buton16.setVisible(false);
            buton17.setVisible(false);
            buton18.setVisible(false);
            buton19.setVisible(false);
            buton15.setVisible(false);
            buton20.setVisible(true);
            buton20.setText("DA");
            buton21.setVisible(true);
            buton21.setText("NU");
        }
        if(e.getSource()== buton19){
            text = buton19.getText();
            createQuestion5("Masinii i s-a reglat unghiul de fuga?");
            JLabel7.setVisible(false);
            JPanel3.add(JLabel8);
            buton14.setVisible(false);
            buton16.setVisible(false);
            buton17.setVisible(false);
            buton18.setVisible(false);
            buton19.setVisible(false);
            buton15.setVisible(false);
            buton20.setVisible(true);
            buton20.setText("DA");
            buton21.setVisible(true);
            buton21.setText("NU");
        }
        if(e.getSource()== buton20){
            text = buton20.getText();
            JLabel8.setVisible(false);
            JLabel9.setLocation(100,50);
            JLabel9.setSize(1000,300);
            JLabel9.setFont(new Font ( "Serif", Font.PLAIN, 30));
            JPanel3.add(JLabel9);
            buton20.setVisible(false);
            buton21.setVisible(false);
        }
        if(e.getSource()== buton21){
            text = buton21.getText();
            JLabel8.setVisible(false);
            JLabel9.setLocation(100,50);
            JLabel9.setSize(1500,300);
            JLabel9.setFont(new Font ( "Serif", Font.PLAIN, 30));
            JPanel3.add(JLabel9);
            buton20.setVisible(false);
            buton21.setVisible(false);
        }
        counter ++;
        if(b){
            System.out.println(text);
            inferenceEngine.inference(text);
            if(counter == 6) {
                JLabel9.setText(inferenceEngine.getConcluzie()); // in afara if-ului sus daca nu merge
                if (JLabel9.getText().contains("ALTERNATOR")) {
                    ImageIcon img = new ImageIcon("alternator.jpg");
                    JLabel JLabel10 = new JLabel();
                    JLabel10.setIcon(img);
                    JLabel10.setLocation(600, 300);
                    JLabel10.setSize(650, 350);
                    JPanel3.add(JLabel10);
                    JPanel3.revalidate();
                    JPanel3.repaint();
                }
                if (JLabel9.getText().contains("BUJII")) {
                    ImageIcon img = new ImageIcon("Bujie.jpg");
                    JLabel JLabel10 = new JLabel();
                    JLabel10.setIcon(img);
                    JLabel10.setLocation(600, 300);
                    JLabel10.setSize(650, 350);
                    JPanel3.add(JLabel10);
                    JPanel3.revalidate();
                    JPanel3.repaint();
                }
                if (JLabel9.getText().contains("SCHIMBARE EGR")) {
                    ImageIcon img = new ImageIcon("egr nou.jpeg");
                    JLabel JLabel10 = new JLabel();
                    JLabel10.setIcon(img);
                    JLabel10.setLocation(600, 300);
                    JLabel10.setSize(650, 350);
                    JPanel3.add(JLabel10);
                    JPanel3.revalidate();
                    JPanel3.repaint();
                }
                if (JLabel9.getText().contains("CURATARE EGR")) {
                    ImageIcon img = new ImageIcon("curatare egr.png");
                    JLabel JLabel10 = new JLabel();
                    JLabel10.setIcon(img);
                    JLabel10.setLocation(600, 300);
                    JLabel10.setSize(650, 350);
                    JPanel3.add(JLabel10);
                    JPanel3.revalidate();
                    JPanel3.repaint();
                }
                if (JLabel9.getText().contains("TELESCOAPE NOI")) {
                    ImageIcon img = new ImageIcon("telescoape.png");
                    JLabel JLabel10 = new JLabel();
                    JLabel10.setIcon(img);
                    JLabel10.setLocation(600, 300);
                    JLabel10.setSize(650, 350);
                    JPanel3.add(JLabel10);
                    JPanel3.revalidate();
                    JPanel3.repaint();
                }
                if (JLabel9.getText().contains("BRATE")) {
                    ImageIcon img = new ImageIcon("brate.jpg");
                    JLabel JLabel10 = new JLabel();
                    JLabel10.setIcon(img);
                    JLabel10.setLocation(600, 300);
                    JLabel10.setSize(650, 350);
                    JPanel3.add(JLabel10);
                    JPanel3.revalidate();
                    JPanel3.repaint();
                }
                if (JLabel9.getText().contains("TURBINA")) {
                    ImageIcon img = new ImageIcon("turbo.jpg");
                    JLabel JLabel10 = new JLabel();
                    JLabel10.setIcon(img);
                    JLabel10.setLocation(600, 300);
                    JLabel10.setSize(650, 350);
                    JPanel3.add(JLabel10);
                    JPanel3.revalidate();
                    JPanel3.repaint();
                }
                if (JLabel9.getText().contains("DPF")) {
                    ImageIcon img = new ImageIcon("CURATARE DPF.jpg");
                    JLabel JLabel10 = new JLabel();
                    JLabel10.setIcon(img);
                    JLabel10.setLocation(600, 300);
                    JLabel10.setSize(650, 350);
                    JPanel3.add(JLabel10);
                    JPanel3.revalidate();
                    JPanel3.repaint();
                }
                if (JLabel9.getText().contains("GARNITURA DE CHIULOASA")) {
                    ImageIcon img = new ImageIcon("garnitura chiuloasa.jpg");
                    JLabel JLabel10 = new JLabel();
                    JLabel10.setIcon(img);
                    JLabel10.setLocation(600, 300);
                    JLabel10.setSize(650, 350);
                    JPanel3.add(JLabel10);
                    JPanel3.revalidate();
                    JPanel3.repaint();
                }
                if (JLabel9.getText().contains("CHIULOASA")) {
                    ImageIcon img = new ImageIcon("chiuloasa.jpg");
                    JLabel JLabel10 = new JLabel();
                    JLabel10.setIcon(img);
                    JLabel10.setLocation(600, 300);
                    JLabel10.setSize(650, 350);
                    JPanel3.add(JLabel10);
                    JPanel3.revalidate();
                    JPanel3.repaint();
                }
                if (JLabel9.getText().contains("UNGHIUL DE FUGA")) {
                    ImageIcon img = new ImageIcon("unghi de fuga.jpeg");
                    JLabel JLabel10 = new JLabel();
                    JLabel10.setIcon(img);
                    JLabel10.setLocation(600, 300);
                    JLabel10.setSize(650, 350);
                    JPanel3.add(JLabel10);
                    JPanel3.revalidate();
                    JPanel3.repaint();
                }
                if (JLabel9.getText().contains("BIELETE NOI")) {
                    ImageIcon img = new ImageIcon("BIELETE.jpg");
                    JLabel JLabel10 = new JLabel();
                    JLabel10.setIcon(img);
                    JLabel10.setLocation(600, 300);
                    JLabel10.setSize(650, 350);
                    JPanel3.add(JLabel10);
                    JPanel3.revalidate();
                    JPanel3.repaint();
                }
            }
        }
    }

        public void SecondFrame() {
            f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
            f.setSize(1280,720);
            JPanel3.setBackground(new Color(204,255,200));
            JPanel3.setLayout(null);
            JPanel3.setBounds(0,250,2000,600);
            JPanel3.setBorder(BorderFactory.createTitledBorder(""));
            f.add(JPanel3);
            createQuestion("Care este marca masinii pe care o detineti ?");
            JPanel3.add(JLabel4);
            buton1.setSize(100,20);
            buton1.setLocation(100,250);
            buton1.setBackground(Color.orange);
            buton1.addActionListener(this);

            buton2.setSize(150,20);
            buton2.setLocation(100,270);
            buton2.setBackground(Color.orange);
            buton2.addActionListener(this);

            buton3.setSize(100,20);
            buton3.setLocation(100,290);
            buton3.setBackground(Color.orange);
            buton3.addActionListener(this);

            buton4.setSize(150,20);
            buton4.setLocation(100,310);
            buton4.setBackground(Color.orange);
            buton4.addActionListener(this);

            buton5.setSize(100,20);
            buton5.setLocation(100,330);
            buton5.setBackground(Color.orange);
            buton5.addActionListener(this);

            buton8.setSize(100,20);
            buton8.setLocation(100,270);
            buton8.setBackground(Color.orange);
            buton8.setVisible(false);
            buton8.addActionListener(this);

            buton9.setSize(100,20);
            buton9.setLocation(100,290);
            buton9.setBackground(Color.orange);
            buton9.setVisible(false);
            buton9.addActionListener(this);

            buton10.setSize(100,20);
            buton10.setLocation(100,310);
            buton10.setBackground(Color.orange);
            buton10.setVisible(false);
            buton10.addActionListener(this);

            buton11.setSize(100,20);
            buton11.setLocation(100,330);
            buton11.setBackground(Color.orange);
            buton11.setVisible(false);
            buton11.addActionListener(this);

            buton12.setSize(100,20);
            buton12.setLocation(100,250);
            buton12.setBackground(Color.orange);
            buton12.setVisible(false);
            buton12.addActionListener(this);

            buton13.setSize(100,20);
            buton13.setLocation(100,300);
            buton13.setBackground(Color.orange);
            buton13.setVisible(false);
            buton13.addActionListener(this);

            buton14.setSize(400,20);
            buton14.setLocation(100,250);
            buton14.setBackground(Color.orange);
            buton14.setVisible(false);
            buton14.addActionListener(this);

            buton15.setSize(400,20);
            buton15.setLocation(100,270);
            buton15.setBackground(Color.orange);
            buton15.setVisible(false);
            buton15.addActionListener(this);

            buton16.setSize(400,20);
            buton16.setLocation(100,290);
            buton16.setBackground(Color.orange);
            buton16.setVisible(false);
            buton16.addActionListener(this);

            buton17.setSize(400,20);
            buton17.setLocation(100,310);
            buton17.setBackground(Color.orange);
            buton17.setVisible(false);
            buton17.addActionListener(this);

            buton18.setSize(400,20);
            buton18.setLocation(100,330);
            buton18.setBackground(Color.orange);
            buton18.setVisible(false);
            buton18.addActionListener(this);

            buton19.setSize(400,20);
            buton19.setLocation(100,350);
            buton19.setBackground(Color.orange);
            buton19.setVisible(false);
            buton19.addActionListener(this);

            buton20.setSize(50,20);
            buton20.setLocation(100,250);
            buton20.setBackground(Color.orange);
            buton20.setVisible(false);
            buton20.addActionListener(this);

            buton21.setSize(50,20);
            buton21.setLocation(100,300);
            buton21.setBackground(Color.orange);
            buton21.setVisible(false);
            buton21.addActionListener(this);

            JPanel3.add(buton1);
            JPanel3.add(buton2);
            JPanel3.add(buton3);
            JPanel3.add(buton4);
            JPanel3.add(buton5);
            JPanel3.add(buton8);
            JPanel3.add(buton9);
            JPanel3.add(buton10);
            JPanel3.add(buton11);
            JPanel3.add(buton12);
            JPanel3.add(buton13);
            JPanel3.add(buton14);
            JPanel3.add(buton15);
            JPanel3.add(buton16);
            JPanel3.add(buton17);
            JPanel3.add(buton18);
            JPanel3.add(buton19);
            JPanel3.add(buton20);
            JPanel3.add(buton21);

            ButtonGroup menu1 = new ButtonGroup();
            menu1.add(buton1);
            menu1.add(buton2);
            menu1.add(buton3);
            menu1.add(buton4);
            menu1.add(buton5);

            ButtonGroup menu2 = new ButtonGroup();
            menu2.add(buton8);
            menu2.add(buton9);
            menu2.add(buton10);
            menu2.add(buton11);

            ButtonGroup menu3 = new ButtonGroup();
            menu3.add(buton12);
            menu3.add(buton13);

            ButtonGroup menu4 = new ButtonGroup();
            menu4.add(buton14);
            menu4.add(buton15);
            menu4.add(buton16);
            menu4.add(buton17);
            menu4.add(buton18);
            menu4.add(buton19);

            ButtonGroup menu5 = new ButtonGroup();
            menu5.add(buton20);
            menu5.add(buton21);
        }

    public void createQuestion(String q){
        JLabel4 = new JLabel(q);
        JLabel4.setVisible(true);
        JLabel4.setLocation(100,50);
        JLabel4.setSize(1000,300);
        JLabel4.setFont(new Font ( "Serif", Font.PLAIN, 30));
        JLabel4.validate();
    }

        public void createQuestion2(String q){
            JLabel5 = new JLabel(q);
            JLabel5.setLocation(100,50);
            JLabel5.setSize(1000,300);
            JLabel5.setFont(new Font ( "Serif", Font.PLAIN, 30));
        }

        public void createQuestion3(String q){
            JLabel6 = new JLabel(q);
            JLabel6.setLocation(100,50);
            JLabel6.setSize(1000,300);
            JLabel6.setFont(new Font ( "Serif", Font.PLAIN, 30));
        }
        public void createQuestion4(String q){
            JLabel7 = new JLabel(q);
            JLabel7.setLocation(100,50);
            JLabel7.setSize(1000,300);
            JLabel7.setFont(new Font ( "Serif", Font.PLAIN, 30));
        }
        public void createQuestion5(String q){
            JLabel8 = new JLabel(q);
            JLabel8.setLocation(100,50);
            JLabel8.setSize(1000,300);
            JLabel8.setFont(new Font ( "Serif", Font.PLAIN, 30));
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



    public static void main (String[] args) throws IOException {
        GUI g = new GUI();
        g.createFrame();
    }
}