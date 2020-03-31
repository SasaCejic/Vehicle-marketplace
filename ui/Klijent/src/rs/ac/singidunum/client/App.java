package rs.ac.singidunum.client;

import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class App {
    private static JPanel MainPanel;
    private static JPanel contentPane;
    private static JButton prikaziAutomobile;
    private static JTextArea prikaziAutomobileRezultat;
    private static JButton pronadjiAutomobil;
    private static JTextArea pronadjiAutomobilPretraga;
    private static JTextArea pronadjiAutomobilRezultat;
    private static JButton dodajAutomobil;
    private static JTextArea dodajAutomobilInputId;
    private static JTextArea dodajAutomobilInputMarka;
    private static JTextArea dodajAutomobilInputModel;
    private static JTextArea dodajAutomobilInputGodinaProizvodnje;
    private static JTextArea dodajAutomobilInputZapreminaMotora;
    private static JTextArea dodajAutomobilInputGorivo;
    private static JTextArea dodajAutomobilInputZapreminaRezervoara;
    private static JTextArea dodajAutomobilInputBrojVrata;
    private static JTextArea dodajAutomobilInputZapreminaPrtljaznika;
    private static JTextArea dodajAutomobilRezultat;
    private static JButton biloKojiAutomobil;
    private static JTextArea biloKojiAutomobilRezultat;
    private static JButton prikaziProizvodjacaAutomobila;
    private static JTextArea prikaziProizvodjacaAutomobilaInputId;
    private static JTextArea prikaziProizvodjacaAutomobilaRezultat;
    private static JButton prikaziModelAutomobila;
    private static JTextArea prikaziModelAutomobilaInputId;
    private static JTextArea prikaziModelAutomobilaRezultat;
    private static JButton prikaziBrojAutomobila;
    private static JTextArea prikaziBrojAutomobilaRezultat;
    private static JButton prikaziListuProizvodjacaAutomobila;
    private static JTextArea prikaziListuProizvodjacaAutomobilaRezultat;

    private static JButton prikaziMotocikle;
    private static JTextArea prikaziMotocikleRezultat;
    private static JButton pronadjiMotocikl;
    private static JTextArea pronadjiMotociklPretraga;
    private static JTextArea pronadjiMotociklRezultat;
    private static JButton dodajMotocikl;
    private static JTextArea dodajMotociklInputId;
    private static JTextArea dodajMotociklInputMarka;
    private static JTextArea dodajMotociklInputModel;
    private static JTextArea dodajMotociklInputGodinaProizvodnje;
    private static JTextArea dodajMotociklInputZapreminaMotora;
    private static JTextArea dodajMotociklInputGorivo;
    private static JTextArea dodajMotociklInputZapreminaRezervoara;
    private static JTextArea dodajMotociklInputPrenos;
    private static JTextArea dodajMotociklInputTipRama;
    private static JTextArea dodajMotociklRezultat;
    private static JButton biloKojiMotocikl;
    private static JTextArea biloKojiMotociklRezultat;
    private static JButton prikaziProizvodjacaMotocikla;
    private static JTextArea prikaziProizvodjacaMotociklaInputId;
    private static JTextArea prikaziProizvodjacaMotociklaRezultat;
    private static JButton prikaziModelMotocikla;
    private static JTextArea prikaziModelMotociklaInputId;
    private static JTextArea prikaziModelMotociklaRezultat;
    private static JButton prikaziBrojMotocikala;
    private static JTextArea prikaziBrojMotocikalaRezultat;
    private static JButton prikaziListuProizvodjacaMotocikala;
    private static JTextArea prikaziListuProizvodjacaMotocikalaRezultat;

    public App(){

        prikaziAutomobile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prikaziAutomobileRezultat.setText("");
                try{
                    prikaziAutomobileRezultat.append(Connect.get("http://localhost:8080/automobili"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        pronadjiAutomobil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pronadjiAutomobilRezultat.setText("");
                String id = pronadjiAutomobilPretraga.getText();
                try{
                    pronadjiAutomobilRezultat.append(Connect.get("http://localhost:8080/automobili/" + id));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        dodajAutomobil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dodajAutomobilRezultat.setText("");
                String automobil = "{" +
                        "\"id\":\"" + dodajAutomobilInputId.getText() + "\"," +
                        "\"marka\":\"" + dodajAutomobilInputMarka.getText() + "\"," +
                        "\"model\":\"" + dodajAutomobilInputModel.getText() + "\"," +
                        "\"godinaProizvodnje\":\"" + dodajAutomobilInputGodinaProizvodnje.getText() + "\"," +
                        "\"zapreminaMotora\":\"" + dodajAutomobilInputZapreminaMotora.getText() + "\"," +
                        "\"gorivo\":\"" + dodajAutomobilInputGorivo.getText() + "\"," +
                        "\"zapreminaRezervoara\":\"" + dodajAutomobilInputZapreminaRezervoara.getText() + "\"," +
                        "\"brojVrata\":\"" + dodajAutomobilInputBrojVrata.getText() + "\"," +
                        "\"zapreminaPrtljaznika\":\"" + dodajAutomobilInputZapreminaPrtljaznika.getText() + "\"" +
                        "}";




                try {
                    dodajAutomobilRezultat.append(Connect.post("http://localhost:8080/dodaj",automobil));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });


        biloKojiAutomobil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                biloKojiAutomobilRezultat.setText("");
                try{
                    biloKojiAutomobilRezultat.append(Connect.get("http://localhost:8080/bilokojiautomobil"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        prikaziProizvodjacaAutomobila.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prikaziProizvodjacaAutomobilaRezultat.setText("");
                String id = prikaziProizvodjacaAutomobilaInputId.getText();
                try{
                    prikaziProizvodjacaAutomobilaRezultat.append(Connect.get("http://localhost:8080/proizvodjaci/" + id));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        prikaziModelAutomobila.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prikaziModelAutomobilaRezultat.setText("");
                String id = prikaziModelAutomobilaInputId.getText();
                try{
                    prikaziModelAutomobilaRezultat.append(Connect.get("http://localhost:8080/modeli/" + id));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        prikaziBrojAutomobila.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prikaziBrojAutomobilaRezultat.setText("");
                try{
                    prikaziBrojAutomobilaRezultat.append(Connect.get("http://localhost:8080/brojautomobila"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        prikaziListuProizvodjacaAutomobila.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prikaziListuProizvodjacaAutomobilaRezultat.setText("");
                try{
                    prikaziListuProizvodjacaAutomobilaRezultat.append(Connect.get("http://localhost:8080/proizvodjaci"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        prikaziMotocikle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prikaziMotocikleRezultat.setText("");
                try{
                    prikaziMotocikleRezultat.append(Connect.get("http://localhost:1313/motocikli"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        pronadjiMotocikl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pronadjiMotociklRezultat.setText("");
                String id = pronadjiMotociklPretraga.getText();
                try{
                    pronadjiMotociklRezultat.append(Connect.get("http://localhost:1313/motocikli/" + id));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        dodajMotocikl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dodajMotociklRezultat.setText("");
                String motocikl = "{" +
                        "\"id\":\"" + dodajMotociklInputId.getText() + "\"," +
                        "\"marka\":\"" + dodajMotociklInputMarka.getText() + "\"," +
                        "\"model\":\"" + dodajMotociklInputModel.getText() + "\"," +
                        "\"godinaProizvodnje\":\"" + dodajMotociklInputGodinaProizvodnje.getText() + "\"," +
                        "\"zapreminaMotora\":\"" + dodajMotociklInputZapreminaMotora.getText() + "\"," +
                        "\"gorivo\":\"" + dodajMotociklInputGorivo.getText() + "\"," +
                        "\"zapreminaRezervoara\":\"" + dodajMotociklInputZapreminaRezervoara.getText() + "\"," +
                        "\"prenos\":\"" + dodajMotociklInputPrenos.getText() + "\"," +
                        "\"tipRama\":\"" + dodajMotociklInputTipRama.getText() + "\"" +
                        "}";




                try {
                    dodajMotociklRezultat.append(Connect.post("http://localhost:1313/dodaj",motocikl));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });


        biloKojiMotocikl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                biloKojiMotociklRezultat.setText("");
                try{
                    biloKojiMotociklRezultat.append(Connect.get("http://localhost:1313/bilokojimotocikl"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        prikaziProizvodjacaMotocikla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prikaziProizvodjacaMotociklaRezultat.setText("");
                String id = prikaziProizvodjacaMotociklaInputId.getText();
                try{
                    prikaziProizvodjacaMotociklaRezultat.append(Connect.get("http://localhost:1313/proizvodjaci/" + id));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        prikaziModelMotocikla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prikaziModelMotociklaRezultat.setText("");
                String id = prikaziModelMotociklaInputId.getText();
                try{
                    prikaziModelMotociklaRezultat.append(Connect.get("http://localhost:1313/modeli/" + id));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        prikaziBrojMotocikala.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prikaziBrojMotocikalaRezultat.setText("");
                try{
                    prikaziBrojMotocikalaRezultat.append(Connect.get("http://localhost:1313/brojmotocikala"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        prikaziListuProizvodjacaMotocikala.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prikaziListuProizvodjacaMotocikalaRezultat.setText("");
                try{
                    prikaziListuProizvodjacaMotocikalaRezultat.append(Connect.get("http://localhost:1313/proizvodjaci"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });



    }

    public static void main(String[] args) {
        createUIComponents();
        JFrame frame = new JFrame("Auto-moto prodavnica");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setContentPane(new App().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static void createUIComponents(){
        MainPanel = new JPanel();

        prikaziAutomobile = new JButton("Prikaži");
        prikaziAutomobileRezultat = new JTextArea(3,20);
        pronadjiAutomobil = new JButton("Pronađi");
        pronadjiAutomobilPretraga = new JTextArea();
        pronadjiAutomobilRezultat = new JTextArea();
        dodajAutomobil = new JButton("Dodaj");
        dodajAutomobilInputId = new JTextArea();
        dodajAutomobilInputMarka = new JTextArea();
        dodajAutomobilInputModel = new JTextArea();
        dodajAutomobilInputGodinaProizvodnje = new JTextArea();
        dodajAutomobilInputZapreminaMotora = new JTextArea();
        dodajAutomobilInputGorivo = new JTextArea();
        dodajAutomobilInputZapreminaRezervoara = new JTextArea();
        dodajAutomobilInputBrojVrata = new JTextArea();
        dodajAutomobilInputZapreminaPrtljaznika = new JTextArea();
        dodajAutomobilRezultat = new JTextArea();
        biloKojiAutomobil = new JButton("Prikaži");
        biloKojiAutomobilRezultat = new JTextArea();
        prikaziProizvodjacaAutomobila = new JButton("Prikaži");
        prikaziProizvodjacaAutomobilaInputId = new JTextArea();
        prikaziProizvodjacaAutomobilaRezultat = new JTextArea();
        prikaziModelAutomobila = new JButton("Prikaži");
        prikaziModelAutomobilaInputId = new JTextArea();
        prikaziModelAutomobilaRezultat = new JTextArea();
        prikaziBrojAutomobila = new JButton("Pirkaži");
        prikaziBrojAutomobilaRezultat = new JTextArea();
        prikaziListuProizvodjacaAutomobila = new JButton("Prikaži");
        prikaziListuProizvodjacaAutomobilaRezultat = new JTextArea();

        MainPanel.setLayout(new BoxLayout(MainPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(MainPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(0, 0, 1370, 706);
        contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(1370, 706));
        contentPane.add(scrollPane);

        prikaziAutomobileRezultat.setLineWrap(true);
        prikaziAutomobileRezultat.setWrapStyleWord(true);

        MainPanel.add(new JLabel("AUTOMOBILI"));
        MainPanel.add(new JLabel("Prikaži sve automobile"));
        MainPanel.add(prikaziAutomobile);
        MainPanel.add(prikaziAutomobileRezultat);

        pronadjiAutomobilRezultat.setLineWrap(true);
        pronadjiAutomobilRezultat.setWrapStyleWord(true);
        pronadjiAutomobilPretraga.setLineWrap(true);
        pronadjiAutomobilPretraga.setWrapStyleWord(true);

        MainPanel.add(new JLabel("Pronađi automobil"));
        MainPanel.add(new JLabel("id"));
        MainPanel.add(pronadjiAutomobilPretraga);
        MainPanel.add(pronadjiAutomobil);
        MainPanel.add(pronadjiAutomobilRezultat);

        dodajAutomobilRezultat.setLineWrap(true);
        dodajAutomobilRezultat.setWrapStyleWord(true);
        dodajAutomobilInputId.setLineWrap(true);
        dodajAutomobilInputId.setWrapStyleWord(true);
        dodajAutomobilInputMarka.setLineWrap(true);
        dodajAutomobilInputMarka.setWrapStyleWord(true);
        dodajAutomobilInputModel.setLineWrap(true);
        dodajAutomobilInputModel.setWrapStyleWord(true);
        dodajAutomobilInputGodinaProizvodnje.setLineWrap(true);
        dodajAutomobilInputGodinaProizvodnje.setWrapStyleWord(true);
        dodajAutomobilInputZapreminaMotora.setLineWrap(true);
        dodajAutomobilInputZapreminaMotora.setWrapStyleWord(true);
        dodajAutomobilInputGorivo.setLineWrap(true);
        dodajAutomobilInputGorivo.setWrapStyleWord(true);
        dodajAutomobilInputZapreminaRezervoara.setLineWrap(true);
        dodajAutomobilInputZapreminaRezervoara.setWrapStyleWord(true);
        dodajAutomobilInputBrojVrata.setLineWrap(true);
        dodajAutomobilInputBrojVrata.setWrapStyleWord(true);
        dodajAutomobilInputZapreminaPrtljaznika.setLineWrap(true);
        dodajAutomobilInputZapreminaPrtljaznika.setWrapStyleWord(true);

        MainPanel.add(new JLabel("Dodaj automobil"));
        MainPanel.add(new JLabel("id"));
        MainPanel.add(dodajAutomobilInputId);
        MainPanel.add(new JLabel("marka"));
        MainPanel.add(dodajAutomobilInputMarka);
        MainPanel.add(new JLabel("model"));
        MainPanel.add(dodajAutomobilInputModel);
        MainPanel.add(new JLabel("godina proizvodnje"));
        MainPanel.add(dodajAutomobilInputGodinaProizvodnje);
        MainPanel.add(new JLabel("zapremina motora"));
        MainPanel.add(dodajAutomobilInputZapreminaMotora);
        MainPanel.add(new JLabel("gorivo"));
        MainPanel.add(dodajAutomobilInputGorivo);
        MainPanel.add(new JLabel("zapremina rezervoara"));
        MainPanel.add(dodajAutomobilInputZapreminaRezervoara);
        MainPanel.add(new JLabel("broj vrata"));
        MainPanel.add(dodajAutomobilInputBrojVrata);
        MainPanel.add(new JLabel("zapremina prtljažnika"));
        MainPanel.add(dodajAutomobilInputZapreminaPrtljaznika);
        MainPanel.add(dodajAutomobil);
        MainPanel.add(dodajAutomobilRezultat);

        biloKojiAutomobilRezultat.setLineWrap(true);
        biloKojiAutomobilRezultat.setWrapStyleWord(true);

        MainPanel.add(new JLabel("Prikaži bilo koji automobil"));
        MainPanel.add(biloKojiAutomobil);
        MainPanel.add(biloKojiAutomobilRezultat);

        prikaziProizvodjacaAutomobilaInputId.setLineWrap(true);
        prikaziProizvodjacaAutomobilaInputId.setWrapStyleWord(true);
        prikaziProizvodjacaAutomobilaRezultat.setLineWrap(true);
        prikaziProizvodjacaAutomobilaRezultat.setLineWrap(true);

        MainPanel.add(new JLabel("Prikaži proizvođača automobila"));
        MainPanel.add(new JLabel("id"));
        MainPanel.add(prikaziProizvodjacaAutomobilaInputId);
        MainPanel.add(prikaziProizvodjacaAutomobila);
        MainPanel.add(prikaziProizvodjacaAutomobilaRezultat);

        prikaziModelAutomobilaInputId.setLineWrap(true);
        prikaziModelAutomobilaInputId.setWrapStyleWord(true);
        prikaziModelAutomobilaRezultat.setLineWrap(true);
        prikaziModelAutomobilaRezultat.setWrapStyleWord(true);

        MainPanel.add(new JLabel("Prikaži model automobila"));
        MainPanel.add(new JLabel("id"));
        MainPanel.add(prikaziModelAutomobilaInputId);
        MainPanel.add(prikaziModelAutomobila);
        MainPanel.add(prikaziModelAutomobilaRezultat);

        prikaziBrojAutomobilaRezultat.setLineWrap(true);
        prikaziBrojAutomobilaRezultat.setWrapStyleWord(true);

        MainPanel.add(new JLabel("Prikaži ukupan broj automobila"));
        MainPanel.add(prikaziBrojAutomobila);
        MainPanel.add(prikaziBrojAutomobilaRezultat);

        prikaziListuProizvodjacaAutomobilaRezultat.setLineWrap(true);
        prikaziListuProizvodjacaAutomobilaRezultat.setWrapStyleWord(true);

        MainPanel.add(new JLabel("Prikaži listu proizvođača automobila"));
        MainPanel.add(prikaziListuProizvodjacaAutomobila);
        MainPanel.add(prikaziListuProizvodjacaAutomobilaRezultat);

        prikaziMotocikle = new JButton("Prikaži");
        prikaziMotocikleRezultat = new JTextArea(3,20);
        pronadjiMotocikl = new JButton("Pronađi");
        pronadjiMotociklPretraga = new JTextArea();
        pronadjiMotociklRezultat = new JTextArea();
        dodajMotocikl = new JButton("Dodaj");
        dodajMotociklInputId = new JTextArea();
        dodajMotociklInputMarka = new JTextArea();
        dodajMotociklInputModel = new JTextArea();
        dodajMotociklInputGodinaProizvodnje = new JTextArea();
        dodajMotociklInputZapreminaMotora = new JTextArea();
        dodajMotociklInputGorivo = new JTextArea();
        dodajMotociklInputZapreminaRezervoara = new JTextArea();
        dodajMotociklInputPrenos = new JTextArea();
        dodajMotociklInputTipRama = new JTextArea();
        dodajMotociklRezultat = new JTextArea();
        biloKojiMotocikl = new JButton("Prikaži");
        biloKojiMotociklRezultat = new JTextArea();
        prikaziProizvodjacaMotocikla = new JButton("Prikaži");
        prikaziProizvodjacaMotociklaInputId = new JTextArea();
        prikaziProizvodjacaMotociklaRezultat = new JTextArea();
        prikaziModelMotocikla = new JButton("Prikaži");
        prikaziModelMotociklaInputId = new JTextArea();
        prikaziModelMotociklaRezultat = new JTextArea();
        prikaziBrojMotocikala = new JButton("Pirkaži");
        prikaziBrojMotocikalaRezultat = new JTextArea();
        prikaziListuProizvodjacaMotocikala = new JButton("Prikaži");
        prikaziListuProizvodjacaMotocikalaRezultat = new JTextArea();

        prikaziMotocikleRezultat.setLineWrap(true);
        prikaziMotocikleRezultat.setWrapStyleWord(true);

        MainPanel.add(new JLabel("MOTOCIKLI"));
        MainPanel.add(new JLabel("Prikaži sve motocikle"));
        MainPanel.add(prikaziMotocikle);
        MainPanel.add(prikaziMotocikleRezultat);

        pronadjiMotociklRezultat.setLineWrap(true);
        pronadjiMotociklRezultat.setWrapStyleWord(true);
        pronadjiMotociklPretraga.setLineWrap(true);
        pronadjiMotociklPretraga.setWrapStyleWord(true);

        MainPanel.add(new JLabel("Pronađi motocikl"));
        MainPanel.add(new JLabel("id"));
        MainPanel.add(pronadjiMotociklPretraga);
        MainPanel.add(pronadjiMotocikl);
        MainPanel.add(pronadjiMotociklRezultat);

        dodajMotociklRezultat.setLineWrap(true);
        dodajMotociklRezultat.setWrapStyleWord(true);
        dodajMotociklInputId.setLineWrap(true);
        dodajMotociklInputId.setWrapStyleWord(true);
        dodajMotociklInputMarka.setLineWrap(true);
        dodajMotociklInputMarka.setWrapStyleWord(true);
        dodajMotociklInputModel.setLineWrap(true);
        dodajMotociklInputModel.setWrapStyleWord(true);
        dodajMotociklInputGodinaProizvodnje.setLineWrap(true);
        dodajMotociklInputGodinaProizvodnje.setWrapStyleWord(true);
        dodajMotociklInputZapreminaMotora.setLineWrap(true);
        dodajMotociklInputZapreminaMotora.setWrapStyleWord(true);
        dodajMotociklInputGorivo.setLineWrap(true);
        dodajMotociklInputGorivo.setWrapStyleWord(true);
        dodajMotociklInputZapreminaRezervoara.setLineWrap(true);
        dodajMotociklInputZapreminaRezervoara.setWrapStyleWord(true);
        dodajMotociklInputPrenos.setLineWrap(true);
        dodajMotociklInputPrenos.setWrapStyleWord(true);
        dodajMotociklInputTipRama.setLineWrap(true);
        dodajMotociklInputTipRama.setWrapStyleWord(true);

        MainPanel.add(new JLabel("Dodaj motocikl"));
        MainPanel.add(new JLabel("id"));
        MainPanel.add(dodajMotociklInputId);
        MainPanel.add(new JLabel("marka"));
        MainPanel.add(dodajMotociklInputMarka);
        MainPanel.add(new JLabel("model"));
        MainPanel.add(dodajMotociklInputModel);
        MainPanel.add(new JLabel("godina proizvodnje"));
        MainPanel.add(dodajMotociklInputGodinaProizvodnje);
        MainPanel.add(new JLabel("zapremina motora"));
        MainPanel.add(dodajMotociklInputZapreminaMotora);
        MainPanel.add(new JLabel("gorivo"));
        MainPanel.add(dodajMotociklInputGorivo);
        MainPanel.add(new JLabel("zapremina rezervoara"));
        MainPanel.add(dodajMotociklInputZapreminaRezervoara);
        MainPanel.add(new JLabel("prenos"));
        MainPanel.add(dodajMotociklInputPrenos);
        MainPanel.add(new JLabel("tip rama"));
        MainPanel.add(dodajMotociklInputTipRama);
        MainPanel.add(dodajMotocikl);
        MainPanel.add(dodajMotociklRezultat);

        biloKojiMotociklRezultat.setLineWrap(true);
        biloKojiMotociklRezultat.setWrapStyleWord(true);

        MainPanel.add(new JLabel("Prikaži bilo koji motocikl"));
        MainPanel.add(biloKojiMotocikl);
        MainPanel.add(biloKojiMotociklRezultat);

        prikaziProizvodjacaMotociklaInputId.setLineWrap(true);
        prikaziProizvodjacaMotociklaInputId.setWrapStyleWord(true);
        prikaziProizvodjacaMotociklaRezultat.setLineWrap(true);
        prikaziProizvodjacaMotociklaRezultat.setLineWrap(true);

        MainPanel.add(new JLabel("Prikaži proizvođača motocikla"));
        MainPanel.add(new JLabel("id"));
        MainPanel.add(prikaziProizvodjacaMotociklaInputId);
        MainPanel.add(prikaziProizvodjacaMotocikla);
        MainPanel.add(prikaziProizvodjacaMotociklaRezultat);

        prikaziModelMotociklaInputId.setLineWrap(true);
        prikaziModelMotociklaInputId.setWrapStyleWord(true);
        prikaziModelMotociklaRezultat.setLineWrap(true);
        prikaziModelMotociklaRezultat.setWrapStyleWord(true);

        MainPanel.add(new JLabel("Prikaži model motocikla"));
        MainPanel.add(new JLabel("id"));
        MainPanel.add(prikaziModelMotociklaInputId);
        MainPanel.add(prikaziModelMotocikla);
        MainPanel.add(prikaziModelMotociklaRezultat);

        prikaziBrojMotocikalaRezultat.setLineWrap(true);
        prikaziBrojMotocikalaRezultat.setWrapStyleWord(true);

        MainPanel.add(new JLabel("Prikaži ukupan broj motocikala"));
        MainPanel.add(prikaziBrojMotocikala);
        MainPanel.add(prikaziBrojMotocikalaRezultat);

        prikaziListuProizvodjacaMotocikalaRezultat.setLineWrap(true);
        prikaziListuProizvodjacaMotocikalaRezultat.setWrapStyleWord(true);

        MainPanel.add(new JLabel("Prikaži listu proizvođača motocikala"));
        MainPanel.add(prikaziListuProizvodjacaMotocikala);
        MainPanel.add(prikaziListuProizvodjacaMotocikalaRezultat);

    }
}
