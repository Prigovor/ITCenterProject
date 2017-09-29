package web.entity;

import javax.persistence.*;

@Entity
@Table(name = "CLIENT_STATUS_NAME")
public class ClientStatusName {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    /*Наименование статуса*/
    @Column(name = "TITLE")
    private String title;

    @Column(name = "NOTE")
    private String note;

    public ClientStatusName() {
    }

    public ClientStatusName(String title, String note) {
        this.title = title;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
