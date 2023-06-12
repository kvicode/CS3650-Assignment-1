package cs3560_assignment1_iVote;

import java.util.HashMap;
import java.util.Map;

public class VotingService {
	
	private Question question;
	private Map<String, Integer> answerAmount;
	
	public VotingService (Question question) {
		
		this.question = question;
		this.answerAmount = new HashMap<>();
	}
	
	public void answerSubmit(Student student) {
		
		answerAmount.put(student.getAnswer(), answerAmount.getOrDefault(student.getAnswer(), 0) + 1);
	}
	
	public void outputStats() {
		
		for (String answer : question.getQuestionAnswers()) {
			int count = answerAmount.getOrDefault(answer, 0);
			System.out.println(answer + " : " + count);
		}
	}
}
