package cs3560_assignment1_iVote;

public class Student {
	private String id;
	private String answer;
	
	public Student(String id, String answer) {
		
		this.id = id;
		this.answer = answer;
	}
	
	public String getID() {
		
		return id;
		
	}
	
	public String getAnswer() {
		return answer;
	}
}
