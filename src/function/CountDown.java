package function;

import javax.swing.JOptionPane;
import date.User;
import ui.SystemGui;

/**
 * 实现倒计时的类
 * @author 陈亚宁 2017.08.09
 *
 */
public class CountDown implements Runnable{
	
	/**
	 * 时间的初始值
	 */
	int time = 7200;
	
	/**
	 * 控制倒计时状态的标签
	 */
	boolean flag = false;
	
	/**
	 * 创建静态对象，供其他方法调用
	 */
	static CountDown countDown = new CountDown();
	
	/**
	 * 线程主方法
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
				
				//将所有按钮状态设置为不可点击，弹出窗口提醒
				SystemGui.bNext.setEnabled(false);
				SystemGui.bSub.setEnabled(false);
				SystemGui.bStart.setEnabled(false);
				SystemGui.bTime.setEnabled(false);
				JOptionPane.showMessageDialog(SystemGui.fSystem, "时间到，你的总分为" + User.user.getScore());
			}
		}
	}
}
