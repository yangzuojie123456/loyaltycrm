package org.loyalty.crm.domain;

import java.io.Serializable;

public class EvaluationPaperQuestion implements Serializable {
    private static final long serialVersionUID = 3761830817030062905L;
    public Long id;
    public Long test_paper_id;
    public Integer question_type;
    public String name;
    public String options;
    public String rule;
    public Integer sort_flag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTest_paper_id() {
        return test_paper_id;
    }

    public void setTest_paper_id(Long test_paper_id) {
        this.test_paper_id = test_paper_id;
    }

    public Integer getQuestion_type() {
        return question_type;
    }

    public void setQuestion_type(Integer question_type) {
        this.question_type = question_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public Integer getSort_flag() {
        return sort_flag;
    }

    public void setSort_flag(Integer sort_flag) {
        this.sort_flag = sort_flag;
    }
}
