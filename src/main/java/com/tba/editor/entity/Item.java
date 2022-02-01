package com.tba.editor.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tba.editor.entity.effect.Effect;

/**
 * Représente un élément de l'univers de jeu, avec lequel le joueur pourra interagir.
 */
@Entity
@Table(name = "item")
public class Item
{
    /**
     * L'identifiant en base de données
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    /**
     * Le lieu dans lequel se trouve l'élément interactif
     */
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
    /**
     * Le nom de l'élément interactif
     */
    @Column(name = "name")
    private String name;
    /**
     * L'élément interactif est-il visible et utilisable?
     */
    @Column(name = "visible")
    private boolean visible;
    /**
     * La liste de tous les effets que cet élément interactif peut produire
     */
    @OneToMany
    @JoinColumn(name = "item_id")
    private List<Effect> effects;

    /**
     * @return L'identifiant en base de données
     */
    public int getId()
    {
        return id;
    }

    /**
     * @return Le lieu dans lequel se trouve l'élément interactif
     */
    public Room getRoom() {
        return room;
    }

    /**
     * @return Le nom de l'élément interactif
     */
    public String getName() {
        return name;
    }

    /**
     * @return L'élément interactif est-il visible et utilisable?
     */
    public boolean isVisible() {
        return visible;
    }
}
