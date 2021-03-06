
import Model_pojo.Marki;
import Model_pojo.Modeli;
import Modeli_dao.DB;
import Modeli_dao.MarkiDAO;
import Modeli_dao.ModeliDAO;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kocev
 */
public class AvtosalonFrame extends javax.swing.JFrame {
public void show_Marki_in_Jtable () {
MarkiDAO objMarki = new MarkiDAO ();
ArrayList<Marki> list = objMarki.selectMarki();
DefaultTableModel model = (DefaultTableModel) this.jTableMarki.getModel();
Object [] row = new Object [4]; 
for (int i= 0;i <list.size();i++){
row [0] = list.get (i).getMarki_id();
row [1] = list.get (i).getMarki_name();
row [2] = list.get (i).getCountry();
row [3] = list.get (i).getEu();
model.addRow(row);
}


}

public void show_Modeli_in_Jtable () {
ModeliDAO objModeli = new ModeliDAO ();
ArrayList<Modeli> list = objModeli.selectModeli();
DefaultTableModel model = (DefaultTableModel) this.jTableModeli.getModel();
Object [] row = new Object [7]; 
for (int i= 0;i <list.size();i++){
row [0] = list.get (i).getModeli_id();
row [1] = list.get (i).getModeli_name();
row [2] = list.get (i).getColor();
row [3] = list.get (i).getPrice();
row [4] = list.get (i).getMarki_name();
row [5] = list.get (i).getCountry();
row [6] = list.get (i).getEu();
model.addRow(row);
}
}

public void show_Search_in_Jtable (int limit) {
MarkiDAO objMarki = new MarkiDAO ();
ArrayList<Marki> list = objMarki.selectFinansiskaKartica(limit);
DefaultTableModel model = (DefaultTableModel) this.jTableSearch.getModel();
Object [] row = new Object [3]; 
for (int i= 0;i <list.size();i++){
row [0] = list.get (i).getCountry();
row [1] = list.get (i).getVkupen_promet();
row [2] = list.get (i).getDanok();
model.addRow(row);
}
}
    /**
     * Creates new form AvtosalonFrame
     */
    public AvtosalonFrame() {
       MarkiDAO            objMarkiDAO          = new MarkiDAO();
       ModeliDAO           objModeliDAO         = new ModeliDAO();
       initComponents();
       
       Rectangle virtualBounds = new Rectangle();
  GraphicsEnvironment ge = GraphicsEnvironment.
          getLocalGraphicsEnvironment();
  GraphicsDevice[] gs =
          ge.getScreenDevices();
  for (int j = 0; j < gs.length; j++) { 
      GraphicsDevice gd = gs[j];
      GraphicsConfiguration[] gc =
          gd.getConfigurations();
      for (int i=0; i < gc.length; i++) {
          virtualBounds =
              virtualBounds.union(gc[i].getBounds());
          
          this.setExtendedState(JFrame.MAXIMIZED_BOTH);
      }
  } 
       
       /*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pack();
        setSize(screenSize.width, screenSize.height);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMarki = new javax.swing.JPanel();
        lblMarki_id = new javax.swing.JLabel();
        lblMarki_name = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblEU = new javax.swing.JLabel();
        txtMarki_id = new javax.swing.JTextField();
        txtMarki_name = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtEU = new javax.swing.JTextField();
        btnInsertMarki = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMarki = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanelModeli = new javax.swing.JPanel();
        lblModeli_id = new javax.swing.JLabel();
        lblModeli_name = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtModeli_id = new javax.swing.JTextField();
        txtModeli_name = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnInsertModeli = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableModeli = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanelSearch = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSearch = new javax.swing.JTable();
        jTextFieldLimit = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMarki = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuSearch = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(getCursorType());
        setLocationByPlatform(isEnabled());
        setMaximizedBounds(getMaximizedBounds());
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(isLocationByPlatform());
        setShape(getMaximizedBounds());
        setSize(getPreferredSize());
        setState(getCursorType());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMarki.setAutoscrolls(true);
        jPanelMarki.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        lblMarki_id.setText("marki_id");

        lblMarki_name.setText("marki_name");

        lblCountry.setText("Country");

        lblEU.setText("EU");

        txtMarki_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarki_idActionPerformed(evt);
            }
        });

        txtMarki_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarki_nameActionPerformed(evt);
            }
        });

        btnInsertMarki.setText("INSERT");
        btnInsertMarki.setActionCommand("");
        btnInsertMarki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertMarkiActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.setToolTipText("");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jTableMarki.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "marki_id", "marki_name", "country", "eu"
            }
        ));
        jTableMarki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMarkiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMarki);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1.setText("MARKI");

        javax.swing.GroupLayout jPanelMarkiLayout = new javax.swing.GroupLayout(jPanelMarki);
        jPanelMarki.setLayout(jPanelMarkiLayout);
        jPanelMarkiLayout.setHorizontalGroup(
            jPanelMarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMarkiLayout.createSequentialGroup()
                .addGroup(jPanelMarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMarki_name, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEU, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarki_id, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarki_name, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEU)
                    .addComponent(txtCountry)
                    .addComponent(txtMarki_id))
                .addGap(575, 575, 575))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMarkiLayout.createSequentialGroup()
                .addGroup(jPanelMarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMarkiLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMarkiLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsertMarki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(134, 134, 134))
        );
        jPanelMarkiLayout.setVerticalGroup(
            jPanelMarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMarkiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarki_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMarki_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMarkiLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtMarki_name))
                    .addComponent(lblMarki_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry)
                    .addComponent(txtCountry))
                .addGap(9, 9, 9)
                .addGroup(jPanelMarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEU))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertMarki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanelMarki, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 1070, -1));

        lblModeli_id.setText("modeli_id");

        lblModeli_name.setText("modeli_name");

        lblColor.setText("Color");

        lblPrice.setText("Price");

        txtModeli_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeli_idActionPerformed(evt);
            }
        });

        btnInsertModeli.setText("INSERT");
        btnInsertModeli.setActionCommand("");
        btnInsertModeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertModeliActionPerformed(evt);
            }
        });

        btnUpdate1.setText("UPDATE");
        btnUpdate1.setToolTipText("");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnDelete1.setText("DELETE");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        jTableModeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "modeli_id", "modeli_name", "color", "price", "marki_name", "country", "eu"
            }
        ));
        jTableModeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableModeliMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableModeli);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel2.setText("MODELI");

        javax.swing.GroupLayout jPanelModeliLayout = new javax.swing.GroupLayout(jPanelModeli);
        jPanelModeli.setLayout(jPanelModeliLayout);
        jPanelModeliLayout.setHorizontalGroup(
            jPanelModeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModeliLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelModeliLayout.createSequentialGroup()
                .addGroup(jPanelModeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModeliLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanelModeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblColor)
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModeli_name)
                            .addComponent(lblModeli_id)
                            .addComponent(btnInsertModeli, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelModeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelModeliLayout.createSequentialGroup()
                                .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtModeli_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModeli_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelModeliLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelModeliLayout.setVerticalGroup(
            jPanelModeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModeliLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanelModeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModeli_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModeli_id))
                .addGap(18, 18, 18)
                .addGroup(jPanelModeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModeli_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModeli_name))
                .addGap(18, 18, 18)
                .addGroup(jPanelModeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColor))
                .addGap(19, 19, 19)
                .addGroup(jPanelModeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelModeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertModeli)
                    .addComponent(btnUpdate1)
                    .addComponent(btnDelete1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanelModeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButtonSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSearch.setText("Search");
        jButtonSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSearchMouseClicked(evt);
            }
        });
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Country", "Vkupen promet", "danok"
            }
        ));
        jScrollPane3.setViewportView(jTableSearch);

        javax.swing.GroupLayout jPanelSearchLayout = new javax.swing.GroupLayout(jPanelSearch);
        jPanelSearch.setLayout(jPanelSearchLayout);
        jPanelSearchLayout.setHorizontalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelSearchLayout.createSequentialGroup()
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jTextFieldLimit))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSearchLayout.setVerticalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearch)
                    .addComponent(jTextFieldLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanelSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jMenuMarki.setText("marki");
        jMenuMarki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuMarkiMouseClicked(evt);
            }
        });
        jMenuMarki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMarkiActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuMarki);

        jMenu2.setText("modeli");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenuSearch.setText("search");
        jMenuSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSearchMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSearch);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertMarkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertMarkiActionPerformed
     
        //Insert marki 
      // Data base Collomn name     =       txtfield 
      String       marki_name       =       this.txtMarki_name.getText();
      String       country          =       this.txtCountry.getText();
      String       eu               =       this.txtEU.getText ();
      int euInteger = Integer.parseInt(eu);
      // DAO connection
      MarkiDAO objMarki = new MarkiDAO ();
      objMarki.setMarki_name(marki_name);// model POJO
      objMarki.setCountry(country);// model POJO
      objMarki.setEu(euInteger);// model POJO
      objMarki.insertMarki(); // model DAO 
      DefaultTableModel model = (DefaultTableModel)this.jTableMarki.getModel();
      model.setRowCount(0);
      this.show_Marki_in_Jtable();
      
    }//GEN-LAST:event_btnInsertMarkiActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // Delete marki 
        // DB objDB = new DB ();
        String marki_id  =   this.txtMarki_id.getText();
        int markiIdInteger = Integer.parseInt(marki_id);
        //DB myDB = new DB ();
        MarkiDAO objMarki = new MarkiDAO ();
        objMarki.setMarki_id(markiIdInteger);// model POJO
        objMarki.deleteMarki(); // model DAO 
        DefaultTableModel model = (DefaultTableModel)this.jTableMarki.getModel();
          model.setRowCount(0);
          this.show_Marki_in_Jtable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // update marki 
      String       marki_id         =       this.txtMarki_id.getText();
      String       marki_name       =       this.txtMarki_name.getText();
      String       country          =       this.txtCountry.getText();
      String       eu               =       this.txtEU.getText ();
      int euInteger = Integer.parseInt(eu);
      int markiIdInteger = Integer.parseInt(marki_id);
      MarkiDAO objMarki = new MarkiDAO ();
      objMarki.setMarki_id(markiIdInteger);
      objMarki.setMarki_name(marki_name);
      objMarki.setCountry(country);
      objMarki.setEu(euInteger);
      objMarki.updateMarki(); //model DAO 
      DefaultTableModel model = (DefaultTableModel)this.jTableMarki.getModel();
          model.setRowCount(0);
          this.show_Marki_in_Jtable();
          
          
//          String ID_Nr = this.jTextFieldID_Nr.getText();
//       int Id_NrInteger = Integer.parseInt(ID_Nr);
//       String Aneme = this.jTextFieldAname.getText();
//       String Contact_Nr = this.jTextFieldContact_Nr.getText();
//       AgencyDAO objAgency = new AgencyDAO();
//          objAgency.setIDNr(Id_NrInteger);
//          objAgency.setAname(Aneme);
//          objAgency.setContactNr(Contact_Nr);
//          objAgency.editAgency();
//          DefaultTableModel model = (DefaultTableModel)this.jTableAgency.getModel();
//          model.setRowCount(0);
//          this.show_Agency_in_Jtable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnInsertModeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertModeliActionPerformed
    // Insert modeli
    String modeli_name = this.txtModeli_name.getText();
    String color       = this.txtColor.getText();
    String price       = this.txtPrice.getText();
    int priceInteger = Integer.parseInt(price);
    ModeliDAO objModeli = new ModeliDAO ();
    objModeli.setModeli_name(modeli_name);// model POJO
    objModeli.setColor(color);// model POJO
    objModeli.setPrice(priceInteger);// model POJO
    objModeli.insertModeli();
    DefaultTableModel model = (DefaultTableModel)this.jTableModeli.getModel();
      model.setRowCount(0);
      this.show_Modeli_in_Jtable();
    }//GEN-LAST:event_btnInsertModeliActionPerformed

    private void txtModeli_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeli_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeli_idActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // delete modeli
        String modeli_id = this.txtModeli_id.getText();
        ModeliDAO objModeli = new ModeliDAO ();
        int modeliIdInteger = Integer.parseInt(modeli_id);
        objModeli.setModeli_id(modeliIdInteger);// model POJO
        objModeli.deleteModeli();
        DefaultTableModel model = (DefaultTableModel)this.jTableModeli.getModel();
      model.setRowCount(0);
      this.show_Modeli_in_Jtable();
        
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // update modeli
        String modeli_id = this.txtModeli_id.getText();
        String modeli_name = this.txtModeli_name.getText();
        String color       = this.txtColor.getText();
        String price       = this.txtPrice.getText();
        ModeliDAO objModeli = new ModeliDAO ();
        int modeliIdInteger = Integer.parseInt(modeli_id);
        int priceInteger = Integer.parseInt(price);
        objModeli.setModeli_id(modeliIdInteger);// model POJO
        objModeli.setColor(color);// model POJO
        objModeli.setModeli_name(modeli_name);// model POJO
        objModeli.setPrice(priceInteger);// model POJO
        objModeli.updateModeli(); //model DAO 
        DefaultTableModel model = (DefaultTableModel)this.jTableModeli.getModel();
      model.setRowCount(0);
      this.show_Modeli_in_Jtable();
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void txtMarki_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarki_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarki_idActionPerformed

    private void jMenuMarkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMarkiActionPerformed
    
    }//GEN-LAST:event_jMenuMarkiActionPerformed

    private void jMenuMarkiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMarkiMouseClicked
          this.show_Marki_in_Jtable(); 
          jPanelModeli.hide();
          jPanelMarki.show();
          this.jPanelSearch.hide();
    }//GEN-LAST:event_jMenuMarkiMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
           this.show_Modeli_in_Jtable();  
           jPanelMarki.hide(); 
           jPanelModeli.show();
            this.jPanelSearch.hide();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jTableMarkiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMarkiMouseClicked
      int i = this.jTableMarki.getSelectedRow();
      TableModel model = this.jTableMarki.getModel();
      this.txtMarki_id.setText(model.getValueAt(i, 0).toString());
      this.txtMarki_name.setText(model.getValueAt(i, 1).toString());
      this.txtCountry.setText(model.getValueAt(i, 2).toString());
      this.txtEU.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_jTableMarkiMouseClicked

    private void jTableModeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableModeliMouseClicked
       int i = this.jTableModeli.getSelectedRow();
      TableModel model = this.jTableModeli.getModel();
      this.txtModeli_id.setText(model.getValueAt(i, 0).toString());
      this.txtModeli_name.setText(model.getValueAt(i, 1).toString());
      this.txtColor.setText(model.getValueAt(i, 2).toString());
      this.txtPrice.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_jTableModeliMouseClicked

    private void jMenuSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSearchMouseClicked
    this.show_Search_in_Jtable(100);
          jPanelModeli.hide();
          jPanelMarki.hide();
          this.jPanelSearch.show();
    }//GEN-LAST:event_jMenuSearchMouseClicked

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        String limit = this.jTextFieldLimit.getText();
        int limitInteger =  Integer.parseInt(limit);
        // marki DAO
        MarkiDAO objMarki = new MarkiDAO();
        objMarki.selectFinansiskaKartica (limitInteger);
        DefaultTableModel model = (DefaultTableModel)this.jTableSearch.getModel();
        model.setRowCount(0);
        this.show_Search_in_Jtable(limitInteger);
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSearchMouseClicked
        String limit = this.jTextFieldLimit.getText();
        int limitInteger =  Integer.parseInt(limit);
        // marki DAO
        MarkiDAO objMarki = new MarkiDAO();
        objMarki.selectFinansiskaKartica (limitInteger);
        DefaultTableModel model = (DefaultTableModel)this.jTableSearch.getModel();

    }//GEN-LAST:event_jButtonSearchMouseClicked

    private void txtMarki_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarki_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarki_nameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AvtosalonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvtosalonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvtosalonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvtosalonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvtosalonFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnInsertMarki;
    private javax.swing.JButton btnInsertModeli;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuMarki;
    private javax.swing.JMenu jMenuSearch;
    private javax.swing.JPanel jPanelMarki;
    private javax.swing.JPanel jPanelModeli;
    private javax.swing.JPanel jPanelSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableMarki;
    private javax.swing.JTable jTableModeli;
    private javax.swing.JTable jTableSearch;
    private javax.swing.JTextField jTextFieldLimit;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblEU;
    private javax.swing.JLabel lblMarki_id;
    private javax.swing.JLabel lblMarki_name;
    private javax.swing.JLabel lblModeli_id;
    private javax.swing.JLabel lblModeli_name;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEU;
    private javax.swing.JTextField txtMarki_id;
    private javax.swing.JTextField txtMarki_name;
    private javax.swing.JTextField txtModeli_id;
    private javax.swing.JTextField txtModeli_name;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
