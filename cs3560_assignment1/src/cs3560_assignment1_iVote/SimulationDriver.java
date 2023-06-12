package cs3560_assignment1_iVote;

import java.util.*;

public class SimulationDriver {
    private static final String[] MULTIPLE_CHOICE_ANSWERS = { "A", "B", "C", "D" };
    private static final String[] SINGLE_CHOICE_ANSWERS = { "1. Right", "2. Wrong" };

    public static void main(String[] args) {
        // Randomly generate the number of students
        Random random = new Random();
        int numStudents = random.nextInt(41); // Generate a random number between 0 and 40

        // Multiple Choice Question
        System.out.println("Multiple Choice Question: A, B, C or D");
        String questionType1 = "Multiple Choice";
        List<String> candidateAnswers1 = Arrays.asList(MULTIPLE_CHOICE_ANSWERS);

        // Create question and answers
        Question question1 = new Question(questionType1, candidateAnswers1);
        VotingService votingService1 = new VotingService(question1);

        // Random students and answers
        List<Student> students1 = new ArrayList<>();

        for (int i = 0; i < numStudents; i++) {
            String id = generateRandomID();
            String answer = MULTIPLE_CHOICE_ANSWERS[random.nextInt(MULTIPLE_CHOICE_ANSWERS.length)];
            students1.add(new Student(id, answer));
        }

        // Send answers to VotingService
        for (Student student : students1) {
            votingService1.answerSubmit(student);
        }

        // Display Results
        System.out.println("Results:");
        votingService1.outputStats();

        System.out.println();

        // Single Choice Question
        System.out.println("Single Choice Question: Right or Wrong?");
        String questionType2 = "Single Choice";
        List<String> candidateAnswers2 = Arrays.asList(SINGLE_CHOICE_ANSWERS);

        Question question2 = new Question(questionType2, candidateAnswers2);
        VotingService votingService2 = new VotingService(question2);

        List<Student> students2 = new ArrayList<>();

        for (int i = 0; i < numStudents; i++) {
            String id = generateRandomID();
            String answer = SINGLE_CHOICE_ANSWERS[random.nextInt(SINGLE_CHOICE_ANSWERS.length)];
            students2.add(new Student(id, answer));
        }

        for (Student student : students2) {
            votingService2.answerSubmit(student);
        }

        System.out.println("Results:");
        votingService2.outputStats();

        System.out.println();

        // Display total number of students
        System.out.println("Total number of students: " + numStudents);
    }

    public static String generateRandomID() {
        Random random = new Random();
        int length = 6;
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
}
