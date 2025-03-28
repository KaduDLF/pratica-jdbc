
package entidades;
import java.util.Date;
import entities.enums.NewEnum;

public class Ordenacao {
    private int id;
    private Date moment;
    private NewEnum status;
    
    public Ordenacao(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Order: " + " id: " + this.id + " Moment: " + this.moment + "Status: " + this.status;
    }
    
    
}
