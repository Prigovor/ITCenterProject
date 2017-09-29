package web.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "GROUP_TABLE")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Номер группы*/
    @Column(name = "GROUP_NUMBER")
    private String groupNumber;

    /*Преподаватель, у преподавателя может быть несколько групп*/
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "TEACHER")
    private Teacher teacher;

    /*Курс, у курса может быть несколько групп*/
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "COURSE")
    private Course course;

    /*План обучения, у группы один план обучения*/
    @OneToOne
    @Column(name = "STUDY_PLAN")
    private StudyPlan studyPlan;

    /*Количество студентов в группе*/
    @Column(name = "NUMBER_OF_STUDENT")
    private Integer numberOfStudents;

    @Column(name = "NOTE")
    private String note;

    /*Связь с таблицей клиентов, группа состоит из нескольких клиентов*/
    @ManyToMany(mappedBy = "", fetch = FetchType.LAZY)
    private List<Client> clientList;

    public Group() {
    }

    public Group(String groupNumber, Teacher teacher, Course course, StudyPlan studyPlan, Integer numberOfStudents, String note) {
        this.groupNumber = groupNumber;
        this.teacher = teacher;
        this.course = course;
        this.studyPlan = studyPlan;
        this.numberOfStudents = numberOfStudents;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public StudyPlan getStudyPlan() {
        return studyPlan;
    }

    public void setStudyPlan(StudyPlan studyPlan) {
        this.studyPlan = studyPlan;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
}
