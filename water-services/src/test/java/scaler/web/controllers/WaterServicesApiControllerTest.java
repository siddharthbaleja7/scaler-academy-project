package scaler.web.controllers;

import scaler.web.models.WaterConnectionCreateRequest;
import scaler.web.models.WaterConnectionResponse;
import scaler.web.models.WaterConnectionUpdateRequest;
import scaler.web.models.WaterConnectionWorkflowUpdateRequest;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import scaler.TestConfiguration;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
* API tests for WaterServicesApiController
*/
@Ignore
@RunWith(SpringRunner.class)
@WebMvcTest(WaterServicesApiController.class)
@Import(TestConfiguration.class)
public class WaterServicesApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void createWaterConnectionSuccess() throws Exception {
        mockMvc.perform(post("/water-services/connection/v1/_create").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isOk());
    }

    @Test
    public void createWaterConnectionFailure() throws Exception {
        mockMvc.perform(post("/water-services/connection/v1/_create").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest());
    }

    @Test
    public void searchWaterConnectionsSuccess() throws Exception {
        mockMvc.perform(post("/water-services/connection/v1/_search").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isOk());
    }

    @Test
    public void searchWaterConnectionsFailure() throws Exception {
        mockMvc.perform(post("/water-services/connection/v1/_search").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest());
    }

    @Test
    public void updateWaterConnectionSuccess() throws Exception {
        mockMvc.perform(post("/water-services/connection/v1/_update").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isOk());
    }

    @Test
    public void updateWaterConnectionFailure() throws Exception {
        mockMvc.perform(post("/water-services/connection/v1/_update").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest());
    }

    @Test
    public void updateWaterConnectionWorkflowSuccess() throws Exception {
        mockMvc.perform(post("/water-services/connection/workflow/v1/_update").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isOk());
    }

    @Test
    public void updateWaterConnectionWorkflowFailure() throws Exception {
        mockMvc.perform(post("/water-services/connection/workflow/v1/_update").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest());
    }

}
