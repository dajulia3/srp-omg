package com.example.srp;

public class Employee {
    public String getEmployeeIdNumber(){
        return "Jim Beam";
    }
    public Money calculatePay(){ return new Money(12); }

    public boolean isValid(){
        return false;
    }

    public String reportHours(){
        String tableHeader = "<html><table>";
        String body = "";

        for(int i=0;i<employmentPeriodInWeeks(); i++){
            body += "<tr><td>week " + i + "</td><td></td></tr>";

        }

        String tableFooter = "</table></html>";

        return tableHeader + body + tableFooter;
    }

    private int employmentPeriodInWeeks() {
        return 25;
    }
}
