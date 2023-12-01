/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.designpatternsone.decorator;

/**
 *
 * @author braulio04
 */
public class NotificacionDecorator extends Notificacion {
    private Notificacion wrappe;
    
    public NotificacionDecorator(Notificacion notificacion) {
        this.wrappe = notificacion;
    }

    public NotificacionDecorator() {
    }
}
