package de.htw_berlin.plan_it;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class EventDTO {

    private Long id;

    private String title;
    private String module;
    private String professor;

    private LocalDateTime start;
    private LocalDateTime end;

    private LocalDateTime deadline;

    //only for lecture events or exams
    private String room;

    //only for deadline events
    private String status;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getModule() {
        return module;
    }

    public String getProfessor() {
        return professor;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public String getRoom() {
        return room;
    }

    public String getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public void setRoom(String classroom) {
        this.room = classroom;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
