package com.tba.editor.entity.effect;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Représente un effet permettant d'afficher un message
 */
@Entity
@DiscriminatorValue("Message")
public class MessageEffect extends Effect
{
    /**
     * Le message à afficher
     */
    @Column(name = "message")
    private String message;
    
    /**
     * @return Le message à afficher
     */
    public String getMessage()
    {
        return message;
    }
}
