package web.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CLIENT_STATUS")
public class ClientStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Связь с базой клиентов, у одного клиента может быть история статусов*/
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "CLIENT")
    private Client client2;

    /*Наименование статуса - стандартный вариант*/
    @OneToOne
    @Column(name = "CLIENT_STATUS_NAME")
    private ClientStatusName clientStatusName;

    /*Дата установки статуса клиента*/
    @Temporal(TemporalType.DATE)
    @Column(name = "STATUS_SET_DATE")
    private Date statusSetDate;

    @Column(name = "NOTE")
    private String note;

    public ClientStatus() {
    }

    public ClientStatus(Client client2, ClientStatusName clientStatusName, Date statusSetDate, String note) {
        this.client2 = client2;
        this.clientStatusName = clientStatusName;
        this.statusSetDate = statusSetDate;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient2() {
        return client2;
    }

    public void setClient2(Client client2) {
        this.client2 = client2;
    }

    public ClientStatusName getClientStatusName() {
        return clientStatusName;
    }

    public void setClientStatusName(ClientStatusName clientStatusName) {
        this.clientStatusName = clientStatusName;
    }

    public Date getStatusSetDate() {
        return statusSetDate;
    }

    public void setStatusSetDate(Date statusSetDate) {
        this.statusSetDate = statusSetDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
