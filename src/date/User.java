package date;
/**
 * 保存用户信息，账号，密码，分数，当前题号等
 * @author 陈亚宁 2017.08.09
 *
 */

public class User {
	/**
	 * 创建静态对象，方便其他方法调用
	 */
	public static User user = new User();
	/**
	 * 用户名，初始值为{@value}
	 */
	private String userName = "admin";
	/**
	 * 密码,初始值为{@value}
	 */
	
	private String passWord = "12345";
	/**
	 * 分数
	 */
	private int score = 0;
	/**
	 * 每次点击"下一题"按钮，i 自增 1，再通过i索引对比 answer数组中的字符判断对错
	 */
	private int i = 0;
	/**
	 * 获取i的值
	 * @return  i 的值
	 */
	public int getI() {
		return i;
	}
	/**
	 * 改变i的值，选择文件后设置为0，点击下一题后自增1
	 * @param i
	 */
	public void setI(int i) {
		switch (i) {
		case 0:
			this.i = i;
			break;
		case 1:
			this.i += 1;
			break;
		default:
			break;
		}
	}
	/**
	 * 获取score的值
	 * @return score的值
	 */
	public int getScore() {
		return score;
	}
	/**
	 * 回答正确将score自增1
	 * @param c checkBoxGroup中选择的选项
	 */
	public void setScore(char c) {
		if(c == (CorrectAnswer.answer[i])){
			score++;
		}
	}
	/**
	 * 返回用户名
	 * @return 用户名
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置用户名
	 * @param userName 用户名，点击注册后从用户名输入框获取到字符串
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 返回密码
	 * @return 密码
	 */
	public String getPassWord() {
		return passWord;
	}
	/**
	 * 设置密码
	 * @param passWord 密码，点击注册后从密码输入框获取到的字符串
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
