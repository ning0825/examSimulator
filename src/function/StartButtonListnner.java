package function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files;
import java.sql.Time;
import java.util.logging.Logger;

import ui.SystemGui;

/**
 * 开始按钮的监听器
 * @author 陈亚宁 2017.08.09
 *
 */
public class StartButtonListnner implements ActionListener{


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(FileSet.fileSet.flag2) {
			new Thread(FileSet.fileSet).start();
		}

		SystemGui.bNext.setEnabled(false);
		SystemGui.bStart.setEnabled(false);
		SystemGui.bTime.setEnabled(true);
		SystemGui.bSub.setEnabled(true);
		
		
		if(CountDown.countDown.flag == false) {
			CountDown.countDown.flag = true;
			new Thread(CountDown.countDown).start();
		}
		
			
		
		
		
		
		
	}

}
