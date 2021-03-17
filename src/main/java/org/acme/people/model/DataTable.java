package org.acme.people.model;

import java.io.Serializable;
import java.util.List;
import org.eclipse.microprofile.opentracing.Traced;
import org.acme.people.utils.Sleep;


public class DataTable implements Serializable {

    private static final long serialVersionUID = -7304814269819778382L;
    public long draw;
    public long recordsTotal;
    public long recordsFiltered;
    public List<Person> data;
    public String error;

    public DataTable() {

    }

    @Traced(true)
    public void setDraw(int draw) {
        this.draw = draw;
    }
    @Traced(true)
    public void setRecordsTotal(long recordsTotal) {
        this.recordsTotal = recordsTotal;
    }
    @Traced(true)
    public void setRecordsFiltered(long recordsFiltered) {
        Sleep.pause(1000);
        this.recordsFiltered = recordsFiltered;
    }
    @Traced(true)
    public void setData(List<Person> data) {
        this.data = data;
    }
    
    @Traced(true)
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
