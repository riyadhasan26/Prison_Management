package com.example.prision_management;

import java.io.Serializable;
import java.util.ArrayList;

public class LegalRepresentitive extends User implements Serializable {

    private ArrayList<VisitRequest> visitList = new ArrayList<>();
    private ArrayList<Consultation> consultationList = new ArrayList<>();
    private ArrayList<CommunicationRequest> communicationList = new ArrayList<>();


    public void requestVisit(VisitRequest v) {
        visitList.add(v);
    }


    public String checkVisitApproval(String requestId) {
        for (VisitRequest v : visitList) {
            if (v.getRequestId().equals(requestId)) {
                return v.getStatus();
            }
        }
        return "Request not found";
    }

    public void communicateWithInmate(CommunicationRequest c) {
        communicationList.add(c);
    }

    public void recordConsultation(Consultation c) {
        consultationList.add(c);
    }

    // scheduleLegalVisit, viewNotifications, viewVisitingRequirements and
    // viewLegalInfo depend on the other users' classes, so they are added later.





    public ArrayList<VisitRequest> getVisitList() {
        return visitList;
    }

    public ArrayList<Consultation> getConsultationList() {
        return consultationList;
    }

    public ArrayList<CommunicationRequest> getCommunicationList() {
        return communicationList;
    }

    public LegalRepresentitive(String userID, String password, String name, String contact) {
        super(userID, password, name, contact);
    }
}
