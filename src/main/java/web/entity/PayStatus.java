package web.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PAY_STATUS")
public class PayStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Связь с таблицей клиентов, у одного клиента может быть несколько транзакций оплаты*/
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "CLIENT")
    private Client client1;

    /*Наименование статуса оплаты*/
    @OneToOne
    @Column(name = "PAY_STATUS_NAME")
    private PayStatusName payStatusName;

    /*Дата транзакции оплаты*/
    @Temporal(TemporalType.DATE)
    @Column(name = "PAY_DATE")
    private Date payDate;

    /*Сумма текущей транзакции оплаты*/
    @Column(name = "PAY_SUM")
    private Double paySum;

    /*Всего заплачено за текущий курс обучения*/
    @Column(name = "ALL_PAY_FOR_COURSE")
    private Double allPayForCourse;

    /*Остаток оплаты за текущий курс обучения*/
    @Column(name = "REMAINS_TO_PAY")
    private Double remainsToPay;

    @Column(name = "NOTE")
    private String note;

    public PayStatus() {
    }

    public PayStatus(Client client1, PayStatusName payStatusName, Date payDate, Double paySum, Double allPayForCourse, Double remainsToPay, String note) {
        this.client1 = client1;
        this.payStatusName = payStatusName;
        this.payDate = payDate;
        this.paySum = paySum;
        this.allPayForCourse = allPayForCourse;
        this.remainsToPay = remainsToPay;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient1() {
        return client1;
    }

    public void setClient1(Client client1) {
        this.client1 = client1;
    }

    public PayStatusName getPayStatusName() {
        return payStatusName;
    }

    public void setPayStatusName(PayStatusName payStatusName) {
        this.payStatusName = payStatusName;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Double getPaySum() {
        return paySum;
    }

    public void setPaySum(Double paySum) {
        this.paySum = paySum;
    }

    public Double getAllPayForCourse() {
        return allPayForCourse;
    }

    public void setAllPayForCourse(Double allPayForCourse) {
        this.allPayForCourse = allPayForCourse;
    }

    public Double getRemainsToPay() {
        return remainsToPay;
    }

    public void setRemainsToPay(Double remainsToPay) {
        this.remainsToPay = remainsToPay;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
