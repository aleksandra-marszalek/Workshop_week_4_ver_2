package pl.coderslab.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


    @JsonIgnoreProperties(ignoreUnknown = true)
    public class TeamDto {
        @JsonProperty("league_id") long apiLeagueId;
        @JsonProperty("team_name") String teamName;
        @JsonProperty("overall_league_position") int leaguePosition;


        public TeamDto() {

        }

        public TeamDto(long apiLeagueId, String teamName, int leaguePosition) {
            this.apiLeagueId = apiLeagueId;
            this.teamName = teamName;
            this.leaguePosition = leaguePosition;
        }

        public long getApiLeagueId() {
            return apiLeagueId;
        }

        public void setApiLeagueId(long apiLeagueId) {
            this.apiLeagueId = apiLeagueId;
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public int getLeaguePosition() {
            return leaguePosition;
        }

        public void setLeaguePosition(int leaguePosition) {
            this.leaguePosition = leaguePosition;
        }

        @Override
        public String toString() {
            return "TeamDto{" +
                    "apiLeagueId=" + getApiLeagueId() +
                    ", teamName='" + getTeamName()+ ", leaguePosition='" + getLeaguePosition()+ '\'' +
                    '}';
        }
    }
