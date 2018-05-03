package pl.coderslab.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



    @JsonIgnoreProperties(ignoreUnknown = true)
    public class LeagueDto {
        @JsonProperty("country_id") long apiCountryId;
        @JsonProperty("country_name") String countryName;
        @JsonProperty("league_id") long apiLeagueId;
        @JsonProperty("league_name") String leagueName;


        public long getApiCountryId() {
            return apiCountryId;
        }

        public void setApiCountryId(long apiCountryId) {
            this.apiCountryId = apiCountryId;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public long getApiLeagueId() {
            return apiLeagueId;
        }

        public void setApiLeagueId(long apiLeagueId) {
            this.apiLeagueId = apiLeagueId;
        }

        public String getLeagueName() {
            return leagueName;
        }

        public void setLeagueName(String leagueName) {
            this.leagueName = leagueName;
        }

        @Override
        public String toString() {
            return "LeagueDto{" +
                    "apiCountryId=" + apiCountryId +
                    ", countryName='" + countryName +  ", apiLeagueId=" + apiLeagueId +
                    ", leagueName='" + leagueName + '\'' +
                    '}';
        }
    }
