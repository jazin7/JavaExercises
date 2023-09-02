import javax.swing.*;
import java.awt.event.*;

public class UniplanerGUI extends JDialog {
    private JPanel contentPane;
    private JTextField nameTextField;
    private JComboBox wochentagComboBox;
    private JTextField uhrzeitTextField;
    private JSpinner uhrzeitSpinner;
    private JTextField raumTextField;
    private JRadioButton vorlesungRadioButton;
    private JRadioButton ubungRadioButton;
    private JList<Veranstaltung> listVeranstaltungen;
    private JButton hinzufugenButton;
    private JButton loschenButton;
    private JTextArea notizenTextArea;
    private JButton speichernButton;

    public UniplanerGUI() {
        setContentPane(contentPane);
        setModal(true);;

        setTitle("Uniplaner");


        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });


        DefaultListModel<Veranstaltung> listModel = new DefaultListModel<>();

        Veranstaltung v1 = new Veranstaltung("ProPro");
        v1.setNotizen("Klausurtermin am 20.9.");
        v1.setTyp(Veranstaltung.Typ.VORLESUNG);
        v1.setUhrzeit("16:15");
        listModel.addElement(v1);

        Veranstaltung v2 = new Veranstaltung("WebEng");
        v2.setWochentag("Dienstag");
        v2.setTyp(Veranstaltung.Typ.UEBUNG);
        v2.setNotizen("Klausurtermin am 11.9.");
        v2.setUhrzeit("12:15");
        listModel.addElement(v2);

        listVeranstaltungen.setModel(listModel);

        listVeranstaltungen.addListSelectionListener(e -> {
            Veranstaltung ausgewaehlt = listVeranstaltungen.getSelectedValue();
            if (ausgewaehlt==null){
                return;
            }

            nameTextField.setText(ausgewaehlt.getName());
            wochentagComboBox.setSelectedItem(ausgewaehlt.getWochentag());
            uhrzeitTextField.setText(ausgewaehlt.getUhrzeit());
            uhrzeitSpinner.setValue(ausgewaehlt.getDauer());
            vorlesungRadioButton.setSelected(ausgewaehlt.getTyp() == Veranstaltung.Typ.VORLESUNG);
            ubungRadioButton.setSelected(ausgewaehlt.getTyp() == Veranstaltung.Typ.UEBUNG);
            notizenTextArea.setText(ausgewaehlt.getNotizen());
        });


        hinzufugenButton.addActionListener(e -> {
            listModel.addElement(new Veranstaltung("Neue Veranstaltung"));
            listVeranstaltungen.setSelectedIndex(listModel.size() - 1);
        });

        loschenButton.addActionListener(e -> {
            int index = listVeranstaltungen.getSelectedIndex();
            if(index >= 0){
                listModel.remove(index);
            }
            if (index > listModel.size()) {
                listVeranstaltungen.setSelectedIndex(index);
            }
            else {
                listVeranstaltungen.setSelectedIndex(index - 1);
            }
        });


        speichernButton.addActionListener(e -> {
            Veranstaltung ausgewaehlt = listVeranstaltungen.getSelectedValue();
            if(ausgewaehlt==null){
                return;
            }

            ausgewaehlt.setName(nameTextField.getText());
            ausgewaehlt.setWochentag(wochentagComboBox.getSelectedItem().toString());
            ausgewaehlt.setUhrzeit(uhrzeitTextField.getText());
            ausgewaehlt.setDauer((Integer) uhrzeitSpinner.getValue());
            ausgewaehlt.setTyp(vorlesungRadioButton.isSelected() ? Veranstaltung.Typ.VORLESUNG : Veranstaltung.Typ.UEBUNG);
            ausgewaehlt.setNotizen(notizenTextArea.getText());

            listVeranstaltungen.updateUI();
        });




        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }





    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        UniplanerGUI dialog = new UniplanerGUI();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
