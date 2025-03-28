
package entidades;
import java.util.Date;
import entities.enums.NewEnum;
public class Order {
    private Date moment;
    private NewEnum status;
    
    public Order(){
        
    }
    public Order(Date moment,NewEnum status){
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public NewEnum getStatus() {
        return status;
    }

    public void setStatus(NewEnum status) {
        this.status = status;
    }
    
    
}
