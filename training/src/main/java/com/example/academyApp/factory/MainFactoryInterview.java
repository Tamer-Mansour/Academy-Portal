package com.example.academyApp.factory;

import java.util.ArrayList;
import java.util.List;

import com.example.academyApp.models.Interview;
import com.example.academyApp.models.Question;
import com.example.academyApp.models.enums.InterviewType;

public class MainFactoryInterview {
	private static String OneToOneInterviewQuestion = "Things to discuss during the \r\n" + "meeting\r\n"
			+ "(what do you want to discuss in \r\n" + "the meeting, points you want to \r\n" + "follow on)\r\n" + "";
	private static String EasyQonceptTechnicalInterviewQuestion = "Easy concept question (Verbal)";
	private static String MediumConceptTechnicalInterviewQuestion = "Medium concept question (Algorithm)";
	private static String NewConcepTechnicalInterviewQuestion = "New concept Questions";
	private static String aboutYourselfTechnicalInterviewQuestion = "Tell us more about yourself?";
	private static String aboutAxsosPersonalInterviewQuestion = "About AXSOS";
	private static String SelfAssessmentPersonalInterviewQuestion = "Self-assessment";
	private static String successMeanPersonalInterviewQuestion = "What does success mean to you?";
	private static String motivateYourselfPersonalInterviewQuestion = "How do you motivate yourself?";
	private static String aboutYourselfFistInterviewQuestion = "Tell us more about yourself?";
	private static String futureGoalsFistInterviewQuestion = "What are your future goals?";
	private static String joinAcademyFistInterviewQuestion = "Why do you want to join the Academy?";
	private static String expectationsFistInterviewQuestion = "What is your expectations out of this \r\n" + "program?";
	private static String committedFistInterviewQuestion = ": How committed will you be, especially in \r\n"
			+ "this fast-changing situation we live in and how \r\n"
			+ "will cope with changes (online training …. Etc.) ";

	public static Interview creatInterviewByType(InterviewType type) {
		switch (type) {
		case ONE_ON_ONE:
			return generateOneToOne();
		case PERSONAL:
			return generatePersonal();
		case TECHNICAL:
			return generateTechnical();
		case FIRST:
			return generateFirst();

		default:
			return new Interview();
		}
	}

	/**
	 * method to generate One to One interview and add questions to it.
	 * 
	 * @return the interview
	 */
	public static Interview generateOneToOne() {
		Interview interview = new Interview();
		interview.setType(InterviewType.ONE_ON_ONE);
		Question q1 = new Question();

		q1.setQuestionText(OneToOneInterviewQuestion);
		q1.setAnswer("");
		q1.setNotes("");
		List<Question> questions = new ArrayList<Question>();
		questions.add(q1);
		interview.setQuestions(questions);
		return interview;
	}

	/**
	 * method to generate technical interview and add questions to it.
	 * 
	 * @return interview
	 */
	public static Interview generateTechnical() {
		Interview interview = new Interview();
		interview.setType(InterviewType.TECHNICAL);
		List<Question> questions = new ArrayList<Question>();
		Question q1 = new Question();
		q1.setInterview(interview);
		q1.setQuestionText(EasyQonceptTechnicalInterviewQuestion);
		q1.setAnswer("");
		q1.setNotes("");
		Question q2 = new Question();
		q2.setInterview(interview);
		q2.setQuestionText(MediumConceptTechnicalInterviewQuestion);
		q2.setAnswer("");
		q2.setNotes("");
		Question q3 = new Question();
		q3.setInterview(interview);
		q3.setQuestionText(NewConcepTechnicalInterviewQuestion);
		q3.setAnswer("");
		q3.setNotes("");
		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		interview.setQuestions(questions);
		return interview;
	}

	/**
	 * method to generate personal interview and add questions to it.
	 * 
	 * @return interview
	 */
	public static Interview generatePersonal() {
		Interview interview = new Interview();
		interview.setType(InterviewType.PERSONAL);
		List<Question> questions = new ArrayList<Question>();
		Question q1 = new Question();

		q1.setQuestionText(aboutYourselfTechnicalInterviewQuestion);
		q1.setAnswer("");
		q1.setNotes("");
		Question q2 = new Question();
		q2.setInterview(interview);
		q2.setQuestionText(aboutAxsosPersonalInterviewQuestion);
		q2.setAnswer("");
		q2.setNotes("");
		Question q3 = new Question();
		q3.setInterview(interview);
		q3.setQuestionText(SelfAssessmentPersonalInterviewQuestion);
		q3.setAnswer("");
		q3.setNotes("");
		Question q4 = new Question();
		q4.setInterview(interview);
		q4.setQuestionText(successMeanPersonalInterviewQuestion);
		q4.setAnswer("");
		q4.setNotes("");
		Question q5 = new Question();
		q5.setInterview(interview);
		q5.setQuestionText(motivateYourselfPersonalInterviewQuestion);
		q5.setAnswer("");
		q5.setNotes("");
		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		questions.add(q4);
		questions.add(q5);
		interview.setQuestions(questions);

		return interview;
	}

	/**
	 * method to generate fist interview and add questions to it.
	 * 
	 * @return interview
	 */
	public static Interview generateFirst() {
		Interview interview = new Interview();
		interview.setType(InterviewType.FIRST);
		List<Question> questions = new ArrayList<Question>();
		Question q1 = new Question();
		q1.setInterview(interview);
		q1.setQuestionText(aboutYourselfFistInterviewQuestion);
		q1.setAnswer("");
		q1.setNotes("");
		Question q2 = new Question();
		q2.setInterview(interview);
		q2.setQuestionText(futureGoalsFistInterviewQuestion);
		q2.setAnswer("");
		q2.setNotes("");
		Question q3 = new Question();
		q3.setInterview(interview);
		q3.setQuestionText(joinAcademyFistInterviewQuestion);
		q3.setAnswer("");
		q3.setNotes("");
		Question q4 = new Question();
		q4.setInterview(interview);
		q4.setQuestionText(expectationsFistInterviewQuestion);
		q4.setAnswer("");
		q4.setNotes("");
		Question q5 = new Question();
		q5.setInterview(interview);
		q5.setQuestionText(committedFistInterviewQuestion);
		q5.setAnswer("");
		q5.setNotes("");
		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		questions.add(q4);
		questions.add(q5);
		interview.setQuestions(questions);
		return interview;
	}
}
