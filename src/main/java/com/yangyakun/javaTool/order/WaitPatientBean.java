package com.yangyakun.javaTool.order;

public class WaitPatientBean implements Comparable<WaitPatientBean> {
    /**
     * patientName : patient2
     * patientNo : no2
     */

    private String patientName;
    private String patientNo;
    private String subscribeId;
    private String status;

    public String getSubscribeId() {
        return subscribeId;
    }

    public void setSubscribeId(String subscribeId) {
        this.subscribeId = subscribeId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "WaitPatientBean{" +
                "patientName='" + patientName + '\'' +
                ", patientNo='" + patientNo + '\'' +
                ", subscribeId='" + subscribeId + '\'' +
                ", status='" + status + '\'' +
                '}'+"\n";
    }

    @Override
    public int compareTo(WaitPatientBean o) {
        return getStatus().compareTo(o.getStatus());
    }
}
