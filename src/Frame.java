
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Frame extends javax.swing.JFrame {
    private final String[] dateArray;
    private final String[] flightidArray; 
    private final String[] nameArray;
    private String passengerName;
    
    
    public Frame() throws Exception {
        dateArray = DBDate.getDate();
        flightidArray = DBFlight.getFlightID(); 
     
        nameArray = DBCustomer.queryCustomer().stream().toArray(String[]::new);
        initComponents();
        infoTextArea.append("welcome!\n");
        
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        dateComboBox1 = new javax.swing.JComboBox<>(dateArray);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        flightidComboBox1 = new javax.swing.JComboBox<>(flightidArray);
        bookButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dateComboBox2 = new javax.swing.JComboBox<>(dateArray);
        flightidComboBox2 = new javax.swing.JComboBox<>(flightidArray);
        jLabel5 = new javax.swing.JLabel();
        queryButton1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        dateComboBox3 = new javax.swing.JComboBox<>(dateArray);
        jLabel6 = new javax.swing.JLabel();
        queryButton2 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        queryButton3 = new javax.swing.JButton();
        nameComboBox1 = new javax.swing.JComboBox<>(nameArray);
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        flightIDText = new javax.swing.JTextField();
        capacityText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addFlightButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        addDateButton = new javax.swing.JButton();
        yearComboBox = new javax.swing.JComboBox<>();
        monthComboBox = new javax.swing.JComboBox<>();
        dayComboBox = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        dateComboBox4 = new javax.swing.JComboBox<>(dateArray);
        jLabel12 = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        nameComboBox2 = new javax.swing.JComboBox<>(nameArray);
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        flightidComboBox3 = new javax.swing.JComboBox<>(flightidArray);
        dropFlightButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cleanButton3 = new javax.swing.JButton();
        cleanButton1 = new javax.swing.JButton();
        cleanButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        infoTextArea = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setForeground(java.awt.Color.blue);

        jLabel1.setText("date");

        jLabel2.setText("flightID");

        bookButton.setText("Book Now");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("passenger Name");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(97, 97, 97))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(jLabel2)
                        .addGap(81, 81, 81)
                        .addComponent(flightidComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301)
                        .addComponent(bookButton)))
                .addGap(164, 164, 164))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightidComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(dateComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookButton))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Book", jPanel1);

        jPanel4.setForeground(java.awt.Color.blue);

        jLabel4.setText("date");

        jLabel5.setText("flightID");

        queryButton1.setText("query");
        queryButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addContainerGap(773, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(dateComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(97, 97, 97)
                    .addComponent(jLabel5)
                    .addGap(34, 34, 34)
                    .addComponent(flightidComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(queryButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(flightidComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(queryButton1)
                        .addComponent(jLabel5))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane5.addTab("Flight Day Status", jPanel13);

        jLabel6.setText("date");

        queryButton2.setText("query");
        queryButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(queryButton2)
                .addGap(395, 395, 395))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(208, 208, 208)
                    .addComponent(dateComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(552, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(queryButton2)
                    .addComponent(jLabel6))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(dateComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(45, Short.MAX_VALUE)))
        );

        jTabbedPane5.addTab("Waitlist Status", jPanel12);

        jLabel13.setText("Passenger Name");

        queryButton3.setText("query");
        queryButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel13)
                .addGap(89, 89, 89)
                .addComponent(nameComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(queryButton3)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(queryButton3)
                        .addComponent(nameComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane5.addTab("Passenger Status", jPanel11);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Status", jPanel4);

        jLabel7.setText("flight ID");

        jLabel8.setText("capacity");

        addFlightButton.setText("add new flight");
        addFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(flightIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(capacityText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addFlightButton))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(capacityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addFlightButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add new flight", jPanel3);

        jLabel9.setText("Date(y/m/d)");

        addDateButton.setText("add new date");
        addDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDateButtonActionPerformed(evt);
            }
        });

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019" }));

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        monthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboBoxActionPerformed(evt);
            }
        });

        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        dayComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(addDateButton))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(addDateButton)
                .addGap(28, 28, 28))
        );

        jTabbedPane2.addTab("Add New Date", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add", jPanel2);

        jLabel10.setText("date");

        jLabel12.setText("passenger name");

        removeButton.setText("remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(535, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(removeButton)
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(nameComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(293, 293, 293))))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel10)
                    .addGap(34, 34, 34)
                    .addComponent(dateComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(132, 132, 132)
                    .addComponent(jLabel12)
                    .addContainerGap(465, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(removeButton)
                .addGap(22, 22, 22))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel12))
                    .addContainerGap(82, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("Remove by Passenger and Date", jPanel8);

        jLabel14.setText("flight id");

        flightidComboBox1.setSelectedItem(1);

        dropFlightButton.setText("drop flight");
        dropFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropFlightButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel14)
                .addGap(60, 60, 60)
                .addComponent(flightidComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(dropFlightButton)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(flightidComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropFlightButton))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Drop flight", jPanel9);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Remove", jPanel7);

        cleanButton3.setText("clean customer");
        cleanButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButton3ActionPerformed(evt);
            }
        });

        cleanButton1.setText("clean date");
        cleanButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButton1ActionPerformed(evt);
            }
        });

        cleanButton2.setText("clean flightid");
        cleanButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("For test purpose,\nby clicking the corresponding data,\nclean the table from db directly");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cleanButton3)
                    .addComponent(cleanButton2)
                    .addComponent(cleanButton1))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(cleanButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cleanButton2)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addComponent(cleanButton3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TEST", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(infoTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(infoTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void queryButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryButton1ActionPerformed
        try {
            divisionLine();
            if(!comboboxValidation())
                    return;
            
            String queryDate = this.dateComboBox2.getSelectedItem().toString();
            String queryId = this.flightidComboBox2.getSelectedItem().toString();
            
            if(!dateValidation(queryDate) || !flightidValidation(queryId))
                return;
            
            
            List<String[]> sList = Status.flightDay(queryId, queryDate);
            infoTextArea.append(
                    String.format("%d records have been found in Booked for fligt %s on date %s\n",sList.size(), queryId,queryDate));
            if(!sList.isEmpty()){
                for(String[] s : sList)
                infoTextArea.append(
                        String.format("BookedTimeStamp: %s\t\t Passenger: %s\n",s[0],s[1]));
            }
            
            infoTextArea.append("\n");
        } catch (Exception ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_queryButton1ActionPerformed

    private void queryButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryButton2ActionPerformed
        try {
            divisionLine();
            String queryDate = dateComboBox3.getSelectedItem().toString();
            if(!comboboxValidation())
                    return;
            
            if(!dateValidation(queryDate))
                return;
            List<String[]> sList = Status.waitlistByDay(queryDate);
            
            infoTextArea.append(
                    String.format("%d records have been found on Waitlist on date %s\n",sList.size(),queryDate));
            
            if(!sList.isEmpty()){
                for(String[] s : sList)
                infoTextArea.append(
                    String.format("bookedTime: %s\t\t Passenger: %s\t\t flight: %s\n",s[0],s[1],s[2]));
            }    
            infoTextArea.append("\n");    
            
        } catch (Exception ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_queryButton2ActionPerformed

    private void addDateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDateButtonActionPerformed
        try {
            divisionLine();
            
            String newDate =  String.format("%s-%s-%s",
                    this.yearComboBox.getSelectedItem().toString(),
                    this.monthComboBox.getSelectedItem().toString(),
                    this.dayComboBox.getSelectedItem().toString());
            String[] dates = DBDate.getDate();
            
            if(Arrays.asList(dates).contains(newDate))
            this.infoTextArea.append(String.format("Date %s has already in current flight dates\n",newDate));
            else{
                DBDate.addDate(newDate);
                dateComboBox1.addItem(newDate);
                dateComboBox2.addItem(newDate);
                dateComboBox3.addItem(newDate);
                dateComboBox4.addItem(newDate);
                this.infoTextArea.append(String.format("Date %s has been successfully added\n",newDate));
            }

        } catch (Exception ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addDateButtonActionPerformed

    private void addFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightButtonActionPerformed
        
        divisionLine();
        String newFlightid = this.flightIDText.getText();
        int capacity = Integer.parseInt(this.capacityText.getText());
        
        try {
            
            String[] flights = DBFlight.getFlightID();
            if(Arrays.asList(flights).contains(newFlightid))
            this.infoTextArea.append(String.format("Flight id %s has already in current flightIDs\n",newFlightid));
            else{
                DBFlight.addFlight(newFlightid, capacity);
                flightidComboBox1.addItem(newFlightid);
                flightidComboBox2.addItem(newFlightid);
                flightidComboBox3.addItem(newFlightid);
                this.infoTextArea.append(String.format("Flight id %s has been successfully added\n",newFlightid));
            }
        } catch (Exception ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addFlightButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // remove by date and passenger name
        
        if(!comboboxValidation())
                return;
        
        String removeDate = this.dateComboBox4.getSelectedItem().toString();
        if(!dateValidation(removeDate))
                return;
        
        divisionLine();
        try{
            String removeName = this.nameComboBox2.getSelectedItem().toString();
            
            infoTextArea.append(String.format("for passenger %s's records on date %s\n",removeName,removeDate));
            
            List<String> waitlistRecord = DBCustomer.removeFromWaitlist(removeName, removeDate);
            infoTextArea.append(String.format("%d records of %s been found and deleted in waitlist\n",
                    waitlistRecord.size(),removeName));
            if(!waitlistRecord.isEmpty())
                for(String s : waitlistRecord)
                    infoTextArea.append(String.format("flightid: %s\n",s));
            
            List<String[]> bookedRecord = DBCustomer.removeFromBooked(removeName,removeDate);
            infoTextArea.append(String.format("\n%d records of %s been found and deleted in booked ticket\n",
                    bookedRecord.size(),removeName));
            
            if(!bookedRecord.isEmpty()){
                for(String[] s : bookedRecord){
                
                    infoTextArea.append(String.format("flightid: %s\t",s[0]));
                    String newName = (s[1]==null)? "no one" : s[1];
                    infoTextArea.append(String.format("and %s is removed from waitlist to book this flight\n",newName));
                }
             }
            
            updateNameComboBox();
        }
        
        catch(Exception ex){
            ex.printStackTrace();
            infoTextArea.append("no record found, so no record removed\n");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed

        this.setPassengerName(evt.getActionCommand());

    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        divisionLine();
        
        Timestamp currentTimestamp = new Timestamp(Calendar.getInstance().getTime().getTime());
        
        this.setPassengerName(this.nameTextField.getText());
        if(!comboboxValidation())
                    return;
        String date = dateComboBox1.getSelectedItem().toString();
        String flightid = flightidComboBox1.getSelectedItem().toString();
        String name = this.getPassengerName();
       if(!dateValidation(date) || !flightidValidation(flightid))
                return;
        try {
            if(name != null){             
                String s = DBCustomer.checkFull(Date.valueOf(date),flightid)?
                ", you've been put into waitlist for flight "
                : ", you've booked ticket for flight ";
                DBCustomer.addCustomer(currentTimestamp, getPassengerName(), Date.valueOf(date), flightid);
                infoTextArea.append(String.format("Dear %s",getPassengerName() + s + flightid +" on "+ date+"\n"));
            }else
            infoTextArea.append("You haven't put your valid name yet, please fill in your name\n");
            //add to nameComboBox
            
             
             updateNameComboBox();  

        } catch (Exception ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bookButtonActionPerformed

    private void queryButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryButton3ActionPerformed
        try {
            //query by passenger name;
            divisionLine();
            String name = this.nameComboBox1.getSelectedItem().toString();
            ArrayList<String[]> status1 = Status.customerWaitlistStatus(name);
            ArrayList<String[]> status2 = Status.customerBookedStatus(name);
            
            this.infoTextArea.append(String.format("for customer %s:\n",name));
            this.infoTextArea.append(String.format("%d record have been found in the waitlists\n",status1.size()));
            
            if(!status1.isEmpty())
                for (String[] s : status1)
                    this.infoTextArea.append(String.format("flightID: %s\t\t date: %s \n",s[0],s[1]));
            
            this.infoTextArea.append(
                    String.format("\n%d record have been found in the booked\n",status2.size()));
            
            if(!status2.isEmpty())
                for (String[] s : status2)
                    this.infoTextArea.append(String.format("flightID: %s\t\t date: %s \n",s[0],s[1]));  
            
        } catch (Exception ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_queryButton3ActionPerformed

    private void dropFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropFlightButtonActionPerformed
        try {
            divisionLine();
            if(!comboboxValidation())
                    return;
            String flightid = flightidComboBox3.getSelectedItem().toString();
            if(!flightidValidation(flightid))
                return;
            flightidComboBox1.removeItemAt(flightidComboBox3.getSelectedIndex());
            flightidComboBox2.removeItemAt(flightidComboBox3.getSelectedIndex());
            flightidComboBox3.removeItemAt(flightidComboBox3.getSelectedIndex());
            
            //drop the record from table flights
            DBFlight.dropFlight(flightid);
            
            List<String[]> waitlist = DBCustomer.removeFromWaitlistByFlight(flightid);
            this.infoTextArea.append(String.format("Waitlist: %d records about flight %s has been found and removed\n",
                    waitlist.size(),flightid));
            if(!waitlist.isEmpty()){
                for(String[] s : waitlist){
                    this.infoTextArea.append(String.format("passengerName: %s\t\t date:%s\n",s[0],s[1]));
                    updateNameComboBox();
                }
            }
                
            
           List<String[]> bookedlist = DBCustomer.removeFromBookedByFlight(flightid); 
            
            this.infoTextArea.append(String.format("\nBooked: %d records about flight %s has been found and removed\n",
                bookedlist.size(),flightid));
            if(!bookedlist.isEmpty()){
                for(String[] s : bookedlist){
                     this.infoTextArea.append(String.format("passengerName: %s\t date: %s\t",s[0],s[1]));
                     String info = s[2]==null?"And no flight available on that day\n": String.format("and he's been moved to another flight: %s on that day\n",s[2]);
                     this.infoTextArea.append(info);
                     updateNameComboBox();
                }
            }     
            
        } catch (Exception ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dropFlightButtonActionPerformed

    private void cleanButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButton1ActionPerformed
        try {
            // TODO add your handling code here
            TestClean.cleanDate();
            dateComboBox1.removeAllItems();
            dateComboBox2.removeAllItems();
            dateComboBox3.removeAllItems();
            dateComboBox4.removeAllItems();
        } catch (Exception ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }//GEN-LAST:event_cleanButton1ActionPerformed

    private void cleanButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButton3ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here
            TestClean.cleanBooked();
            TestClean.cleanWaitlist();
            nameComboBox1.removeAllItems();
            nameComboBox2.removeAllItems();
            
        } catch (Exception ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cleanButton3ActionPerformed

    private void cleanButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButton2ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here
            TestClean.cleanFlightid();
            flightidComboBox1.removeAllItems();
            flightidComboBox2.removeAllItems();
            flightidComboBox3.removeAllItems();
        } catch (Exception ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cleanButton2ActionPerformed

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthComboBoxActionPerformed

    private void dayComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayComboBoxActionPerformed

    
    public String getPassengerName() {          
        return passengerName;
    }

   

    public void setPassengerName(String passengerName) {
        if(!passengerName.matches("[a-zA-Z]+")){
            this.infoTextArea.append("Passenger name should not be empty or special characters,\n");
            this.passengerName = null;
            this.nameTextField.setText("");
        }else
            this.passengerName = passengerName;
    }
    
    
    
    public void divisionLine(){
        
        Timestamp currentTimestamp = new Timestamp(Calendar.getInstance().getTime().getTime());
        infoTextArea.append("\n");
        for(int i =0; i<30;i++){
            infoTextArea.append("-");
        }
        infoTextArea.append(currentTimestamp.toString());
        for(int i =0; i<30;i++){
            infoTextArea.append("-");
        }
        infoTextArea.append("\n");
    }
    public boolean dateValidation(String date){
        if(date == null){
            infoTextArea.append("No valid query date\n");
            return false;
        }
        return true;
    }
    public boolean flightidValidation(String flightid){
        if(flightid == null){
            infoTextArea.append("No valid query flightid\n");
            return false;
        }
        return true;
    }
    
    public boolean comboboxValidation(){
        if(dateComboBox1.getItemCount()==0 || flightidComboBox1.getItemCount()==0){
            infoTextArea.append("Date or Flightid Combobox contains no item\n");
            return false;
        }
        return true;
    }
    public void updateNameComboBox() throws Exception{
        String[] names = DBCustomer.queryCustomer().stream().toArray(String[]::new);
        
        this.nameComboBox1.removeAllItems();
        this.nameComboBox2.removeAllItems();
        for(String name : names){
            this.nameComboBox1.addItem(name);
            this.nameComboBox2.addItem(name);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDateButton;
    private javax.swing.JButton addFlightButton;
    private javax.swing.JButton bookButton;
    private javax.swing.JTextField capacityText;
    private javax.swing.JButton cleanButton1;
    private javax.swing.JButton cleanButton2;
    private javax.swing.JButton cleanButton3;
    private javax.swing.JComboBox<String> dateComboBox1;
    private javax.swing.JComboBox<String> dateComboBox2;
    private javax.swing.JComboBox<String> dateComboBox3;
    private javax.swing.JComboBox<String> dateComboBox4;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JButton dropFlightButton;
    private javax.swing.JTextField flightIDText;
    private javax.swing.JComboBox<String> flightidComboBox1;
    private javax.swing.JComboBox<String> flightidComboBox2;
    private javax.swing.JComboBox<String> flightidComboBox3;
    private java.awt.TextArea infoTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JComboBox<String> nameComboBox1;
    private javax.swing.JComboBox<String> nameComboBox2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton queryButton1;
    private javax.swing.JButton queryButton2;
    private javax.swing.JButton queryButton3;
    private javax.swing.JButton removeButton;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
