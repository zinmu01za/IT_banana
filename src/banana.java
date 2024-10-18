
import static com.oracle.jrockit.jfr.ContentType.Bytes;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.text.MessageFormat;
import static java.time.zone.ZoneRulesProvider.refresh;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import java.util.Collections;

public class banana extends javax.swing.JFrame {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private Object ImgPath;
    String filename = null;
    byte[] person_image = null;
    private int i;
   
   
    public banana(){
        initComponents();
        con=Connect.ConnectDB();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ShowDataToForm();
        ShowDataToForm1();
        ShowDataToForm2();
        ShowDataToForm3();
    }
    
    
    
    public void ShowDataToForm(){
        String sql="SELECT ProductID as 'ลำดับ',ProductName as 'ชื่อเมนู',Price as 'ราคา'\n"
                + "FROM warehouse ";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            tbproduct_list.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(banana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ShowDataToForm1(){
        String sql="SELECT ProductID as 'ลำดับ',ProductName as 'ชื่อเมนู',Price as 'ราคา'\n"
                + "FROM warehouse ";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            tbproductinsert.setModel(DbUtils.resultSetToTableModel(rs));
           
        } catch (SQLException ex) {
            Logger.getLogger(banana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ShowDataToForm2(){
        String sql="SELECT ProductName as 'ชื่อเมนู',Price as 'ราคา',gobbet as 'จำนวน',put as 'ภาชนะ'\n"
                + "FROM list_menu ";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            tbproductlist.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(banana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ShowDataToForm3(){
        String sql="SELECT ProductName ,Price ,count ,unit ,date_time as 'วันที่'\n"
                + "FROM list_bay ";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            tb_list.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(banana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproduct_list = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        lbl_image = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gobbet = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        put = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        txt_cate = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        bodypanel = new javax.swing.JPanel();
        panelsystem = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbproductlist = new javax.swing.JTable();
        put1 = new javax.swing.JLabel();
        txt_name1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_price1 = new javax.swing.JTextField();
        gobbet1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_cate1 = new javax.swing.JTextField();
        txt_sum = new javax.swing.JTextField();
        ton1 = new javax.swing.JTextField();
        ton2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txt_search1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        panelinsert = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbproductinsert = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_price2 = new javax.swing.JTextField();
        txt_search2 = new javax.swing.JTextField();
        txt_name2 = new javax.swing.JTextField();
        lbl_image1 = new javax.swing.JLabel();
        btn_image = new javax.swing.JButton();
        btn_insert2 = new javax.swing.JButton();
        btn_delete2 = new javax.swing.JButton();
        btn_edit2 = new javax.swing.JButton();
        txt_id2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        panellist = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_list = new javax.swing.JTable();
        txt_search3 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txt_sum1 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        promotion = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        message = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\menubar java\\icon\\monkey2.png")); // NOI18N
        jLabel5.setText("BananaShake");
        jLabel5.setIconTextGap(10);
        jLabel5.setInheritsPopupMenu(false);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 60));

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel2.setText("  -");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 50, 60));

        jLabel3.setBackground(new java.awt.Color(255, 51, 51));
        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel3.setText("  x");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 50, 60));

        jLabel1.setBackground(new java.awt.Color(255, 204, 102));
        jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbproduct_list.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        tbproduct_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbproduct_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbproduct_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbproduct_list);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 580, 230));

        jLabel45.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel45.setText("บาท");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 455, 40, -1));

        txt_search.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel2.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 470, 30));

        lbl_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lbl_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 210, 170));

        jLabel6.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel6.setText("ชื่อสินค้า :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel7.setText("ราคา :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel8.setText("จำนวน :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 490, -1, -1));

        gobbet.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jPanel2.add(gobbet, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 490, 150, 30));

        txt_name.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jPanel2.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 410, 150, 30));

        txt_price.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jPanel2.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 450, 150, 30));

        put.setBackground(new java.awt.Color(255, 255, 153));
        put.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        put.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "กล่อง", "แพ็ต", "ชิ้น", "แก้ว", "ขวด", "กระป๋อง", "ถุง", " " }));
        put.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel2.add(put, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 90, 30));

        jLabel16.setBackground(new java.awt.Color(204, 255, 204));
        jLabel16.setFont(new java.awt.Font("TH SarabunPSK", 1, 26)); // NOI18N
        jLabel16.setText(" รายการสินค้า");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        txt_cate.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jPanel2.add(txt_cate, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 530, 150, 30));

        jLabel20.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel20.setText("เพิ่มเติม :");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 530, -1, -1));

        jLabel33.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel33.setText("ค้นหา :");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 55, -1, -1));

        jLabel35.setBackground(new java.awt.Color(255, 0, 0));
        jLabel35.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 0, 0));
        jLabel35.setText("* สามารถค้นหาได้จากชื่อเมนู,ราคา *");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 85, 250, -1));

        jButton9.setBackground(new java.awt.Color(255, 204, 102));
        jButton9.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jButton9.setText("ทำรายการ");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 575, 140, 40));

        jLabel30.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "รายละเอียดสินค้า", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("TH SarabunPSK", 1, 26))); // NOI18N
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 365, 360, 270));
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 670));

        jLabel48.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\menubar java\\พื้นหลัง\\bg1.png")); // NOI18N
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 670));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 620, 670));

        bodypanel.setBackground(new java.awt.Color(204, 255, 204));
        bodypanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        bodypanel.setLayout(new java.awt.CardLayout());

        panelsystem.setBackground(new java.awt.Color(255, 255, 204));
        panelsystem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbproductlist.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        tbproductlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbproductlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbproductlistMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbproductlist);

        panelsystem.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 530, 190));

        put1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        panelsystem.add(put1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 50, 20));

        txt_name1.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        panelsystem.add(txt_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 100, 30));

        jLabel40.setBackground(new java.awt.Color(255, 255, 204));
        jLabel40.setFont(new java.awt.Font("TH SarabunPSK", 1, 26)); // NOI18N
        jLabel40.setText(" ข้อมูลรายการสินค้า");
        jLabel40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panelsystem.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 40));

        jLabel17.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel17.setText("ชื่อสินค้า :");
        panelsystem.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel18.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel18.setText("ราคา :");
        panelsystem.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        txt_price1.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        panelsystem.add(txt_price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 100, 30));

        gobbet1.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        panelsystem.add(gobbet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 100, 30));

        jLabel19.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel19.setText("จำนวน :");
        panelsystem.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLabel21.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel21.setText("เพิ่มเติม :");
        panelsystem.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        txt_cate1.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        panelsystem.add(txt_cate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 100, 30));

        txt_sum.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        panelsystem.add(txt_sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 100, 30));

        ton1.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        panelsystem.add(ton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 100, 30));

        ton2.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        panelsystem.add(ton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 100, 30));

        jLabel23.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel23.setText("เงินทอน :");
        panelsystem.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 515, -1, -1));

        jLabel24.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel24.setText("ราคา :");
        panelsystem.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 435, -1, -1));

        jLabel25.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel25.setText("ได้รับ :");
        panelsystem.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 475, -1, -1));

        jLabel26.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel26.setText("บาท");
        panelsystem.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, -1, -1));

        jLabel27.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel27.setText("บาท");
        panelsystem.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        jLabel28.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel28.setText("บาท");
        panelsystem.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 204, 102));
        jButton4.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jButton4.setText("คิดเงิน");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelsystem.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 80, 40));

        jButton5.setBackground(new java.awt.Color(255, 204, 102));
        jButton5.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jButton5.setText("ราคารวม");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panelsystem.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 80, 40));

        jButton6.setBackground(new java.awt.Color(255, 204, 102));
        jButton6.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jButton6.setText("แก้ไข");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panelsystem.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 555, 80, 40));

        jButton7.setBackground(new java.awt.Color(255, 204, 102));
        jButton7.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jButton7.setText("ลบ");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panelsystem.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 555, 80, 40));

        jButton8.setBackground(new java.awt.Color(255, 204, 102));
        jButton8.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jButton8.setText("บันทึกรายการ");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panelsystem.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 605, 130, 40));

        jLabel29.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "รายละเอียดสินค้า", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("TH SarabunPSK", 1, 26))); // NOI18N
        panelsystem.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 280, 310));

        jLabel31.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel31.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "คำนวณราคา", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("TH SarabunPSK", 1, 26))); // NOI18N
        panelsystem.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 250, 250));

        txt_search1.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        txt_search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search1KeyReleased(evt);
            }
        });
        panelsystem.add(txt_search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 420, 30));

        jLabel32.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel32.setText("ค้นหา :");
        panelsystem.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel34.setBackground(new java.awt.Color(255, 0, 0));
        jLabel34.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 0));
        jLabel34.setText("* สามารถค้นหาได้จากชื่อเมนู,ราคา,ภาชนะ *");
        panelsystem.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 300, -1));

        jButton10.setBackground(new java.awt.Color(255, 204, 102));
        jButton10.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jButton10.setText("เคลียตาราง");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        panelsystem.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 120, 40));

        jLabel22.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("* เคลียตารางทุกครั้งเมื่อทำการบันทึกรายการเสร็จสิ้น *");
        panelsystem.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 325, 360, -1));
        panelsystem.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 670));

        jLabel50.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\menubar java\\พื้นหลัง\\bg1.png")); // NOI18N
        panelsystem.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 670));

        bodypanel.add(panelsystem, "card2");

        panelinsert.setBackground(new java.awt.Color(255, 255, 204));
        panelinsert.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbproductinsert.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        tbproductinsert.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbproductinsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbproductinsertMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbproductinsert);

        panelinsert.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 500, 230));

        jLabel9.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel9.setText("ลำดับ :");
        panelinsert.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel10.setText("ชื่อสินค้า :");
        panelinsert.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel11.setText("ค้นหา :");
        panelinsert.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        txt_price2.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        panelinsert.add(txt_price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 140, 30));

        txt_search2.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        txt_search2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search2KeyReleased(evt);
            }
        });
        panelinsert.add(txt_search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 390, 30));

        txt_name2.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        panelinsert.add(txt_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 140, 30));

        lbl_image1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelinsert.add(lbl_image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 190, 140));

        btn_image.setBackground(new java.awt.Color(255, 204, 102));
        btn_image.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        btn_image.setText("เลือกรูปภาพ");
        btn_image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btn_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imageActionPerformed(evt);
            }
        });
        panelinsert.add(btn_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 150, 40));

        btn_insert2.setBackground(new java.awt.Color(255, 204, 102));
        btn_insert2.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        btn_insert2.setText("เพิ่ม");
        btn_insert2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btn_insert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insert2ActionPerformed(evt);
            }
        });
        panelinsert.add(btn_insert2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 80, 40));

        btn_delete2.setBackground(new java.awt.Color(255, 204, 102));
        btn_delete2.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        btn_delete2.setText("ลบ");
        btn_delete2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btn_delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete2ActionPerformed(evt);
            }
        });
        panelinsert.add(btn_delete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 80, 40));

        btn_edit2.setBackground(new java.awt.Color(255, 204, 102));
        btn_edit2.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        btn_edit2.setText("แก้ไข");
        btn_edit2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btn_edit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit2ActionPerformed(evt);
            }
        });
        panelinsert.add(btn_edit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 80, 40));

        txt_id2.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        panelinsert.add(txt_id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 140, 30));

        jLabel13.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel13.setText("ราคา :");
        panelinsert.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "รายละเอียด", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("TH SarabunPSK", 1, 26))); // NOI18N
        panelinsert.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 520, 270));

        jLabel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ตารางข้อมูล", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("TH SarabunPSK", 0, 18))); // NOI18N
        panelinsert.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 520, 330));

        jLabel43.setBackground(new java.awt.Color(255, 255, 204));
        jLabel43.setFont(new java.awt.Font("TH SarabunPSK", 1, 26)); // NOI18N
        jLabel43.setText("การเพิ่มรายการสินค้า");
        jLabel43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panelinsert.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, 180, 40));
        panelinsert.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 670));

        jLabel47.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\menubar java\\พื้นหลัง\\bg1.png")); // NOI18N
        panelinsert.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 670));

        bodypanel.add(panelinsert, "card4");

        panellist.setBackground(new java.awt.Color(255, 255, 204));
        panellist.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_list.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        tb_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tb_list);

        panellist.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 520, 240));

        txt_search3.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        txt_search3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search3KeyReleased(evt);
            }
        });
        panellist.add(txt_search3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 450, 30));

        jLabel38.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel38.setText("ค้นหา :");
        panellist.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel39.setBackground(new java.awt.Color(255, 0, 0));
        jLabel39.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 0, 0));
        jLabel39.setText("* สามารถค้นหาได้จากชื่อเมนู,ราคา *");
        panellist.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 84, -1, -1));

        jLabel41.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel41.setText("บาท");
        panellist.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 395, -1, -1));

        txt_sum1.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        panellist.add(txt_sum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 130, 30));

        jButton11.setBackground(new java.awt.Color(255, 204, 102));
        jButton11.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jButton11.setText("รวม");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        panellist.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 120, 40));

        jLabel44.setBackground(new java.awt.Color(255, 255, 204));
        jLabel44.setFont(new java.awt.Font("TH SarabunPSK", 1, 26)); // NOI18N
        jLabel44.setText(" สรุปการขายสินค้า");
        jLabel44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panellist.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 7, 150, -1));

        jLabel42.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel42.setText("ยอดรวม :");
        panellist.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 395, -1, -1));

        jButton12.setBackground(new java.awt.Color(255, 204, 102));
        jButton12.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jButton12.setText("ปริ้น");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        panellist.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 110, 40));
        panellist.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 670));

        jLabel49.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\menubar java\\พื้นหลัง\\bg1.png")); // NOI18N
        panellist.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 670));

        bodypanel.add(panellist, "card3");

        promotion.setBackground(new java.awt.Color(255, 255, 204));
        promotion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\NetBeansProjects\\IT_banana\\src\\img\\menubar java\\พื้นหลัง\\bg1.png")); // NOI18N
        promotion.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 670));

        bodypanel.add(promotion, "card5");

        message.setBackground(new java.awt.Color(255, 255, 204));
        message.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\menubar java\\message2.png")); // NOI18N
        message.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        bodypanel.add(message, "card6");

        jPanel1.add(bodypanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 560, 670));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\menubar java\\icon\\checklist3.png")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 130, 90));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\menubar java\\icon\\car1.png")); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 130, 90));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\menubar java\\icon\\add3.png")); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 90));

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\menubar java\\icon\\exit4.png")); // NOI18N
        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 130, 90));

        jButton15.setBackground(new java.awt.Color(204, 204, 204));
        jButton15.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\menubar java\\icon\\promption.png")); // NOI18N
        jButton15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 130, 90));

        jButton16.setBackground(new java.awt.Color(204, 204, 204));
        jButton16.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\menubar java\\icon\\message.png")); // NOI18N
        jButton16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 130, 90));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 130, 670));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1340, 710));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        Point P = evt.getLocationOnScreen();
        this.setLocation(P);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        bodypanel.removeAll();
        bodypanel.repaint();
        bodypanel.revalidate();
        
        bodypanel.add(panelsystem);
        bodypanel.repaint();
        bodypanel.revalidate();  

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        bodypanel.removeAll();
        bodypanel.repaint();
        bodypanel.revalidate();
        
        bodypanel.add(panelinsert);
        bodypanel.repaint();
        bodypanel.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bodypanel.removeAll();
        bodypanel.repaint();
        bodypanel.revalidate();
        
        bodypanel.add(panellist);
        bodypanel.repaint();
        bodypanel.revalidate(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_insert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insert2ActionPerformed
        try{
            String sql="insert into warehouse (ProductName,Price,image)values(?,?,?)";
            pst=con.prepareStatement(sql);
            pst.setString(1, txt_name2.getText());
            pst.setString(2, txt_price2.getText());
            pst.setBytes(3, person_image);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "บันทึก","บันทึกเรียบร้อย",JOptionPane.INFORMATION_MESSAGE);
            ShowDataToForm1();
            ShowDataToForm();
            clearData();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_insert2ActionPerformed

    private void btn_delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete2ActionPerformed
        deleteRecord();
    }//GEN-LAST:event_btn_delete2ActionPerformed

    public void deleteRecord() {
        String id = txt_id2.getText();
        String sql ="delete from warehouse WHERE ProductID='" + id + "'";
        try {
            Connection c = Connect.ConnectDB();
            if (pst.executeUpdate(sql) != -1) {
                JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
                ShowDataToForm1();
                ShowDataToForm();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void btn_edit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit2ActionPerformed
            String value1= txt_id2.getText();
        try{
            
            String value2= txt_name2.getText();
            String value3= txt_price2.getText();
            String sql="UPDATE warehouse SET ProductID='"+value1+"',ProductName ='"+value2+"',Price ='"+value3+"' WHERE ProductID='"+value1+"'";
            pst=con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "แก้ไขข้อมูลเรียบร้อย");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        ShowDataToForm1();
        ShowDataToForm();
        try{
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);
            byte [] image = new byte[(int)file.length()];
            fis.read(image);
            
            String sql = "UPDATE warehouse SET image = ? WHERE Productid ='"+value1+"' ";
            
            pst = con.prepareStatement(sql);
            pst.setBytes(1, image);
            pst.executeUpdate();
            pst.close();
            ShowDataToForm1();
            ShowDataToForm();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_edit2ActionPerformed

    private void btn_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_image1.getWidth(),lbl_image1.getHeight(),Image.SCALE_SMOOTH));
        lbl_image1.setIcon(imageIcon);
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_imageActionPerformed

    private void txt_search2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search2KeyReleased
        DefaultTableModel table = (DefaultTableModel) tbproductinsert.getModel();
        String search = txt_search2.getText();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(table);
        tbproductinsert.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txt_search2KeyReleased

    private void tbproductinsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbproductinsertMouseClicked
        try {
            int row=tbproductinsert.getSelectedRow();
            String selectId=tbproductinsert.getValueAt(row,0).toString();
            String sql="select * from warehouse where ProductID='"+selectId+"'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("ProductID");
                txt_id2.setText(add1);
                String add2=rs.getString("ProductName");
                txt_name2.setText(add2);
                int add3=rs.getInt("Price");
                txt_price2.setText(add3+"");
                byte[] add4=rs.getBytes("image");

                ImageIcon imageIcon = new ImageIcon(new ImageIcon(add4).getImage().getScaledInstance(lbl_image1.getWidth(),lbl_image1.getHeight(),Image.SCALE_SMOOTH));
                lbl_image1.setIcon(imageIcon);
                pst.execute();
            }
        } catch (SQLException ex) {
            Logger.getLogger(banana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbproductinsertMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            String sql="Select sum(Price*gobbet) from list_menu";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
               String sum = rs.getString("sum(Price*gobbet)");
               txt_sum.setText(sum); 
            }
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e); 
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       deleteRecord1();
    }//GEN-LAST:event_jButton7ActionPerformed

    public void deleteRecord1() {
        String id = txt_name1.getText();
        String sql ="delete from list_menu WHERE ProductName='" + id + "'";
        try {
            Connection c = Connect.ConnectDB();
            if (pst.executeUpdate(sql) != -1) {
                JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
                ShowDataToForm2();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void tbproduct_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbproduct_listMouseClicked
        try {
            int row=tbproduct_list.getSelectedRow();
            String selectId=tbproduct_list.getValueAt(row,0).toString();
            String sql="select * from warehouse where ProductID='"+selectId+"'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){

                String add1=rs.getString("ProductName");
                txt_name.setText(add1);
                int add2=rs.getInt("Price");
                txt_price.setText(add2+"");

                byte[] add3=rs.getBytes("image");

                ImageIcon imageIcon = new ImageIcon(new ImageIcon(add3).getImage().getScaledInstance(lbl_image.getWidth(),lbl_image.getHeight(),Image.SCALE_SMOOTH));
                lbl_image.setIcon(imageIcon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(banana.class.getName()).log(Level.SEVERE, null, ex);
        }
        ShowDataToForm();
    }//GEN-LAST:event_tbproduct_listMouseClicked

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
       DefaultTableModel table = (DefaultTableModel) tbproduct_list.getModel();
        String search = txt_search.getText();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(table);
        tbproduct_list.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       try{
            String sql="insert into list_menu (ProductName,Price,gobbet,put,Category)values(?,?,?,?,?)";
            pst=con.prepareStatement(sql);
            pst.setString(1, txt_name.getText());
            pst.setString(2, txt_price.getText());
            pst.setString(3, gobbet.getText());
            pst.setString(4, put.getSelectedItem().toString());
            pst.setString(5, txt_cate.getText());
            pst.execute();
            JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อย");
            ShowDataToForm2();
            clearData();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void txt_search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search1KeyReleased
        DefaultTableModel table = (DefaultTableModel) tbproductlist.getModel();
        String search = txt_search1.getText();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(table);
        tbproductlist.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txt_search1KeyReleased

    private void tbproductlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbproductlistMouseClicked
        try {
            int row=tbproductlist.getSelectedRow();
            String selectId=tbproductlist.getValueAt(row,0).toString();
            String sql="select * from list_menu where ProductName='"+selectId+"'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                String add2=rs.getString("ProductName");
                txt_name1.setText(add2);
                int add3=rs.getInt("Price");
                txt_price1.setText(add3+"");
                String add4=rs.getString("gobbet");
                gobbet1.setText(add4);
                String add5=rs.getString("put");
                put1.setText(add5);
                String add6=rs.getString("Category");
                txt_cate1.setText(add6);
            }
        } catch (SQLException ex) {
            Logger.getLogger(banana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbproductlistMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         try{
            String value2= txt_name1.getText();
            String value3= txt_price1.getText();
            String value4= gobbet1.getText();
            String value5= txt_cate1.getText();
            String sql="UPDATE list_menu SET ProductName ='"+value2+"',Price ='"+value3+"',gobbet ='"+value4+"',Category ='"+value5+"'";
            pst=con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "แก้ไขเรียบร้อย", "แก้ไข", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        ShowDataToForm2();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            String query = "insert into list_bay (ProductName,Price,gobbet,put)values(?,?,?,?)";
            pst = con.prepareStatement(query);
            pst.setString(1, txt_name1.getText());
            pst.setString(2, txt_price1.getText());
            pst.setString(3, gobbet1.getText());
            pst.setString(4, put1.getText());
            pst.execute();
            JOptionPane.showMessageDialog(this, "บันทึกเรียบร้อย", "บันทึก", JOptionPane.INFORMATION_MESSAGE);
            clearData1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ShowDataToForm3();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int T01 = Integer.parseInt(txt_sum.getText());
         int T02 = Integer.parseInt(ton1.getText());
         int N1 = T01;
         int N2 = T02;
         int TATOL = N2-N1;
         int B1 = TATOL ;
         ton2.setText (String.valueOf(B1));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt_search3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search3KeyReleased
        DefaultTableModel table = (DefaultTableModel) tb_list.getModel();
        String search = txt_search3.getText();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(table);
        tb_list.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txt_search3KeyReleased

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       try{
            String sql="Select sum(Price*gobbet) from list_bay";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
               String sum = rs.getString("sum(Price*gobbet)");
               txt_sum1.setText(sum);
            }
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e); 
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        ClearRecord();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       MessageFormat header = new MessageFormat("Report Print");
        MessageFormat footer = new MessageFormat("page{0,number,integer}");

        try{
            tb_list.print(JTable.PrintMode.NORMAL, header,footer);
        }catch(java.awt.print.PrinterException e){
            System.err.format("Can not print %s %n", e.getMessage());
        }
       
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
           menu1 field= new menu1();
                field.setVisible(true);
               JOptionPane.showMessageDialog(this, "คุณต้องกลับสู่หน้าระบบงาน", "คำเตือน",
                       JOptionPane.ERROR_MESSAGE);
              setVisible(false);
              

              //code การไปยังหน้า ฟอร์ม login
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
         bodypanel.removeAll();
        bodypanel.repaint();
        bodypanel.revalidate();
        
        bodypanel.add(promotion);
        bodypanel.repaint();
        bodypanel.revalidate(); 
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       bodypanel.removeAll();
        bodypanel.repaint();
        bodypanel.revalidate();
        
        bodypanel.add(message);
        bodypanel.repaint();
        bodypanel.revalidate(); 
    }//GEN-LAST:event_jButton16ActionPerformed

    public void ClearRecord() {
        String sql ="delete from list_menu ";
        try {
            Connection c = Connect.ConnectDB();
            if (pst.executeUpdate(sql) != -1) {
                JOptionPane.showMessageDialog(this, "เคลียข้อมูลเรียบร้อย");
                ShowDataToForm2();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(banana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(banana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(banana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(banana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new banana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodypanel;
    private javax.swing.JButton btn_delete2;
    private javax.swing.JButton btn_edit2;
    private javax.swing.JButton btn_image;
    private javax.swing.JButton btn_insert2;
    private javax.swing.JTextField gobbet;
    private javax.swing.JTextField gobbet1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lbl_image1;
    private javax.swing.JPanel message;
    private javax.swing.JPanel panelinsert;
    private javax.swing.JPanel panellist;
    private javax.swing.JPanel panelsystem;
    private javax.swing.JPanel promotion;
    private javax.swing.JComboBox put;
    private javax.swing.JLabel put1;
    private javax.swing.JTable tb_list;
    private javax.swing.JTable tbproduct_list;
    private javax.swing.JTable tbproductinsert;
    private javax.swing.JTable tbproductlist;
    private javax.swing.JTextField ton1;
    private javax.swing.JTextField ton2;
    private javax.swing.JTextField txt_cate;
    private javax.swing.JTextField txt_cate1;
    private javax.swing.JTextField txt_id2;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_name1;
    private javax.swing.JTextField txt_name2;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_price1;
    private javax.swing.JTextField txt_price2;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_search1;
    private javax.swing.JTextField txt_search2;
    private javax.swing.JTextField txt_search3;
    private javax.swing.JTextField txt_sum;
    private javax.swing.JTextField txt_sum1;
    // End of variables declaration//GEN-END:variables

private void clearData() {
        txt_name.setText("");
        txt_price.setText("");
        gobbet.setText("");
        txt_cate.setText("");
    }
private void clearData1() {
        txt_name1.setText("");
        txt_price1.setText("");
        gobbet1.setText("");
        txt_cate1.setText("");
        put1.setText("");
    }


}
