package web.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TEACHER_TABLE")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Связь с таблицей групп, у преподавателя может быть несколько групп*/
    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY)
    private List<Group> groupList;

    /*Связь с таблицей статусов преподавателя, может быть несколько статусов в разные периоды сотрудничества*/
    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY)
    private List<TeactherStatus> teactherStatusList;

    /*Фамилия*/
    @Column(name = "SURNAME")
    private String surName;

    /*Имя*/
    @Column(name = "NAME")
    private String name;

    /*Отчество*/
    @Column(name = "LASTNAME")
    private String lastName;

    /*Номер телефона, один или несколько?*/
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    /*Адрес электронной почты, один или несколько?*/
    @Column(name = "EMAIL")
    private String email;

    /*Адрес проживания*/
    @OneToOne
    @Column(name = "ADDRESS")
    private Address livingAddress;

    /*Паспортные данные*/
    @OneToOne
    @Column(name = "TEACHER_PASSPORT")
    private Passport teacherPassport;

    /*Код налогоплательщика*/
    @Column(name = "IPN")
    private Integer ipn;

    /*Зарплата*/
    @Column(name = "SALERY")
    private Double salery;

    @Column(name = "NOTE")
    private String note;

    public Teacher() {
    }

    public Teacher(String surName, String name, String lastName, String phoneNumber, String email, Address livingAddress, Passport teacherPassport, Integer ipn, Double salery, String note) {
        this.surName = surName;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.livingAddress = livingAddress;
        this.teacherPassport = teacherPassport;
        this.ipn = ipn;
        this.salery = salery;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public List<TeactherStatus> getTeactherStatusList() {
        return teactherStatusList;
    }

    public void setTeactherStatusList(List<TeactherStatus> teactherStatusList) {
        this.teactherStatusList = teactherStatusList;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getLivingAddress() {
        return livingAddress;
    }

    public void setLivingAddress(Address livingAddress) {
        this.livingAddress = livingAddress;
    }

    public Passport getTeacherPassport() {
        return teacherPassport;
    }

    public void setTeacherPassport(Passport teacherPassport) {
        this.teacherPassport = teacherPassport;
    }

    public Integer getIpn() {
        return ipn;
    }

    public void setIpn(Integer ipn) {
        this.ipn = ipn;
    }

    public Double getSalery() {
        return salery;
    }

    public void setSalery(Double salery) {
        this.salery = salery;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
