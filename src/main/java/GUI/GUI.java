/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Szalma Szilard
 */

import lists.Kolcsonlista;
import lists.Konyvlista;
import lists.Felhasznalolista;
import lists.Konyvtaroslista;
import classes.Felhasznalo;
import classes.Book;
import classes.konyvtaros;
import classes.kolcson;
import java.util.ArrayList;
import classes.ConsoleColors;
import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import GUI.AddBook;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
         tableModelBook = (DefaultTableModel) jTable1.getModel();
         tableModelUser = (DefaultTableModel) jTable2.getModel();
         tableModelIoan = (DefaultTableModel) jTable3.getModel();
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jDialog1 = new javax.swing.JDialog();
        ScrollPanelBooks = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ScrollPanelUsers = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ScrollPanelIoans = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        ImportBookTXT = new javax.swing.JMenuItem();
        ExportBooksTXT = new javax.swing.JMenuItem();
        ImportBooksXML = new javax.swing.JMenuItem();
        ExportBooksXML = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ImportUsersTXT = new javax.swing.JMenuItem();
        ExportUsersTXT = new javax.swing.JMenuItem();
        ImportUsersXML = new javax.swing.JMenuItem();
        ExportUsersXML = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ImportIoansTXT = new javax.swing.JMenuItem();
        ExportIoansTXT = new javax.swing.JMenuItem();
        ImportIoansXML = new javax.swing.JMenuItem();
        ExportIoansXML = new javax.swing.JMenuItem();
        BookMenu = new javax.swing.JMenu();
        ListBooks = new javax.swing.JMenuItem();
        AddBook = new javax.swing.JMenuItem();
        ModifyBook = new javax.swing.JMenuItem();
        DeleteBook = new javax.swing.JMenuItem();
        UserMenu = new javax.swing.JMenu();
        ListUsers = new javax.swing.JMenuItem();
        AddUser = new javax.swing.JMenuItem();
        ModifyUser = new javax.swing.JMenuItem();
        DeleteUser = new javax.swing.JMenuItem();
        IoanMenu = new javax.swing.JMenu();
        ListIoans = new javax.swing.JMenuItem();
        AddIoan = new javax.swing.JMenuItem();
        ModifyIoan = new javax.swing.JMenuItem();
        DeleteIoan = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Azonositó", "Cím", "Író", "Kiadó", "Kiadás éve", "Hozzáférhető"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ScrollPanelBooks.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Azonosító", "Név", "Cím", "Email", "Telefonszám"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ScrollPanelUsers.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kölcsön Azonosító", "Könyv Azonosító", "Felhasználó Azonosító", "Kölcsön Dátum", "Kölcsön Lejárat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ScrollPanelIoans.setViewportView(jTable3);

        FileMenu.setText("File");
        FileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileMenuActionPerformed(evt);
            }
        });

        ImportBookTXT.setText("ImportBooksTXT");
        ImportBookTXT.setToolTipText("");
        ImportBookTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportBookTXTActionPerformed(evt);
            }
        });
        FileMenu.add(ImportBookTXT);

        ExportBooksTXT.setLabel("ExportBooksTXT");
        ExportBooksTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportBooksTXTActionPerformed(evt);
            }
        });
        FileMenu.add(ExportBooksTXT);

        ImportBooksXML.setText("ImportBooksXML");
        ImportBooksXML.setToolTipText("");
        ImportBooksXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportBooksXMLActionPerformed(evt);
            }
        });
        FileMenu.add(ImportBooksXML);

        ExportBooksXML.setText("ExportBooksXML");
        ExportBooksXML.setToolTipText("");
        ExportBooksXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportBooksXMLActionPerformed(evt);
            }
        });
        FileMenu.add(ExportBooksXML);
        FileMenu.add(jSeparator1);

        ImportUsersTXT.setText("ImportUsersTXT");
        ImportUsersTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportUsersTXTActionPerformed(evt);
            }
        });
        FileMenu.add(ImportUsersTXT);

        ExportUsersTXT.setText("ExportUsersTXT");
        ExportUsersTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportUsersTXTActionPerformed(evt);
            }
        });
        FileMenu.add(ExportUsersTXT);

        ImportUsersXML.setText("ImportUsersXML");
        ImportUsersXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportUsersXMLActionPerformed(evt);
            }
        });
        FileMenu.add(ImportUsersXML);

        ExportUsersXML.setText("ExportUsersXML");
        ExportUsersXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportUsersXMLActionPerformed(evt);
            }
        });
        FileMenu.add(ExportUsersXML);
        FileMenu.add(jSeparator2);

        ImportIoansTXT.setText("ImportIoansTXT");
        ImportIoansTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportIoansTXTActionPerformed(evt);
            }
        });
        FileMenu.add(ImportIoansTXT);

        ExportIoansTXT.setText("ExportIoansTXT");
        ExportIoansTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportIoansTXTActionPerformed(evt);
            }
        });
        FileMenu.add(ExportIoansTXT);

        ImportIoansXML.setText("ImportIoansXML");
        ImportIoansXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportIoansXMLActionPerformed(evt);
            }
        });
        FileMenu.add(ImportIoansXML);

        ExportIoansXML.setText("ExportIoansXML");
        ExportIoansXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportIoansXMLActionPerformed(evt);
            }
        });
        FileMenu.add(ExportIoansXML);

        jMenuBar1.add(FileMenu);

        BookMenu.setText("Book");

        ListBooks.setText("ListBooks");
        ListBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBooksActionPerformed(evt);
            }
        });
        BookMenu.add(ListBooks);

        AddBook.setText("Add");
        AddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookActionPerformed(evt);
            }
        });
        BookMenu.add(AddBook);

        ModifyBook.setText("Modify");
        ModifyBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyBookActionPerformed(evt);
            }
        });
        BookMenu.add(ModifyBook);

        DeleteBook.setText("Delete");
        DeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBookActionPerformed(evt);
            }
        });
        BookMenu.add(DeleteBook);

        jMenuBar1.add(BookMenu);

        UserMenu.setText("User");

        ListUsers.setText("ListUsers");
        ListUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListUsersActionPerformed(evt);
            }
        });
        UserMenu.add(ListUsers);

        AddUser.setText("Add");
        AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserActionPerformed(evt);
            }
        });
        UserMenu.add(AddUser);

        ModifyUser.setText("Modify");
        ModifyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyUserActionPerformed(evt);
            }
        });
        UserMenu.add(ModifyUser);

        DeleteUser.setText("Delete");
        DeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserActionPerformed(evt);
            }
        });
        UserMenu.add(DeleteUser);

        jMenuBar1.add(UserMenu);

        IoanMenu.setText("Ioan");

        ListIoans.setText("ListIoans");
        ListIoans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListIoansActionPerformed(evt);
            }
        });
        IoanMenu.add(ListIoans);

        AddIoan.setText("Add");
        AddIoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddIoanActionPerformed(evt);
            }
        });
        IoanMenu.add(AddIoan);

        ModifyIoan.setText("Modify");
        ModifyIoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyIoanActionPerformed(evt);
            }
        });
        IoanMenu.add(ModifyIoan);

        DeleteIoan.setText("Delete");
        DeleteIoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteIoanActionPerformed(evt);
            }
        });
        IoanMenu.add(DeleteIoan);

        jMenuBar1.add(IoanMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScrollPanelBooks, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addComponent(ScrollPanelUsers)
                    .addComponent(ScrollPanelIoans))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ScrollPanelBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPanelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPanelIoans, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImportBookTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportBookTXTActionPerformed
        // TODO add your handling code here:
        lista1.konyvlistaBetoltesFROMTXT();
        lista1.KiListaz();
        JOptionPane.showMessageDialog(this,"Books loaded successfully(TXT)");
    }//GEN-LAST:event_ImportBookTXTActionPerformed

    private void ExportBooksTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportBooksTXTActionPerformed
        // TODO add your handling code here:
        lista1.KonyvlistaMentes();
        JOptionPane.showMessageDialog(this,"Books saved successfully(TXT)");
    }//GEN-LAST:event_ExportBooksTXTActionPerformed

    private void ImportBooksXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportBooksXMLActionPerformed
        // TODO add your handling code here:
        lista1.konyvListaBetoltesXML();
        lista1.KiListaz();
        JOptionPane.showMessageDialog(this,"Books loaded successfully(XML)");
    }//GEN-LAST:event_ImportBooksXMLActionPerformed

    private void ExportBooksXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportBooksXMLActionPerformed
        // TODO add your handling code here:
        lista1.konyvListaToXML();
        JOptionPane.showMessageDialog(this,"Books saved successfully(XML)");
    }//GEN-LAST:event_ExportBooksXMLActionPerformed

    private void ImportUsersTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportUsersTXTActionPerformed
        // TODO add your handling code here:
        lista2.FelhasznaloListaBetoltesFROMTXT();
        lista2.KiListaz();
        JOptionPane.showMessageDialog(this,"Users loaded successfully(TXT)");
    }//GEN-LAST:event_ImportUsersTXTActionPerformed

    private void ExportUsersTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportUsersTXTActionPerformed
        // TODO add your handling code here:
        lista2.FelhasznaloListaMentes();
        JOptionPane.showMessageDialog(this,"Users saved successfully(TXT)");
    }//GEN-LAST:event_ExportUsersTXTActionPerformed

    private void ImportUsersXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportUsersXMLActionPerformed
        // TODO add your handling code here:
        lista2.felhasznaloListaBetoltesXML();
        lista2.KiListaz();
        JOptionPane.showMessageDialog(this,"Users loaded successfully(XML)");
    }//GEN-LAST:event_ImportUsersXMLActionPerformed

    private void ExportUsersXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportUsersXMLActionPerformed
        // TODO add your handling code here:
        lista2.felhasznaloListaToXML();
        JOptionPane.showMessageDialog(this,"Users saved successfully(XML)");
    }//GEN-LAST:event_ExportUsersXMLActionPerformed

    private void FileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileMenuActionPerformed

    private void ImportIoansTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportIoansTXTActionPerformed
        // TODO add your handling code here:
        lista3.KolcsonListaBetoltesFROMTXT();
        lista3.KiListaz();
        JOptionPane.showMessageDialog(this,"Ioans loaded successfully(TXT)");
        
    }//GEN-LAST:event_ImportIoansTXTActionPerformed

    private void ExportIoansTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportIoansTXTActionPerformed
        // TODO add your handling code here:
        lista3.KolcsonMentes();
        JOptionPane.showMessageDialog(this,"Ioans saved successfully(TXT)");
    }//GEN-LAST:event_ExportIoansTXTActionPerformed

    private void ImportIoansXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportIoansXMLActionPerformed
        // TODO add your handling code here:
        lista3.kolcsonListaBetoltesXML();
        lista3.KiListaz();
        JOptionPane.showMessageDialog(this,"Ioans loaded successfully(XML)");
    }//GEN-LAST:event_ImportIoansXMLActionPerformed

    private void ExportIoansXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportIoansXMLActionPerformed
        // TODO add your handling code here:
        lista3.kolcsonListaToXML();
        JOptionPane.showMessageDialog(this,"Ioans saved successfully(XML)");
        
    }//GEN-LAST:event_ExportIoansXMLActionPerformed

    private void ListBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBooksActionPerformed
        // TODO add your handling code here:
        //load table
        tableModelBook.setRowCount(0);
        for(int i=0 ;i < lista1.Meret(); ++i){
              tableModelBook.insertRow(tableModelBook.getRowCount(), new Object[]{lista1.konyvek.get(i).getAzonosito(), lista1.konyvek.get(i).getCim(), lista1.konyvek.get(i).getIro(),
                                        lista1.konyvek.get(i).getKiado(), lista1.konyvek.get(i).getKiadas_eve(), lista1.konyvek.get(i).isHozzaferheto() } );
            }
        
    }//GEN-LAST:event_ListBooksActionPerformed

    private void AddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookActionPerformed
        // TODO add your handling code here:
        AddBook sp = new AddBook();
        sp.setVisible(true);

    }//GEN-LAST:event_AddBookActionPerformed

    private void ModifyBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModifyBookActionPerformed

    private void DeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBookActionPerformed
        // TODO add your handling code here:
        DeleteBook ps = new DeleteBook();
        ps.setVisible(true);
    }//GEN-LAST:event_DeleteBookActionPerformed
    public  void UpdateList(){
       // ClickListener c1=new ClickListener();
       // tableModelUser.addActionListener(c1);
        
        ListUsers.doClick();
}

    private void ListUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListUsersActionPerformed
        // TODO add your handling code here:
         tableModelUser.setRowCount(0);   
         for(int i=0 ;i < lista2.Meret(); i++){
              tableModelUser.insertRow(tableModelUser.getRowCount(), new Object[]{lista2.userlist.get(i).getAzonosito(), lista2.userlist.get(i).getNev(), lista2.userlist.get(i).getCim(),
                                        lista2.userlist.get(i).getEmail(), lista2.userlist.get(i).getTel() } );
            }
    }//GEN-LAST:event_ListUsersActionPerformed

    private void AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserActionPerformed
        // TODO add your handling code here:
        AddUser sp = new AddUser();
        sp.setVisible(true);
    }//GEN-LAST:event_AddUserActionPerformed

    private void ModifyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModifyUserActionPerformed

    private void DeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserActionPerformed
        // TODO add your handling code here:
        DeleteUser ff = new DeleteUser();
        ff.setVisible(true);
    }//GEN-LAST:event_DeleteUserActionPerformed

    private void ListIoansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListIoansActionPerformed
        // TODO add your handling code here:
        tableModelIoan.setRowCount(0);
        for(int i=0 ;i < lista3.Meret(); ++i){
              tableModelIoan.insertRow(tableModelIoan.getRowCount(), new Object[]{lista3.kolcsonlist.get(i).getKolcsonAzonosito(), lista3.kolcsonlist.get(i).getBookAzonosito(), lista3.kolcsonlist.get(i).getFelhasznaloAzonosito(),
                                        lista3.kolcsonlist.get(i).getKolcsonDatum(), lista3.kolcsonlist.get(i).getKolcsonLejarat() } );
            }
        
        
        
    }//GEN-LAST:event_ListIoansActionPerformed

    private void AddIoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddIoanActionPerformed
        // TODO add your handling code here:
           AddIoan oo = new AddIoan();
        oo.setVisible(true);
    }//GEN-LAST:event_AddIoanActionPerformed

    private void ModifyIoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyIoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModifyIoanActionPerformed

    private void DeleteIoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteIoanActionPerformed
        // TODO add your handling code here:
        DeleteIoan hoho = new DeleteIoan();
        hoho.setVisible(true);
    }//GEN-LAST:event_DeleteIoanActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddBook;
    private javax.swing.JMenuItem AddIoan;
    private javax.swing.JMenuItem AddUser;
    private javax.swing.JMenu BookMenu;
    private javax.swing.JMenuItem DeleteBook;
    private javax.swing.JMenuItem DeleteIoan;
    private javax.swing.JMenuItem DeleteUser;
    private javax.swing.JMenuItem ExportBooksTXT;
    private javax.swing.JMenuItem ExportBooksXML;
    private javax.swing.JMenuItem ExportIoansTXT;
    private javax.swing.JMenuItem ExportIoansXML;
    private javax.swing.JMenuItem ExportUsersTXT;
    private javax.swing.JMenuItem ExportUsersXML;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuItem ImportBookTXT;
    private javax.swing.JMenuItem ImportBooksXML;
    private javax.swing.JMenuItem ImportIoansTXT;
    private javax.swing.JMenuItem ImportIoansXML;
    private javax.swing.JMenuItem ImportUsersTXT;
    private javax.swing.JMenuItem ImportUsersXML;
    private javax.swing.JMenu IoanMenu;
    private javax.swing.JMenuItem ListBooks;
    private javax.swing.JMenuItem ListIoans;
    private javax.swing.JMenuItem ListUsers;
    private javax.swing.JMenuItem ModifyBook;
    private javax.swing.JMenuItem ModifyIoan;
    private javax.swing.JMenuItem ModifyUser;
    private javax.swing.JScrollPane ScrollPanelBooks;
    private javax.swing.JScrollPane ScrollPanelIoans;
    private javax.swing.JScrollPane ScrollPanelUsers;
    private javax.swing.JMenu UserMenu;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

   public static  Konyvlista lista1 = new Konyvlista();
   public static Felhasznalolista lista2 = new Felhasznalolista();
   public static Kolcsonlista lista3 = new Kolcsonlista();
    DefaultTableModel tableModelBook;
    DefaultTableModel tableModelUser;
    DefaultTableModel tableModelIoan;
    
    
}


