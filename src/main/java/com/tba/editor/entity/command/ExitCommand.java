package com.tba.editor.entity.command;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Représente une commande permettant de sortir du jeu
 */
@Entity
@Table(name = "exit_command")
public class ExitCommand extends Command
{

}
