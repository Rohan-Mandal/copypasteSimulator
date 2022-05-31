package copypasteSimulator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import static javax.swing.UIManager.*;

public class SimulatorFrame extends JFrame {

    public JButton about_button;
    public JCheckBox human_mode;
    public JLabel jLabel1;
    public JLabel jLabel2;
    public JLabel jLabel3;
    public JLabel jLabel4;
    public JScrollPane jScrollPane1;
    public JSeparator jSeparator1;
    public JSeparator jSeparator2;
    public JSeparator jSeparator3;
    public JLabel keystroke_lable;
    public JLabel lableInfo;
    public JCheckBox lineWrapCheckBox;
    public JProgressBar progress;
    public JComboBox startTimerCombobox;
    public JButton startTyping;
    public JButton stopTyping;
    public JComboBox strokeTimerComboBox;
    public JTextArea textArea;
    public JLabel version_lable;

    public static String version = "1.0";
    public static String tag = "#COC";
    private SimulatorWorker worker;

    /**
     * Creates new form SimulatorFrame
     *
     * @throws AWTException
     */
    public SimulatorFrame() throws AWTException {
        worker = new SimulatorWorker(this);
        initComponents();
        startUI();
    }

    public void startUI() {
        startTyping.setVisible(true);
        stopTyping.setVisible(false);
        version_lable.setText(version + " " + tag);
        lableInfo.setText("Ready for transfer");
        progress.setValue(0);
    }

    public void stopUI() {
        startTyping.setVisible(false);
        stopTyping.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jSeparator2 = new JSeparator();
        jScrollPane1 = new JScrollPane();
        textArea = new JTextArea();
        startTyping = new JButton();
        stopTyping = new JButton();
        version_lable = new JLabel();
        lableInfo = new JLabel();
        jSeparator1 = new JSeparator();
        jLabel2 = new JLabel();
        startTimerCombobox = new JComboBox();
        jLabel3 = new JLabel();
        strokeTimerComboBox = new JComboBox();
        jLabel4 = new JLabel();
        keystroke_lable = new JLabel();
        progress = new JProgressBar();
        lineWrapCheckBox = new JCheckBox();
        jSeparator3 = new JSeparator();
        human_mode = new JCheckBox();
        about_button = new JButton();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulator");
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        textArea.setColumns(20);
        textArea.setFont(new Font("Leelawadee UI", 0, 13)); // NOI18N
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        textArea.setPreferredSize(null);
        jScrollPane1.setViewportView(textArea);

        startTyping.setText("Start Typing");
        startTyping.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                startTypingActionPerformed(evt);
            }
        });

        stopTyping.setText("Stop Typing");
        stopTyping.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                stopTypingActionPerformed(evt);
            }
        });

        version_lable.setText("v0.X #XXXXXXi");

        lableInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lableInfo.setHorizontalAlignment(SwingConstants.CENTER);
        lableInfo.setText("To kaisa hai app log ?");

        jLabel2.setText("Timer duration (in Seconds)");

        startTimerCombobox.setModel(new DefaultComboBoxModel(new String[]{"2", "3", "4", "5", "6", "7", "8", " "}));
        startTimerCombobox.setSelectedIndex(3);
        startTimerCombobox.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                startTimerComboPropertyChange(evt);
            }
        });

        jLabel3.setText("Key Stroke response Time");

        strokeTimerComboBox.setModel(new DefaultComboBoxModel(new String[]{"2", "8", "10", "12", "50", "90", "100", "120", "150"}));
        strokeTimerComboBox.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                strokeTimerComboBoxPropertyChange(evt);
            }
        });

        jLabel4.setText("Countdown before Typing");
        keystroke_lable.setText("Controls Typing Speed");

        lineWrapCheckBox.setSelected(true);
        lineWrapCheckBox.setText("Word Wrap");
        lineWrapCheckBox.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                lineWrapCheckBoxPropertyChange(evt);
            }
        });

        jSeparator3.setOrientation(SwingConstants.VERTICAL);

        human_mode.setText("Human Mode");
        human_mode.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                human_modePropertyChange(evt);
            }
        });

        about_button.setFont(new Font("Leelawadee UI", 0, 18)); // NOI18N
        about_button.setText("Help");
        about_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                about_buttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel1.setText("Welcome To Copy-Paste Simulator ");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(startTyping)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(stopTyping)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(progress, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(version_lable))
                                                        .addComponent(lableInfo, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(strokeTimerComboBox, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(keystroke_lable))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(startTimerCombobox, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel4)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(lineWrapCheckBox)
                                                        .addComponent(human_mode))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(about_button))
                                        .addComponent(jSeparator1))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(startTyping)
                                                        .addComponent(stopTyping)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lableInfo, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(version_lable)
                                                        .addComponent(progress, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(startTimerCombobox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(strokeTimerComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(keystroke_lable)))
                                        .addComponent(about_button)
                                        .addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lineWrapCheckBox)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(human_mode)))
                                .addGap(10, 10, 10))
        );
        pack();
    }

    private void startTypingActionPerformed(ActionEvent evt) {
        String text = textArea.getText();
        worker.startRequest(text);
    }

    private void stopTypingActionPerformed(ActionEvent evt) {
        worker.stopRequest();
    }

    private void lineWrapCheckBoxPropertyChange(PropertyChangeEvent evt) {
        textArea.setLineWrap(lineWrapCheckBox.isSelected());
    }

    private void startTimerComboPropertyChange(PropertyChangeEvent evt) {
        int value = Integer.parseInt(startTimerCombobox.getSelectedItem().toString());
        worker.setStartTime(value);
    }

    private void strokeTimerComboBoxPropertyChange(PropertyChangeEvent evt) {
        int value = Integer.parseInt(strokeTimerComboBox.getSelectedItem().toString());
        worker.setKeyStrokeDelay(value);
    }

    private void about_buttonActionPerformed(ActionEvent evt) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                HelpFrame frame = new HelpFrame();
                frame.setVisible(true);
            }
        });
    }

    private void human_modePropertyChange(PropertyChangeEvent evt) {
        if (human_mode.isSelected()) {
            strokeTimerComboBox.setSelectedIndex(5);
            setSpeedControlEnabled(false);
        } else {
            strokeTimerComboBox.setSelectedIndex(0);
            setSpeedControlEnabled(true);
        }
    }

    private void setSpeedControlEnabled(boolean isEnabled) {
        if (isEnabled) {
            keystroke_lable.setText("Controls Typing speed.");
        } else {
            keystroke_lable.setText("Turn off HUMAN MODE to access speed control");
        }
        strokeTimerComboBox.setEnabled(isEnabled);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (LookAndFeelInfo info : getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
        }

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    SimulatorFrame frame = new SimulatorFrame();
                    frame.setAlwaysOnTop(true);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                } catch (AWTException ex) {
                }
            }
        });
    }
}

