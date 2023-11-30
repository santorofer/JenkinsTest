/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * ZELOS2150GVSetup.java
 *
 * Created on Nov 9, 2011, 11:23:55 AM
 */
/**
 *
 * @author F.Molon
 */
public class ZELOS2150GVSetup extends DeviceSetup
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/** Creates new form ZELOS2150GVSetup */
	public ZELOS2150GVSetup()
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
	// Code">//GEN-BEGIN:initComponents
	private void initComponents()
	{
		deviceButtons1 = new DeviceButtons();
		jPanel1 = new javax.swing.JPanel();
		jPanel8 = new javax.swing.JPanel();
		deviceField16 = new DeviceField();
		deviceField17 = new DeviceField();
		deviceDispatch1 = new DeviceDispatch();
		jPanel2 = new javax.swing.JPanel();
		deviceChoice1 = new DeviceChoice();
		deviceField1 = new DeviceField();
		deviceField2 = new DeviceField();
		jPanel3 = new javax.swing.JPanel();
		deviceChoice2 = new DeviceChoice();
		deviceField3 = new DeviceField();
		deviceChoice3 = new DeviceChoice();
		jPanel4 = new javax.swing.JPanel();
		deviceChoice4 = new DeviceChoice();
		deviceField4 = new DeviceField();
		deviceField5 = new DeviceField();
		jPanel5 = new javax.swing.JPanel();
		deviceField6 = new DeviceField();
		deviceField7 = new DeviceField();
		deviceField8 = new DeviceField();
		deviceField9 = new DeviceField();
		jPanel6 = new javax.swing.JPanel();
		deviceField10 = new DeviceField();
		deviceField11 = new DeviceField();
		deviceField12 = new DeviceField();
		deviceField13 = new DeviceField();
		jPanel7 = new javax.swing.JPanel();
		deviceField14 = new DeviceField();
		deviceField15 = new DeviceField();
		jPanel9 = new javax.swing.JPanel();
		deviceChoice5 = new DeviceChoice();
		deviceField18 = new DeviceField();
		jPanel20 = new javax.swing.JPanel();
		deviceChoice8 = new DeviceChoice();
		deviceField19 = new DeviceField();
		deviceField20 = new DeviceField();
		setDeviceProvider("localhost");
		setDeviceTitle("Zelos 2150 GV Camera Device");
		setDeviceType("ZELOS2150GV");
		setHeight(600);
		setWidth(700);
		getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);
		jPanel1.setLayout(new java.awt.GridLayout(9, 0));
		deviceField16.setIdentifier("");
		deviceField16.setLabelString("Name: ");
		deviceField16.setOffsetNid(1);
		deviceField16.setTextOnly(true);
		jPanel8.add(deviceField16);
		deviceField17.setIdentifier("");
		deviceField17.setLabelString("Comment:");
		deviceField17.setNumCols(15);
		deviceField17.setOffsetNid(2);
		jPanel8.add(deviceField17);
		jPanel8.add(deviceDispatch1);
		jPanel1.add(jPanel8);
		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Exposure"));
		deviceChoice1.setChoiceItems(new String[]
		{ "YES", "NO" });
		deviceChoice1.setIdentifier("");
		deviceChoice1.setLabelString("Automatic: ");
		deviceChoice1.setOffsetNid(5);
		deviceChoice1.setUpdateIdentifier("");
		jPanel2.add(deviceChoice1);
		deviceField1.setIdentifier("");
		deviceField1.setLabelString("Exp. Time[s]: ");
		deviceField1.setNumCols(4);
		deviceField1.setOffsetNid(4);
		jPanel2.add(deviceField1);
		deviceField2.setIdentifier("");
		deviceField2.setLabelString("Exp. Level[0-255]: ");
		deviceField2.setNumCols(4);
		deviceField2.setOffsetNid(6);
		jPanel2.add(deviceField2);
		jPanel1.add(jPanel2);
		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Gain"));
		deviceChoice2.setChoiceItems(new String[]
		{ "YES", "NO" });
		deviceChoice2.setIdentifier("");
		deviceChoice2.setLabelString("Automatic: ");
		deviceChoice2.setOffsetNid(7);
		deviceChoice2.setUpdateIdentifier("");
		jPanel3.add(deviceChoice2);
		deviceField3.setIdentifier("");
		deviceField3.setLabelString("Gain[0-511]: ");
		deviceField3.setNumCols(4);
		deviceField3.setOffsetNid(8);
		jPanel3.add(deviceField3);
		deviceChoice3.setChoiceItems(new String[]
		{ "YES", "NO" });
		deviceChoice3.setIdentifier("");
		deviceChoice3.setLabelString("Slow Scan: ");
		deviceChoice3.setOffsetNid(9);
		deviceChoice3.setUpdateIdentifier("");
		jPanel3.add(deviceChoice3);
		jPanel1.add(jPanel3);
		jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Synchronization"));
		deviceChoice4.setChoiceItems(new String[]
		{ "INTERNAL", "EXTERNAL" });
		deviceChoice4.setIdentifier("");
		deviceChoice4.setLabelString("Synch.:");
		deviceChoice4.setOffsetNid(20);
		deviceChoice4.setUpdateIdentifier("");
		jPanel4.add(deviceChoice4);
		deviceField4.setIdentifier("");
		deviceField4.setLabelString("Int. Period[s]:");
		deviceField4.setNumCols(4);
		deviceField4.setOffsetNid(21);
		jPanel4.add(deviceField4);
		deviceField5.setIdentifier("");
		deviceField5.setLabelString("Ext. Timebase: ");
		deviceField5.setNumCols(20);
		deviceField5.setOffsetNid(22);
		jPanel4.add(deviceField5);
		jPanel1.add(jPanel4);
		jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Frame Area: "));
		deviceField6.setIdentifier("");
		deviceField6.setLabelString("Start X:");
		deviceField6.setNumCols(4);
		deviceField6.setOffsetNid(10);
		jPanel5.add(deviceField6);
		deviceField7.setIdentifier("");
		deviceField7.setLabelString("Start Y:");
		deviceField7.setNumCols(4);
		deviceField7.setOffsetNid(11);
		jPanel5.add(deviceField7);
		deviceField8.setIdentifier("");
		deviceField8.setLabelString("Width: ");
		deviceField8.setNumCols(4);
		deviceField8.setOffsetNid(12);
		jPanel5.add(deviceField8);
		deviceField9.setIdentifier("");
		deviceField9.setLabelString("Height: ");
		deviceField9.setNumCols(4);
		deviceField9.setOffsetNid(13);
		jPanel5.add(deviceField9);
		jPanel1.add(jPanel5);
		jPanel5.getAccessibleContext().setAccessibleName("Frame Area");
		jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Measure Area: "));
		deviceField10.setIdentifier("");
		deviceField10.setLabelString("Start X:");
		deviceField10.setNumCols(4);
		deviceField10.setOffsetNid(14);
		jPanel6.add(deviceField10);
		deviceField11.setIdentifier("");
		deviceField11.setLabelString("Start Y:");
		deviceField11.setNumCols(4);
		deviceField11.setOffsetNid(15);
		jPanel6.add(deviceField11);
		deviceField12.setIdentifier("");
		deviceField12.setLabelString("Width: ");
		deviceField12.setNumCols(4);
		deviceField12.setOffsetNid(16);
		jPanel6.add(deviceField12);
		deviceField13.setIdentifier("");
		deviceField13.setLabelString("Height: ");
		deviceField13.setNumCols(4);
		deviceField13.setOffsetNid(17);
		jPanel6.add(deviceField13);
		jPanel1.add(jPanel6);
		jPanel6.getAccessibleContext().setAccessibleName("Measure Area");
		jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Binning"));
		deviceField14.setIdentifier("");
		deviceField14.setLabelString("Horizontal[1-8]:");
		deviceField14.setNumCols(4);
		deviceField14.setOffsetNid(19);
		jPanel7.add(deviceField14);
		deviceField15.setIdentifier("");
		deviceField15.setLabelString("Vertical[1-8]:");
		deviceField15.setNumCols(4);
		deviceField15.setOffsetNid(18);
		jPanel7.add(deviceField15);
		jPanel1.add(jPanel7);
		jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Storage and Streaming"));
		deviceChoice5.setChoiceItems(new String[]
		{ "Stream and Store", "Only Stream", "Only Store" });
		deviceChoice5.setIdentifier("");
		deviceChoice5.setLabelString("Enable:");
		deviceChoice5.setOffsetNid(24);
		deviceChoice5.setUpdateIdentifier("");
		jPanel9.add(deviceChoice5);
		deviceField18.setIdentifier("");
		deviceField18.setLabelString("Localhost Port:");
		deviceField18.setNumCols(4);
		deviceField18.setOffsetNid(25);
		jPanel9.add(deviceField18);
		jPanel1.add(jPanel9);
		jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Dynamic Range for Streaming"));
		deviceChoice8.setBorder(null);
		deviceChoice8.setChoiceItems(new String[]
		{ "YES", "NO" });
		deviceChoice8.setLabelString("Auto Adjustment:");
		deviceChoice8.setOffsetNid(26);
		jPanel20.add(deviceChoice8);
		deviceField19.setIdentifier("");
		deviceField19.setLabelString("Manual Low Limit:");
		deviceField19.setNumCols(4);
		deviceField19.setOffsetNid(27);
		jPanel20.add(deviceField19);
		deviceField20.setIdentifier("");
		deviceField20.setLabelString("Manual High Limit:");
		deviceField20.setNumCols(4);
		deviceField20.setOffsetNid(28);
		jPanel20.add(deviceField20);
		jPanel1.add(jPanel20);
		getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
	}// </editor-fold>//GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private DeviceButtons deviceButtons1;
	private DeviceChoice deviceChoice1;
	private DeviceChoice deviceChoice2;
	private DeviceChoice deviceChoice3;
	private DeviceChoice deviceChoice4;
	private DeviceChoice deviceChoice5;
	private DeviceChoice deviceChoice8;
	private DeviceDispatch deviceDispatch1;
	private DeviceField deviceField1;
	private DeviceField deviceField10;
	private DeviceField deviceField11;
	private DeviceField deviceField12;
	private DeviceField deviceField13;
	private DeviceField deviceField14;
	private DeviceField deviceField15;
	private DeviceField deviceField16;
	private DeviceField deviceField17;
	private DeviceField deviceField18;
	private DeviceField deviceField19;
	private DeviceField deviceField2;
	private DeviceField deviceField20;
	private DeviceField deviceField3;
	private DeviceField deviceField4;
	private DeviceField deviceField5;
	private DeviceField deviceField6;
	private DeviceField deviceField7;
	private DeviceField deviceField8;
	private DeviceField deviceField9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel20;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	// End of variables declaration//GEN-END:variables
}