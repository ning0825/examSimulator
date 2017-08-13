package function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ui.LoginWindow;
import ui.SignWindow;

/**
 * µÇÂ¼½çÃæµÄ×¢²á°´Å¥¼àÌýÆ÷
 * @author ³ÂÑÇÄþ 2017.08.09
 *
 */
public class JbSignButtonlistenner implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		LoginWindow.fLogin.dispose();
		new SignWindow();
	}
}
