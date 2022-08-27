package chpater1javaspring.controller.db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private Long id;
    private String name;
    private double price;
    private String description1;
    private String description2;
    private String description3;

}
