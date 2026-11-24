package com.example.prision_management;

public class CommunicationRequest {

    private String prisonerId;
    private String channel;
    private String requestDetails;


    public String getPrisonerId() {
        return prisonerId;
    }

    public void setPrisonerId(String prisonerId) {
        this.prisonerId = prisonerId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(String requestDetails) {
        this.requestDetails = requestDetails;
    }

    public CommunicationRequest(String prisonerId, String channel, String requestDetails) {
        this.prisonerId = prisonerId;
        this.channel = channel;
        this.requestDetails = requestDetails;
    }


    @Override
    public String toString() {
        return "CommunicationRequest{" +
                "prisonerId='" + prisonerId + '\'' +
                ", channel='" + channel + '\'' +
                ", requestDetails='" + requestDetails + '\'' +
                '}';
    }
}
