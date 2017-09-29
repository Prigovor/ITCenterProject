package web.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "COURSE_TABLE")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Название курса*/
    @Column(name = "COURSE_NAME")
    private String courseName;

    /*Связь с таблицей характеристик курса, в разное время у курса могут быть разные параметры: цена, длительность...*/
    @OneToMany(mappedBy = "course1", fetch = FetchType.LAZY)
    private List<CourseParameters> courseParametersList;

    /*Связь с базой учебных групп, для курса может быть несколько групп*/
    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private List<Group> groupList;

    @Column(name = "NOTE")
    private String note;

    public Course() {
    }

    public Course(String courseName, String note) {
        this.courseName = courseName;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<CourseParameters> getCourseParametersList() {
        return courseParametersList;
    }

    public void setCourseParametersList(List<CourseParameters> courseParametersList) {
        this.courseParametersList = courseParametersList;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
