package numericalmethods;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
public class homeOM extends javax.swing.JFrame {
    public homeOM() {
        initComponents();
    }
   private double valL = Double.NEGATIVE_INFINITY; // Initialize xL and xU as global variables
   private double valU = Double.POSITIVE_INFINITY;
   private int totalIterCount = 1; // Initialize total iteration count as global variable
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Secant = new javax.swing.JRadioButton();
        SimpleFixedPoint = new javax.swing.JRadioButton();
        BACK = new javax.swing.JButton();
        NewtonRaphson = new javax.swing.JRadioButton();
        CLOSE = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        eq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numA = new javax.swing.JTextField();
        numB = new javax.swing.JTextField();
        editedLabel = new javax.swing.JLabel();
        Calculate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        appRoot = new javax.swing.JTextField();
        graph = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1044, 824));
        jPanel1.setMinimumSize(new java.awt.Dimension(1044, 824));
        jPanel1.setPreferredSize(new java.awt.Dimension(1044, 857));
        jPanel1.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel5.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Txt_IV50", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Select Method:");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(20, 10, 180, 30);

        Secant.setBackground(new java.awt.Color(255, 153, 153));
        Secant.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Secant.setText("Secant");
        Secant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecantActionPerformed(evt);
            }
        });
        jPanel5.add(Secant);
        Secant.setBounds(400, 40, 70, 24);

        SimpleFixedPoint.setBackground(new java.awt.Color(255, 153, 153));
        SimpleFixedPoint.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        SimpleFixedPoint.setText("Simple Fixed Point");
        SimpleFixedPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpleFixedPointActionPerformed(evt);
            }
        });
        jPanel5.add(SimpleFixedPoint);
        SimpleFixedPoint.setBounds(30, 40, 140, 24);

        BACK.setBackground(new java.awt.Color(0, 0, 0));
        BACK.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        BACK.setForeground(new java.awt.Color(255, 255, 255));
        BACK.setText("BACK");
        BACK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        jPanel5.add(BACK);
        BACK.setBounds(320, 80, 70, 23);

        NewtonRaphson.setBackground(new java.awt.Color(255, 153, 153));
        NewtonRaphson.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        NewtonRaphson.setText("Newton Raphson");
        NewtonRaphson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewtonRaphsonActionPerformed(evt);
            }
        });
        jPanel5.add(NewtonRaphson);
        NewtonRaphson.setBounds(220, 40, 130, 24);

        CLOSE.setBackground(new java.awt.Color(0, 0, 0));
        CLOSE.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        CLOSE.setForeground(new java.awt.Color(255, 255, 255));
        CLOSE.setText("CLOSE");
        CLOSE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });
        jPanel5.add(CLOSE);
        CLOSE.setBounds(420, 80, 70, 23);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(510, 10, 500, 110);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel2.setLayout(null);

        eq.setBackground(new java.awt.Color(0, 0, 0));
        eq.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        eq.setForeground(new java.awt.Color(255, 255, 255));
        eq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(eq);
        eq.setBounds(100, 20, 200, 40);

        jLabel2.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EQUATION:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 20, 120, 40);

        jLabel3.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("xL:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 70, 60, 40);

        numA.setBackground(new java.awt.Color(0, 0, 0));
        numA.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        numA.setForeground(new java.awt.Color(255, 255, 255));
        numA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(numA);
        numA.setBounds(100, 70, 70, 40);

        numB.setBackground(new java.awt.Color(0, 0, 0));
        numB.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        numB.setForeground(new java.awt.Color(255, 255, 255));
        numB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(numB);
        numB.setBounds(230, 70, 70, 40);

        editedLabel.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        editedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editedLabel.setText("xU:");
        jPanel2.add(editedLabel);
        editedLabel.setBounds(170, 70, 60, 40);

        Calculate.setBackground(new java.awt.Color(177, 185, 102));
        Calculate.setFont(new java.awt.Font("Txt_IV50", 1, 14)); // NOI18N
        Calculate.setForeground(new java.awt.Color(255, 255, 255));
        Calculate.setText("CALCULATE");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });
        jPanel2.add(Calculate);
        Calculate.setBounds(320, 70, 140, 40);

        jLabel1.setFont(new java.awt.Font("Txt_IV50", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ROOT:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 120, 140, 40);

        appRoot.setBackground(new java.awt.Color(0, 0, 0));
        appRoot.setFont(new java.awt.Font("Txt_IV50", 1, 14)); // NOI18N
        appRoot.setForeground(new java.awt.Color(255, 255, 255));
        appRoot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(appRoot);
        appRoot.setBounds(170, 120, 130, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 300, 470, 180);

        graph.setBackground(new java.awt.Color(255, 255, 255));
        graph.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout graphLayout = new javax.swing.GroupLayout(graph);
        graph.setLayout(graphLayout);
        graphLayout.setHorizontalGroup(
            graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        graphLayout.setVerticalGroup(
            graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        jPanel1.add(graph);
        graph.setBounds(520, 140, 480, 330);

        tbl.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "xL", "xR", "xU", "f(xL)", "f(xR)", "f(xU)", "Error"
            }
        ));
        tbl.setEnabled(false);
        tbl.setFocusable(false);
        tbl.getTableHeader().setResizingAllowed(false);
        tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 500, 990, 300);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);
        jPanel1.add(jPanel3);
        jPanel3.setBounds(510, 130, 500, 350);

        jLabel5.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numericalmethods/1.11l.gif"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 10, 470, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
//CALCULATION
        
        
            
            //SimpleFixedPiont
            if (SimpleFixedPoint.isSelected()){
     
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#.#########");
                if (eq.getText().isEmpty() || numA.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Enter the data needed");
                } else {
                    ArrayList<Object[]> data = new ArrayList<>();
                    double MarginE = 0.001;
                    double x0 = Double.parseDouble(numA.getText()); // Initial guess
                    double x1;
                    int iterations = 0;
                    double error = Double.MAX_VALUE;

                    while (error > MarginE) {
                        iterations++;
                        x1 = g(x0); // Fixed-point iteration: x1 = g(x0)

                        String decimalnumX0 = decimalFormat.format(x0);
                        String decimalnumX1 = decimalFormat.format(x1);
                        String decimalnumError;

                        if (iterations == 1) {
                            decimalnumError = " ";
                        } else {
                            double prevX0 = Double.parseDouble(data.get(iterations - 2)[1].toString());
                            error = Math.abs(x1 - prevX0) / Math.abs(x1) * 100;
                            decimalnumError = decimalFormat.format(error);
                        }

                        Object[] rowData = {iterations, decimalnumX0, decimalnumX1, decimalnumError};
                        data.add(rowData);

                        x0 = x1;
                    }

                    DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                    model.setRowCount(0);

                    for (Object[] row : data) {
                        model.addRow(row);
                    }

                    int lastRowIndex = model.getRowCount() - 1;
                    if (lastRowIndex >= 0) {
                        tbl.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                        //Root highlight
                       // tabl.setSelectionBackground(Color.YELLOW);
                    }

                    // Displaying the root, assuming it's the last computed x1
                    String decimalRoot = decimalFormat.format(x0);
                    appRoot.setText(decimalRoot);
                    graph(eq.getText(), x0);
                }
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "PLEASE ENTER A VALID NUMBERS FOR BOTH LOWER AND UPPER BOUND LIMITS");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }       else if (NewtonRaphson.isSelected()){
     
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#.#########");
                if (eq.getText().isEmpty() || numA.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Enter the data needed");
                } else {
                    ArrayList<Object[]> data = new ArrayList<>();
                    double MarginE = 0.001;
                    double x0 = Double.parseDouble(numA.getText()); // Initial guess
                    double fx0, fDashX0, x1, fx1;
                    int iterations = 0;
                    double error = Double.MAX_VALUE;

                    while (error > MarginE) {
                        iterations++;
                        fx0 = evaluate(eq.getText(), x0);
                        fDashX0 = differentiateFunction(eq.getText(), x0);

                        // Newton-Raphson formula for finding next approximation
                        x1 = x0 - (fx0 / fDashX0);
                        fx1 = evaluate(eq.getText(), x1);

                        String decimalnumX0 = decimalFormat.format(x0);
                        String decimalnumX1 = decimalFormat.format(x1);
                        String decimalnumFX0 = decimalFormat.format(fx0);
                        String decimalnumFX1 = decimalFormat.format(fx1);
                        String decimalnumError;

                        if (iterations == 1) {
                            decimalnumError = " ";
                        } else {
                            double prevX0 = Double.parseDouble(data.get(iterations - 2)[1].toString());
                            error = Math.abs(x1 - prevX0) / Math.abs(x1) * 100;
                            decimalnumError = decimalFormat.format(error);
                        }

                        Object[] rowData = {iterations, decimalnumX0, decimalnumFX0, decimalnumX1, decimalnumFX1, decimalnumError};
                        data.add(rowData);

                        x0 = x1;
                    }

                    DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                    model.setRowCount(0);

                    for (Object[] row : data) {
                        model.addRow(row);
                    }

                    int lastRowIndex = model.getRowCount() - 1;
                    if (lastRowIndex >= 0) {
                        tbl.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                        //tabl.setSelectionBackground(Color.YELLOW);
                    }

                    // Displaying the root, assuming it's the last computed x1
                    String decimalRoot = decimalFormat.format(x0);
                    appRoot.setText(decimalRoot);
                    graph(eq.getText(), x0);
                }
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "PLEASE ENTER A VALID NUMBERS FOR BOTH LOWER AND UPPER BOUND LIMITS");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
       
}       else if (Secant.isSelected()){
     
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#.#####");
        if (eq.getText().isEmpty() || numA.getText().isEmpty() || numB.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the data needed");
        } else {
            ArrayList<Object[]> data = new ArrayList<>();
            double MarginE = 0.001;
            double x0 = Double.parseDouble(numA.getText());
            double x1 = Double.parseDouble(numB.getText());
            int iterations = 0;
             double roott =  0;
             double error = Math.abs(x1 - x0);

        
         while (error > MarginE) {
                iterations++;   
                double fx0 = evaluate(eq.getText(), x0);
                double fx1 = evaluate(eq.getText(), x1);
                double numerator = fx1 * (x0 - x1);
                double denominator = fx0 - fx1;
                double x2 = x1 - numerator / denominator;
                double fx2 = evaluate(eq.getText(), x2);
 
                //DECIMAL PLACE//
                String decimalnumXO = decimalFormat.format(x0);
                String decimalnumXL = decimalFormat.format(x1);
                String decimalnumX2 = decimalFormat.format(x2);
                String decimalnumFx0 = decimalFormat.format(fx0);
                String decimalnumFx1 = decimalFormat.format(fx1);
                String decimalnumFx2 = decimalFormat.format(fx2);
                String decimalnumE = decimalFormat.format(error);         
                
                
                Object[] rowData = {iterations, decimalnumXO, decimalnumXL, decimalnumX2, decimalnumFx0, decimalnumFx1, decimalnumFx2, decimalnumE};
                data.add(rowData);
               
               error = Math.abs(x1 - x0);
               x0=x1;
               x1=x2;
               roott = x2;      
              }

           DefaultTableModel model = (DefaultTableModel) tbl.getModel();
           model.setRowCount(0);
            
            for (Object[] row : data) {
                model.addRow(row);
            }
             String decimalRoot = decimalFormat.format(roott);
             appRoot.setText(decimalRoot);
             graph(eq.getText(), roott);
           }
        } catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "CHECK YOUR DATA INPUT!");
}
     }       
    }//GEN-LAST:event_CalculateActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        mainpanel m = new mainpanel();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BACKActionPerformed

    private void NewtonRaphsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewtonRaphsonActionPerformed
        if (NewtonRaphson.isSelected()){
            SimpleFixedPoint.setSelected(false);
            Secant.setSelected(false);
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            appRoot.setText("");
            graph.removeAll();
            graph.revalidate();
            graph.repaint();
            model.setColumnIdentifiers(new String[]{"Iteration", "xL", "f(xL)", "x1", "f(x1)", "Error"});
            editedLabel.setText("-----");
            numB.setEnabled(false);
            numB.setText("");

        }

    }//GEN-LAST:event_NewtonRaphsonActionPerformed

    private void SimpleFixedPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpleFixedPointActionPerformed
        if (SimpleFixedPoint.isSelected()){
            Secant.setSelected(false);
            NewtonRaphson.setSelected(false);
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            appRoot.setText("");
            graph.removeAll();
            graph.revalidate();
            graph.repaint();
            model.setColumnIdentifiers(new String[]{"Iteration", "xl", "fxl", "Erorr"});
            editedLabel.setText("-----");
            numB.setEnabled(false);
            numB.setText("");

        }
    }//GEN-LAST:event_SimpleFixedPointActionPerformed

    private void SecantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecantActionPerformed
        if (Secant.isSelected()){
            SimpleFixedPoint.setSelected(false);
            NewtonRaphson.setSelected(false);
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            appRoot.setText("");
            graph.removeAll();
            graph.revalidate();
            graph.repaint();
            model.setColumnIdentifiers(new String[]{"Iteration", "xl", "fxl", "Error",});
            editedLabel.setText("xU");
            numB.setEnabled(true);
            numB.setText("");

        }

    }//GEN-LAST:event_SecantActionPerformed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
    dispose(); 
    System.exit(0);
    }//GEN-LAST:event_CLOSEActionPerformed

    private double g(double x) {
    // Example: Let's choose g(x) = x - f(x) / f'(x), similar to the Newton-Raphson method
    double fx = evaluate(eq.getText(), x);
    double fDashX = differentiateFunction(eq.getText(), x);

    // Avoid division by zero
    if (fDashX == 0) {
        throw new ArithmeticException("Derivative is zero. Division by zero error.");
    }

    return x - (fx / fDashX);
}
    private double differentiateFunction(String equationStr, double xValue) {
    double h = 0.000001; // a small value
    return (evaluate(equationStr, xValue + h) - evaluate(equationStr, xValue)) / h;
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
            java.util.logging.Logger.getLogger(homeOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeOM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton CLOSE;
    private javax.swing.JButton Calculate;
    private javax.swing.JRadioButton NewtonRaphson;
    private javax.swing.JRadioButton Secant;
    private javax.swing.JRadioButton SimpleFixedPoint;
    private javax.swing.JTextField appRoot;
    private javax.swing.JLabel editedLabel;
    private javax.swing.JTextField eq;
    private javax.swing.JPanel graph;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numA;
    private javax.swing.JTextField numB;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
  
    /*private static double evaluate(String equationStr, double xValue) {
        double result = 0.0;
        double x = xValue;
       
        try {
            if (equationStr.equals("e^-x")) {
                result = Math.exp(-x);
            } else if (equationStr.equals("e^x")) {
                result = Math.exp(x);   
            } else if (equationStr.equals("e^-x-x")) {
                result = Math.exp(-x) - x;
            } else {
                equationStr = equationStr.replaceAll("\\s", "");
                equationStr = equationStr.replaceAll("e", Double.toString(Math.E));
                String[] terms = equationStr.split("(?=[+-])");

                  for (String term : terms) {
                    if (term.contains("x") || term.contains("X")) {
                        double coefficient = 1.0;
                        String[] parts = term.split("x");

                        try {
                            if (parts[0].equals("-")) {
                                coefficient = -1.0;
                            } else if (!parts[0].equals("+") && !parts[0].equals("")) {
                                coefficient = Double.parseDouble(parts[0]);
                            }
                            double power = 1.0;
                            if (parts.length > 1 && !parts[1].equals("")) {
                                power = Double.parseDouble(parts[1].substring(1));
                            }
                            result += coefficient * Math.pow(x, power);
                        } catch (Exception e) {
                        }
                    } else {
                        try {
                            result += Double.parseDouble(term);
                        } catch (NumberFormatException e) {
                         break;
                        }
                    }
                  }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }*/
    private double evaluate(String equation, double x) {
    try {
        Expression expression = new ExpressionBuilder(equation)
                .variable("x")
                .build()
                .setVariable("x", x);
        return expression.evaluate();
    } catch (Exception e) {
        e.printStackTrace();
        return Double.NaN;
    }
}
    private double evaluateFunction(String equation, double x) {
    try {
        Expression expression = new ExpressionBuilder(equation)
                .variable("x")
                .build()
                .setVariable("x", x);
        return expression.evaluate();
    } catch (Exception e) {
        e.printStackTrace();
        return Double.NaN;
    }
}
    
    private void graph(String equationStr, double roots) {
    XYSeries series = new XYSeries("Function");

    for ( double x = -10.0; x <= 10.0; x += 0.01) {
        series.add(x, evaluateFunction(equationStr, x));
    }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "GRAPH",
                "X",
                "f(X)",
                dataset
        );
            chart.setBackgroundPaint(Color.WHITE);

        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.LIGHT_GRAY);
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.LIGHT_GRAY);

        plot.getRenderer().setSeriesPaint(0, Color.BLUE);

        XYSeries rootSeries = new XYSeries("Root");
        rootSeries.add(roots, evaluate(eq.getText(), roots));
        XYSeriesCollection rootDataset = new XYSeriesCollection();
        rootDataset.addSeries(rootSeries);
        plot.setDataset(1, rootDataset);
        plot.mapDatasetToDomainAxis(1, 0);
        plot.mapDatasetToRangeAxis(1, 0);
        XYItemRenderer renderer = new XYLineAndShapeRenderer(false, true);
        renderer.setSeriesPaint(0, Color.RED); 
        plot.setRenderer(1, renderer);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(580, 350));
        
        graph.setLayout(new BorderLayout());
        graph.removeAll();
        graph.add(chartPanel, BorderLayout.CENTER);
        graph.revalidate();
        graph.repaint();
    }
}
    
