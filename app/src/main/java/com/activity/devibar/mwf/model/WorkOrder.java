package com.activity.devibar.mwf.model;

/**
 * Created by namai on 11/24/2016.
 */

public class WorkOrder {

    /**
     * DateTimeIN : 10/14/2016 10:46:00 AM
     * TicketNo : N/A
     * WorkOrderNo : 201610140001
     * WorkOrderType : Service Connection Approval
     * ORNo : .
     * ORDate : null
     * Purpose : .
     * AccountID : 01-0001-2241
     * Name : GO, WLLIAM SMITH
     * WorkOrderStatus : CM
     * Address :  LEYTE - TINAG-AN,ALBUERA,LEYTE
     * Electrician : LECLIENT_01
     * Supervisor :
     * DepartmentID :
     * Remarks : .
     * Extra1 : 0
     * Notes1 : .
     * Notes2 : .
     * CityMunicipality : ALBUERA
     * DUEDATE : 10/15/2016 10:46:00 AM
     * ExecutionTime : 10/15/2016 10:46:00 AM
     */

    private String DateTimeIN;
    private String TicketNo;
    private String WorkOrderNo;
    private String WorkOrderType;
    private String ORNo;
    private Object ORDate;
    private String Purpose;
    private String AccountID;
    private String Name;
    private String WorkOrderStatus;
    private String Address;
    private String Electrician;
    private String Supervisor;
    private String DepartmentID;
    private String Remarks;
    private String Extra1;
    private String Notes1;
    private String Notes2;
    private String CityMunicipality;
    private String DUEDATE;
    private String ExecutionTime;

    public WorkOrder(String dateTimeIN, String ticketNo, String workOrderNo, String workOrderType, String ORNo, Object ORDate, String purpose, String accountID, String name, String workOrderStatus, String address, String electrician, String supervisor, String departmentID, String remarks, String extra1, String notes1, String notes2, String cityMunicipality, String DUEDATE, String executionTime) {
        DateTimeIN = dateTimeIN;
        TicketNo = ticketNo;
        WorkOrderNo = workOrderNo;
        WorkOrderType = workOrderType;
        this.ORNo = ORNo;
        this.ORDate = ORDate;
        Purpose = purpose;
        AccountID = accountID;
        Name = name;
        WorkOrderStatus = workOrderStatus;
        Address = address;
        Electrician = electrician;
        Supervisor = supervisor;
        DepartmentID = departmentID;
        Remarks = remarks;
        Extra1 = extra1;
        Notes1 = notes1;
        Notes2 = notes2;
        CityMunicipality = cityMunicipality;
        this.DUEDATE = DUEDATE;
        ExecutionTime = executionTime;
    }

    public String getDateTimeIN() {
        return DateTimeIN;
    }

    public void setDateTimeIN(String DateTimeIN) {
        this.DateTimeIN = DateTimeIN;
    }

    public String getTicketNo() {
        return TicketNo;
    }

    public void setTicketNo(String TicketNo) {
        this.TicketNo = TicketNo;
    }

    public String getWorkOrderNo() {
        return WorkOrderNo;
    }

    public void setWorkOrderNo(String WorkOrderNo) {
        this.WorkOrderNo = WorkOrderNo;
    }

    public String getWorkOrderType() {
        return WorkOrderType;
    }

    public void setWorkOrderType(String WorkOrderType) {
        this.WorkOrderType = WorkOrderType;
    }

    public String getORNo() {
        return ORNo;
    }

    public void setORNo(String ORNo) {
        this.ORNo = ORNo;
    }

    public Object getORDate() {
        return ORDate;
    }

    public void setORDate(Object ORDate) {
        this.ORDate = ORDate;
    }

    public String getPurpose() {
        return Purpose;
    }

    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }

    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String AccountID) {
        this.AccountID = AccountID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getWorkOrderStatus() {
        return WorkOrderStatus;
    }

    public void setWorkOrderStatus(String WorkOrderStatus) {
        this.WorkOrderStatus = WorkOrderStatus;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getElectrician() {
        return Electrician;
    }

    public void setElectrician(String Electrician) {
        this.Electrician = Electrician;
    }

    public String getSupervisor() {
        return Supervisor;
    }

    public void setSupervisor(String Supervisor) {
        this.Supervisor = Supervisor;
    }

    public String getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(String DepartmentID) {
        this.DepartmentID = DepartmentID;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    public String getExtra1() {
        return Extra1;
    }

    public void setExtra1(String Extra1) {
        this.Extra1 = Extra1;
    }

    public String getNotes1() {
        return Notes1;
    }

    public void setNotes1(String Notes1) {
        this.Notes1 = Notes1;
    }

    public String getNotes2() {
        return Notes2;
    }

    public void setNotes2(String Notes2) {
        this.Notes2 = Notes2;
    }

    public String getCityMunicipality() {
        return CityMunicipality;
    }

    public void setCityMunicipality(String CityMunicipality) {
        this.CityMunicipality = CityMunicipality;
    }

    public String getDUEDATE() {
        return DUEDATE;
    }

    public void setDUEDATE(String DUEDATE) {
        this.DUEDATE = DUEDATE;
    }

    public String getExecutionTime() {
        return ExecutionTime;
    }

    public void setExecutionTime(String ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }
}
