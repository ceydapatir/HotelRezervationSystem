import java.awt.CardLayout;
import CustomerInfo.CustomerList;
import CustomerInfo.Information;
import CustomerInfo.Reservation;
import static CustomerInfo.CustomerList.customer;
import static CustomerInfo.Reservation.reservationList;
import CustomerInfo.RoomInfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import CustomerInfo.Pension;

public class RezWind extends javax.swing.JFrame {
    static ArrayList<Pension> pensionList = new ArrayList<Pension>() ;
            String id ;
            String name ;
            String surname ;
            String country ;
            
            int adultNo ;                
            int childNo ;
            String dateIn ;
            String dateOut ;
            
            int roomNo ;
            String roomType ;
           
          
    public RezWind() {
        initComponents();
        PInfo2.setVisible(true);
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Clear = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        PInfo2 = new javax.swing.JPanel();
        customerCountry = new javax.swing.JTextField();
        customerSname = new javax.swing.JTextField();
        customerName = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        numKids = new javax.swing.JSpinner();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        typeRoom = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        roomNum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Day = new javax.swing.JTextField();
        Indate = new javax.swing.JTextField();
        massage = new javax.swing.JRadioButton();
        tour = new javax.swing.JRadioButton();
        minibar = new javax.swing.JRadioButton();
        breakfast = new javax.swing.JRadioButton();
        sport = new javax.swing.JRadioButton();
        spa = new javax.swing.JRadioButton();
        customerId = new javax.swing.JFormattedTextField();
        numAdults = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REZERVATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Confirm.setText("CONFIRM");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Confirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        PInfo2.setBackground(new java.awt.Color(255, 255, 255));

        customerCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countrytxtActionPerformed(evt);
            }
        });

        jLabel38.setText("CITIZEN NUMBER:");

        jLabel39.setText("NAME:");

        jLabel40.setText("SURNAME:");

        jLabel41.setText("COUNTRY:");

        jLabel42.setText("No. of Adults:");

        jLabel43.setText("No. of Kids:");

        jLabel44.setText("EXTRAS:");

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp Image 2019-12-24 at 18.38.47.2.jpeg"))); // NOI18N
        jLabel45.setText("jLabel18");

        numKids.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        numKids.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 0, 0));
        jLabel46.setText("Accommodation:");

        jLabel47.setText("ROOM TYPE:");

        typeRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suit(+$100)", "Deluxe(+$200)" }));
        typeRoom.setSelectedIndex(-1);

        jLabel48.setText("DATE IN(DD,MM,YY):");

        jLabel49.setText("DAY:");

        jLabel50.setText("NUMBER OF ROOM:");

        massage.setText("MASSAGE(+$15)");

        tour.setText("TOUR(+$20)");
        tour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tourActionPerformed(evt);
            }
        });

        minibar.setText("MINIBAR(+$10)");

        breakfast.setText("BREAKFAST(+$20)");
        breakfast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breakfastActionPerformed(evt);
            }
        });

        sport.setText("GYM(+$10)");

        spa.setText("SPA(+$10)");

        try {
            customerId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        numAdults.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jButton1.setText("CALCULATE FEE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PInfo2Layout = new javax.swing.GroupLayout(PInfo2);
        PInfo2.setLayout(PInfo2Layout);
        PInfo2Layout.setHorizontalGroup(
            PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PInfo2Layout.createSequentialGroup()
                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PInfo2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PInfo2Layout.createSequentialGroup()
                                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel41))
                                .addGap(43, 43, 43)
                                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(customerCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(customerName, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(customerSname, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(customerId)))
                            .addComponent(jLabel46)
                            .addGroup(PInfo2Layout.createSequentialGroup()
                                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PInfo2Layout.createSequentialGroup()
                                        .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel50)
                                            .addComponent(jLabel48))
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PInfo2Layout.createSequentialGroup()
                                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Indate)
                                    .addComponent(typeRoom, 0, 131, Short.MAX_VALUE)
                                    .addComponent(roomNum)
                                    .addComponent(Day)))))
                    .addGroup(PInfo2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(PInfo2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43))
                        .addGap(63, 63, 63)
                        .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numKids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numAdults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PInfo2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PInfo2Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(massage, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(spa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(breakfast, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(minibar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        PInfo2Layout.setVerticalGroup(
            PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PInfo2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(customerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(numAdults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(PInfo2Layout.createSequentialGroup()
                        .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerSname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)
                            .addComponent(numKids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(customerCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addGap(18, 18, 18)
                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(massage)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(roomNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minibar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(Indate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(tour))
                .addGroup(PInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PInfo2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(sport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(breakfast)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1))
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel2.add(PInfo2, "card2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void countrytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countrytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countrytxtActionPerformed
     

    boolean saveReservation(ArrayList<Reservation> rt) throws IOException {
          FileWriter fw = null;
        fw = new FileWriter("reservation.txt");
        try {
          
            for (int i = 0; i < customer.size(); i++) {
                String str = "id:" + customer.get(i).getId() + ",name:" + customer.get(i).getName() + 
                        ",surname:" + customer.get(i).getSurname() + ",country:" + customer.get(i).getCountry()
                        + ",adultNo:"  + ",childNo:"  + ",roomNo:"  + ",roomType:" + ",dateIn:"  + ",dateOut:  "  +",count:" + customer.get(i).getCount()+ "\n";

                fw.write(str);
                
            }

        } catch (Exception e) { 
           
        } fw.close();
       
        return true;
         
    }
    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
      
    try {
             id = customerId.getText();
             name = customerName.getText();
             surname = customerSname.getText();
             country = customerCountry.getText();
            
             adultNo = Integer.parseInt(numAdults.getValue().toString());                
             childNo = Integer.parseInt(numKids.getValue().toString());
             dateIn = Indate.getText();
             dateOut = Day.getText();
            
             roomNo = Integer.parseInt(roomNum.getText());
             roomType = typeRoom.getSelectedItem().toString();
 
            Reservation rt = new Reservation(id, childNo, adultNo, name, surname, country, dateIn, dateOut, 0);
            customer.add(rt);
            
            System.out.println(rt.toString());
       
            JOptionPane.showMessageDialog(this, "Reservation Succesful!");
            System.out.println(rt.toString());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"ERROR!");
            //System.out.println(e.toString());
        }

        customerId.setText("");
        customerName.setText("");
        customerSname.setText("");
        customerCountry.setText("");
        Indate.setText("");
        Day.setText("");
        roomNum.setText("");
    }//GEN-LAST:event_ConfirmActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        
        customerId.setText("");
        customerName.setText("");
        customerSname.setText("");
        customerCountry.setText("");
        Indate.setText("");
        Day.setText("");
        roomNum.setText("");
        
    }//GEN-LAST:event_ClearActionPerformed

    private void tourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tourActionPerformed
       
    }//GEN-LAST:event_tourActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        try {
           
            saveReservation(reservationList);

        } catch (IOException ex) {
            Logger.getLogger(RezWind.class.getName()).log(Level.SEVERE, null,ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            try {
             id = customerId.getText();
             name = customerName.getText();
             surname = customerSname.getText();
             country = customerCountry.getText();
            
             adultNo = Integer.parseInt(numAdults.getValue().toString());                
             childNo = Integer.parseInt(numKids.getValue().toString());
             dateIn = Indate.getText();
             dateOut = Day.getText();
            
             roomNo = Integer.parseInt(roomNum.getText());
             roomType = typeRoom.getSelectedItem().toString();
 
            Reservation rt = new Reservation(id, childNo, adultNo, name, surname, country, dateIn, dateOut, 0);
        
            
            Pension ps=new Pension( minibar.isSelected(), massage.isSelected(), breakfast.isSelected(), spa.isSelected(), tour.isSelected(),sport.isSelected(), rt.payment(), id, name, surname, country);
            RoomInfo rinfo=new RoomInfo(typeRoom.getSelectedItem().toString(),roomNo, ps.payment(), id, name, surname, country);
            int price = Integer.parseInt(Day.getText());
            JOptionPane.showMessageDialog(this,"Your Price is : $" + rinfo.payment()* price);
         
            
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"ERROR!");
            //System.out.println(e.toString());
        }
            
   
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void breakfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breakfastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_breakfastActionPerformed

    
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
            java.util.logging.Logger.getLogger(RezWind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RezWind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RezWind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RezWind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RezWind().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Confirm;
    private javax.swing.JTextField Day;
    private javax.swing.JTextField Indate;
    private javax.swing.JPanel PInfo2;
    private javax.swing.JRadioButton breakfast;
    private javax.swing.JTextField customerCountry;
    private javax.swing.JFormattedTextField customerId;
    private javax.swing.JTextField customerName;
    private javax.swing.JTextField customerSname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton massage;
    private javax.swing.JRadioButton minibar;
    private javax.swing.JSpinner numAdults;
    private javax.swing.JSpinner numKids;
    private javax.swing.JTextField roomNum;
    private javax.swing.JRadioButton spa;
    private javax.swing.JRadioButton sport;
    private javax.swing.JRadioButton tour;
    private javax.swing.JComboBox<String> typeRoom;
    // End of variables declaration//GEN-END:variables
}
