package org.acme.people.model;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.opentracing.Traced;
import org.acme.people.utils.Sleep;

@ApplicationScoped
@Traced
public class DataTable implements Serializable {

    private static final long serialVersionUID = -7304814269819778382L;
    public long draw;
    public long recordsTotal;
    public long recordsFiltered;
    public List<Person> data;
    public String error;

    public DataTable() {

    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
    public void setRecordsTotal(long recordsTotal) {
        this.recordsTotal = recordsTotal;
    }
    public void setRecordsFiltered(long recordsFiltered) {
        Sleep.pause(500);
        this.recordsFiltered = recordsFiltered;
    }
    public void setData(List<Person> data) {
        this.data = data;
    }
    
    public void setError(String error) {
        this.error = error;
    }

    public long getDraw() {
        return this.draw;
    }
    public long getRecordsTotal() {
        return this.recordsTotal;
    }
    public long getRecordsFiltered() {
        return this.recordsFiltered;
    }
    public List<Person> getData() {
        return this.data;
    }
    public String getError() {
        return this.error;
    }


}
