/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manduchi
 */
public class RFX_RPADCSetup extends DeviceSetup
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form RFX_RPADCSetup
	 */
	public RFX_RPADCSetup()
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        deviceField1 = new DeviceField();
        deviceDispatch1 = new DeviceDispatch();
        jPanel3 = new javax.swing.JPanel();
        deviceField2 = new DeviceField();
        deviceField4 = new DeviceField();
        jPanel4 = new javax.swing.JPanel();
        deviceChoice1 = new DeviceChoice();
        deviceChoice2 = new DeviceChoice();
        deviceChoice3 = new DeviceChoice();
        jPanel7 = new javax.swing.JPanel();
        deviceChoice4 = new DeviceChoice();
        deviceField9 = new DeviceField();
        jPanel6 = new javax.swing.JPanel();
        deviceField7 = new DeviceField();
        deviceField8 = new DeviceField();
        deviceField11 = new DeviceField();
        jPanel8 = new javax.swing.JPanel();
        deviceField10 = new DeviceField();
        deviceField6 = new DeviceField();
        deviceField3 = new DeviceField();
        jPanel9 = new javax.swing.JPanel();
        deviceField12 = new DeviceField();
        deviceField13 = new DeviceField();
        deviceField14 = new DeviceField();
        jPanel5 = new javax.swing.JPanel();
        deviceField5 = new DeviceField();

        setDeviceProvider("localhost:8000");
        setDeviceTitle("RedPitaya ADC");
        setDeviceType("RFX_RPADC");
        setHeight(300);
        setWidth(800);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(8, 1));

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Comment:");
        deviceField1.setNumCols(25);
        deviceField1.setOffsetNid(1);
        deviceField1.setTextOnly(true);
        jPanel2.add(deviceField1);
        jPanel2.add(deviceDispatch1);

        jPanel1.add(jPanel2);

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("Decimation:");
        deviceField2.setOffsetNid(2);
        jPanel3.add(deviceField2);

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("Segment Size: ");
        deviceField4.setOffsetNid(4);
        jPanel3.add(deviceField4);

        jPanel1.add(jPanel3);

        deviceChoice1.setChoiceItems(new String[] {"STREAMING", "EVENT_STREAMING", "EVENT_SINGLE", "TRIGGER_STREAMING", "TRIGGER_SINGLE"});
        deviceChoice1.setIdentifier("");
        deviceChoice1.setLabelString("Mode:");
        deviceChoice1.setOffsetNid(7);
        deviceChoice1.setUpdateIdentifier("");
        jPanel4.add(deviceChoice1);

        deviceChoice2.setChoiceItems(new String[] {"UPPER", "LOWER"});
        deviceChoice2.setIdentifier("");
        deviceChoice2.setLabelString("Event Mode: ");
        deviceChoice2.setOffsetNid(8);
        deviceChoice2.setUpdateIdentifier("");
        jPanel4.add(deviceChoice2);

        deviceChoice3.setChoiceItems(new String[] {"A", "B"});
        deviceChoice3.setIdentifier("");
        deviceChoice3.setLabelString("Event Chan.:");
        deviceChoice3.setOffsetNid(9);
        deviceChoice3.setUpdateIdentifier("");
        jPanel4.add(deviceChoice3);

        jPanel1.add(jPanel4);

        deviceChoice4.setChoiceItems(new String[] {"INTERNAL", "TRIG_EXTERNAL", "EXTERNAL", "HIGHWAY"});
        deviceChoice4.setIdentifier("");
        deviceChoice4.setLabelString("Clock Mode:");
        deviceChoice4.setOffsetNid(14);
        deviceChoice4.setUpdateIdentifier("");
        jPanel7.add(deviceChoice4);

        deviceField9.setIdentifier("");
        deviceField9.setLabelString("Ext. Clock:");
        deviceField9.setNumCols(25);
        deviceField9.setOffsetNid(15);
        jPanel7.add(deviceField9);

        jPanel1.add(jPanel7);

        deviceField7.setIdentifier("");
        deviceField7.setLabelString("Pre Samples: ");
        deviceField7.setOffsetNid(12);
        jPanel6.add(deviceField7);

        deviceField8.setIdentifier("");
        deviceField8.setLabelString("Post Samples: ");
        deviceField8.setOffsetNid(13);
        jPanel6.add(deviceField8);

        deviceField11.setIdentifier("");
        deviceField11.setLabelString("MDSplus trig. event");
        deviceField11.setOffsetNid(28);
        deviceField11.setTextOnly(true);
        jPanel6.add(deviceField11);

        jPanel1.add(jPanel6);

        deviceField10.setIdentifier("");
        deviceField10.setLabelString("Ev. streaming level:");
        deviceField10.setNumCols(4);
        deviceField10.setOffsetNid(10);
        jPanel8.add(deviceField10);

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("Ev. streaming samples: ");
        deviceField6.setNumCols(4);
        deviceField6.setOffsetNid(11);
        jPanel8.add(deviceField6);

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("Timing Highway event code: ");
        deviceField3.setNumCols(4);
        deviceField3.setOffsetNid(23);
        jPanel8.add(deviceField3);

        jPanel1.add(jPanel8);

        deviceField12.setIdentifier("");
        deviceField12.setLabelString("Dead Time(s):");
        deviceField12.setNumCols(6);
        deviceField12.setOffsetNid(34);
        jPanel9.add(deviceField12);

        deviceField13.setIdentifier("");
        deviceField13.setLabelString("Offset A (raw):");
        deviceField13.setNumCols(6);
        deviceField13.setOffsetNid(35);
        jPanel9.add(deviceField13);

        deviceField14.setIdentifier("");
        deviceField14.setLabelString("Offset B (raw): ");
        deviceField14.setNumCols(6);
        deviceField14.setOffsetNid(22);
        jPanel9.add(deviceField14);

        jPanel1.add(jPanel9);

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("Trigger: ");
        deviceField5.setNumCols(35);
        deviceField5.setOffsetNid(5);
        jPanel5.add(deviceField5);

        jPanel1.add(jPanel5);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChoice deviceChoice1;
    private DeviceChoice deviceChoice2;
    private DeviceChoice deviceChoice3;
    private DeviceChoice deviceChoice4;
    private DeviceDispatch deviceDispatch1;
    private DeviceField deviceField1;
    private DeviceField deviceField10;
    private DeviceField deviceField11;
    private DeviceField deviceField12;
    private DeviceField deviceField13;
    private DeviceField deviceField14;
    private DeviceField deviceField2;
    private DeviceField deviceField3;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private DeviceField deviceField7;
    private DeviceField deviceField8;
    private DeviceField deviceField9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}