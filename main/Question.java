
public class Question {

	private String text;
	private String[] options;
	private String answer;
	private static int count = 0;
	
	public Question(String text, String[] options,String answerOption) {
		this.text = text;
		this.options = options;
		this.answer = answerOption;
		Question.setCount(Question.getCount() + 1);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Question.count = count;
	}
	
}
