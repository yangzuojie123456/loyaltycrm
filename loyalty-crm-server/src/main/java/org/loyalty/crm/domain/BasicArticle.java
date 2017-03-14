package org.loyalty.crm.domain;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

public class BasicArticle implements Serializable{

    private static final long serialVersionUID = -8345291947189875363L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Long getHot() {
        return hot;
    }

    public void setHot(Long hot) {
        this.hot = hot;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }


    private Long id;
    @NotEmpty(message="title不能为Null")
    private String title;
    private String pic;
    private String content;
    private String keyWord;
    private String channel;
    private Long hot;
    private Long createTime;


}
