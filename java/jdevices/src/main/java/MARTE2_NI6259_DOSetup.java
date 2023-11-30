/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manduchi
 */
public class MARTE2_NI6259_DOSetup extends DeviceSetup
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form MARTE2_NI6259_DOSetup
	 */
	public MARTE2_NI6259_DOSetup()
	{
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deviceButtons1 = new DeviceButtons();
        jPanel2 = new javax.swing.JPanel();
        deviceField1 = new DeviceField();
        deviceField8 = new DeviceField();
        deviceField9 = new DeviceField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        deviceField2 = new DeviceField();
        deviceField3 = new DeviceField();
        jPanel4 = new javax.swing.JPanel();
        deviceField4 = new DeviceField();
        deviceField5 = new DeviceField();
        jPanel5 = new javax.swing.JPanel();
        deviceField6 = new DeviceField();
        deviceField7 = new DeviceField();

        setDeviceProvider("spilds:8100");
        setDeviceTitle("MARTe2 NI6259 Digital Output ");
        setDeviceType("MARTE2_NI6259_DO");
        setHeight(200);
        setWidth(600);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Board Id: ");
        deviceField1.setNumCols(4);
        deviceField1.setOffsetNid(10);
        jPanel2.add(deviceField1);

        deviceField8.setIdentifier("");
        deviceField8.setLabelString("Timebase: ");
        deviceField8.setNumCols(20);
        deviceField8.setOffsetNid(3);
        jPanel2.add(deviceField8);

        deviceField9.setIdentifier("");
        deviceField9.setLabelString("Timebase div.:");
        deviceField9.setNumCols(4);
        deviceField9.setOffsetNid(54);
        jPanel2.add(deviceField9);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("Mask: ");
        deviceField2.setOffsetNid(24);
        jPanel3.add(deviceField2);

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("Value: ");
        deviceField3.setNumCols(35);
        deviceField3.setOffsetNid(16);
        jPanel3.add(deviceField3);

        jTabbedPane1.addTab("Port 1", jPanel3);

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("Mask: ");
        deviceField4.setOffsetNid(40);
        jPanel4.add(deviceField4);

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("Value: ");
        deviceField5.setNumCols(35);
        deviceField5.setOffsetNid(32);
        jPanel4.add(deviceField5);

        jTabbedPane1.addTab("Port 2", jPanel4);

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("Mask: ");
        deviceField6.setOffsetNid(53);
        jPanel5.add(deviceField6);

        deviceField7.setIdentifier("");
        deviceField7.setLabelString("Value: ");
        deviceField7.setNumCols(35);
        deviceField7.setOffsetNid(45);
        jPanel5.add(deviceField7);

        jTabbedPane1.addTab("Port 3", jPanel5);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceField deviceField1;
    private DeviceField deviceField2;
    private DeviceField deviceField3;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private DeviceField deviceField7;
    private DeviceField deviceField8;
    private DeviceField deviceField9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}