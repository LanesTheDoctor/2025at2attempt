package gcesports_gui;

public class Competition
{
    private String game;
    private String competitionDate;
    private String location;
    private String team;
    private int points;
    
    public Competition (String game, String competitionDate, String location, String team, int points)
    {
        this.game = game;
        this.competitionDate = competitionDate;
        this.location = location;
        this.team = team;
        this.points = points;
    }
    
    //get methods
    public String getGame()
    {
        return game;
    }
    
    public String getCompetitionDate()
    {
        return competitionDate;
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public String getTeam()
    {
        return team;
    }
    
    public int getPoints()
    {
        return points;
    }
    
    //set methods
    
    public void setGame(String game)
    {
        this.game = game;
    }
    
    public void setCompetitionDate(String competitionDate)
    {
        this.competitionDate = competitionDate;
    }
    
    public void setLocation(String location)
    {
        this.location = location;
    }
    
    public void setTeam(String team)
    {
        this.team = team;
    }
    
    public void setPoints(int points)
    {
        this.points = points;
    }
    
    //override
    @Override
    public String toString()
    {
        String csvStr = game + "," + competitionDate + "," + location + "," + team + "," + points;
        return csvStr;
    }
    
}
