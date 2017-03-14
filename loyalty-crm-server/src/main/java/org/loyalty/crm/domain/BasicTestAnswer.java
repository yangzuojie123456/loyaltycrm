package org.loyalty.crm.domain;

import java.io.Serializable;

public class BasicTestAnswer implements Serializable {
    private static final long serialVersionUID = 3184136542485334367L;
    public Long id;
    public Long user_test_id;
    public String question_id;
    public String question_name;
    public String answer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_test_id() {
        return user_test_id;
    }

    public void setUser_test_id(Long user_test_id) {
        this.user_test_id = user_test_id;
    }

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    public String getQuestion_name() {
        return question_name;
    }

    public void setQuestion_name(String question_name) {
        this.question_name = question_name;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
