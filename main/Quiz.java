import java.util.Scanner;

public class Quiz {

	private Scanner scanner = new Scanner(System.in);
	
	public Quiz() {
		startQuiz();
	}
	
	public void startQuiz() {
		
		while(true) {
			System.out.println("PLEASE SELECT ONE OF THE OPTIONS BELOW: \n1. Trainer \n2. Student\n3. Quit");
			int option = scanner.nextInt();
			if(option == 1) {
				//trainer, create questions
			}else if(option == 2) {
				//student, show questions
			}else if(option ==3) {
				System.out.println("Ending the program.");
				break;
			}else {
				System.out.println("Invalid Choice");
			}
		}
	}
	
	public void createQuestion(String text) {
		
	}
	
	public void createOptions(String[] options) {
		
	}
}
