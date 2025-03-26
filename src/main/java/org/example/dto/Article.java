package org.example.dto;

public class Article extends Dto {

    private String updateDate;
    private String title;
    private String body;

    private int memberId;

    public Article(int id, String regDate, String updateDate, int memberId, String title, String body) {
        this.id = id;
        this.regDate = regDate;
        this.memberId = memberId;
        this.updateDate = updateDate;
        this.title = title;
        this.body = body;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
