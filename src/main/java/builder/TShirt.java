package builder;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;

import java.util.List;
@Data
@Builder
public class TShirt {

    private char size;
    private String color;
    private String brand;
    @Singular(value = "Company")
    private List<String>orderCompanies;

}
