/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.designpatternsone.decorator;

/**
 *
 * @author braulio04
 */
public class SMSDecorator extends NotificacionDecorator {
    public SMSDecorator(Notificacion notificacion) {
        super(notificacion);
    }
    
    @Override 
    public void notificar(String message) {
        super.notificar(message);
        System.out.println("SMS " + message);
    }
    
}
