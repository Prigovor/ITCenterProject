package web.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "STUDY_PLAN_ITEMS")
public class StudyPlanItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Связь с учебной программой, у одной программы может быть несколько позиций*/
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "STUDY_PLAN")
    private StudyPlan studyPlan;

    /*Наименование пункта учебной программы*/
    @Column(name = "TITLE")
    private String title;

    /*Количество занятий по пункту программы*/
    @Column(name = "NUMBER_OF_CLASSES")
    private Integer numberOfClasses;

    /*Дата начала пункта программы*/
    @Temporal(TemporalType.DATE)
    @Column(name = "START_ITEM")
    private Date startItem;

    /*Дата окончания пункта программы*/
    @Temporal(TemporalType.DATE)
    @Column(name = "FINISH_ITEM")
    private Date finishItem;

    @Column(name = "NOTE")
    private String note;

    public StudyPlanItems() {
    }

    public StudyPlanItems(StudyPlan studyPlan, String title, Integer numberOfClasses, Date startItem, Date finishItem, String note) {
        this.studyPlan = studyPlan;
        this.title = title;
        this.numberOfClasses = numberOfClasses;
        this.startItem = startItem;
        this.finishItem = finishItem;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StudyPlan getStudyPlan() {
        return studyPlan;
    }

    public void setStudyPlan(StudyPlan studyPlan) {
        this.studyPlan = studyPlan;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(Integer numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public Date getStartItem() {
        return startItem;
    }

    public void setStartItem(Date startItem) {
        this.startItem = startItem;
    }

    public Date getFinishItem() {
        return finishItem;
    }

    public void setFinishItem(Date finishItem) {
        this.finishItem = finishItem;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
