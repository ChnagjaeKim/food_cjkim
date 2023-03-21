package food.domain;

import food.OwnerApplication;
import food.domain.Rejected;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Cooking_table")
@Data
public class Cooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String orderId;

    private Double uv;

    private Long qty;

    private String customerName;

    private String address;

    private Long telephone;

    private Boolean accept;

    private Boolean reject;

    private Boolean start;

    private Boolean finish;

    @PostPersist
    public void onPostPersist() {
        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();
    }

    public static CookingRepository repository() {
        CookingRepository cookingRepository = OwnerApplication.applicationContext.getBean(
            CookingRepository.class
        );
        return cookingRepository;
    }

    public void acceptReject(AcceptRejectCommand acceptRejectCommand) {
        Accepetd accepetd = new Accepetd(this);
        accepetd.publishAfterCommit();
    }

    public void startCook(StartCookCommand startCookCommand) {
        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();
    }

    public void finishCook(FinishCookCommand finishCookCommand) {
        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();
    }

    public static void menuInformation(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        Cooking cooking = new Cooking();
        repository().save(cooking);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(cooking->{
            
            cooking // do something
            repository().save(cooking);


         });
        */

    }
}
