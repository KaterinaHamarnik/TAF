package models;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CustomerBuilder {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private int age;

}
