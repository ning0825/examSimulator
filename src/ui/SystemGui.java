package ui;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import function.ChoiceItemLisenner;
import function.NextButtonListenner;
import function.PauseButtonLisnner;
import function.ScoreButtonListenner;
import function.StartButtonListnner;
import function.SubButtonListener;
import function.TextFieldBorderSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * ϵͳ������
 * @author ������ 2017.08.09
 *
 */
public class SystemGui {
	/**
	 * ������
	 */
	public static JFrame fSystem;
	/**
	 * �����ǩ
	 */
	public static JLabel lTitle;
	/**
	 * ��panel
	 */
	JPanel jp;
	/**
	 * ѡ�������ļ����鿴������ʣ��ʱ�������
	 */
	JPanel jp1;
	/**
	 * ʣ��ʱ��panel
	 */
	JPanel jp12;
	/**
	 * ѡ���ļ�panel
	 */
	JPanel jp11;
	/**
	 * �鿴����panel
	 */
	JPanel jp13;
	/**
	 * �������ݣ�ѡ���ť������
	 */
	JPanel jp2;
	/**
	 * ѡ�������ļ���ǩ
	 */
	JLabel lChooseFile;
	/**
	 * ѡ�������ļ�������
	 */
	Choice cChooseFile;
	/**
	 * �鿴�����ı���
	 */
	public static JTextArea taScore;
	/**
	 * �鿴������ť
	 */
	JButton bScore;
	/**
	 * ʣ��ʱ���ǩ
	 */
	JLabel ltime;
	/**
	 * ʣ��ʱ���ı���
	 */
	public static JTextField tfTime;
	/**
	 * ��ͣ��ʱ��ť
	 */
	public static JButton bTime;
	/**
	 * ��ʼ��ʱ��ť
	 */
	public static JButton bStart;
	/**
	 * �����ı���
	 */
	public static JTextArea taPaper;
	/**
	 * A��ѡ��
	 */
	Checkbox cbA;
	/**
	 * B��ѡ��
	 */
	Checkbox cbB;
	/**
	 * C��ѡ��
	 */
	Checkbox cbC;
	/**
	 * D��ѡ��
	 */
	Checkbox cbD;
	/**
	 * ��ѡ����
	 */
	public static CheckboxGroup cbx;
	/**
	 * �ύ�𰸰�ť
	 */
	public static JButton bSub;
	/**
	 * ��һ�ⰴť
	 */
	public static JButton bNext;
	/**
	 * ��ʾ��Ϣ�ı���
	 */
	JTextArea remind;
	
	public SystemGui() {
		fSystem = new JFrame("���Դ���");							//������
		fSystem.getContentPane().setBackground(Color.white);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		fSystem.setBounds(((screenWidth - 1000) / 2), ((screenHeight - 700) / 2), 1000, 650);
		fSystem.setVisible(true);
		fSystem.setResizable(false);
		fSystem.setLayout(null);
		fSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		lTitle = new JLabel("�Ծ�һ");							//�Ϸ�����
		lTitle.setFont(new Font("����", 0, 40));
		lTitle.setSize(new Dimension(1000, 80));
		lTitle.setHorizontalAlignment(JTextField.CENTER);
		fSystem.add(lTitle);
		
		jp1 = new JPanel();										//�������
		jp1.setBounds(0, 100, 300, 650);
		jp1.setBackground(Color.white);
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 3));
		fSystem.add(jp1);
		
		jp12 = new JPanel();									//ʣ��ʱ��panel
		jp12.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));
		jp12.setPreferredSize(new Dimension(300, 100));
		jp12.setBackground(Color.white);
		jp1.add(jp12);
		
		jp11 = new JPanel();									//ѡ���ļ�panel
		jp11.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp11.setPreferredSize(new Dimension(300, 150));
		jp11.setBackground(Color.white);
		jp1.add(jp11);
		
		jp13 = new JPanel();									//�鿴����panel
		jp13.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp13.setPreferredSize(new Dimension(300, 120));
		jp13.setBackground(Color.white);
		jp1.add(jp13);
		
		remind = new JTextArea();									//��ʾ��Ϣ�ı���
		remind.setEditable(false);
		remind.setBackground(Color.white);
		remind.setBorder(null);
		remind.setForeground(Color.gray);
		remind.setText("       ѡ������󣬵����ʼ��ť���ɿ�ʼ���ԡ�");
		remind.setFont(new Font("����", 0, 12));
		jp1.add(remind);
		
		jp2 = new JPanel();									//�ұ�����
		jp2.setBounds(300, 100, 700, 700);
		jp2.setBackground(Color.white);
		jp2.setLayout(null);
		fSystem.add(jp2);
		
		lChooseFile = new JLabel("ѡ�������ļ�");					//��ѡ�������ļ���
		lChooseFile.setFont(new Font("����", 0, 20));
		lChooseFile.setPreferredSize(new Dimension(280, 30));
		lChooseFile.setHorizontalAlignment(JTextField.LEFT);
		lChooseFile.setVerticalAlignment(JTextField.TOP);
		jp11.add(lChooseFile);
		
		cChooseFile = new Choice();								//ѡ���ļ�������
		cChooseFile.add(new PopupMenu("sfd"));
		cChooseFile.add("�Ծ�һ");
		cChooseFile.add("�Ծ��");
		cChooseFile.add("�Ծ���");
		cChooseFile.setPreferredSize(new Dimension(280, 20));
		cChooseFile.addItemListener(new ChoiceItemLisenner());
		jp11.add(cChooseFile);
		
		tfTime = new JTextField();								//ʣ��ʱ���ı���
		tfTime.setPreferredSize(new Dimension(182, 50));
		tfTime.setFont(new Font("Mongolian Baiti", 1, 30));
		tfTime.setBackground(Color.white);
		tfTime.setEditable(false);
		tfTime.setBorder(null);
		TextFieldBorderSet.textSet(tfTime);
		tfTime.setHorizontalAlignment(JTextField.CENTER);
		tfTime.setText("2:0:0");
		jp12.add(tfTime);
		
		bStart = new JButton(">");								//��ʼ��ʱ��ť
		bStart.setPreferredSize(new Dimension(50, 50));
		bStart.setBackground(new Color(153, 153, 204));
		bStart.setForeground(Color.WHITE);
		bStart.setFont(new Font("����", 1, 15));
		bStart.setBorder(null);
		bStart.setEnabled(true);
		bStart.addActionListener(new StartButtonListnner());
		jp12.add(bStart);
		
		bTime = new JButton("||");							//��ͣ��ʱ��ť
		bTime.setPreferredSize(new Dimension(50, 50));
		bTime.setBackground(new Color(153, 153, 204));
		bTime.setForeground(Color.WHITE);
		bTime.setFont(new Font("����", 1, 12));
		bTime.setBorder(null);
		bTime.setEnabled(false);
		bTime.addActionListener(new PauseButtonLisnner());
		jp12.add(bTime);
		
		taScore = new JTextArea();								//�鿴�����ı���
		taScore.setPreferredSize(new Dimension(170, 50));
		taScore.setFont(new Font("����", 0, 20));
		TextFieldBorderSet.textSetBottom(taScore);
		taScore.setLineWrap(true);
		jp13.add(taScore);
		
		bScore = new JButton("�鿴����");							//�鿴������ť
		bScore.setPreferredSize(new Dimension(105, 50));
		bScore.setBorder(null);
		bScore.setBackground(new Color(153, 153, 204));
		bScore.setForeground(Color.WHITE);
		bScore.setFont(new Font("����", 1, 15));
		bScore.addActionListener(new ScoreButtonListenner());
		jp13.add(bScore);
		bScore.revalidate();

		
		taPaper = new JTextArea();								//�Ծ��ı���
		taPaper.setEditable(false);
		taPaper.setFont(new Font("Mongolian Baiti", 0, 20));
		taPaper.setBounds(20, 2, 650, 350);
		taPaper.setMargin(new Insets(0, 72, 50, 50));
		taPaper.setLineWrap(true);
		taPaper.setWrapStyleWord(true);
		jp2.add(taPaper);
		
		
		cbx = new CheckboxGroup();				//��ѡ��ť��
		cbA = new Checkbox("A", cbx, false); 
		cbA.setBounds(100, 350, 60, 60);
		cbA.setFont(new Font("SERIF", 0, 18));
		jp2.add(cbA);
		cbB = new Checkbox("B", cbx, false);
		cbB.setBounds(200, 350, 60, 60);
		cbB.setFont(new Font("SERIF", 0, 18));
		jp2.add(cbB);
		cbC = new Checkbox("C", cbx, false);
		cbC.setBounds(300, 350, 60, 60);
		cbC.setFont(new Font("SERIF", 0, 18));
		jp2.add(cbC);
		cbD = new Checkbox("D", cbx, false);
		cbD.setBounds(400, 350, 60, 60);
		cbD.setFont(new Font("SERIF", 0, 18));
		jp2.add(cbD);
		
		bSub = new JButton("�ύ");							//�ύ�𰸰�ť
		bSub.setBackground(new Color(255,153,153));
		bSub.setForeground(Color.WHITE);
		bSub.setFont(new Font("", 1, 15));
		bSub.setBounds(470, 370, 90, 40);
		bSub.setBorderPainted(false);
		bSub.addActionListener(new SubButtonListener());
		bSub.setEnabled(false);
		jp2.add(bSub);
		
		bNext = new JButton("��һ��");							//��һ�ⰴť
		bNext.setBounds(580, 370, 90, 40);
		bNext.setBackground(new Color(30, 144, 255));
		bNext.setForeground(Color.WHITE);
		bNext.setFont(new Font("", 1, 15));
		bNext.setBorder(null);
		bNext.setEnabled(false);
		bNext.addActionListener(new NextButtonListenner());
		jp2.add(bNext);
		
		fSystem.repaint();
	}
	
	public static void main(String[] args) {
		new SystemGui();
	}


}
