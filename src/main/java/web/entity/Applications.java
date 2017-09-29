package web.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "APPLICATIONS_TABLE")
public class Applications {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Номер заявки*/
    @Column(name = "APP_NUMBER")
    private String appNumber;

    /*Дата отправки/поступления заявки*/
    @Temporal(TemporalType.DATE)
    @Column(name = "SEND_APP_DATE")
    private Date sendAppDate;

    /*Клиент, у одного клиента может быть несколько заявок*/
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "CLIENT_ID")
    private Client client;

    /*Статус обработки заявки, у заявки может быть несколько статусов обработки*/
    @OneToMany(mappedBy = "applications", fetch = FetchType.LAZY)
    private List<AppStatus> appStatusList;

    /*Контакт/ы с клиентом по данной заявке, по заявке может быть несколько контактов с клиентом*/
    @OneToMany(mappedBy = "applications1", fetch = FetchType.LAZY)
    private List<ContactWithClient> contactWithClientList;

    /*Курс на который была отправлена заявка*/
    @OneToOne
    @Column(name = "COURSE")
    private Course course;

    @Column(name = "NOTE")
    private String note;

    public Applications() {
    }

    public Applications(String appNumber, Date sendAppDate, Client client,Course course, String note) {
        this.appNumber = appNumber;
        this.sendAppDate = sendAppDate;
        this.client = client;
        this.course = course;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppNumber() {
        return appNumber;
    }

    public void setAppNumber(String appNumber) {
        this.appNumber = appNumber;
    }

    public Date getSendAppDate() {
        return sendAppDate;
    }

    public void setSendAppDate(Date sendAppDate) {
        this.sendAppDate = sendAppDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<AppStatus> getAppStatusList() {
        return appStatusList;
    }

    public void setAppStatusList(List<AppStatus> appStatusList) {
        this.appStatusList = appStatusList;
    }

    public List<ContactWithClient> getContactWithClientList() {
        return contactWithClientList;
    }

    public void setContactWithClientList(List<ContactWithClient> contactWithClientList) {
        this.contactWithClientList = contactWithClientList;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
