package date;
/**
 * �����û���Ϣ���˺ţ����룬��������ǰ��ŵ�
 * @author ������ 2017.08.09
 *
 */

public class User {
	/**
	 * ������̬���󣬷���������������
	 */
	public static User user = new User();
	/**
	 * �û�������ʼֵΪ{@value}
	 */
	private String userName = "admin";
	/**
	 * ����,��ʼֵΪ{@value}
	 */
	
	private String passWord = "12345";
	/**
	 * ����
	 */
	private int score = 0;
	/**
	 * ÿ�ε��"��һ��"��ť��i ���� 1����ͨ��i�����Ա� answer�����е��ַ��ж϶Դ�
	 */
	private int i = 0;
	/**
	 * ��ȡi��ֵ
	 * @return  i ��ֵ
	 */
	public int getI() {
		return i;
	}
	/**
	 * �ı�i��ֵ��ѡ���ļ�������Ϊ0�������һ�������1
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
	 * ��ȡscore��ֵ
	 * @return score��ֵ
	 */
	public int getScore() {
		return score;
	}
	/**
	 * �ش���ȷ��score����1
	 * @param c checkBoxGroup��ѡ���ѡ��
	 */
	public void setScore(char c) {
		if(c == (CorrectAnswer.answer[i])){
			score++;
		}
	}
	/**
	 * �����û���
	 * @return �û���
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * �����û���
	 * @param userName �û��������ע�����û���������ȡ���ַ���
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * ��������
	 * @return ����
	 */
	public String getPassWord() {
		return passWord;
	}
	/**
	 * ��������
	 * @param passWord ���룬���ע��������������ȡ�����ַ���
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
