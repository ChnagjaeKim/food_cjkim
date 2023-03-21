package food.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class FinishDeliveryCommand {

    private Boolean finish;
}
