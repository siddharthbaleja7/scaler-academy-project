package scaler.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;

/**
 * Document
 */
@Validated
@jakarta.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2025-02-17T20:56:21.724071100+05:30[Asia/Calcutta]")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Document   {
        @JsonProperty("auditDetails")

          @Valid
                private AuditDetails auditDetails = null;

        @JsonProperty("documentType")
          @NotNull

                private String documentType = null;

        @JsonProperty("documentUid")

                private String documentUid = null;

        @JsonProperty("fileStoreId")
          @NotNull

                private String fileStoreId = null;

        @JsonProperty("id")

                private String id = null;

            /**
            * Gets or Sets status
            */
            public enum StatusEnum {
                        ACTIVE("ACTIVE"),
                        
                        INACTIVE("INACTIVE"),
                        
                        INWORKFLOW("INWORKFLOW");
            
            private String value;
            
            StatusEnum(String value) {
            this.value = value;
            }
            
            @Override
            @JsonValue
            public String toString() {
            return String.valueOf(value);
            }
            
            @JsonCreator
            public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
            return b;
            }
            }
            return null;
            }
            }        @JsonProperty("status")

                private StatusEnum status = null;


}
