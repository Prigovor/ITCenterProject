package web.entity;

import javax.persistence.*;

@Entity
@Table(name = "TEACHER_STATUS_NAME")
public class TeacherStatusName {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Наименование статуса преподавателя*/
    @Column(name = "TEACHER_STATUS_NAME")
    private String teacherStatusName;

    @Column(name = "NOTE")
    private String note;

    public TeacherStatusName() {
    }

    public TeacherStatusName(String teacherStatusName, String note) {
        this.teacherStatusName = teacherStatusName;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeacherStatusName() {
        return teacherStatusName;
    }

    public void setTeacherStatusName(String teacherStatusName) {
        this.teacherStatusName = teacherStatusName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
