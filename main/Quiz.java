import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Quiz {

	private Scanner scanner;
    private List<Question> questionsList = new ArrayList<>();
    private List<Student> studentScores = new ArrayList<>();
	
	public Quiz() {
		this.scanner = new Scanner(System.in);
		startQuiz();
	}
	
	public void startQuiz() {
		
		while(true) {
			System.out.println("PLEASE SELECT ONE OF THE OPTIONS BELOW: \n1. Trainer \n2. Student\n3. Show Scores \n4. Quit");
			int option = scanner.nextInt();
			if(option == 1) {
				//trainer, create questions
				createQuestions();
			}else if(option == 2) {
				//student, show questions
				showQuizQuestions();
			}else if(option == 3) {
				showScores();
			}else if(option == 4) {
				scanner.close();
				System.out.println("Ending the program.");
				break;
			}else {
				System.out.println("Invalid Choice");
			}
		}
	}
	
	public void createQuestions() {
		//loop over to create 3 questions with options
		for(int i=0; i<2; i++) {
			System.out.println("Type in the question for Question# " + (i+1) +"\n");
			String[] options = new String[4];
			String questionText = scanner.next();
			for(int j = 0; j<4;j++) {
				System.out.println("Type in the option# " + (j+1) + " for Question# " + (i+1) + "\n");
				options[j] = scanner.next();
			}
			System.out.println("\nType in the answer option for Question# " + (i+1));
			String answerOption = scanner.next();
			
			Question question = new Question(questionText, options, answerOption);
			questionsList.add(question);
		}
		System.out.println("Questions created Successfully.");
	}
	
	public void showQuizQuestions() {
		if(questionsList.size() == 0) {
			System.out.println("No Questions added yet.\n\n");
			return;
		}
		System.out.println("What is your name?\n");
		String name = scanner.next();
		Student s1 = new Student(name, 0);		
		
		for(Question q : questionsList) {
			System.out.println(q.getAnswer() + "   **********************ANSWER");
			System.out.println(q.getText());
			String[] options = q.getOptions();
			for(int i=0;i<options.length;i++) {
				System.out.println(i+1 + ". " + options[i]);
			}
			System.out.println("What is your answer:\n");
			String answer = scanner.next();
			System.out.println("The asnwer is " + answer + 1 +" AND correct " + q.getAnswer() + 1);
			if(answer.equals(q.getAnswer())) {
				s1.setScore(s1.getScore() + 1);
			}else {
				System.out.println("Value different");
			}
			System.out.println("#################### " + s1.getScore());
			
		}
		studentScores.add(s1);

		System.out.println("\n************** QUIZ SUBMITTED **********************\n\n");
	}
	
	public void showScores() {
		if(studentScores.size() == 0) {
			System.out.println("No Quiz taken yet.");
			return;
		}
		System.out.println("NAME\t\tSCORE");
		for(Student s : studentScores) {
			System.out.println(s.getName() + "\t\t" + s.getScore());
		}
	}
	
}
