/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;
import entidades.Ordenacao;
import entities.enums.NewEnum;
import java.util.Date;

public class ProgramaEnum {
    public static void main(String[] args) {
        Ordenacao order = new Ordenacao();
        order.setId(1080);
        order.setMoment(new Date());
        order.setStatus(NewEnum.AGUARDANDO_PAGAMENTO);
        
        System.out.println(order);
    }
}
