package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String name;

    @EqualsAndHashCode.Exclude
    private int id;

    @Expose
    private String email;
    private String password;

    @SerializedName(value = "is_active") //Для GSON
    @JsonProperty("is_active") //Для Jackson
    private boolean isActive;

    @SerializedName(value = "is_admin")
    @JsonProperty("is_admin")
    @EqualsAndHashCode.Exclude
    private boolean isAdmin;

    @SerializedName(value = "role_id")
    @JsonProperty("role_id")
    private int roleId;

    private String role;

    @EqualsAndHashCode.Exclude
    private String email_notifications;
}
