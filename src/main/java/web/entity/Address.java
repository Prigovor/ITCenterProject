package web.entity;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESSES")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Область*/
    @Column(name = "REGION")
    private String region;

    /*Район*/
    @Column(name = "DISTRICT")
    private String district;

    /*Город*/
    @Column(name = "SITY")
    private String sity;

    /*Название улицы, проспекта, например: вул. Миру*/
    @Column(name = "STREET")
    private String street;

    /*Номер здания*/
    @Column(name = "BUILDING_NUMBER")
    private String buildingNumber;

    /*Корпус*/
    @Column(name = "BUILDING_BLOCK")
    private String buildingBlock;

    /*Квартира*/
    @Column(name = "APPARTMENT_NUMBER")
    private String appartmentNumber;

    public Address() {
    }

    public Address(String region, String district, String sity, String street, String buildingNumber, String buildingBlock, String appartmentNumber) {
        this.region = region;
        this.district = district;
        this.sity = sity;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.buildingBlock = buildingBlock;
        this.appartmentNumber = appartmentNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getBuildingBlock() {
        return buildingBlock;
    }

    public void setBuildingBlock(String buildingBlock) {
        this.buildingBlock = buildingBlock;
    }

    public String getAppartmentNumber() {
        return appartmentNumber;
    }

    public void setAppartmentNumber(String appartmentNumber) {
        this.appartmentNumber = appartmentNumber;
    }
}
