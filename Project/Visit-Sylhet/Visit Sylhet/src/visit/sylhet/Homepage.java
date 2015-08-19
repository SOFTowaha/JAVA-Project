package visit.sylhet;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.IOException;
import java.net.MalformedURLException;

public class Homepage extends javax.swing.JFrame {

    public Homepage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ZilaCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PlaceCombo = new javax.swing.JComboBox();
        FinalGo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        ZilaCombo.setFont(new java.awt.Font("Siyam Rupali", 1, 24)); // NOI18N
        ZilaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "নির্বাচন করুন ", "সিলেট শহর", "মৌলভীবাজার", "সুনামগঞ্জ", "হবিগঞ্জ" }));
        ZilaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZilaComboActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Siyam Rupali", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("দর্শনীয় স্থানঃ ");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Siyam Rupali", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("জেলাঃ");

        PlaceCombo.setFont(new java.awt.Font("Siyam Rupali", 1, 24)); // NOI18N
        PlaceCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "নির্বাচন করুন ", "পাংথুমাই", "বিছানাকান্দি", "লক্ষনছড়া", "করুমছড়া", "জাফলং", "সারিয়াঘাট", "জৈন্তাপুর", "রাতারগুল", "ভোলাগঞ্জ", "মালিনিছড়া", "লোভাছড়া", "বি টি আর আই", "লাউয়াছড়া", "মাধবকুণ্ড", "পারিকুন্ড", "হামহাম", "টাঙ্গুয়ার হাওড়", "নারায়ণতলা", "জাদুকাটা", " " }));
        PlaceCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceComboActionPerformed(evt);
            }
        });

        FinalGo.setFont(new java.awt.Font("Siyam Rupali", 1, 36)); // NOI18N
        FinalGo.setText("চলুন");
        FinalGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalGoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ZilaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FinalGo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlaceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(407, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabel2)
                    .addContainerGap(670, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(ZilaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PlaceCombo))
                .addGap(21, 21, 21)
                .addComponent(FinalGo)
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(218, 218, 218)
                    .addComponent(jLabel2)
                    .addContainerGap(343, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlaceComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceComboActionPerformed
        PlaceCombo.setFont(new java.awt.Font("Siyam Rupali", 1, 24));
        if (ZilaCombo.getSelectedIndex() == 0) {
            PlaceCombo.setEnabled(false);
        }
        if (ZilaCombo.getSelectedIndex() == 1) {
            PlaceCombo.setEnabled(true);
            PlaceCombo.removeAllItems();
            PlaceCombo.addItem("পাংথুমাই");
            PlaceCombo.addItem("বিছানাকান্দি");
            PlaceCombo.addItem("লক্ষনছড়া");
            PlaceCombo.addItem("করুমছড়া");
            PlaceCombo.addItem("জাফলং");
            PlaceCombo.addItem("সারিয়াঘাট");
            PlaceCombo.addItem("জৈন্তাপুর");
            PlaceCombo.addItem("রাতারগুল");
            PlaceCombo.addItem("ভোলাগঞ্জ");
            PlaceCombo.addItem("মালিনিছড়া");
            PlaceCombo.addItem("লোভাছড়া");
        }
        if (ZilaCombo.getSelectedIndex() == 2) {
            PlaceCombo.setEnabled(true);
            PlaceCombo.removeAllItems();
            PlaceCombo.addItem("বি টি আর আই");
            PlaceCombo.addItem("লাউয়াছড়া");
            PlaceCombo.addItem("মাধবকুণ্ড");
            PlaceCombo.addItem("পারিকুন্ড");
            PlaceCombo.addItem("হামহাম");
        }
        if (ZilaCombo.getSelectedIndex() == 3) {
            PlaceCombo.setEnabled(true);
            PlaceCombo.removeAllItems();
            PlaceCombo.addItem("টাঙ্গুয়ার হাওড়");
            PlaceCombo.addItem("নারায়ণতলা");
            PlaceCombo.addItem("জাদুকাটা");
        }
        if (ZilaCombo.getSelectedIndex() == 4) {
            PlaceCombo.setEnabled(true);
            PlaceCombo.removeAllItems();
            PlaceCombo.addItem("pore");
            PlaceCombo.addItem("aro pore");
            PlaceCombo.addItem("aro aro pore");
        }
    }//GEN-LAST:event_PlaceComboActionPerformed

    private void ZilaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZilaComboActionPerformed
        PlaceCombo.setFont(new java.awt.Font("Siyam Rupali", 1, 24));
        if (ZilaCombo.getSelectedIndex() == 0) {
            PlaceCombo.setEnabled(false);
        }
        if (ZilaCombo.getSelectedIndex() == 1) {
            PlaceCombo.setEnabled(true);
            PlaceCombo.removeAllItems();
            PlaceCombo.addItem("পাংথুমাই");
            PlaceCombo.addItem("বিছানাকান্দি");
            PlaceCombo.addItem("লক্ষনছড়া");
            PlaceCombo.addItem("করুমছড়া");
            PlaceCombo.addItem("জাফলং");
            PlaceCombo.addItem("সারিয়াঘাট");
            PlaceCombo.addItem("জৈন্তাপুর");
            PlaceCombo.addItem("রাতারগুল");
            PlaceCombo.addItem("ভোলাগঞ্জ");
            PlaceCombo.addItem("মালিনিছড়া");
            PlaceCombo.addItem("লোভাছড়া");
        }
        if (ZilaCombo.getSelectedIndex() == 2) {
            PlaceCombo.setEnabled(true);
            PlaceCombo.removeAllItems();
            PlaceCombo.addItem("বি টি আর আই");
            PlaceCombo.addItem("লাউয়াছড়া");
            PlaceCombo.addItem("মাধবকুণ্ড");
            PlaceCombo.addItem("পারিকুন্ড");
            PlaceCombo.addItem("হামহাম");
        }
        if (ZilaCombo.getSelectedIndex() == 3) {
            PlaceCombo.setEnabled(true);
            PlaceCombo.removeAllItems();
            PlaceCombo.addItem("টাঙ্গুয়ার হাওড়");
            PlaceCombo.addItem("নারায়ণতলা");
            PlaceCombo.addItem("জাদুকাটা");
        }
        if (ZilaCombo.getSelectedIndex() == 4) {
            PlaceCombo.setEnabled(true);
            PlaceCombo.removeAllItems();
            PlaceCombo.addItem("pore");
            PlaceCombo.addItem("aro pore");
            PlaceCombo.addItem("aro aro pore");
        }


    }//GEN-LAST:event_ZilaComboActionPerformed

    private void FinalGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalGoActionPerformed

        switch (PlaceCombo.getSelectedItem().toString()) {
            case "পাংথুমাই":
                Pangthumai pang = new Pangthumai();
                pang.setVisible(true);
                dispose();
                break;
            case "বিছানাকান্দি":
                Bichanakandi bich = new Bichanakandi();
                bich.setVisible(true);
                dispose();
                break;
            default:
                System.out.println("bbbb");
        }


    }//GEN-LAST:event_FinalGoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

//        try {
//            ImageIcon image = new ImageIcon(ImageIO.read(new URL("http://www.keenthemes.com/preview/metronic/theme/assets/global/plugins/jcrop/demos/demo_files/image1.jpg")));
//
//        } catch (MalformedURLException av) {
//            av.printStackTrace();
//        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FinalGo;
    private javax.swing.JComboBox PlaceCombo;
    private javax.swing.JComboBox ZilaCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
