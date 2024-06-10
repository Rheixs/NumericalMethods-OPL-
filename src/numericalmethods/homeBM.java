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
public class homeBM extends javax.swing.JFrame {
    public homeBM() {
        initComponents();
    }
   private double valL = Double.NEGATIVE_INFINITY; // Initialize xL and xU as global variables
   private double valU = Double.POSITIVE_INFINITY;
   private int totalIterCount = 1; // Initialize total iteration count as global variable
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        graph = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        RegulaFalse = new javax.swing.JRadioButton();
        Bisection = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Incremental = new javax.swing.JRadioButton();
        Graphing = new javax.swing.JRadioButton();
        Close = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        eq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numA = new javax.swing.JTextField();
        numB = new javax.swing.JTextField();
        editedLabel = new javax.swing.JLabel();
        appRoot = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Calculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1044, 824));
        jPanel1.setMinimumSize(new java.awt.Dimension(1044, 824));
        jPanel1.setPreferredSize(new java.awt.Dimension(1044, 857));
        jPanel1.setLayout(null);

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
        jScrollPane2.setBounds(30, 520, 980, 240);

        jLabel4.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numericalmethods/1.11l.gif"))); // NOI18N
        jLabel4.setText("Select Method:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(550, 20, 460, 300);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        graph.setBackground(new java.awt.Color(255, 255, 255));
        graph.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout graphLayout = new javax.swing.GroupLayout(graph);
        graph.setLayout(graphLayout);
        graphLayout.setHorizontalGroup(
            graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        graphLayout.setVerticalGroup(
            graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        jPanel3.add(graph);
        graph.setBounds(10, 10, 490, 350);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(30, 140, 510, 370);

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel4.setLayout(null);

        RegulaFalse.setBackground(new java.awt.Color(255, 153, 153));
        RegulaFalse.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        RegulaFalse.setText("Regula False");
        RegulaFalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegulaFalseActionPerformed(evt);
            }
        });
        jPanel4.add(RegulaFalse);
        RegulaFalse.setBounds(390, 50, 110, 24);

        Bisection.setBackground(new java.awt.Color(255, 153, 153));
        Bisection.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Bisection.setText("Bisection");
        Bisection.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BisectionItemStateChanged(evt);
            }
        });
        jPanel4.add(Bisection);
        Bisection.setBounds(260, 50, 90, 20);

        jLabel5.setFont(new java.awt.Font("Txt_IV50", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Select Method:");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 10, 190, 20);

        Back.setBackground(new java.awt.Color(0, 0, 0));
        Back.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel4.add(Back);
        Back.setBounds(340, 80, 70, 23);

        Incremental.setBackground(new java.awt.Color(255, 153, 153));
        Incremental.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Incremental.setText("Incremental");
        Incremental.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                IncrementalItemStateChanged(evt);
            }
        });
        jPanel4.add(Incremental);
        Incremental.setBounds(130, 50, 110, 20);

        Graphing.setBackground(new java.awt.Color(255, 153, 153));
        Graphing.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Graphing.setText("Graphing");
        Graphing.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GraphingItemStateChanged(evt);
            }
        });
        Graphing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraphingActionPerformed(evt);
            }
        });
        jPanel4.add(Graphing);
        Graphing.setBounds(20, 50, 110, 20);

        Close.setBackground(new java.awt.Color(0, 0, 0));
        Close.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setText("Close");
        Close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jPanel4.add(Close);
        Close.setBounds(430, 80, 70, 23);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(30, 20, 510, 110);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel2.setLayout(null);

        eq.setBackground(new java.awt.Color(0, 0, 0));
        eq.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        eq.setForeground(new java.awt.Color(255, 255, 255));
        eq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(eq);
        eq.setBounds(120, 10, 200, 40);

        jLabel2.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EQUATION:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 120, 40);

        jLabel3.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("xL:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 70, 60, 40);

        numA.setBackground(new java.awt.Color(0, 0, 0));
        numA.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        numA.setForeground(new java.awt.Color(255, 255, 255));
        numA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(numA);
        numA.setBounds(110, 70, 70, 40);

        numB.setBackground(new java.awt.Color(0, 0, 0));
        numB.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        numB.setForeground(new java.awt.Color(255, 255, 255));
        numB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(numB);
        numB.setBounds(250, 70, 70, 40);

        editedLabel.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        editedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editedLabel.setText("xU:");
        jPanel2.add(editedLabel);
        editedLabel.setBounds(190, 70, 60, 40);

        appRoot.setBackground(new java.awt.Color(0, 0, 0));
        appRoot.setFont(new java.awt.Font("Txt_IV50", 1, 14)); // NOI18N
        appRoot.setForeground(new java.awt.Color(255, 255, 255));
        appRoot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(appRoot);
        appRoot.setBounds(140, 120, 180, 40);

        jLabel1.setFont(new java.awt.Font("Txt_IV50", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ROOT:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 120, 140, 40);

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
        Calculate.setBounds(330, 70, 120, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(550, 340, 460, 170);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
//CALCULATION
        
        // Graphing Method
        if (Graphing.isSelected()) { 
         DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                model.setRowCount(0);
                String eqStr = eq.getText().replaceAll("\\s", "");
                double valX = Double.parseDouble(numA.getText());
                DecimalFormat format = new DecimalFormat("#.####");

                ArrayList<Object[]> dataList = new ArrayList<>();

                double prevY = evaluate(eqStr, valX);
                String decX = format.format(valX);
                String decY = format.format(prevY);
                dataList.add(new Object[]{decX, decY});

                double step = 0.2;
                double currX = valX + step;
                double currY = evaluate(eqStr, currX);
                boolean signChange = false;

                double rootVal = Double.NaN;


            try {

                while (!signChange) {
                    decX = format.format(currX);
                    decY = format.format(currY);
                    dataList.add(new Object[]{decX, decY});
                    model.setRowCount(0);

                    for (Object[] row : dataList) {
                        model.addRow(row);
                    }

                    if (prevY * currY < 0) {
                        double tolerance = 0.001;
                        double root = 0;
                        double lowerBound = currX - step;
                        double upperBound = currX;

                        do {
                            root = (lowerBound * evaluate(eqStr, upperBound) - upperBound * evaluate(eqStr, lowerBound)) 
                                    / (evaluate(eqStr, upperBound) - evaluate(eqStr, lowerBound));

                            double fA = evaluate(eqStr, lowerBound);
                            double fC = evaluate(eqStr, root);

                            if (fC == 0.0) {
                                break;
                            } else if (fA * fC < 0) {
                                upperBound = root;
                            } else {
                                lowerBound = root;
                            }
                        } while (Math.abs(upperBound - lowerBound) > tolerance);

                        rootVal = root;
                        appRoot.setText(format.format(rootVal));

                        signChange = true; // Set signChange to true to exit the loop

                        graph(eq.getText(), root);
                    } else {
                        prevY = currY;
                        currX += step;
                        currY = evaluate(eqStr, currX);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
            //Incremental Method
        } else if (Incremental.isSelected()){
            
             try {
            if (eq.getText().isEmpty() || numA.getText().isEmpty() || numB.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter the data needed, Thank you!");
            } else {
            DecimalFormat format = new DecimalFormat("#.########");
                ArrayList<Object[]> dataList = new ArrayList<>();
                double marginE = 0.001;
                double valL = Double.parseDouble(numA.getText());
                double delta = Double.parseDouble(numB.getText());
                double root = 0;
                double valU = valL + delta;
                int iterCount = 0;
                double prevU = 0; 

                double error = Math.abs(valU - prevU) / Math.abs(valU) * 100;

                while (error > marginE) {
                    iterCount++;
                    double fL = evaluate(eq.getText(), valL);
                    double fU = evaluate(eq.getText(), valU);
                    double product = fL * fU;

                    String decA = format.format(valL);
                    String decC = format.format(delta);
                    String decB = format.format(valU);
                    String decFA = format.format(fL);
                    String decFB = format.format(fU);
                    String decError;

                    if (iterCount == 1) {
                        decError = " ";
                    } else {
                        double currentError = Math.abs(valU - prevU) / Math.abs(valU) * 100;
                        decError = format.format(currentError);
                    }

                    String sign;
                    if (product < 0) {
                        sign = "<0";
                    } else if (product > 0) {
                        sign = ">0";
                    } else {
                        sign = "0"; // Just in case the product is zero
                    }

                    Object[] rowData = {iterCount, decA, decC,
                            decB, decFA, decFB, decError, sign};
                    dataList.add(rowData);

                    if (error < marginE && fL * fU == 0) {
                        root = valU;
                        break;
                    }

                    if (fL * fU < 0) {
                        valL = valL;
                        delta /= 10.0;
                        root = valU;
                    } else if (fL * fU > 0){
                        valL = valU;
                        delta = delta;
                        root = valU;
                    }

                    prevU = valU;
                    valU = valL + delta;
                    error = Math.abs(valU - prevU) / Math.abs(valU) * 100;
                }
                DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                model.setRowCount(0);

                for (Object[] row : dataList) {
                    model.addRow(row);
                }
                if (root != 0) {
                    String decRoot = format.format(root);
                    appRoot.setText(decRoot);
                    graph(eq.getText(), root);
                } else {
                    JOptionPane.showMessageDialog(this, "No root found within the specified range.");
                }
            }
         } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
         }
             
             //Bisection Method
        } else if (Bisection.isSelected()){
            try {
            
                if (eq.getText().isEmpty() || numA.getText().isEmpty() || numB.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Enter the data needed, Thank you!");
                } else {
                    DecimalFormat format = new DecimalFormat("#.########");
                   totalIterCount = 1;
                    ArrayList<Object[]> data = new ArrayList<>();
                    double MarginE = 0.001;
                    double xL = Double.parseDouble(numA.getText());
                    double xU = Double.parseDouble(numB.getText());
                    double roott = 0;
                    double xM = (xL + xU) / 2.0;
                    int iterations = 0;
                    double prevXM = 0; 

                    double Error = Math.abs(xM - prevXM) / Math.abs(xM) * 100;

                    while (Error > MarginE) {
                        iterations++;
                        double fxL = evaluate(eq.getText(), xL);
                        double fxU = evaluate(eq.getText(), xM);
                        double fxM = evaluate(eq.getText(), xU);

                        String decimalnumA = format.format(xL);
                        String decimalnumB = format.format(xU);
                        String decimalnumC = format.format(xM);
                        String decimalnumFA = format.format(fxL);
                        String decimalnumbFC = format.format(fxU);
                        String decimalnumERROR;

                        if (iterations == 1) {
                            decimalnumERROR = " ";
                        } else {
                            double currentError = Math.abs(xM - prevXM) / Math.abs(xM) * 100;
                            decimalnumERROR = format.format(currentError);
                        }

                        Object[] rowData = {iterations, decimalnumA, decimalnumC,
                                 decimalnumB, decimalnumFA, decimalnumbFC, decimalnumERROR};
                           data.add(rowData);

                           if (Math.abs(fxM) < MarginE) {
                               roott = xM;
                               break;
                           }

                           if (fxL * fxU < 0) {
                               xU = xM;
                               roott = xM;
                           } else {
                               xL = xM;
                               roott = xM;
                           }

                           prevXM = xM;
                           xM = (xL + xU) / 2;
                           Error = Math.abs(xM - prevXM) / Math.abs(xM) * 100; 
                    }
                    DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                    model.setRowCount(0);

                    for (Object[] row : data) {
                        model.addRow(row);
                    }
                    if (roott != 0) {
                        String decimalRoot = format.format(roott);
                        appRoot.setText(decimalRoot);
                        graph(eq.getText(), roott);
                    } else {
                        JOptionPane.showMessageDialog(this, "No root found within the specified range.");
                    }
            }
     } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
     }
            
 }     else if (RegulaFalse.isSelected()){
     
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#.#########");
                if (eq.getText().isEmpty() || numA.getText().isEmpty() || numB.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Enter the data needed, Thank you!");
                } else {
                    ArrayList<Object[]> data = new ArrayList<>();
                    double MarginE = 0.001;
                    double xL = Double.parseDouble(numA.getText());
                    double xU = Double.parseDouble(numB.getText());
                    double fxL, fxU, fxR, xR;
                    int iterations = 0;
                    double prevXU = 0;
                    double Error = Double.MAX_VALUE;

                    while (Error > MarginE) {
                        iterations++;
                        fxL = evaluate(eq.getText(), xL);
                        fxU = evaluate(eq.getText(), xU);

                        // Regula Falsi formula for finding next approximation
                        xR = (fxU * xL - fxL * xU) / (fxU - fxL);
                        fxR = evaluate(eq.getText(), xR);

                        String decimalnumA = decimalFormat.format(xL);
                        String decimalnumB = decimalFormat.format(xU);
                        String decimalnumC = decimalFormat.format(xR);
                        String decimalnumFC = decimalFormat.format(fxR);
                        String decimalnumERROR;

                        if (iterations == 1) {
                            decimalnumERROR = " ";
                        } else {
                            double currentError = Math.abs(xR - prevXU) / Math.abs(xR) * 100;
                            decimalnumERROR = decimalFormat.format(currentError);
                        }

                        Object[] rowData = {iterations, decimalnumA, decimalnumB,
                                decimalnumC, decimalnumFC, decimalnumERROR};
                        data.add(rowData);

                        if (fxL * fxR < 0) {
                            xU = xR;
                        } else if (fxL * fxR > 0) {
                            xL = xR;
                        }

                        prevXU = xR;
                        Error = Math.abs(fxR); // Error is now based on the value of f(xR)
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

                    // Displaying the root, assuming it's the last computed xR
                    String decimalRoot = decimalFormat.format(prevXU); // Assuming the last computed xR is the root
                    appRoot.setText(decimalRoot);
                    graph(eq.getText(), prevXU);
                }
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "PLEASE ENTER A VALID NUMBERS FOR BOTH LOWER AND UPPER BOUND LIMITS");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
}                  
    }//GEN-LAST:event_CalculateActionPerformed
    
    private void GraphingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GraphingItemStateChanged
        if (Graphing.isSelected()){
            Incremental.setSelected(false);
            Bisection.setSelected(false);
            RegulaFalse.setSelected(false);
             DefaultTableModel model = (DefaultTableModel) tbl.getModel();
             model.setRowCount(0);
             appRoot.setText("");
             graph.removeAll();
             graph.revalidate(); 
             graph.repaint(); 
             model.setColumnIdentifiers(new String[]{"x", "fx"});
             editedLabel.setText("-----");
             numB.setEnabled(false);
             numB.setText("");
            
     }
        
    }//GEN-LAST:event_GraphingItemStateChanged

    private void IncrementalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_IncrementalItemStateChanged
         if (Incremental.isSelected()){
            Graphing.setSelected(false);
            Bisection.setSelected(false); 
            RegulaFalse.setSelected(false);
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            appRoot.setText("");
            graph.removeAll();
            graph.revalidate(); 
            graph.repaint(); 
            model.setColumnIdentifiers(new String[]{"Iteration", "xL", "xR", "xU", "f(xL)", "f(xU)", "Error", "f(xl)*f(xU)"});
            editedLabel.setText("DeltaX");
            numB.setEnabled(true);
            numB.setText("");
                   
        }
        
    }//GEN-LAST:event_IncrementalItemStateChanged

    private void BisectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BisectionItemStateChanged
        if (Bisection.isSelected()){
            Incremental.setSelected(false);
            Graphing.setSelected(false); 
            RegulaFalse.setSelected(false);
             DefaultTableModel model = (DefaultTableModel) tbl.getModel();
             model.setRowCount(0);
             appRoot.setText("");
             graph.removeAll();
             graph.revalidate();
             graph.repaint();
             model.setColumnIdentifiers(new String[]{"Iteration", "xL", "xR", "xU", "f(xL)", "f(xU)", "Error"});
             editedLabel.setText("xU");
             numB.setEnabled(true);
             numB.setText("");
            
        }
        
    }//GEN-LAST:event_BisectionItemStateChanged

    private void GraphingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraphingActionPerformed

    }//GEN-LAST:event_GraphingActionPerformed

    private void RegulaFalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegulaFalseActionPerformed
       if (RegulaFalse.isSelected()){
            Graphing.setSelected(false);
            Incremental.setSelected(false);
            Bisection.setSelected(false);
             DefaultTableModel model = (DefaultTableModel) tbl.getModel();
             model.setRowCount(0);
             appRoot.setText("");
             graph.removeAll();
             graph.revalidate();
             graph.repaint();
             model.setColumnIdentifiers(new String[]{"Iteration","xL","xU", "xR", "f(xR)","Error"});
             editedLabel.setText("xU");
             numB.setEnabled(true);
             numB.setText("");
            
        }
       
    }//GEN-LAST:event_RegulaFalseActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
    mainpanel m = new mainpanel();
    m.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
    dispose(); 
    System.exit(0);
    }//GEN-LAST:event_CloseActionPerformed

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
            java.util.logging.Logger.getLogger(homeBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeBM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JRadioButton Bisection;
    private javax.swing.JButton Calculate;
    private javax.swing.JButton Close;
    private javax.swing.JRadioButton Graphing;
    private javax.swing.JRadioButton Incremental;
    private javax.swing.JRadioButton RegulaFalse;
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
    private javax.swing.JPanel jPanel4;
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
    
