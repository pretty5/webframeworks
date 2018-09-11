import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.List;
@Data

public class Permission {
    private int id;
    private String name;
    private List<Role> roleList;
}
