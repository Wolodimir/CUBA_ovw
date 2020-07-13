package com.company.cuba.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

@NamePattern("%s|topic")
@Table(name = "CUBA_SESSION")
@Entity(name = "cuba_Session")
public class Session extends StandardEntity {
    private static final long serialVersionUID = -3545273384883874092L;

    @NotNull
    @Column(name = "TOPIC", nullable = false)
    protected String topic;

    @NotNull
    @Column(name = "START_DATE", nullable = false)
    protected LocalDateTime startDate;

    @NotNull
    @Column(name = "DURATION", nullable = false)
    protected @Positive Integer duration;

    @NotNull
    @OnDelete(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SPEAKER_ID")
    protected Speaker speaker;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Transient
    @MetaProperty(related = {"startDate", "duration"})
    public LocalDateTime getEndDate(){
        return (startDate != null && duration != null)? startDate.plusHours(duration) : null;
    }
}