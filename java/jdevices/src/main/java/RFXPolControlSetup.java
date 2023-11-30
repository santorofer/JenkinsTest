/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * MARTESetup.java
 *
 * Created on Mar 2, 2011, 1:07:35 PM
 */
/**
 *
 * @author manduchi
 */
public class RFXPolControlSetup extends DeviceSetup
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/** Creates new form MARTESetup */
	public RFXPolControlSetup()
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
		jPanel2 = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		jPanel6 = new javax.swing.JPanel();
		jPanel7 = new javax.swing.JPanel();
		jPanel8 = new javax.swing.JPanel();
		jPanel9 = new javax.swing.JPanel();
		jPanel1 = new javax.swing.JPanel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel13 = new javax.swing.JPanel();
		jPanel14 = new javax.swing.JPanel();
		jPanel43 = new javax.swing.JPanel();
		deviceChoice3 = new DeviceChoice();
		deviceField22 = new DeviceField();
		deviceField23 = new DeviceField();
		deviceField24 = new DeviceField();
		jPanel44 = new javax.swing.JPanel();
		deviceField25 = new DeviceField();
		deviceField26 = new DeviceField();
		deviceField27 = new DeviceField();
		deviceField28 = new DeviceField();
		jPanel45 = new javax.swing.JPanel();
		deviceField29 = new DeviceField();
		deviceField30 = new DeviceField();
		deviceField31 = new DeviceField();
		deviceField32 = new DeviceField();
		jPanel46 = new javax.swing.JPanel();
		deviceField33 = new DeviceField();
		deviceField34 = new DeviceField();
		deviceField35 = new DeviceField();
		deviceField36 = new DeviceField();
		deviceField37 = new DeviceField();
		jPanel15 = new javax.swing.JPanel();
		deviceTable1 = new DeviceTable();
		deviceTable2 = new DeviceTable();
		setDeviceProvider("localhost");
		setDeviceTitle("MARTe EDA1Setup");
		setDeviceType("MARTE_EDA1");
		setHeight(700);
		setWidth(900);
		getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);
		jPanel2.setLayout(new java.awt.GridLayout(5, 0));
		jPanel2.add(jPanel5);
		jPanel2.add(jPanel6);
		jPanel2.add(jPanel7);
		jPanel2.add(jPanel8);
		jPanel2.add(jPanel9);
		getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);
		jPanel1.setLayout(new java.awt.BorderLayout());
		jPanel13.setLayout(new java.awt.BorderLayout());
		jPanel14.setLayout(new java.awt.GridLayout(4, 1));
		deviceChoice3.setChoiceIntValues(new int[]
		{ 0, 1, 2 });
		deviceChoice3.setChoiceItems(new String[]
		{ "4-4-4", "8-3-1", "8-2-2" });
		deviceChoice3.setConvert(true);
		deviceChoice3.setIdentifier("");
		deviceChoice3.setLabelString("Configuration: ");
		deviceChoice3.setOffsetNid(1345);
		deviceChoice3.setUpdateIdentifier("");
		jPanel43.add(deviceChoice3);
		deviceField22.setIdentifier("");
		deviceField22.setLabelString("aaGain: ");
		deviceField22.setNumCols(20);
		deviceField22.setOffsetNid(1417);
		jPanel43.add(deviceField22);
		deviceField23.setIdentifier("");
		deviceField23.setLabelString("invAAGain: ");
		deviceField23.setNumCols(20);
		deviceField23.setOffsetNid(1423);
		jPanel43.add(deviceField23);
		deviceField24.setIdentifier("");
		deviceField24.setLabelString("bvGain: ");
		deviceField24.setNumCols(20);
		deviceField24.setOffsetNid(1441);
		jPanel43.add(deviceField24);
		jPanel14.add(jPanel43);
		deviceField25.setIdentifier("");
		deviceField25.setLabelString("maxPVATCurr: ");
		deviceField25.setNumCols(20);
		deviceField25.setOffsetNid(1447);
		jPanel44.add(deviceField25);
		deviceField26.setIdentifier("");
		deviceField26.setLabelString("DecouplerGain: ");
		deviceField26.setNumCols(4);
		deviceField26.setOffsetNid(1453);
		jPanel44.add(deviceField26);
		deviceField27.setIdentifier("");
		deviceField27.setLabelString("compResGain: ");
		deviceField27.setNumCols(4);
		deviceField27.setOffsetNid(1459);
		jPanel44.add(deviceField27);
		deviceField28.setIdentifier("");
		deviceField28.setLabelString("Kp:");
		deviceField28.setNumCols(4);
		deviceField28.setOffsetNid(1465);
		jPanel44.add(deviceField28);
		jPanel14.add(jPanel44);
		deviceField29.setIdentifier("");
		deviceField29.setLabelString("Ki:");
		deviceField29.setNumCols(4);
		deviceField29.setOffsetNid(1471);
		jPanel45.add(deviceField29);
		deviceField30.setIdentifier("");
		deviceField30.setLabelString("tStartEquilIntegralAction: ");
		deviceField30.setNumCols(20);
		deviceField30.setOffsetNid(1477);
		jPanel45.add(deviceField30);
		deviceField31.setIdentifier("");
		deviceField31.setLabelString("minIpCurr ");
		deviceField31.setNumCols(4);
		deviceField31.setOffsetNid(1483);
		jPanel45.add(deviceField31);
		deviceField32.setIdentifier("");
		deviceField32.setLabelString("equilNonLinarFactorSaturation: ");
		deviceField32.setNumCols(4);
		deviceField32.setOffsetNid(1489);
		jPanel45.add(deviceField32);
		jPanel14.add(jPanel45);
		deviceField33.setIdentifier("");
		deviceField33.setLabelString("ffwdOn: ");
		deviceField33.setNumCols(4);
		deviceField33.setOffsetNid(1507);
		jPanel46.add(deviceField33);
		deviceField34.setIdentifier("");
		deviceField34.setLabelString("fdbkOn: ");
		deviceField34.setNumCols(4);
		deviceField34.setOffsetNid(1513);
		jPanel46.add(deviceField34);
		deviceField35.setIdentifier("");
		deviceField35.setLabelString("voltageControl");
		deviceField35.setNumCols(4);
		deviceField35.setOffsetNid(1519);
		jPanel46.add(deviceField35);
		deviceField36.setIdentifier("");
		deviceField36.setLabelString("equiFlux: ");
		deviceField36.setNumCols(4);
		deviceField36.setOffsetNid(1525);
		jPanel46.add(deviceField36);
		deviceField37.setIdentifier("");
		deviceField37.setLabelString("strainAlarmLatchTime: ");
		deviceField37.setNumCols(4);
		deviceField37.setOffsetNid(1531);
		jPanel46.add(deviceField37);
		jPanel14.add(jPanel46);
		jPanel13.add(jPanel14, java.awt.BorderLayout.NORTH);
		jPanel15.setLayout(new java.awt.GridLayout(2, 1));
		deviceTable1.setColumnNames(new String[]
		{ "1", "2", "3", "4", "5", "6", "7", "8" });
		deviceTable1.setIdentifier("");
		deviceTable1.setLabelString("fsMMFRT");
		deviceTable1.setNumCols(8);
		deviceTable1.setNumRows(1);
		deviceTable1.setOffsetNid(1495);
		jPanel15.add(deviceTable1);
		deviceTable2.setColumnNames(new String[]
		{ "1", "2", "3", "4", "5", "6", "7", "8" });
		deviceTable2.setIdentifier("");
		deviceTable2.setLabelString("fsBvRT");
		deviceTable2.setNumCols(8);
		deviceTable2.setNumRows(1);
		deviceTable2.setOffsetNid(1501);
		jPanel15.add(deviceTable2);
		jPanel13.add(jPanel15, java.awt.BorderLayout.CENTER);
		jTabbedPane1.addTab("Simulink", jPanel13);
		jPanel1.add(jTabbedPane1, java.awt.BorderLayout.CENTER);
		getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
	}// </editor-fold>//GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private DeviceButtons deviceButtons1;
	private DeviceChoice deviceChoice3;
	private DeviceField deviceField22;
	private DeviceField deviceField23;
	private DeviceField deviceField24;
	private DeviceField deviceField25;
	private DeviceField deviceField26;
	private DeviceField deviceField27;
	private DeviceField deviceField28;
	private DeviceField deviceField29;
	private DeviceField deviceField30;
	private DeviceField deviceField31;
	private DeviceField deviceField32;
	private DeviceField deviceField33;
	private DeviceField deviceField34;
	private DeviceField deviceField35;
	private DeviceField deviceField36;
	private DeviceField deviceField37;
	private DeviceTable deviceTable1;
	private DeviceTable deviceTable2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel13;
	private javax.swing.JPanel jPanel14;
	private javax.swing.JPanel jPanel15;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel43;
	private javax.swing.JPanel jPanel44;
	private javax.swing.JPanel jPanel45;
	private javax.swing.JPanel jPanel46;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JTabbedPane jTabbedPane1;
	// End of variables declaration//GEN-END:variables
}