package web.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CLIENTS_TABLE")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Фамилия*/
    @Column(name = "SURNAME")
    private String surName;

    /*Имя*/
    @Column(name = "NAME")
    private String name;

    /*Отчество*/
    @Column(name = "LASTNAME")
    private String lastName;

    /*Номер телефона - один или несколько?*/
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    /*Адрес электронной почты - один или несколько?*/
    @Column(name = "EMAIL")
    private String email;

    /*Связь с базой адресов*/
    @OneToOne
    @Column(name = "LIVING_ADDRESS")
    private Address livingAddress;

    /*Связь с базой паспортных данных*/
    @OneToOne
    @Column(name = "CLIENT_PASSPORT")
    private Passport clientPassport;

    /*Индивидуальный номер налогоплательщика*/
    @Column(name = "IPN")
    private Integer ipn;

    /*Статус клиента - не проходил обучение, студент, закончил обучение..., возможно несколько статусов*/
    @OneToMany(mappedBy = "client2", fetch = FetchType.LAZY)
    private List<ClientStatus> clientStatusList;

    /*Состояние оплаты обучения, возможно несколько состояний оплаты*/
    @OneToMany(mappedBy = "client1", fetch = FetchType.LAZY)
    private List<PayStatus> payStatus;

    /*Связь с базой заявок, клиент может направить несколько заявок*/
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private List<Applications> applicationsList;

    @Column(name = "NOTE")
    private String note;

    /*Связь с базой учебных групп, клиент может проходить обучение в нескольких группах разных курсов*/
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "GROUP_JOIN_CLIENT", joinColumns = @JoinColumn(name = "CLIENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "GROUP_ID"))
    private List<Group> groupList;

    public Client() {
    }

    public Client(String surName, String name, String lastName, String phoneNumber, String email, Address livingAddress, Passport clientPassport, Integer ipn, String note) {
        this.surName = surName;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.livingAddress = livingAddress;
        this.clientPassport = clientPassport;
        this.ipn = ipn;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Passport getClientPassport() {
        return clientPassport;
    }

    public void setClientPassport(Passport clientPassport) {
        this.clientPassport = clientPassport;
    }

    public Integer getIpn() {
        return ipn;
    }

    public void setIpn(Integer ipn) {
        this.ipn = ipn;
    }

    public List<ClientStatus> getClientStatusList() {
        return clientStatusList;
    }

    public void setClientStatusList(List<ClientStatus> clientStatusList) {
        this.clientStatusList = clientStatusList;
    }

    public List<PayStatus> getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(List<PayStatus> payStatus) {
        this.payStatus = payStatus;
    }

    public List<Applications> getApplicationsList() {
        return applicationsList;
    }

    public void setApplicationsList(List<Applications> applicationsList) {
        this.applicationsList = applicationsList;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }
}
