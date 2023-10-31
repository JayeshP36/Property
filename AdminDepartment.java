package Property;

public class AdminDepartment extends SuperDepartment {

    public String departmentName(){
        return "Admin Department";
    }

    public String getTodayWork(){
        return "Complete your document submissions";
    }

    public String getWorkDeadLine(){
        return "Complete by EOD";
    }
}
