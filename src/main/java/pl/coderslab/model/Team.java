package pl.coderslab.model;

public class Team {

    private long id;
    private String name;
    private League league;

    public Team() {
    }

    public Team(long id, String name, League league) {
        this.id = id;
        this.name = name;
        this.league = league;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    
}
