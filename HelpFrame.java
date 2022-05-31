package copypasteSimulator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;

public class HelpFrame extends JFrame {

    public JButton jButton1;
    public JLabel jLabel1;
    public JLabel jLabel2;
    public JLabel jLabel3;
    public JLabel jLabel4;
    public JLabel jLabel5;
    public JLabel jLabel6;
    public JLabel jLabel7;
    public JScrollPane jScrollPane1;
    public JSeparator jSeparator1;
    public JSeparator jSeparator2;
    public JTextArea jTextArea1;
    public JButton rohan_github;

    /**
     * Creates new form HelpFrame
     */
    public HelpFrame() {
        initComponents();
        jTextArea1.setCaretPosition(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jButton1 = new JButton();
        jLabel7 = new JLabel();
        jSeparator1 = new JSeparator();
        jSeparator2 = new JSeparator();
        rohan_github = new JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new Font("Leelawadee UI", 0, 16)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\"The best things in life comes free of cost \"  and so is this simulator. \nSteps to use simulator:-\n1.Paste/Type  some Text in the space given below.\n2.Click on \"start typing\" button below. A 5 timer will start.\n3.Go to the target window where copy/paste is disabled and place the cursor there within that 5 seconds timer.\n4.Sit back and relax. After the timer end.Simulator will transfer all of the text to that window.\nNote:- Dont use the system for anything else while simulator is running.\n\nIt works by stimulating Keystrokes for the given text and doesn't  interact with the Js inside the browser. \nStarting from v1.0 there's a \"Human mode\" which types at a much  slow speed and takes beaks at certain  intervals.\n \nThis projects is still under devlopement and requires support for diffrent keyborad layouts and missing keys. Even as little as reporting an issue helps a lot.\nAur thora padh bhi liya karo, simulator interview me kam nahi ayega.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel2.setText("Contributors :-");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel3.setText("1. Rohan Mandal");


        jButton1.setText("Copy-Paste Simulator on Github");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                gitHubButtonAction(evt);
            }
        });

        rohan_github.setText("Github Profile");
        rohan_github.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                gitHubButtonAction(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jButton1)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel6))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel4)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jSeparator1, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                                                        .addComponent(jSeparator2))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel5))
                                                                        .addGap(35, 35, 35)
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(rohan_github))
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jLabel7)))
                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                )));

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel7)
                                        .addComponent(rohan_github))
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 5, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(5, 5, 5)
                                                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5))
                                                .addContainerGap(29, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)))));
        pack();
    }

    private void gitHubButtonAction(ActionEvent evt) {
        openLink("https://github.com/Rohan-Mandal/Copy-Paste-Simulator");
    }

    private void openLink(String link) {
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(URI.create(link));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpFrame().setVisible(true);
            }
        });
    }
}

