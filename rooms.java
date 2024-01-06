import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import net.proteanit.sql.DbUtils;

public class rooms extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    
    public rooms() {
        initComponents();
        showRooms();
        roomedit_btn.setEnabled(false);
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        bookings = new javax.swing.JLabel();
        customers = new javax.swing.JLabel();
        rooms = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        managerooms_lbl = new javax.swing.JLabel();
        roomnumber = new javax.swing.JTextField();
        roomstatus_lbl = new javax.swing.JLabel();
        roomtype_lbl = new javax.swing.JLabel();
        roomprice = new javax.swing.JTextField();
        roomprice_lbl = new javax.swing.JLabel();
        roomstatus = new javax.swing.JComboBox<>();
        roomtype = new javax.swing.JComboBox<>();
        roomedit_btn = new javax.swing.JButton();
        roomdelete_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomlist = new javax.swing.JTable();
        roomadd_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        searchstat = new javax.swing.JComboBox<>();
        searchtype = new javax.swing.JComboBox<>();
        Refresh = new javax.swing.JButton();
        desc = new java.awt.TextField();
        roomnumber_lbl1 = new javax.swing.JLabel();
        roomnumber_lbl2 = new javax.swing.JLabel();
        roomnumber_lbl3 = new javax.swing.JLabel();
        pax = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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
                .addGap(184, 184, 184)
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

        managerooms_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        managerooms_lbl.setForeground(new java.awt.Color(255, 255, 255));
        managerooms_lbl.setText("Manage Rooms");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(managerooms_lbl)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managerooms_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roomnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        roomnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomnumberActionPerformed(evt);
            }
        });

        roomstatus_lbl.setBackground(new java.awt.Color(0, 0, 0));
        roomstatus_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        roomstatus_lbl.setForeground(new java.awt.Color(255, 0, 0));
        roomstatus_lbl.setText("Status");
        roomstatus_lbl.setToolTipText("");

        roomtype_lbl.setBackground(new java.awt.Color(0, 0, 0));
        roomtype_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        roomtype_lbl.setForeground(new java.awt.Color(255, 0, 0));
        roomtype_lbl.setText("Room Type");
        roomtype_lbl.setToolTipText("");

        roomprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        roomprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roompriceActionPerformed(evt);
            }
        });

        roomprice_lbl.setBackground(new java.awt.Color(0, 0, 0));
        roomprice_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        roomprice_lbl.setForeground(new java.awt.Color(255, 0, 0));
        roomprice_lbl.setText("Price");
        roomprice_lbl.setToolTipText("");

        roomstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Free", "Booked", " " }));
        roomstatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        roomstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomstatusActionPerformed(evt);
            }
        });

        roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Single", "Double", "Family", " " }));
        roomtype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        roomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomtypeActionPerformed(evt);
            }
        });

        roomedit_btn.setBackground(new java.awt.Color(255, 51, 51));
        roomedit_btn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        roomedit_btn.setForeground(new java.awt.Color(255, 255, 255));
        roomedit_btn.setText("Edit");
        roomedit_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roomedit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomedit_btnActionPerformed(evt);
            }
        });

        roomdelete_btn.setBackground(new java.awt.Color(255, 51, 51));
        roomdelete_btn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        roomdelete_btn.setForeground(new java.awt.Color(255, 255, 255));
        roomdelete_btn.setText("Delete");
        roomdelete_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roomdelete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomdelete_btnActionPerformed(evt);
            }
        });

        roomlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Room Number", "Status", "Category", "PAX", "Price", "Room Details", "Actions"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomlistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(roomlist);
        if (roomlist.getColumnModel().getColumnCount() > 0) {
            roomlist.getColumnModel().getColumn(0).setMaxWidth(500);
            roomlist.getColumnModel().getColumn(1).setMaxWidth(500);
            roomlist.getColumnModel().getColumn(2).setMaxWidth(500);
            roomlist.getColumnModel().getColumn(3).setMaxWidth(500);
            roomlist.getColumnModel().getColumn(4).setPreferredWidth(50);
            roomlist.getColumnModel().getColumn(4).setMaxWidth(500);
            roomlist.getColumnModel().getColumn(5).setPreferredWidth(300);
            roomlist.getColumnModel().getColumn(5).setMaxWidth(500);
        }

        roomadd_btn.setBackground(new java.awt.Color(255, 51, 51));
        roomadd_btn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        roomadd_btn.setForeground(new java.awt.Color(255, 255, 255));
        roomadd_btn.setText("Add");
        roomadd_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roomadd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomadd_btnActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 0, 0));

        searchstat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Free", "Booked" }));
        searchstat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchstatActionPerformed(evt);
            }
        });

        searchtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Single", "Double ", "Family" }));
        searchtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtypeActionPerformed(evt);
            }
        });

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActionPerformed(evt);
            }
        });

        roomnumber_lbl1.setBackground(new java.awt.Color(0, 0, 0));
        roomnumber_lbl1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        roomnumber_lbl1.setForeground(new java.awt.Color(255, 0, 0));
        roomnumber_lbl1.setText("Room Number");
        roomnumber_lbl1.setToolTipText("");

        roomnumber_lbl2.setBackground(new java.awt.Color(0, 0, 0));
        roomnumber_lbl2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        roomnumber_lbl2.setForeground(new java.awt.Color(255, 0, 0));
        roomnumber_lbl2.setText("Room Description");
        roomnumber_lbl2.setToolTipText("");

        roomnumber_lbl3.setBackground(new java.awt.Color(0, 0, 0));
        roomnumber_lbl3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        roomnumber_lbl3.setForeground(new java.awt.Color(255, 0, 0));
        roomnumber_lbl3.setText("Room Pax");
        roomnumber_lbl3.setToolTipText("");

        pax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roomnumber_lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(roomnumber)
                                        .addComponent(roomtype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(roomstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(pax, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(roomnumber_lbl3))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(roomprice_lbl)
                                                    .addGap(26, 26, 26))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(1, 1, 1)
                                                    .addComponent(roomprice))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(roomadd_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(roomedit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(50, 50, 50)
                                                    .addComponent(roomdelete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(roomstatus_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(roomtype_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(roomnumber_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(13, 13, 13)))
                                    .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(searchstat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Refresh)
                                .addGap(254, 254, 254))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(229, 229, 229))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchstat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Refresh)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(roomnumber_lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomstatus_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(roomtype_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(roomnumber_lbl3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pax, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(roomprice_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(roomprice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roomnumber_lbl2)
                        .addGap(1, 1, 1)
                        .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomedit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomadd_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roomdelete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void clearFields(){
        roomnumber.setText(null);
        roomprice.setText(null);
     }

   private void showRooms() {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress", "root", "");
        st = con.createStatement();
        rs = st.executeQuery("select * from rooms");

        // Create a DefaultTableModel with custom headers
        String[] columnHeaders = {"Room ID", "Room Number", "Status", "Category", "Capacity", "Price", "Room Details"};
        DefaultTableModel model = new DefaultTableModel(null, columnHeaders);

        while (rs.next()) {
            // Add data to the model
            Object[] rowData = {
                    rs.getInt("room_id"),
                    rs.getString("room_num"),
                    rs.getString("room_stat"),
                    rs.getString("room_type"),
                    rs.getInt("room_pax"),  
                    rs.getInt("price"),
                    rs.getString("room_desc")};
            model.addRow(rowData);
        }

        roomlist.setModel(model);
        roomlist.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer());

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, ex);
    }
}

class MultiLineTableCellRenderer extends JTextArea implements TableCellRenderer {
    MultiLineTableCellRenderer() {
        setLineWrap(true);
        setWrapStyleWord(true);
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value != null) {
            setText(value.toString());
            setSize(table.getColumnModel().getColumn(column).getWidth(), getPreferredSize().height);
            if (table.getRowHeight(row) != getPreferredSize().height) {
                table.setRowHeight(row, getPreferredSize().height);
            }
        } else {
            setText(""); 
        }
        return this;
    }
}

    private void searchstatus(){
        try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress","root","");
                    st = con.createStatement();
                    rs = st.executeQuery("select * from rooms where room_stat LIKE '%" + searchstat.getSelectedItem() + "%'");
                    roomlist.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex);

                }
    }
    private void searchtype(){
        try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress","root","");
                    st = con.createStatement();
                    rs = st.executeQuery("select * from rooms where room_type LIKE '%" + searchtype.getSelectedItem() + "%'");
                    roomlist.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex);

                }
    }
    private void roomadd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomadd_btnActionPerformed
        if(roomnumber.getText().isEmpty() || roomtype.getSelectedIndex() == -1 || roomstatus.getSelectedIndex() == -1 || pax.getText().isEmpty() || roomprice.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Fields Empty!");
        }
        else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress","root","");
                PreparedStatement Save = con.prepareStatement("insert into rooms (room_num, room_type, room_stat, room_pax, price, room_desc) values (?, ?, ?, ?, ?, ?)");
                Save.setInt(1, Integer.valueOf(roomnumber.getText().toString()));
                Save.setString(2, roomtype.getSelectedItem().toString());
                Save.setString(3, roomstatus.getSelectedItem().toString());
                Save.setString(4, pax.getText().toString());
                Save.setInt(5, Integer.valueOf(roomprice.getText().toString()));
                Save.setString(6, desc.getText().toString());
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Room Added!");
                con.close();
                showRooms();
                clearFields();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
                
            }
        }
    }//GEN-LAST:event_roomadd_btnActionPerformed
    int key = 0;
    private void roomdelete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomdelete_btnActionPerformed
        if(key == 0)
        {
            JOptionPane.showMessageDialog(this, "Select a Room!");
        }
        else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress","root","");
                PreparedStatement Save = con.prepareStatement("delete from rooms where room_id = ?");
                Save.setInt(1, key);
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Room Deleted!");
                con.close();
                showRooms();
                clearFields();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
                
            }
        }
    }//GEN-LAST:event_roomdelete_btnActionPerformed

    private void roomedit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomedit_btnActionPerformed
        if(key == 0)
        {
            JOptionPane.showMessageDialog(this, "Select a Room!");
        }
        else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress", "root", "");
                PreparedStatement Save = con.prepareStatement("update rooms set room_num=?, room_type=?, room_stat=?, room_pax=?, price=?, room_desc=? where room_id = ?");
                Save.setInt(1, Integer.valueOf(roomnumber.getText().toString()));
                Save.setString(2, roomtype.getSelectedItem().toString());
                Save.setString(3, roomstatus.getSelectedItem().toString());
                Save.setInt(4, Integer.valueOf(pax.getText().toString()));
                Save.setInt(5, Integer.valueOf(roomprice.getText().toString()));
                Save.setString(6, desc.getText().toString());
                Save.setInt(7, key);
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Room Updated!");
                con.close();
                showRooms();
                clearFields();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_roomedit_btnActionPerformed

    private void roomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomtypeActionPerformed

    private void roompriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roompriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roompriceActionPerformed

    private void roomnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomnumberActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
            new login().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void roomlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomlistMouseClicked
    Refresh.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            roomadd_btn.setEnabled(true);
            roomedit_btn.setEnabled(false);
        }
    });
    DefaultTableModel model = (DefaultTableModel) roomlist.getModel();
    int MyIndex = roomlist.getSelectedRow();
    key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
    roomnumber.setText(model.getValueAt(MyIndex, 1).toString());
    roomstatus.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
    roomtype.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
    pax.setText(model.getValueAt(MyIndex, 4).toString());
    roomprice.setText(model.getValueAt(MyIndex, 5).toString());
    desc.setText(model.getValueAt(MyIndex, 6).toString());
    roomadd_btn.setEnabled(false);
    roomedit_btn.setEnabled(true);
    }//GEN-LAST:event_roomlistMouseClicked

    private void bookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingsMouseClicked
       new Bookings().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_bookingsMouseClicked

    private void customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseClicked
        new customers().setVisible(true);
        this.setVisible(false);;
    }//GEN-LAST:event_customersMouseClicked

    private void roomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseClicked
        new rooms().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_roomsMouseClicked

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
       searchstat.setSelectedItem("-Select-");
       searchtype.setSelectedItem("-Select-");
       showRooms();
    }//GEN-LAST:event_RefreshActionPerformed

    private void searchstatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchstatActionPerformed
       searchstatus();
    }//GEN-LAST:event_searchstatActionPerformed

    private void searchtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtypeActionPerformed
      searchtype();
    }//GEN-LAST:event_searchtypeActionPerformed

    private void descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descActionPerformed

    private void roomstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomstatusActionPerformed

    private void paxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paxActionPerformed

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
            java.util.logging.Logger.getLogger(rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel bookings;
    private javax.swing.JLabel customers;
    private java.awt.TextField desc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel managerooms_lbl;
    private javax.swing.JTextField pax;
    private javax.swing.JButton roomadd_btn;
    private javax.swing.JButton roomdelete_btn;
    private javax.swing.JButton roomedit_btn;
    private javax.swing.JTable roomlist;
    private javax.swing.JTextField roomnumber;
    private javax.swing.JLabel roomnumber_lbl1;
    private javax.swing.JLabel roomnumber_lbl2;
    private javax.swing.JLabel roomnumber_lbl3;
    private javax.swing.JTextField roomprice;
    private javax.swing.JLabel roomprice_lbl;
    private javax.swing.JLabel rooms;
    private javax.swing.JComboBox<String> roomstatus;
    private javax.swing.JLabel roomstatus_lbl;
    private javax.swing.JComboBox<String> roomtype;
    private javax.swing.JLabel roomtype_lbl;
    private javax.swing.JComboBox<String> searchstat;
    private javax.swing.JComboBox<String> searchtype;
    // End of variables declaration//GEN-END:variables

    private Object getText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}