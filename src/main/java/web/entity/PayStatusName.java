package web.entity;

import javax.persistence.*;

@Entity
@Table(name = "PAY_STATUS_NAME")
public class PayStatusName {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Наименование статуса оплаты*/
    @Column(name = "PAY_STATUS_NAME")
    private String payStatusName;

    @Column(name = "NOTE")
    private String note;

    public PayStatusName() {
    }

    public PayStatusName(String payStatusName, String note) {
        this.payStatusName = payStatusName;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayStatusName() {
        return payStatusName;
    }

    public void setPayStatusName(String payStatusName) {
        this.payStatusName = payStatusName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
