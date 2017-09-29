package web.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "STUDY_PLAN")
public class StudyPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Название учебного плана*/
    @Column(name = "PLAN_NAME")
    private String planName;

    @Column(name = "NOTE")
    private String note;

    /*Связь с таблицей позиций учебного плана, у одного учебного плана может быть несколько позиций*/
    @OneToMany(mappedBy = "studyPlan", fetch = FetchType.LAZY)
    private List<StudyPlanItems> studyPlanItemsList;

    /*Дата начала учебного плана*/
    @Temporal(TemporalType.DATE)
    @Column(name = "START_STUDY")
    private Date startStudy;

    /*Дата окончания учебного плана*/
    @Temporal(TemporalType.DATE)
    @Column(name = "FINISH_STUDY")
    private Date finishStudy;

    public StudyPlan() {
    }

    public StudyPlan(String planName, String note, Date startStudy, Date finishStudy) {
        this.planName = planName;
        this.note = note;
        this.startStudy = startStudy;
        this.finishStudy = finishStudy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<StudyPlanItems> getStudyPlanItemsList() {
        return studyPlanItemsList;
    }

    public void setStudyPlanItemsList(List<StudyPlanItems> studyPlanItemsList) {
        this.studyPlanItemsList = studyPlanItemsList;
    }

    public Date getStartStudy() {
        return startStudy;
    }

    public void setStartStudy(Date startStudy) {
        this.startStudy = startStudy;
    }

    public Date getFinishStudy() {
        return finishStudy;
    }

    public void setFinishStudy(Date finishStudy) {
        this.finishStudy = finishStudy;
    }
}
