package web.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CLIENT_PASSPORT")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Серия паспорта*/
    @Column(name = "PASSPORT_SERIES")
    private String passportSeries;

    /*Номер паспорта*/
    @Column(name = "PASSPORT_NUMBER")
    private String passportNumber;

    /*Дата выдачи паспорта*/
    @Temporal(TemporalType.DATE)
    @Column(name = "PASSPORT_ISSUING_DATE")
    private Date passportIssuingDate;

    /*Кем выдан паспорт*/
    @Column(name = "PASSPORT_ISSUING_SUBJECT")
    private String passportIssuingSubject;

    /*Адрес прописки*/
    @OneToOne
    @Column(name = "PASSPORT_ADDRESS")
    private Address passportAddress;

    public Passport() {
    }

    public Passport(String passportSeries, String passportNumber, Date passportIssuingDate, String passportIssuingSubject, Address passportAddress) {
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.passportIssuingDate = passportIssuingDate;
        this.passportIssuingSubject = passportIssuingSubject;
        this.passportAddress = passportAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Date getPassportIssuingDate() {
        return passportIssuingDate;
    }

    public void setPassportIssuingDate(Date passportIssuingDate) {
        this.passportIssuingDate = passportIssuingDate;
    }

    public String getPassportIssuingSubject() {
        return passportIssuingSubject;
    }

    public void setPassportIssuingSubject(String passportIssuingSubject) {
        this.passportIssuingSubject = passportIssuingSubject;
    }

    public Address getPassportAddress() {
        return passportAddress;
    }

    public void setPassportAddress(Address passportAddress) {
        this.passportAddress = passportAddress;
    }
}
