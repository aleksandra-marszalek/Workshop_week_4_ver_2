package pl.coderslab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.coderslab.DTO.CountryDto;

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
}