package com.tba.editor.entity.effect;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.tba.editor.entity.Room;

/**
 * Représente un effet permettant de changer de lieu
 */
@Entity
@DiscriminatorValue("ChangeRoom")
public class ChangeCurrentRoomEffect extends Effect
{
    /**
     * Le lieu dans lequel l'effet doit déplacer le joueur
     */
    @ManyToOne
    @JoinColumn(name = "target_room_id")
    private Room targetRoom;

    /**
     * @return Le lieu dans lequel l'effet doit déplacer le joueur
     */
    public Room getTargetRoom()
    {
        return targetRoom;
    }
}
