package function;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

/**
 * 本类的方法用于设置文本边框
 * @author 陈亚宁 2017.08.09
 *
 */
public class TextFieldBorderSet {
	
	/**
	 * 设置textField文本框
	 * @param field 输入用户名，密码等文本框
	 */
	public static void textSet(JTextField field) {  
        field.setBackground(new Color(255, 255, 255));  
        MatteBorder border = new MatteBorder(0, 0, 1, 0, new Color(192, 192, 192));  
        field.setBorder(border);  
    }
	/**
	 * 设置textArea文本框，四周细线
	 * @param jTextArea  试卷文本框
	 */
	public static void textSetLeft(JTextArea jTextArea) {  
        jTextArea.setBackground(new Color(255, 255, 255));  
        MatteBorder border = new MatteBorder(1, 1, 1, 1, new Color(192, 192, 192));  
        jTextArea.setBorder(border);  
    }
	
	/**
	 * 设置textArea文本框，底部细线
	 * @param jTextArea
	 */
	public static void textSetBottom(JTextArea jTextArea) {  
        jTextArea.setBackground(new Color(255, 255, 255));  
        MatteBorder border = new MatteBorder(0, 0, 1, 0, new Color(192, 192, 192)); 
        jTextArea.setBorder(border);  
    }
	
}

