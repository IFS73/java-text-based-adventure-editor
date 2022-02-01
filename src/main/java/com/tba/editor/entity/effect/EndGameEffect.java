package com.tba.editor.entity.effect;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Représente un effet permettant de terminer la partie en cours
 */
@Entity
@DiscriminatorValue("EndGame")
public class EndGameEffect extends Effect
{

}
