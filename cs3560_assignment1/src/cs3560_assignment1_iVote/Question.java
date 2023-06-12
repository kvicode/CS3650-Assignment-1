package cs3560_assignment1_iVote;
import java.util.List;

public class Question {
	private String questionType;
	private List<String> questionAnswers;
	
	public Question(String questionType, List<String> questionAnswers) {
		this.questionType = questionType;
		this.questionAnswers = questionAnswers;
	}
	
	public String getQuestionType() {
		
		return questionType;
	}
	
	public List<String> getQuestionAnswers(){
		
		return questionAnswers;
	}
}
