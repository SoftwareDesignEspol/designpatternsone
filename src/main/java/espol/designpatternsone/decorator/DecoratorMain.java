/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.designpatternsone.decorator;

/**
 *
 * @author braulio04
 */
public class DecoratorMain {
    public static void main(String[] args) {
        NotificacionDecorator n = new SMSDecorator(new EmailDecorator());
        n.notificar("Notificacion");
    }
    
}
