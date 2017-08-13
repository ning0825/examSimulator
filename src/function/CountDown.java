package function;

import javax.swing.JOptionPane;
import date.User;
import ui.SystemGui;

/**
 * ʵ�ֵ���ʱ����
 * @author ������ 2017.08.09
 *
 */
public class CountDown implements Runnable{
	
	/**
	 * ʱ��ĳ�ʼֵ
	 */
	int time = 7200;
	
	/**
	 * ���Ƶ���ʱ״̬�ı�ǩ
	 */
	boolean flag = false;
	
	/**
	 * ������̬���󣬹�������������
	 */
	static CountDown countDown = new CountDown();
	
	/**
	 * �߳�������
	 */
	public void run() {
		
		while(time >= 0 && flag){
			int hour = time / 3600;
			int min = (time / 60) % 60;
			int sec = time % 60;
			SystemGui.tfTime.setText(hour + ":" + min +":" + sec);
			time--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(time < 0) {
				
				//�����а�ť״̬����Ϊ���ɵ����������������
				SystemGui.bNext.setEnabled(false);
				SystemGui.bSub.setEnabled(false);
				SystemGui.bStart.setEnabled(false);
				SystemGui.bTime.setEnabled(false);
				JOptionPane.showMessageDialog(SystemGui.fSystem, "ʱ�䵽������ܷ�Ϊ" + User.user.getScore());
			}
		}
	}
}
