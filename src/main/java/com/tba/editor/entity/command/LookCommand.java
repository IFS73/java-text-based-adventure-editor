package com.tba.editor.entity.command;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Représente une commande permettant d'afficher la description du lieu actuel
 */
@Entity
@Table(name = "look_command")
public class LookCommand extends Command
{

}
