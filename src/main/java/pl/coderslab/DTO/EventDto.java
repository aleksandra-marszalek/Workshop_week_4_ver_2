package pl.coderslab.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventDto {

    /*  private long id;
        private String date;
        private League league;
        private Team homeTeam;
        private Team awayTeam;
        private int homeGoals;
        private int awayGoals;

   */

        @JsonProperty("match_id") long matchId;
        @JsonProperty("match_date") String matchDate;
        @JsonProperty("league_id") long apiLeagueId;
        @JsonProperty("match_hometeam_name") String homeTeamName;
        @JsonProperty("match_awayteam_name") String awayTeamName;
        @JsonProperty("match_hometeam_score") int homeTeamScore;
        @JsonProperty("match_awayteam_score") int awayTeamScore;

    @Override
    public String toString() {

        return "EventDto{" +
                "apiLeagueId= " + getApiLeagueId() +
                ", matchId= " + getMatchId()+ ", matchDate='" + getMatchDate()+'\''+ ", homeTeamName='" + getHomeTeamName() +'\'' +
                ", awayTeamName='" + getAwayTeamName()+'\'' + ", homeTeamScore= " + getHomeTeamScore()+
                ", awayTeamScore= " + getAwayTeamScore() +
                '}';
    }


    public EventDto() {
    }

    public EventDto(long matchId, String matchDate, long apiLeagueId, String homeTeamName, String awayTeamName, int homeTeamScore, int awayTeamScore) {
        this.matchId = matchId;
        this.matchDate = matchDate;
        this.apiLeagueId = apiLeagueId;
        this.homeTeamName = homeTeamName;
        this.awayTeamName = awayTeamName;
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;
    }

    public long getMatchId() {
        return matchId;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    public long getApiLeagueId() {
        return apiLeagueId;
    }

    public void setApiLeagueId(long apiLeagueId) {
        this.apiLeagueId = apiLeagueId;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(int awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }
}
