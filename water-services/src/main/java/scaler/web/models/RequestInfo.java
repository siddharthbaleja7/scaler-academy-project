package scaler.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;

/**
 * RequestInfo
 */
@Validated
@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2025-02-17T20:56:21.724071100+05:30[Asia/Calcutta]")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestInfo   {
        @JsonProperty("action")

                private String action = null;

        @JsonProperty("apiId")

                private String apiId = null;

        @JsonProperty("authToken")

                private String authToken = null;

        @JsonProperty("correlationId")

                private String correlationId = null;

        @JsonProperty("did")

                private String did = null;

        @JsonProperty("key")

                private String key = null;

        @JsonProperty("msgId")

                private String msgId = null;

        @JsonProperty("plainAccessRequest")

          @Valid
                private PlainAccessRequest plainAccessRequest = null;

        @JsonProperty("ts")

                private Long ts = null;

        @JsonProperty("userInfo")

          @Valid
                private User userInfo = null;

        @JsonProperty("ver")

                private String ver = null;


}
