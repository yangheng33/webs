package com.amar.webs.model;

import java.io.Serializable;
import java.util.Date;

public class News implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.editorid
     *
     * @mbggenerated
     */
    private Integer editorid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.starttime
     *
     * @mbggenerated
     */
    private Date starttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.releasetime
     *
     * @mbggenerated
     */
    private Date releasetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.lastedittime
     *
     * @mbggenerated
     */
    private Date lastedittime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.categoryid
     *
     * @mbggenerated
     */
    private Integer categoryid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.titlepic
     *
     * @mbggenerated
     */
    private String titlepic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.sourceby
     *
     * @mbggenerated
     */
    private String sourceby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table news
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.id
     *
     * @return the value of news.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.id
     *
     * @param id the value for news.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.editorid
     *
     * @return the value of news.editorid
     *
     * @mbggenerated
     */
    public Integer getEditorid() {
        return editorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.editorid
     *
     * @param editorid the value for news.editorid
     *
     * @mbggenerated
     */
    public void setEditorid(Integer editorid) {
        this.editorid = editorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.starttime
     *
     * @return the value of news.starttime
     *
     * @mbggenerated
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.starttime
     *
     * @param starttime the value for news.starttime
     *
     * @mbggenerated
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.releasetime
     *
     * @return the value of news.releasetime
     *
     * @mbggenerated
     */
    public Date getReleasetime() {
        return releasetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.releasetime
     *
     * @param releasetime the value for news.releasetime
     *
     * @mbggenerated
     */
    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.lastedittime
     *
     * @return the value of news.lastedittime
     *
     * @mbggenerated
     */
    public Date getLastedittime() {
        return lastedittime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.lastedittime
     *
     * @param lastedittime the value for news.lastedittime
     *
     * @mbggenerated
     */
    public void setLastedittime(Date lastedittime) {
        this.lastedittime = lastedittime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.status
     *
     * @return the value of news.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.status
     *
     * @param status the value for news.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.title
     *
     * @return the value of news.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.title
     *
     * @param title the value for news.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.content
     *
     * @return the value of news.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.content
     *
     * @param content the value for news.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.categoryid
     *
     * @return the value of news.categoryid
     *
     * @mbggenerated
     */
    public Integer getCategoryid() {
        return categoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.categoryid
     *
     * @param categoryid the value for news.categoryid
     *
     * @mbggenerated
     */
    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.titlepic
     *
     * @return the value of news.titlepic
     *
     * @mbggenerated
     */
    public String getTitlepic() {
        return titlepic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.titlepic
     *
     * @param titlepic the value for news.titlepic
     *
     * @mbggenerated
     */
    public void setTitlepic(String titlepic) {
        this.titlepic = titlepic == null ? null : titlepic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.sourceby
     *
     * @return the value of news.sourceby
     *
     * @mbggenerated
     */
    public String getSourceby() {
        return sourceby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.sourceby
     *
     * @param sourceby the value for news.sourceby
     *
     * @mbggenerated
     */
    public void setSourceby(String sourceby) {
        this.sourceby = sourceby == null ? null : sourceby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        News other = (News) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEditorid() == null ? other.getEditorid() == null : this.getEditorid().equals(other.getEditorid()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getReleasetime() == null ? other.getReleasetime() == null : this.getReleasetime().equals(other.getReleasetime()))
            && (this.getLastedittime() == null ? other.getLastedittime() == null : this.getLastedittime().equals(other.getLastedittime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getTitlepic() == null ? other.getTitlepic() == null : this.getTitlepic().equals(other.getTitlepic()))
            && (this.getSourceby() == null ? other.getSourceby() == null : this.getSourceby().equals(other.getSourceby()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEditorid() == null) ? 0 : getEditorid().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getReleasetime() == null) ? 0 : getReleasetime().hashCode());
        result = prime * result + ((getLastedittime() == null) ? 0 : getLastedittime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getTitlepic() == null) ? 0 : getTitlepic().hashCode());
        result = prime * result + ((getSourceby() == null) ? 0 : getSourceby().hashCode());
        return result;
    }
}