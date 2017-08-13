package function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ui.SystemGui;

/**
 * ÔÝÍ£°´Å¥µÄ¼àÌýÆ÷
 * @author ³ÂÑÇÄþ 2017.08.09
 *
 */
public class PauseButtonLisnner implements ActionListener{



	@Override
	public void actionPerformed(ActionEvent e) {
		
		CountDown.countDown.flag = false;
		
		SystemGui.bTime.setEnabled(false);
		SystemGui.bStart.setEnabled(true);
		SystemGui.bNext.setEnabled(false);
		SystemGui.bSub.setEnabled(false);
	}
}
