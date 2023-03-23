package com.hibernate.map.ManyToOne.example1;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question {

	@Id
	@Column(name = "Question_id")
	private int id;

//	@Column(name = "Question")
	private String question;

//	@OneToOne
//	private Answer answer;


//	@OneToMany(mappedBy = "question")
	@OneToMany(mappedBy = "question",fetch = FetchType.LAZY)
	private List<Answer> answers;

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", answers=" + answers + "]";
	}

	public Question(int id, String question, List<Answer> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Question() {
		super();
	}

//	public Answer getAnswer() {
//		return answer;
//	}
//
//	public void setAnswer(Answer answer) {
//		this.answer = answer;
//	}
//
//	public Question(int id, String question, Answer answer) {
//		super();
//		this.id = id;
//		this.question = question;
//		this.answer = answer;
//	}
//	
//	@Override
//	public String toString() {
//		return "Question [id=" + id + ", question=" + question + ", answer=" + answer + "]";
//	}
}
