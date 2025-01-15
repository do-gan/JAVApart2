class  Employee
{
    private String ename;
    private String designation;
    private double salary;
    private String email;

    // Getter and Setter for ename
    public String getEname() 
    {
        return ename;
    }
    public void setEname(String ename) 
    {
        this.ename = ename;
    }

    // Getter and Setter for designation
    public String getDesignation() 
    {
        return designation;
    }
    public void setDesignation(String designation) 
    {
        this.designation = designation;
    }

    // Getter and Setter for salary
    public double getSalary() 
    {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter and Setter for email
    public String getEmail() 
    {
        return email;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }
}
class Output
{
    public static void main(String[]args) 
    {
        Employee s=new Employee();
        s.setEname("Ankan");
        s.setDesignation("Developer");
        s.setEmail("ank@ibm.com");
        s.setSalary(5000);
        System.out.println(s.getEname()+" works as "+s.getDesignation()+" with emailid "+s.getEmail()+" and earns "+s.getSalary()+" per anum.");   
    }   
}
