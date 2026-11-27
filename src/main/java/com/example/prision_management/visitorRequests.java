package com.example.prision_management;

public class visitorRequests {
    private string visitor_name;
    private int visitor_id;
    private LocalDate visit_date;

    public visitorRequests(string visitor_name, int visitor_id, LocalDate visit_date) {
        this.visitor_name = visitor_name;
        this.visitor_id = visitor_id;
        this.visit_date = visit_date;
    }

    public string getVisitor_name() {
        return visitor_name;
    }

    public void setVisitor_name(string visitor_name) {
        this.visitor_name = visitor_name;
    }

    public int getVisitor_id() {
        return visitor_id;
    }

    public void setVisitor_id(int visitor_id) {
        this.visitor_id = visitor_id;
    }

    public LocalDate getVisit_date() {
        return visit_date;
    }

    public void setVisit_date(LocalDate visit_date) {
        this.visit_date = visit_date;
    }

    @Override
    public String toString() {
        return "visitorRequests{" +
                "visitor_name=" + visitor_name +
                ", visitor_id=" + visitor_id +
                ", visit_date=" + visit_date +
                '}';
    }
}
