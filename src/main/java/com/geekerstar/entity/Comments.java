package com.geekerstar.entity;

/**
 * @Author: Geekerstar(QQ : 247507792)
 * @Date: 2018/9/6 14:33
 * @Description:
 */
public class Comments {
    private long id;
    private long articleId;
    private String commIp;
    private String comment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public String getCommIp() {
        return commIp;
    }

    public void setCommIp(String commIp) {
        this.commIp = commIp;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
