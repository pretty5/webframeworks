import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data

public class Role {
    private int id;
    private String name;
    private List<Permission> permissionList;
}
