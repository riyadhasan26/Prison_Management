package com.example.prision_management;

import java.io.Serializable;
import java.time.LocalDate;

public class VisitRequest implements Serializable {


        private String requestId;
        private String prisonerId;
        private String purpose;
        private LocalDate requestDate;
        private String status;




        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public String getPrisonerId() {
            return prisonerId;
        }

        public void setPrisonerId(String prisonerId) {
            this.prisonerId = prisonerId;
        }

        public String getPurpose() {
            return purpose;
        }

        public void setPurpose(String purpose) {
            this.purpose = purpose;
        }

        public LocalDate getRequestDate() {
            return requestDate;
        }

        public void setRequestDate(LocalDate requestDate) {
            this.requestDate = requestDate;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public VisitRequest(String requestId, String prisonerId, String purpose, LocalDate requestDate, String status) {
            this.requestId = requestId;
            this.prisonerId = prisonerId;
            this.purpose = purpose;
            this.requestDate = requestDate;
            this.status = status;
        }

        @Override
        public String toString() {
            return "VisitRequest{" +
                    "requestId='" + requestId + '\'' +
                    ", prisonerId='" + prisonerId + '\'' +
                    ", purpose='" + purpose + '\'' +
                    ", requestDate=" + requestDate +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

