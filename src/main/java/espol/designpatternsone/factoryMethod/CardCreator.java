/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.designpatternsone.factoryMethod;

/**
 *
 * @author JOSUE
 */
public class CardCreator {
    private int price;
    private int limit;
    CreditCard createCard() {
        return new CreditCard();
    }
}
