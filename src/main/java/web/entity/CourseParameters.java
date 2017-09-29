package web.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COURSE_STATUS_NAME")
public class CourseParameters {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Актуальность данных параметров курса с... (дата)*/
    @Temporal(TemporalType.DATE)
    @Column(name = "ACTUAL_WITH")
    private Date actualWith;

    /*Актуальность данных параметров курса до... (дата)*/
    @Temporal(TemporalType.DATE)
    @Column(name = "ACTUAL_TO")
    private Date actualTo;

    /*Стоимость курса в актуальный период*/
    @Column(name = "COURSE_PRICE")
    private Double coursePrice;

    /*Длительность курса в актуальный период*/
    @Column(name = "COURSE_DURATION")
    private Double courseDuration;

    /*Связь с таблицей курсов, у одного курса может быть несколько состояний параметров в разное время: цена, длительность...*/
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "COURSE")
    private Course course1;

    @Column(name = "NOTE")
    private String note;

    public CourseParameters() {
    }

    public CourseParameters(Date actualWith, Date actualTo, Double coursePrice, Double courseDuration, Course course1, String note) {
        this.actualWith = actualWith;
        this.actualTo = actualTo;
        this.coursePrice = coursePrice;
        this.courseDuration = courseDuration;
        this.course1 = course1;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getActualWith() {
        return actualWith;
    }

    public void setActualWith(Date actualWith) {
        this.actualWith = actualWith;
    }

    public Date getActualTo() {
        return actualTo;
    }

    public void setActualTo(Date actualTo) {
        this.actualTo = actualTo;
    }

    public Double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(Double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public Double getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(Double courseDuration) {
        this.courseDuration = courseDuration;
    }

    public Course getCourse1() {
        return course1;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
