package scaler.util;

import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
import scaler.config.Configuration;
import static scaler.config.ServiceConstants.URL;
import static scaler.config.ServiceConstants.URL_SHORTENING_ERROR_CODE;
import static scaler.config.ServiceConstants.URL_SHORTENING_ERROR_MESSAGE;

@Slf4j
@Component
public class UrlShortenerUtil {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Configuration configs;


    public String getShortenedUrl(String url){

        HashMap<String,String> body = new HashMap<>();
        body.put(URL,url);
        StringBuilder builder = new StringBuilder(configs.getUrlShortnerHost());
        builder.append(configs.getUrlShortnerEndpoint());
        String res = restTemplate.postForObject(builder.toString(), body, String.class);

        if(StringUtils.isEmpty(res)){
            log.error(URL_SHORTENING_ERROR_CODE, URL_SHORTENING_ERROR_MESSAGE + url); ;
            return url;
        }
        else return res;
    }


}