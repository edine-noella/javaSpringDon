package com.springDonatien.springProj.studentMng.models;

import com.springDonatien.springProj.studentMng.enums.AssignmentStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
@Entity
@Table(name = "bed_assignment")
public class BedAssignment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String assignedOn;
    private String assignedBy;
    private String realesedOn;
    @Enumerated(EnumType.STRING)
    private AssignmentStatus status;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Bed bed;

    public BedAssignment() {
    }
    public BedAssignment(Student student, Bed bed, String assignedBy, AssignmentStatus status) {
        this.assignedOn = LocalDateTime.now().toString();
        this.realesedOn = null;
        this.assignedBy = assignedBy;
        this.status = status;
        this.bed = bed;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAssignedOn() {
        return assignedOn;
    }
    public void setAssignedOn(String assignedOn) {
        this.assignedOn = assignedOn;
    }
    public String getAssignedBy() {
        return assignedBy;
    }
    public void setAssignedBy(String assignedBy) {
        this.assignedBy = assignedBy;
    }
    public String getRealesedOn() {
        return realesedOn;
    }
    public void setRealesedOn(String realesedOn) {
        this.realesedOn = realesedOn;
    }
    public AssignmentStatus getStatus() {
        return status;
    }
    public void setStatus(AssignmentStatus status) {
        this.status = status;
    }
}