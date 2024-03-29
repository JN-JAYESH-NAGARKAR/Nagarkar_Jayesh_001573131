/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CustomerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Menu.Item;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.Organization.RestaurantManagerOrganization;
//import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import ui.LabAssistantRole.CommentOrderJPanel;


/**
 *
 * @author raunak
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CustomerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CustomerOrganization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        valueLabel1.setText(userAccount.getEmployee().getName());
        populateRequestTable();
        populateMenuTable();
        
    }
    public void populateMenuTable(){
        DefaultTableModel model = (DefaultTableModel)menuJTable.getModel();
        
        model.setRowCount(0);
        
        
        for(Item item : enterprise.getMenu().getItemList()){
            Object[] row = new Object[3];
            row[0] = item;
            row[1] = item.getName();
            row[2] = item.getPrice();
            System.out.println(item.getName());
            
            model.addRow(row);
        }
        
    }
    
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;         //--jayesh   row[0] = request.getMessage(); 
            row[1] = request.getDeliveryman();
            row[2] = request.getStatus();
            String result = ((OrderWorkRequest) request).getTestResult();
            row[3] = result == null ? "" : result;
            row[4] = request.getRequestDate();
            row[5] = request.getResolveDate();
            
            model.addRow(row);
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnFeedback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuJTable = new javax.swing.JTable();
        btnCancelOrder = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        valueLabel1 = new javax.swing.JLabel();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Item", "Delivery Man", "Order Status", "Customer Review", "Order Date", "Delivered date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        requestTestJButton.setText("Request Order");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");

        btnFeedback.setText("Feedback");
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Menu");

        menuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Item Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(menuJTable);

        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Dear Customer");

        valueLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel1.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshTestJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(requestTestJButton)
                                        .addGap(57, 57, 57)
                                        .addComponent(btnFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 380, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refreshTestJButton)
                        .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFeedback)
                    .addComponent(btnCancelOrder))
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        

        
        //--jayesh insert code for update table based on selected input from menu table,update workrequest for useraccount and manager-organization
        System.out.println("CustomerWorkAreaJPanel line number 255");
        int selectedRow = menuJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        System.out.println("CustomerWorkAreaJPanel line number 261");
        Item orderItem = (Item)menuJTable.getValueAt(selectedRow, 0);
        
        WorkRequest request = new OrderWorkRequest();
        request.setItem(orderItem);
        request.setSender(userAccount);
        request.setStatus("Ordered");
        
     
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        
        populateRequestTable();
        System.out.println("CustomerWorkAreaJPanel line number 272");
        
        //-- jayesh trying to add request to the respective managerorganization
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof RestaurantManagerOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            
        }
       
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        // TODO add your handling code here:
        System.out.println("CustomerWorkAreaJPanel line number 197");
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        System.out.println("CustomerWorkAreaJPanel line number 203");
        OrderWorkRequest request = (OrderWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
     
        
        System.out.println("CustomerWorkAreaJPanel line number 207");
        CommentOrderJPanel commentOrderJPanel = new CommentOrderJPanel(userProcessContainer, request);
        userProcessContainer.add("commentOrderJPanel", commentOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        // TODO add your handling code here:
        System.out.println("CustomerWorkAreaJPanel line number 319");
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        System.out.println("CustomerWorkAreaJPanel line number 325");
        OrderWorkRequest request = (OrderWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Canceled");
        //-- jayesh trying to remove order request from the respective managerorganization
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof RestaurantManagerOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().removeRequest(request);
            
        }
        populateRequestTable();
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menuJTable;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
