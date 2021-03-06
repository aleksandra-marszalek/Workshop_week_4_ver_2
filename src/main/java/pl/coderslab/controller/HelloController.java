package pl.coderslab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.coderslab.DAO.CountryDao;
import pl.coderslab.DAO.UserDao;
import pl.coderslab.DTO.*;
import pl.coderslab.model.Event;

@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);


    @RequestMapping("/get-countries")
    public String getCountriesAction() {
        String url = "https://apifootball.com/api/?action=get_countries& APIkey=f0df14e90abe953b07ba9c6225c38f9b86a341d8c001f9428b07ab9d9267a41d";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CountryDto[]> responseCountries = restTemplate.getForEntity(url, CountryDto[].class);
        CountryDto[] countries = responseCountries.getBody();
        for (CountryDto country: countries) {
            logger.info("countries {}", country);
        }
        return "some result";
    }

    @RequestMapping("/create-countries")
    public String createCountries() {
        String url = "https://apifootball.com/api/?action=get_countries& APIkey=f0df14e90abe953b07ba9c6225c38f9b86a341d8c001f9428b07ab9d9267a41d";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CountryDto[]> responseCountries = restTemplate.getForEntity(url, CountryDto[].class);
        CountryDto[] countries = responseCountries.getBody();
        for (CountryDto country: countries) {
            CountryDao.create(country);
        }
        return "some result- created countries";
    }


    @RequestMapping("/get-leagues/{id}")
    public String getLeaguesAction(@PathVariable int id) {
        String url = "https://apifootball.com/api/?action=get_leagues&country_id="+id+"&APIkey=f0df14e90abe953b07ba9c6225c38f9b86a341d8c001f9428b07ab9d9267a41d";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<LeagueDto[]> responseLeagues = restTemplate.getForEntity(url, LeagueDto[].class);
        LeagueDto[] leagues = responseLeagues.getBody();
        for (LeagueDto league: leagues) {
            logger.info("leagues {}", league);
        }
        return "some result - leagues";
    }

    @RequestMapping("/get-teams/{id}")
    public String getTeamsAction(@PathVariable int id) {
        String url = "https://apifootball.com/api/?action=get_standings&league_id="+id+"&APIkey=f0df14e90abe953b07ba9c6225c38f9b86a341d8c001f9428b07ab9d9267a41d";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<TeamDto[]> responseTeams = restTemplate.getForEntity(url, TeamDto[].class);
        TeamDto[] teams = responseTeams.getBody();
        for (TeamDto team: teams) {
            logger.info("teams {}", team);
        }
        return "some result - teams";
    }

    @RequestMapping("/get-events/{id}")
    public String getEventsAction(@PathVariable int id) {
        String url = "https://apifootball.com/api/?action=get_events&from=2016-10-30&to=2016-11-01&league_id="+id+
                "&APIkey=f0df14e90abe953b07ba9c6225c38f9b86a341d8c001f9428b07ab9d9267a41d";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<EventDto[]> responseEvents = restTemplate.getForEntity(url, EventDto[].class);
        EventDto[] events = responseEvents.getBody();
        for (EventDto event: events) {
            logger.info("events {}", event);
        }
        return "some result - events";
    }

    @RequestMapping("/get-users")
    public String getUsersAction() {
        String url = "http://localhost:8080/api/fake-users";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserDto[]> responseEvents = restTemplate.getForEntity(url, UserDto[].class);
        UserDto[] users = responseEvents.getBody();
        for (UserDto user: users) {
            logger.info("users {}", user);
        }
        return "some result - users";
    }

    @RequestMapping("/create-users")
    public String createUsersAction() {
        String url = "http://localhost:8080/api/fake-users";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserDto[]> responseEvents = restTemplate.getForEntity(url, UserDto[].class);
        UserDto[] users = responseEvents.getBody();
        for (UserDto user : users) {
            logger.info("users {}", user);
            UserDao.create(user);
        }
        return "Created result - users";
    }
}