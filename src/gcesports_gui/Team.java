package gcesports_gui;

public class Team
{
    private String teamName;
    private String contactName;
    private String contactPhone;
    private String contactEmail;
    
    public Team (String teamName, String contactName, String contactPhone, String contactEmail)
    {
        this.teamName = teamName;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
    }
    
    //method overloading
    public Team()
    {
        this.teamName = "Test team;";
        this.contactName = "Test contact name";
        this.contactPhone = "0404";
        this.contactEmail = "test@gmail.com";
    }
    
    //get methods
    public String getTeamName()
    {
        return teamName;
    }
    
    public String getContactName()
    {
        return contactName;
    }
    
    public String getContactPhone()
    {
        return contactPhone;
    }
    
    public String getContactEmail()
    {
        return contactEmail;
    }
    
    //set methods
    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }
    
    public void setContactName(String contactName)
    {
        this.contactName = contactName;
    }
    
    public void setContactPhone(String contactPhone)
    {
        this.contactPhone = contactPhone;
    }
    
    public void setContactEmail(String contactEmail)
    {
        this.contactEmail = contactEmail;
    }
    
    //Override
    @Override
    public String toString()
    {
        String csvStr = teamName + "," + contactName + "," + contactPhone + "," + contactEmail;
        return csvStr;
    }
}
