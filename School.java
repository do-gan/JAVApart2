class Teacher
{
    private String tname;
    private String subject;
    private int yrsOfExp;

    // Getter and Setter for tname
    public String getTname() 
    {
        return this.tname;
    }
    public void setTname(String tname) 
    {
        this.tname= tname;
    }

    // Getter and Setter for subject
     public String getSubject() 
     {
         return this.subject;
     }
     public void setSubject(String subject) 
     {
         this.subject= subject;
     }

     // Getter and Setter for subject
     public int getYrsOfExp() 
     {
         return this.yrsOfExp;
     }
     public void setYrsOfExp(int yrsOfExp) 
     {
         this.yrsOfExp= yrsOfExp;
     }
}
class Student 
{
    private String sname;  
    private String degree; 
    private String college;

    // Getter and setter for sname
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) 
    {
        this.sname = sname;
    }

    // Getter and setter for degree
    public String getDegree() 
    {
        return degree;
    }
    public void setDegree(String degree)
    {
        this.degree = degree;
    }

    // Getter and setter for college
    public String getCollege() 
    {
        return college;
    }
    public void setCollege(String college) 
    {
        this.college = college;
    }
}
class Relationship 
{
    public static void Output1()
    {
        Teacher t=new Teacher();  
        t.setSubject("java");
        t.setTname("Amitava");
        t.setYrsOfExp(0);

        Student s=new Student();
        s.setSname("Ankan");
        s.setDegree(null);
        s.setCollege(null);
        
        System.out.println(s.getSname()+" takes "+t.getSubject()+" class under "+t.getTname()+" sir");
    }  
    public static void Output2()
    {
        Teacher t=new Teacher();  
        t.setSubject("OOPS");
        t.setTname("Amitava");
        t.setYrsOfExp(0);

        Student s=new Student();
        s.setSname("Madhu");
        s.setDegree("Btech");
        s.setCollege("UEM");

        System.out.println(t.getTname()+" teaches "+t.getSubject()+" design to "+s.getSname()+" who reads as "+s.getDegree()+" Student in "+s.getCollege()+" college");
    }
    
    public static void main(String[]args)
    {
        Output1();
        Output2();
    }
}
