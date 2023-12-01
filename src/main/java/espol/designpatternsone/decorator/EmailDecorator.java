/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.designpatternsone.decorator;

/**
 *
 * @author braulio04
 */
public class EmailDecorator extends NotificacionDecorator {
    
    public EmailDecorator(Notificacion notificacion) {
        super(notificacion);
    }
    
    public EmailDecorator() {}
    
    public void Notificar(String message) {
        super.notificar(message);
        System.out.println("Email " + message);
    }
}
