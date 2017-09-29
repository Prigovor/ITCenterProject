package web.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TEACHER_STATUS")
public class TeactherStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Преподаватель, у одного преподавателя может быть несколько статусов*/
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "TEACHER")
    private Teacher teacher;

    /*Наименование статуса преподавателя - набор стандартных значений*/
    @OneToOne
    @Column(name = "TEACHER_STATUS_NAME")
    private TeacherStatusName teacherStatusName;

    /*Дата установки статуса преподавателя*/
    @Temporal(TemporalType.DATE)
    @Column(name = "SET_STATUS_DATE")
    private Date setStatusDate;

    @Column(name = "NOTE")
    private String note;

    public TeactherStatus() {
    }

    public TeactherStatus(Teacher teacher, TeacherStatusName teacherStatusName, Date setStatusDate, String note) {
        this.teacher = teacher;
        this.teacherStatusName = teacherStatusName;
        this.setStatusDate = setStatusDate;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public TeacherStatusName getTeacherStatusName() {
        return teacherStatusName;
    }

    public void setTeacherStatusName(TeacherStatusName teacherStatusName) {
        this.teacherStatusName = teacherStatusName;
    }

    public Date getSetStatusDate() {
        return setStatusDate;
    }

    public void setSetStatusDate(Date setStatusDate) {
        this.setStatusDate = setStatusDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
