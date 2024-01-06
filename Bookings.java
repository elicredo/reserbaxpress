import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class Bookings extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    public Bookings() {
        initComponents();
        getRooms();
        getCustomers();
        showBookings();
        update.setEnabled(false);
        clearFields();
        doclistener();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        customerstable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        bookings = new javax.swing.JLabel();
        customers = new javax.swing.JLabel();
        rooms = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        managebookings_lbl = new javax.swing.JLabel();
        roomtype_bl = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        checkoutbtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        bookinglist = new javax.swing.JTable();
        checkinbtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        customername_lbl = new javax.swing.JLabel();
        checkindate_lbl = new javax.swing.JLabel();
        totalcost_lbl = new javax.swing.JLabel();
        totalcost = new javax.swing.JTextField();
        duration_lbl = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        room = new javax.swing.JComboBox<>();
        customer = new javax.swing.JComboBox<>();
        checkin = new com.toedter.calendar.JDateChooser();
        refresh = new javax.swing.JButton();
        duration_lbl1 = new javax.swing.JLabel();
        additionalPillows = new javax.swing.JTextField();
        duration_lbl2 = new javax.swing.JLabel();
        additionalBlankets = new javax.swing.JTextField();
        duration_lbl4 = new javax.swing.JLabel();
        numberOfPeople = new javax.swing.JTextField();
        totalcost_lbl1 = new javax.swing.JLabel();
        paymentrec = new javax.swing.JTextField();

        customerstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Full Name", "Phone Number", "Gender", "Date of Birth", "Address"
            }
        ));
        customerstable.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(customerstable);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1001, 584));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        logout.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        bookings.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        bookings.setForeground(new java.awt.Color(255, 255, 255));
        bookings.setText("Bookings");
        bookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingsMouseClicked(evt);
            }
        });

        customers.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        customers.setForeground(new java.awt.Color(255, 255, 255));
        customers.setText("Customers");
        customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersMouseClicked(evt);
            }
        });

        rooms.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        rooms.setForeground(new java.awt.Color(255, 255, 255));
        rooms.setText("Rooms");
        rooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookings, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customers, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(bookings, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customers, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        managebookings_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        managebookings_lbl.setForeground(new java.awt.Color(255, 255, 255));
        managebookings_lbl.setText("Manage Bookings");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(managebookings_lbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(managebookings_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        roomtype_bl.setBackground(new java.awt.Color(0, 0, 0));
        roomtype_bl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        roomtype_bl.setForeground(new java.awt.Color(255, 0, 0));
        roomtype_bl.setText("Room Number");
        roomtype_bl.setToolTipText("");

        update.setBackground(new java.awt.Color(255, 51, 51));
        update.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        checkoutbtn.setBackground(new java.awt.Color(255, 51, 51));
        checkoutbtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        checkoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        checkoutbtn.setText("Check-Out");
        checkoutbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutbtnActionPerformed(evt);
            }
        });

        bookinglist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "Room", "Customer", "Check In", "Check Out", "Number of People", "Additionals", "Total Cost", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookinglist.setCellSelectionEnabled(true);
        bookinglist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookinglistMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(bookinglist);
        bookinglist.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        checkinbtn.setBackground(new java.awt.Color(255, 51, 51));
        checkinbtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        checkinbtn.setForeground(new java.awt.Color(255, 255, 255));
        checkinbtn.setText("Check In");
        checkinbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinbtnActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 0, 0));

        customername_lbl.setBackground(new java.awt.Color(0, 0, 0));
        customername_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        customername_lbl.setForeground(new java.awt.Color(255, 0, 0));
        customername_lbl.setText("Customer Name");
        customername_lbl.setToolTipText("");

        checkindate_lbl.setBackground(new java.awt.Color(0, 0, 0));
        checkindate_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        checkindate_lbl.setForeground(new java.awt.Color(255, 0, 0));
        checkindate_lbl.setText("Date of Check In");
        checkindate_lbl.setToolTipText("");

        totalcost_lbl.setBackground(new java.awt.Color(0, 0, 0));
        totalcost_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        totalcost_lbl.setForeground(new java.awt.Color(255, 0, 0));
        totalcost_lbl.setText("Total Cost");
        totalcost_lbl.setToolTipText("");

        totalcost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        totalcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalcostActionPerformed(evt);
            }
        });

        duration_lbl.setBackground(new java.awt.Color(0, 0, 0));
        duration_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        duration_lbl.setForeground(new java.awt.Color(255, 0, 0));
        duration_lbl.setText("Duration in Days");
        duration_lbl.setToolTipText("");

        duration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationActionPerformed(evt);
            }
        });

        room.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomActionPerformed(evt);
            }
        });

        customer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        duration_lbl1.setBackground(new java.awt.Color(0, 0, 0));
        duration_lbl1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        duration_lbl1.setForeground(new java.awt.Color(255, 0, 0));
        duration_lbl1.setText("Additional Pillows");
        duration_lbl1.setToolTipText("");

        additionalPillows.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        additionalPillows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionalPillowsActionPerformed(evt);
            }
        });

        duration_lbl2.setBackground(new java.awt.Color(0, 0, 0));
        duration_lbl2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        duration_lbl2.setForeground(new java.awt.Color(255, 0, 0));
        duration_lbl2.setText("Additional Blankets");
        duration_lbl2.setToolTipText("");

        additionalBlankets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        additionalBlankets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionalBlanketsActionPerformed(evt);
            }
        });

        duration_lbl4.setBackground(new java.awt.Color(0, 0, 0));
        duration_lbl4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        duration_lbl4.setForeground(new java.awt.Color(255, 0, 0));
        duration_lbl4.setText("Number of People");
        duration_lbl4.setToolTipText("");

        numberOfPeople.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        numberOfPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfPeopleActionPerformed(evt);
            }
        });

        totalcost_lbl1.setBackground(new java.awt.Color(0, 0, 0));
        totalcost_lbl1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        totalcost_lbl1.setForeground(new java.awt.Color(255, 0, 0));
        totalcost_lbl1.setText("Payment Recieved");
        totalcost_lbl1.setToolTipText("");

        paymentrec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paymentrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentrecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(totalcost_lbl)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(customer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(customername_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(checkin, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(checkindate_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(duration_lbl)
                                                .addComponent(duration_lbl4))
                                            .addGap(21, 21, 21)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(numberOfPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(duration_lbl1)
                                            .addGap(18, 18, 18)
                                            .addComponent(additionalPillows, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(duration_lbl2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(additionalBlankets, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(totalcost_lbl1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(paymentrec))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(roomtype_bl, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(refresh)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(checkinbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(checkoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomtype_bl)
                            .addComponent(refresh))
                        .addGap(6, 6, 6)
                        .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customername_lbl)
                        .addGap(2, 2, 2)
                        .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkindate_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(duration_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(duration_lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberOfPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(duration_lbl1)
                            .addComponent(additionalPillows, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(duration_lbl2)
                            .addComponent(additionalBlankets, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalcost_lbl)
                            .addComponent(totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalcost_lbl1)
                            .addComponent(paymentrec, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkinbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearFields(){
        room.setSelectedItem("101");
        customer.setSelectedItem("101");
        checkin.setDate(null);
        duration.setText(null);
        numberOfPeople.setText(null);
        additionalPillows.setText(null);
        additionalBlankets.setText(null);
        totalcost.setText(null);
        paymentrec.setText(null);
     }
    
    private void updateRoomComboBox() {
        DefaultComboBoxModel<String> roomModel = new DefaultComboBoxModel<>();
        room.setModel(roomModel);
    try {
        String s = "Free";
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress", "root", "");
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM rooms");

        while (rs.next()) {
            int roomNumber = rs.getInt("room_num");
            roomModel.addElement(String.valueOf(roomNumber));
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage());
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }
    
    
    private void updateRoomStat(){
     try {
         int roomId = Integer.parseInt(room.getSelectedItem().toString());
         String status = "Booked";
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress", "root", "");
        PreparedStatement updateRoom = con.prepareStatement("UPDATE rooms SET room_stat = ? WHERE room_num = ?");
        updateRoom.setInt(2, roomId);
        updateRoom.setString(1, status);

        int rowsUpdated = updateRoom.executeUpdate();

        if (rowsUpdated > 0) {
            System.out.println("Room status updated for room " + roomId);
        } else {
            System.out.println("Failed to update room status for room " + roomId);
        }

        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }}
    
   private void showBookings() {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress", "root", "");
        st = con.createStatement();
        rs = st.executeQuery("select * from booking");

        // Create a DefaultTableModel with custom headers
        String[] columnHeaders = {"Book ID", "Room", "Customer", "Check In", "Check Out", "Occupants", "Duration(Days)", "Additional Pillow","Additional Blanket", "Total Cost", "Payment Recieved", "Balance", "Status"};
        DefaultTableModel model = new DefaultTableModel(null, columnHeaders);

        while (rs.next()) {
            // Add data to the model
            Object[] rowData = {
                    rs.getInt("book_id"),
                    rs.getString("room"),
                    rs.getString("customer"),
                    rs.getString("checkindate"),
                    rs.getString("checkoutdate"),
                    rs.getInt("occupants"),
                    rs.getInt("duration"),
                    rs.getInt("add_pillows"),
                    rs.getInt("add_blanket"),
                    rs.getInt("cost"),
                    rs.getInt("paymentrec"),
                    rs.getInt("balance"),
                    rs.getString("status")
            };
            model.addRow(rowData);
        }

        // Set the table model
        bookinglist.setModel(model);

        // Set a custom cell renderer to adjust column heights dynamically
        bookinglist.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer());

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, ex);
    }
}

// Custom cell renderer to allow multi-line text in cells
class MultiLineTableCellRenderer extends JTextArea implements TableCellRenderer {
    MultiLineTableCellRenderer() {
        setLineWrap(true);
        setWrapStyleWord(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setText((value == null) ? "" : value.toString());
        setSize(table.getColumnModel().getColumn(column).getWidth(), getPreferredSize().height);
        if (table.getRowHeight(row) != getPreferredSize().height) {
            table.setRowHeight(row, getPreferredSize().height);
        }
        return this;
    }
}

    private void getRooms() {
    try {
        String s = "Free";
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress", "root", "");
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM rooms");
        while (rs.next()) {
            int roomNumber = rs.getInt("room_num");
            room.addItem(String.valueOf(roomNumber));
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }
}

private void getCustomers() {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress", "root", "");
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM customers");
        while (rs.next()) {
            String customerName = rs.getString("cust_name");
            customer.addItem(customerName);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }
}
   private void updateRoomToFree(){
     String status = "Free";
    if (room.getSelectedItem() != null) {
    int roomId = Integer.parseInt(room.getSelectedItem().toString());

    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress", "root", "");
        PreparedStatement updateRoom = con.prepareStatement("UPDATE rooms SET room_stat = ? WHERE room_num = ?");
        updateRoom.setInt(2, roomId);
        updateRoom.setString(1, status);

        int rowsUpdated = updateRoom.executeUpdate();

        if (rowsUpdated > 0) {
            System.out.println("Room status updated for room " + roomId);
        } else {
            System.out.println("Failed to update room status for room " + roomId);
        }

        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
} else {
    System.out.println("Selected item in the room combo box is null.");
}
}
  private void doclistener() {
    duration.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            getCost();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            getCost();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            // If there are style updates, you can handle them here
        }
    });

    additionalPillows.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            getCost();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            getCost();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            // If there are style updates, you can handle them here
        }
    });

    additionalBlankets.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            getCost();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            getCost();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            // If there are style updates, you can handle them here
        }
    });

    numberOfPeople.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            getCost();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            getCost();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            // If there are style updates, you can handle them here
        }
    });
} 
  private void getCost() {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress", "root", "");
        st = con.createStatement();
        String selectedRoomId = room.getSelectedItem().toString();

        // Explicitly initialize variables to handle empty fields
        int durationOfStay = 0;
        int pillows = 0;
        int blankets = 0;
        int additionalPax = 0;

        // Validate and parse duration
        if (!duration.getText().isEmpty()) {
            durationOfStay = Integer.parseInt(duration.getText());
        }

        // Validate and parse additionalPillows
        if (!additionalPillows.getText().isEmpty()) {
            pillows = Integer.parseInt(additionalPillows.getText());
        }

        // Validate and parse additionalBlankets
        if (!additionalBlankets.getText().isEmpty()) {
            blankets = Integer.parseInt(additionalBlankets.getText());
        }

        // Validate and parse additionalPax
        if (!numberOfPeople.getText().isEmpty()) {
            additionalPax = Integer.parseInt(numberOfPeople.getText());
        }

        String query = "SELECT price, room_pax FROM rooms WHERE room_num=?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, selectedRoomId);
            rs = ps.executeQuery();

            if (rs.next()) {
                int roomPrice = rs.getInt("price");
                int roomPax = rs.getInt("room_pax");

                int totalCost = (roomPrice + pillows * 100 + blankets * 100) * durationOfStay;

                int additionalPaxCost = Math.max(0, additionalPax - roomPax) * 100;

                totalCost += additionalPaxCost;

                // Use final variables for the lambda expression
                final int finalTotalCost = totalCost;

                SwingUtilities.invokeLater(() -> {
                    totalcost.setText(String.valueOf(finalTotalCost));
                });

                // Debug prints
                System.out.println("Total Cost: " + totalCost);
            } else {
                // Print a message indicating that the room was not found
                System.out.println("Room not found for room ID: " + selectedRoomId);

                // Show a dialog to inform the user about the issue
                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(this, "Room not found", "Error", JOptionPane.ERROR_MESSAGE);
                });
            }
        }
    } catch (NumberFormatException ex) {
        // Print the stack trace for debugging
        ex.printStackTrace();
        
        // Show a dialog to inform the user about the invalid input
        SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        });
    } catch (SQLException ex) {
        // Print the stack trace for debugging
        ex.printStackTrace();
        
        // Show a dialog to inform the user about the database error
        SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        });
    }
}

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
     if (key == 0) {
    JOptionPane.showMessageDialog(this, "Select a Booking!");
} else {
    if (room.getSelectedIndex() == -1 || customer.getSelectedIndex() == -1 || checkin.getDate() == null || duration.getText().isEmpty() || totalcost.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Fields Empty!");
    } else {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date CIBDate = checkin.getDate();
            String CIB = dateFormat.format(CIBDate);
            Calendar cal = Calendar.getInstance();
            cal.setTime(CIBDate);
            cal.add(Calendar.DATE, Integer.parseInt(duration.getText()));
            String COB = dateFormat.format(cal.getTime());

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress", "root", "");

                // Check the current status of the booking
                PreparedStatement checkStatus = con.prepareStatement("SELECT status FROM booking WHERE book_id = ?");
                checkStatus.setInt(1, key);
                ResultSet statusResult = checkStatus.executeQuery();

                if (statusResult.next()) {
                    String status = statusResult.getString("status");

                    if ("Checked out".equals(status)) {
                        JOptionPane.showMessageDialog(this, "Cannot update a booking with 'Checked out' status.");
                    } else {
                        // Get the current room of the booking
                        PreparedStatement getCurrentRoom = con.prepareStatement("SELECT room FROM booking WHERE book_id = ?");
                        getCurrentRoom.setInt(1, key);
                        ResultSet currentRoomResult = getCurrentRoom.executeQuery();
                        String currentRoom = "";

                        if (currentRoomResult.next()) {
                            currentRoom = currentRoomResult.getString("room");
                        }

                        // Check if the room is being changed
                        if (!currentRoom.equals(room.getSelectedItem().toString())) {
                            // Room is being changed, update the old room status to 'Free'
                            PreparedStatement updateOldRoomStatus = con.prepareStatement("UPDATE rooms SET room_stat = 'Free' WHERE room_num = ?");
                            updateOldRoomStatus.setString(1, currentRoom);
                            updateOldRoomStatus.executeUpdate();

                            // Update the new room status to 'Booked'
                            PreparedStatement updateNewRoomStatus = con.prepareStatement("UPDATE rooms SET room_stat = 'Booked' WHERE room_num = ?");
                            updateNewRoomStatus.setString(1, room.getSelectedItem().toString());
                            updateNewRoomStatus.executeUpdate();
                        }

                        // Proceed with the update
                        PreparedStatement saveBooking = con.prepareStatement("UPDATE booking SET room=?, customer=?, checkindate=?, checkoutdate=?, duration=?, occupants=?, add_pillows=?, add_blanket=?, cost=?, paymentrec=? WHERE book_id=?");
                        saveBooking.setString(1, room.getSelectedItem().toString());
                        saveBooking.setString(2, customer.getSelectedItem().toString());
                        saveBooking.setString(3, CIB);
                        saveBooking.setString(4, COB);
                        saveBooking.setInt(5, Integer.parseInt(duration.getText()));
                        saveBooking.setInt(6, Integer.parseInt(numberOfPeople.getText()));
                        saveBooking.setInt(7, Integer.parseInt(additionalPillows.getText()));
                        saveBooking.setInt(8, Integer.parseInt(additionalBlankets.getText()));
                        saveBooking.setInt(9, Integer.parseInt(totalcost.getText()));
                        saveBooking.setInt(10, Integer.parseInt(paymentrec.getText()));
                        saveBooking.setInt(11, key);

                        int row = saveBooking.executeUpdate();
                        if (row > 0) {
                            // Booking updated successfully, now update balance
                            int balance = Integer.parseInt(totalcost.getText()) - Integer.parseInt(paymentrec.getText());

                            // Update balance in the booking table
                            PreparedStatement updateBalance = con.prepareStatement("UPDATE booking SET balance = ? WHERE book_id = ?");
                            updateBalance.setInt(1, balance);
                            updateBalance.setInt(2, key);
                            updateBalance.executeUpdate();

                            JOptionPane.showMessageDialog(this, "Booking Updated!");
                        } else {
                            JOptionPane.showMessageDialog(this, "Failed to update booking.");
                        }

                        con.close();
                        showBookings();
                        clearFields();
                        updateRoomStat();
                        getRooms();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Unable to retrieve booking status.");
                }
            } catch (SQLException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
}
    }//GEN-LAST:event_updateActionPerformed
int key = 0;
    private void checkoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutbtnActionPerformed
     if (key == 0) {
    JOptionPane.showMessageDialog(this, "Select a Booking!");
} else {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress", "root", "");
        
        PreparedStatement getRemainingBalance = con.prepareStatement("SELECT balance FROM booking WHERE book_id = ?");
        getRemainingBalance.setInt(1, key);
        ResultSet balanceResult = getRemainingBalance.executeQuery();
        
        int remainingBalance = 0; 
        if (balanceResult.next()) {
            remainingBalance = balanceResult.getInt("balance");
        }

        if (remainingBalance > 0) {
            String userInput = JOptionPane.showInputDialog(this, "There is still a remaining balance of P" + remainingBalance + ". Enter the amount to deduct:");

            if (userInput == null || userInput.trim().isEmpty()) {
                con.close();
                return; 
            }

            int deductionAmount = Integer.parseInt(userInput);

            if (deductionAmount > remainingBalance) {
                JOptionPane.showMessageDialog(this, "Deduction amount cannot be greater than the remaining balance.");
                con.close();
                return;
            }

            remainingBalance -= deductionAmount;

            PreparedStatement updateBalance = con.prepareStatement("UPDATE booking SET balance = ? WHERE book_id = ?");
            updateBalance.setDouble(1, remainingBalance);
            updateBalance.setInt(2, key);
            updateBalance.executeUpdate();
        }
        
        PreparedStatement getRoomId = con.prepareStatement("SELECT room FROM booking WHERE book_id = ?");
        getRoomId.setInt(1, key);
        ResultSet roomResult = getRoomId.executeQuery();

        int roomId = -1;  // Initialize with a default value
        if (roomResult.next()) {
            roomId = roomResult.getInt("room");
        }
        PreparedStatement deleteBooking = con.prepareStatement("update booking set status = 'Checked Out' WHERE book_id = ?");
        deleteBooking.setInt(1, key);
        int deleteRow = deleteBooking.executeUpdate();
        
        if (deleteRow > 0 && roomId != -1) {
            // Update the room status to 'Free'
            PreparedStatement updateRoom = con.prepareStatement("UPDATE rooms SET room_stat = 'Free' WHERE room_num = ?");
            updateRoom.setInt(1, roomId);
            int updateRoomRow = updateRoom.executeUpdate();

            if (updateRoomRow > 0) {
                JOptionPane.showMessageDialog(this, "Booking Deleted, Room Status Updated!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update room status.");
            }

            con.close();
            showBookings();
            clearFields();
            getRooms();
            updateRoomComboBox();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete booking.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, ex);
    }
}
                       
    }//GEN-LAST:event_checkoutbtnActionPerformed

    private void checkinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinbtnActionPerformed
    if (room.getSelectedIndex() == -1 || customer.getSelectedIndex() == -1 || checkin.getDate() == null ||
    duration.getText().isEmpty() || numberOfPeople.getText().isEmpty() ||
    additionalPillows.getText().isEmpty() || additionalBlankets.getText().isEmpty() ||
    totalcost.getText().isEmpty() || paymentrec.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please fill in all fields.");
} else {
    try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date CIBDate = checkin.getDate();
        String CIB = dateFormat.format(CIBDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(CIBDate);
        cal.add(Calendar.DATE, Integer.parseInt(duration.getText()));
        String COB = dateFormat.format(cal.getTime());

        try {
            String status = "Active";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress", "root", "");

            PreparedStatement checkRoomAvailability = con.prepareStatement("SELECT room_stat FROM rooms WHERE room_num = ?");
            checkRoomAvailability.setString(1, room.getSelectedItem().toString());
            ResultSet roomAvailabilityResult = checkRoomAvailability.executeQuery();

            if (roomAvailabilityResult.next()) {
                String roomStatus = roomAvailabilityResult.getString("room_stat");

                if ("Free".equals(roomStatus)) {
                    // Room is available, proceed with booking
                    PreparedStatement saveBooking = con.prepareStatement("INSERT INTO booking (room, customer, checkindate, checkoutdate, duration, occupants, add_pillows, add_blanket, cost, paymentrec, balance, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    saveBooking.setString(1, room.getSelectedItem().toString());
                    saveBooking.setString(2, customer.getSelectedItem().toString());
                    saveBooking.setString(3, CIB);
                    saveBooking.setString(4, COB);
                    saveBooking.setInt(5, Integer.parseInt(duration.getText()));
                    saveBooking.setInt(6, Integer.parseInt(numberOfPeople.getText()));
                    saveBooking.setInt(7, Integer.parseInt(additionalPillows.getText()));
                    saveBooking.setInt(8, Integer.parseInt(additionalBlankets.getText()));
                    saveBooking.setInt(9, Integer.parseInt(totalcost.getText()));
                    saveBooking.setInt(10, Integer.parseInt(paymentrec.getText()));
                    saveBooking.setInt(11, 0);
                    saveBooking.setString(12, status);

                    int row = saveBooking.executeUpdate();
                    if (row > 0) {
                        // Booking added successfully, now update room status and balance
                        int balance = Integer.parseInt(totalcost.getText()) - Integer.parseInt(paymentrec.getText());

                        // Update room status to 'Booked'
                        PreparedStatement updateRoomStatus = con.prepareStatement("UPDATE rooms SET room_stat = 'Booked' WHERE room_num = ?");
                        updateRoomStatus.setString(1, room.getSelectedItem().toString());
                        updateRoomStatus.executeUpdate();

                        // Update balance in the booking table
                        PreparedStatement updateBalance = con.prepareStatement("UPDATE booking SET balance = ? WHERE room = ? AND customer = ? AND checkindate = ?");
                        updateBalance.setInt(1, balance);
                        updateBalance.setString(2, room.getSelectedItem().toString());
                        updateBalance.setString(3, customer.getSelectedItem().toString());
                        updateBalance.setString(4, CIB);
                        updateBalance.executeUpdate();

                        JOptionPane.showMessageDialog(this, "Booking Added! Room is now booked.");
                        clearFields();
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to add booking.");
                        clearFields();
                    }
                } else {
                    // Room is not available
                    JOptionPane.showMessageDialog(this, "Selected room is not available. Please choose another room.");
                }
            } else {
                // Handle the case where the room is not found in the rooms table
                JOptionPane.showMessageDialog(this, "Selected room not found in the database.");
            }

            con.close();
            showBookings();
            updateRoomStat();
            getRooms();
            updateRoomComboBox();
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, ex);
    }
}
    }//GEN-LAST:event_checkinbtnActionPerformed

    private void totalcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalcostActionPerformed

    }//GEN-LAST:event_totalcostActionPerformed

    private void durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationActionPerformed

    }//GEN-LAST:event_durationActionPerformed

    private void roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomActionPerformed

    }//GEN-LAST:event_roomActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed

    }//GEN-LAST:event_customerActionPerformed

    private void bookinglistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookinglistMouseClicked
     refresh.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        checkinbtn.setEnabled(true);
        update.setEnabled(false);
    }
});

DefaultTableModel model = (DefaultTableModel) bookinglist.getModel();
int MyIndex = bookinglist.getSelectedRow();

if (MyIndex != -1 && MyIndex < model.getRowCount()) {
    try {
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        room.setSelectedItem(model.getValueAt(MyIndex, 1).toString());
        customer.setSelectedItem(model.getValueAt(MyIndex, 2).toString());

        String cibString = model.getValueAt(MyIndex, 3).toString();
        try {
            Date cib = new SimpleDateFormat("yyyy-MM-dd").parse(cibString);
            checkin.setDate(cib);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        numberOfPeople.setText(model.getValueAt(MyIndex, 5).toString());
        duration.setText(model.getValueAt(MyIndex, 6).toString());
        additionalPillows.setText(model.getValueAt(MyIndex, 7).toString());
        additionalBlankets.setText(model.getValueAt(MyIndex, 8).toString());
        totalcost.setText(model.getValueAt(MyIndex, 9).toString());
        paymentrec.setText(model.getValueAt(MyIndex, 10).toString());

        checkinbtn.setEnabled(false);
        update.setEnabled(true);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, ex);
    }
} else {
    // Handle the case where no row is selected or the index is out of bounds
    JOptionPane.showMessageDialog(this,"Select a valid row before refreshing.");
}
    }//GEN-LAST:event_bookinglistMouseClicked

    private void roomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseClicked
         new rooms().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_roomsMouseClicked

    private void bookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingsMouseClicked
        new Bookings().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bookingsMouseClicked

    private void customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseClicked
       new customers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customersMouseClicked

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
     showBookings();
     clearFields();
    }//GEN-LAST:event_refreshActionPerformed

    private void additionalPillowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionalPillowsActionPerformed

    }//GEN-LAST:event_additionalPillowsActionPerformed

    private void additionalBlanketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionalBlanketsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_additionalBlanketsActionPerformed

    private void numberOfPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfPeopleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberOfPeopleActionPerformed

    private void paymentrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentrecActionPerformed
       
    }//GEN-LAST:event_paymentrecActionPerformed

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
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField additionalBlankets;
    private javax.swing.JTextField additionalPillows;
    private javax.swing.JTable bookinglist;
    private javax.swing.JLabel bookings;
    private com.toedter.calendar.JDateChooser checkin;
    private javax.swing.JButton checkinbtn;
    private javax.swing.JLabel checkindate_lbl;
    private javax.swing.JButton checkoutbtn;
    private javax.swing.JComboBox<String> customer;
    private javax.swing.JLabel customername_lbl;
    private javax.swing.JLabel customers;
    private javax.swing.JTable customerstable;
    private javax.swing.JTextField duration;
    private javax.swing.JLabel duration_lbl;
    private javax.swing.JLabel duration_lbl1;
    private javax.swing.JLabel duration_lbl2;
    private javax.swing.JLabel duration_lbl4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel managebookings_lbl;
    private javax.swing.JTextField numberOfPeople;
    private javax.swing.JTextField paymentrec;
    private javax.swing.JButton refresh;
    private javax.swing.JComboBox<String> room;
    private javax.swing.JLabel rooms;
    private javax.swing.JLabel roomtype_bl;
    private javax.swing.JTextField totalcost;
    private javax.swing.JLabel totalcost_lbl;
    private javax.swing.JLabel totalcost_lbl1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
