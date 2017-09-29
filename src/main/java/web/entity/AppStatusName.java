package web.entity;

import javax.persistence.*;

@Entity
@Table(name = "APP_STATUS_NAME")
public class AppStatusName {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Наименование статуса обработки заявки*/
    @Column(name = "APP_STATUS_NAME")
    private String appStatusName;

    @Column(name = "NOTE")
    private String note;

    public AppStatusName() {
    }

    public AppStatusName(String appStatusName, String note) {
        this.appStatusName = appStatusName;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppStatusName() {
        return appStatusName;
    }

    public void setAppStatusName(String appStatusName) {
        this.appStatusName = appStatusName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
