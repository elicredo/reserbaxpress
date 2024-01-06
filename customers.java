import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import net.proteanit.sql.DbUtils;

public class customers extends javax.swing.JFrame {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Statement st = null;
    public customers() {
        initComponents();
        showCustomers();
        customeredit_btn.setEnabled(false);
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
        customername_lbl = new javax.swing.JLabel();
        customername = new javax.swing.JTextField();
        customeredit_btn = new javax.swing.JButton();
        customerdelete_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerlist = new javax.swing.JTable();
        customeradd_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        customerphone_lbl = new javax.swing.JLabel();
        customerphone = new javax.swing.JTextField();
        customergender_lbl = new javax.swing.JLabel();
        customeraddress_lbl = new javax.swing.JLabel();
        customeraddress = new javax.swing.JTextField();
        customerdob_lbl = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        customerdob = new com.toedter.calendar.JDateChooser();
        customername_lbl1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addGap(184, 184, 184)
                .addComponent(bookings, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customers, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        managerooms_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        managerooms_lbl.setForeground(new java.awt.Color(255, 255, 255));
        managerooms_lbl.setText("Manage Customers");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(managerooms_lbl)
                .addContainerGap(548, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managerooms_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        customername_lbl.setBackground(new java.awt.Color(0, 0, 0));
        customername_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        customername_lbl.setForeground(new java.awt.Color(255, 0, 0));
        customername_lbl.setText("Search:");
        customername_lbl.setToolTipText("");

        customername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        customername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customernameActionPerformed(evt);
            }
        });

        customeredit_btn.setBackground(new java.awt.Color(255, 51, 51));
        customeredit_btn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        customeredit_btn.setForeground(new java.awt.Color(255, 255, 255));
        customeredit_btn.setText("Edit");
        customeredit_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customeredit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customeredit_btnActionPerformed(evt);
            }
        });

        customerdelete_btn.setBackground(new java.awt.Color(255, 51, 51));
        customerdelete_btn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        customerdelete_btn.setForeground(new java.awt.Color(255, 255, 255));
        customerdelete_btn.setText("Delete");
        customerdelete_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customerdelete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerdelete_btnActionPerformed(evt);
            }
        });

        customerlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Full Name", "Phone Number", "Gender", "Date of Birth", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerlist.setCellSelectionEnabled(true);
        customerlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerlistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerlist);
        customerlist.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        customeradd_btn.setBackground(new java.awt.Color(255, 51, 51));
        customeradd_btn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        customeradd_btn.setForeground(new java.awt.Color(255, 255, 255));
        customeradd_btn.setText("Add");
        customeradd_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customeradd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customeradd_btnActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 0, 0));

        customerphone_lbl.setBackground(new java.awt.Color(0, 0, 0));
        customerphone_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        customerphone_lbl.setForeground(new java.awt.Color(255, 0, 0));
        customerphone_lbl.setText("Contact Number");
        customerphone_lbl.setToolTipText("");

        customerphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        customerphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerphoneActionPerformed(evt);
            }
        });

        customergender_lbl.setBackground(new java.awt.Color(0, 0, 0));
        customergender_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        customergender_lbl.setForeground(new java.awt.Color(255, 0, 0));
        customergender_lbl.setText("Sex");
        customergender_lbl.setToolTipText("");

        customeraddress_lbl.setBackground(new java.awt.Color(0, 0, 0));
        customeraddress_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        customeraddress_lbl.setForeground(new java.awt.Color(255, 0, 0));
        customeraddress_lbl.setText("Address");
        customeraddress_lbl.setToolTipText("");

        customeraddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        customeraddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customeraddressActionPerformed(evt);
            }
        });

        customerdob_lbl.setBackground(new java.awt.Color(0, 0, 0));
        customerdob_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        customerdob_lbl.setForeground(new java.awt.Color(255, 0, 0));
        customerdob_lbl.setText("Date of Birth");
        customerdob_lbl.setToolTipText("");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Male", "Female", "Others", " " }));

        customername_lbl1.setBackground(new java.awt.Color(0, 0, 0));
        customername_lbl1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        customername_lbl1.setForeground(new java.awt.Color(255, 0, 0));
        customername_lbl1.setText("Full Name");
        customername_lbl1.setToolTipText("");

        search.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchCaretUpdate(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(customername_lbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(refresh))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(customeradd_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(customeredit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(50, 50, 50)
                                                    .addComponent(customerdelete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(gender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(customerdob, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(customername, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(customerphone_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(customerphone, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(customergender_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(customeraddress_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(customeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(customerdob_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(75, 75, 75)))
                                                .addComponent(customername_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customername_lbl)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(customername_lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(customername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customerphone_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerphone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customergender_lbl)
                        .addGap(5, 5, 5)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customerdob_lbl)
                        .addGap(5, 5, 5)
                        .addComponent(customerdob, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customeraddress_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customeraddress, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customeredit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customeradd_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customerdelete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void clearFields(){
        customername.setText(null);
        customerphone.setText(null);
        gender.setSelectedItem("-Select-");
        customerdob.setDate(null);
        customeraddress.setText(null);
        
     }
 private void showCustomers() {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress", "root", "");
        st = con.createStatement();
        rs = st.executeQuery("select * from customers");

        // Create a DefaultTableModel with custom headers
        String[] columnHeaders = {"Customer ID", "Full Name", "Contact Number", "Gender", "Date of Birth", "Address"};
        DefaultTableModel model = new DefaultTableModel(null, columnHeaders);

        while (rs.next()) {
            // Add data to the model
            Object[] rowData = {
                    rs.getInt("cust_id"),
                    rs.getString("cust_name"),
                    rs.getString("cust_phone"),
                    rs.getString("cust_gender"),
                    rs.getString("cust_bday"),
                    rs.getString("cust_add"),

            };
            model.addRow(rowData);
        }

        // Set the table model
        customerlist.setModel(model);

        customerlist.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer());

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
 private void Search(){
        try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress","root","");
                    st = con.createStatement();
                    rs = st.executeQuery("select * from customers where cust_name LIKE '%" + search.getText() + "%'");
                    customerlist.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex);

                }
    }
    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void customernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customernameActionPerformed

    private void customeredit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customeredit_btnActionPerformed
    if(customername.getText().isEmpty() || customerphone.getText().isEmpty() || gender.getSelectedIndex() == -1 || customerdob.getDate() == null || customeraddress.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Fields Empty!");
        } else {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String DOB = dateFormat.format(customerdob.getDate());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress","root","");
            PreparedStatement Save = con.prepareStatement("update customers set cust_name=?, cust_phone=?, cust_gender=?, cust_bday=?, cust_add=? where cust_id = ?");
            Save.setString(1, customername.getText());
            Save.setString(2, customerphone.getText());
            Save.setString(3, gender.getSelectedItem().toString());
            Save.setString(4, DOB);
            Save.setString(5, customeraddress.getText());
            Save.setInt(6, key);
            int row = Save.executeUpdate();
            JOptionPane.showMessageDialog(this, "Customer Edited!");
            showCustomers();
            clearFields();
            con.close(); // Close the connection after database operations
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_customeredit_btnActionPerformed
int key = 0;
    private void customerdelete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerdelete_btnActionPerformed
       if(key == 0)
        {
            JOptionPane.showMessageDialog(this, "Select a Customer!");
        }
        else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress","root","");
                PreparedStatement Save = con.prepareStatement("delete from customers where cust_id = ?");
                Save.setInt(1, key);
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Room Deleted!");
                con.close();
                showCustomers();
                clearFields();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
                
            }
        }
    }//GEN-LAST:event_customerdelete_btnActionPerformed

    private void customeradd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customeradd_btnActionPerformed
     if(customername.getText().isEmpty() || customerphone.getText().isEmpty() || gender.getSelectedIndex() == -1 || customerdob.getDate() == null || customeraddress.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Fields Empty!");
        } else {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String DOB = dateFormat.format(customerdob.getDate());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reserbaexpress","root","");
            PreparedStatement Save = con.prepareStatement("insert into customers (cust_name, cust_phone, cust_gender, cust_bday, cust_add) values (?, ?, ?, ?, ?)");
            Save.setString(1, customername.getText());
            Save.setString(2, customerphone.getText());
            Save.setString(3, gender.getSelectedItem().toString());
            Save.setString(4, DOB);
            Save.setString(5, customeraddress.getText());
            int row = Save.executeUpdate(); // Execute the update
            JOptionPane.showMessageDialog(this, "Customer Added!");
            showCustomers();
            clearFields();
            con.close(); // Close the connection after database operations
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_customeradd_btnActionPerformed

    private void customerphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerphoneActionPerformed

    private void customeraddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customeraddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customeraddressActionPerformed

    private void customerlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerlistMouseClicked
       refresh.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            customeradd_btn.setEnabled(true);
            customeredit_btn.setEnabled(false);
        }
        });   
    DefaultTableModel model = (DefaultTableModel)customerlist.getModel();
       int MyIndex = customerlist.getSelectedRow();
       key = Integer.valueOf(model.getValueAt(MyIndex,0).toString());
       customername.setText(model.getValueAt(MyIndex, 1).toString());
       customerphone.setText(model.getValueAt(MyIndex, 2).toString());
       gender.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
       String dobString = model.getValueAt(MyIndex, 4).toString();
        try {
            Date dob = new SimpleDateFormat("yyyy-MM-dd").parse(dobString);
            customerdob.setDate(dob);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       customeraddress.setText(model.getValueAt(MyIndex, 1).toString());
       customeradd_btn.setEnabled(false);
       customeredit_btn.setEnabled(true);
    }//GEN-LAST:event_customerlistMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

    }//GEN-LAST:event_searchActionPerformed

    private void searchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchCaretUpdate
       Search();
    }//GEN-LAST:event_searchCaretUpdate

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
      showCustomers();
      search.setText("");
    }//GEN-LAST:event_refreshActionPerformed

    private void roomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseClicked
     new rooms().setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_roomsMouseClicked

    private void bookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingsMouseClicked
        new Bookings().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_bookingsMouseClicked

    private void customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseClicked
      new customers().setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_customersMouseClicked

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
            java.util.logging.Logger.getLogger(customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookings;
    private javax.swing.JButton customeradd_btn;
    private javax.swing.JTextField customeraddress;
    private javax.swing.JLabel customeraddress_lbl;
    private javax.swing.JButton customerdelete_btn;
    private com.toedter.calendar.JDateChooser customerdob;
    private javax.swing.JLabel customerdob_lbl;
    private javax.swing.JButton customeredit_btn;
    private javax.swing.JLabel customergender_lbl;
    private javax.swing.JTable customerlist;
    private javax.swing.JTextField customername;
    private javax.swing.JLabel customername_lbl;
    private javax.swing.JLabel customername_lbl1;
    private javax.swing.JTextField customerphone;
    private javax.swing.JLabel customerphone_lbl;
    private javax.swing.JLabel customers;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel managerooms_lbl;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel rooms;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
