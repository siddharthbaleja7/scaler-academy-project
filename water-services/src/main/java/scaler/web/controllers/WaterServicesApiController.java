package scaler.web.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import scaler.web.models.WaterConnectionCreateRequest;
import scaler.web.models.WaterConnectionResponse;
import scaler.web.models.WaterConnectionUpdateRequest;
import scaler.web.models.WaterConnectionWorkflowUpdateRequest;

import java.io.IOException;
import java.util.List;

@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2025-01-07T15:17:21.586197+05:30[Asia/Kolkata]")
@Controller
@RequestMapping("/connection")
public class WaterServicesApiController {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public WaterServicesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @RequestMapping(value = "/v1/_create", method = RequestMethod.POST)
    public ResponseEntity<WaterConnectionResponse> createWaterConnection(@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody WaterConnectionCreateRequest body) {
        return new ResponseEntity<WaterConnectionResponse>(HttpStatus.OK);
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<WaterConnectionResponse>("Test", HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                return new ResponseEntity<WaterConnectionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
//
//        return new ResponseEntity<WaterConnectionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/v1/_search", method = RequestMethod.GET)
    public ResponseEntity<WaterConnectionResponse> searchWaterConnections(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Tenant ID to filter connections.", required = true, schema = @Schema()) @Valid @RequestParam(value = "tenantId", required = true) String tenantId, @Parameter(in = ParameterIn.QUERY, description = "Connection number to filter results.", schema = @Schema()) @Valid @RequestParam(value = "connectionNo", required = false) String connectionNo, @Parameter(in = ParameterIn.QUERY, description = "List of application numbers to filter results.", schema = @Schema()) @Valid @RequestParam(value = "applicationNo", required = false) List<String> applicationNo, @Parameter(in = ParameterIn.QUERY, description = "Filter connections by application status.", schema = @Schema()) @Valid @RequestParam(value = "applicationStatus", required = false) List<String> applicationStatus, @Parameter(in = ParameterIn.QUERY, description = "Filter connections by IDs.", schema = @Schema()) @Valid @RequestParam(value = "ids", required = false) List<String> ids) {
        try {
            return new ResponseEntity<WaterConnectionResponse>(objectMapper.readValue("{  \"ResponseInfo\" : {    \"ver\" : \"ver\",    \"resMsgId\" : \"resMsgId\",    \"msgId\" : \"msgId\",    \"apiId\" : \"apiId\",    \"ts\" : 0,    \"status\" : \"SUCCESSFUL\"  },  \"WaterConnection\" : [ {    \"workflow\" : {      \"documents\" : [ {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      }, {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      } ],      \"action\" : \"action\",      \"assignees\" : [ \"assignees\", \"assignees\" ],      \"comment\" : \"comment\",      \"status\" : \"status\"    },    \"documents\" : [ null, null ],    \"applicationNo\" : \"applicationNo\",    \"channel\" : \"channel\",    \"connectionHolders\" : [ \"connectionHolders\", \"connectionHolders\" ],    \"additionalDetails\" : { },    \"connectionType\" : \"connectionType\",    \"connectionExecutionDate\" : 5,    \"applicationStatus\" : \"applicationStatus\",    \"auditDetails\" : {      \"lastModifiedTime\" : 1,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 6    },    \"tenantId\" : \"tenantId\",    \"id\" : \"id\",    \"propertyId\" : \"propertyId\",    \"connectionNo\" : \"connectionNo\",    \"status\" : true  }, {    \"workflow\" : {      \"documents\" : [ {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      }, {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      } ],      \"action\" : \"action\",      \"assignees\" : [ \"assignees\", \"assignees\" ],      \"comment\" : \"comment\",      \"status\" : \"status\"    },    \"documents\" : [ null, null ],    \"applicationNo\" : \"applicationNo\",    \"channel\" : \"channel\",    \"connectionHolders\" : [ \"connectionHolders\", \"connectionHolders\" ],    \"additionalDetails\" : { },    \"connectionType\" : \"connectionType\",    \"connectionExecutionDate\" : 5,    \"applicationStatus\" : \"applicationStatus\",    \"auditDetails\" : {      \"lastModifiedTime\" : 1,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 6    },    \"tenantId\" : \"tenantId\",    \"id\" : \"id\",    \"propertyId\" : \"propertyId\",    \"connectionNo\" : \"connectionNo\",    \"status\" : true  } ]}", WaterConnectionResponse.class), HttpStatus.OK);
        } catch (IOException e) {
            return new ResponseEntity<WaterConnectionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @RequestMapping(value = "/v1/_update", method = RequestMethod.POST)
    public ResponseEntity<WaterConnectionResponse> updateWaterConnection(@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody WaterConnectionUpdateRequest body) {

        try {
            return new ResponseEntity<WaterConnectionResponse>(objectMapper.readValue("{  \"ResponseInfo\" : {    \"ver\" : \"ver\",    \"resMsgId\" : \"resMsgId\",    \"msgId\" : \"msgId\",    \"apiId\" : \"apiId\",    \"ts\" : 0,    \"status\" : \"SUCCESSFUL\"  },  \"WaterConnection\" : [ {    \"workflow\" : {      \"documents\" : [ {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      }, {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      } ],      \"action\" : \"action\",      \"assignees\" : [ \"assignees\", \"assignees\" ],      \"comment\" : \"comment\",      \"status\" : \"status\"    },    \"documents\" : [ null, null ],    \"applicationNo\" : \"applicationNo\",    \"channel\" : \"channel\",    \"connectionHolders\" : [ \"connectionHolders\", \"connectionHolders\" ],    \"additionalDetails\" : { },    \"connectionType\" : \"connectionType\",    \"connectionExecutionDate\" : 5,    \"applicationStatus\" : \"applicationStatus\",    \"auditDetails\" : {      \"lastModifiedTime\" : 1,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 6    },    \"tenantId\" : \"tenantId\",    \"id\" : \"id\",    \"propertyId\" : \"propertyId\",    \"connectionNo\" : \"connectionNo\",    \"status\" : true  }, {    \"workflow\" : {      \"documents\" : [ {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      }, {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      } ],      \"action\" : \"action\",      \"assignees\" : [ \"assignees\", \"assignees\" ],      \"comment\" : \"comment\",      \"status\" : \"status\"    },    \"documents\" : [ null, null ],    \"applicationNo\" : \"applicationNo\",    \"channel\" : \"channel\",    \"connectionHolders\" : [ \"connectionHolders\", \"connectionHolders\" ],    \"additionalDetails\" : { },    \"connectionType\" : \"connectionType\",    \"connectionExecutionDate\" : 5,    \"applicationStatus\" : \"applicationStatus\",    \"auditDetails\" : {      \"lastModifiedTime\" : 1,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 6    },    \"tenantId\" : \"tenantId\",    \"id\" : \"id\",    \"propertyId\" : \"propertyId\",    \"connectionNo\" : \"connectionNo\",    \"status\" : true  } ]}", WaterConnectionResponse.class), HttpStatus.NOT_IMPLEMENTED);
        } catch (IOException e) {
            return new ResponseEntity<WaterConnectionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @RequestMapping(value = "/workflow/v1/_update", method = RequestMethod.POST)
    public ResponseEntity<WaterConnectionResponse> updateWaterConnectionWorkflow(@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody WaterConnectionWorkflowUpdateRequest body) {
        try {
            return new ResponseEntity<WaterConnectionResponse>(objectMapper.readValue("{  \"ResponseInfo\" : {    \"ver\" : \"ver\",    \"resMsgId\" : \"resMsgId\",    \"msgId\" : \"msgId\",    \"apiId\" : \"apiId\",    \"ts\" : 0,    \"status\" : \"SUCCESSFUL\"  },  \"WaterConnection\" : [ {    \"workflow\" : {      \"documents\" : [ {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      }, {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      } ],      \"action\" : \"action\",      \"assignees\" : [ \"assignees\", \"assignees\" ],      \"comment\" : \"comment\",      \"status\" : \"status\"    },    \"documents\" : [ null, null ],    \"applicationNo\" : \"applicationNo\",    \"channel\" : \"channel\",    \"connectionHolders\" : [ \"connectionHolders\", \"connectionHolders\" ],    \"additionalDetails\" : { },    \"connectionType\" : \"connectionType\",    \"connectionExecutionDate\" : 5,    \"applicationStatus\" : \"applicationStatus\",    \"auditDetails\" : {      \"lastModifiedTime\" : 1,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 6    },    \"tenantId\" : \"tenantId\",    \"id\" : \"id\",    \"propertyId\" : \"propertyId\",    \"connectionNo\" : \"connectionNo\",    \"status\" : true  }, {    \"workflow\" : {      \"documents\" : [ {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      }, {        \"documentType\" : \"documentType\",        \"documentUid\" : \"documentUid\",        \"fileStore\" : \"fileStore\",        \"id\" : \"id\",        \"additionalDetails\" : { }      } ],      \"action\" : \"action\",      \"assignees\" : [ \"assignees\", \"assignees\" ],      \"comment\" : \"comment\",      \"status\" : \"status\"    },    \"documents\" : [ null, null ],    \"applicationNo\" : \"applicationNo\",    \"channel\" : \"channel\",    \"connectionHolders\" : [ \"connectionHolders\", \"connectionHolders\" ],    \"additionalDetails\" : { },    \"connectionType\" : \"connectionType\",    \"connectionExecutionDate\" : 5,    \"applicationStatus\" : \"applicationStatus\",    \"auditDetails\" : {      \"lastModifiedTime\" : 1,      \"createdBy\" : \"createdBy\",      \"lastModifiedBy\" : \"lastModifiedBy\",      \"createdTime\" : 6    },    \"tenantId\" : \"tenantId\",    \"id\" : \"id\",    \"propertyId\" : \"propertyId\",    \"connectionNo\" : \"connectionNo\",    \"status\" : true  } ]}", WaterConnectionResponse.class), HttpStatus.NOT_IMPLEMENTED);
        } catch (IOException e) {
            return new ResponseEntity<WaterConnectionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
