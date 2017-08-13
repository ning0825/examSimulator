package function;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

/**
 * ����ķ������������ı��߿�
 * @author ������ 2017.08.09
 *
 */
public class TextFieldBorderSet {
	
	/**
	 * ����textField�ı���
	 * @param field �����û�����������ı���
	 */
	public static void textSet(JTextField field) {  
        field.setBackground(new Color(255, 255, 255));  
        MatteBorder border = new MatteBorder(0, 0, 1, 0, new Color(192, 192, 192));  
        field.setBorder(border);  
    }
	/**
	 * ����textArea�ı�������ϸ��
	 * @param jTextArea  �Ծ��ı���
	 */
	public static void textSetLeft(JTextArea jTextArea) {  
        jTextArea.setBackground(new Color(255, 255, 255));  
        MatteBorder border = new MatteBorder(1, 1, 1, 1, new Color(192, 192, 192));  
        jTextArea.setBorder(border);  
    }
	
	/**
	 * ����textArea�ı��򣬵ײ�ϸ��
	 * @param jTextArea
	 */
	public static void textSetBottom(JTextArea jTextArea) {  
        jTextArea.setBackground(new Color(255, 255, 255));  
        MatteBorder border = new MatteBorder(0, 0, 1, 0, new Color(192, 192, 192)); 
        jTextArea.setBorder(border);  
    }
	
}

