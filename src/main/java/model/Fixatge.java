package model;

import java.util.Date;

/**
 * Created by jgarcias on 31/01/17.
 */
public class Fixatge {
    private String id;
    private Date date;
    private String tipus;

    public Fixatge(String id, Date date) {
        this.id = id;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
}
