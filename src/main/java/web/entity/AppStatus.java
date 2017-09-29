package web.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "APPLICATION_STATUS")
public class AppStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Заявка, одной заявке может соответствовать несколько состояний обработки*/
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "APPLICATIONS")
    private Applications applications;

    /*Дата изменеия статуса обработки заявки*/
    @Temporal(TemporalType.DATE)
    @Column(name = "CHANGE_STATUS_DATE")
    private Date changeStatusDate;

    /*Статус обработки заявки*/
    @OneToOne
    @Column(name = "APP_STATUS_MANE")
    private AppStatusName appStatusName;

    @Column(name = "NOTE")
    private String note;

    public AppStatus() {
    }

    public AppStatus(Applications applications, Date changeStatusDate, AppStatusName appStatusName, String note) {
        this.applications = applications;
        this.changeStatusDate = changeStatusDate;
        this.appStatusName = appStatusName;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Applications getApplications() {
        return applications;
    }

    public void setApplications(Applications applications) {
        this.applications = applications;
    }

    public Date getChangeStatusDate() {
        return changeStatusDate;
    }

    public void setChangeStatusDate(Date changeStatusDate) {
        this.changeStatusDate = changeStatusDate;
    }

    public AppStatusName getAppStatusName() {
        return appStatusName;
    }

    public void setAppStatusName(AppStatusName appStatusName) {
        this.appStatusName = appStatusName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
