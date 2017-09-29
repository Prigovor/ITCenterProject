package web.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CONTACT_WITH_CLIENT")
public class ContactWithClient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Связь с таблицей заявок, у одной заявки может быть несколько контактов с клиентом*/
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "APPLICATION")
    private Applications applications1;

    /*Плановая дата связи с клиентом*/
    @Temporal(TemporalType.DATE)
    @Column(name = "PLAN_DATE_CONTACT")
    private Date planDateContact;

    /*Фактическая дата связи с клиентом*/
    @Temporal(TemporalType.DATE)
    @Column(name = "FACT_DATE_CONTACT")
    private Date factDateContact;

    @Column(name = "NOTE")
    private String note;

    public ContactWithClient() {
    }

    public ContactWithClient(Applications applications1, Date planDateContact, Date factDateContact, String note) {
        this.applications1 = applications1;
        this.planDateContact = planDateContact;
        this.factDateContact = factDateContact;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Applications getApplications1() {
        return applications1;
    }

    public void setApplications1(Applications applications1) {
        this.applications1 = applications1;
    }

    public Date getPlanDateContact() {
        return planDateContact;
    }

    public void setPlanDateContact(Date planDateContact) {
        this.planDateContact = planDateContact;
    }

    public Date getFactDateContact() {
        return factDateContact;
    }

    public void setFactDateContact(Date factDateContact) {
        this.factDateContact = factDateContact;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
